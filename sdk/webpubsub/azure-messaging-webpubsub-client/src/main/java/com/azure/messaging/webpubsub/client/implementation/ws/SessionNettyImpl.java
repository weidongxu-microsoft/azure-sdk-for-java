// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

import com.azure.core.http.HttpHeaderName;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.webpubsub.client.implementation.MessageDecoder;
import com.azure.messaging.webpubsub.client.implementation.MessageEncoder;
import com.azure.messaging.webpubsub.client.implementation.WebPubSubMessage;
import com.azure.messaging.webpubsub.client.models.ConnectFailedException;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshakerFactory;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketClientCompressionHandler;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import org.glassfish.tyrus.core.CloseReasons;

import javax.net.ssl.SSLException;
import javax.websocket.CloseReason;
import javax.websocket.EncodeException;
import javax.websocket.SendHandler;
import javax.websocket.SendResult;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

final class SessionNettyImpl implements Session {

    private final AtomicReference<ClientLogger> loggerReference;
    private final MessageEncoder messageEncoder;
    private final MessageDecoder messageDecoder;
    private final String path;
    private final String protocol;
    private final String userAgent;
    private final Consumer<Object> messageHandler;
    private final Consumer<Session> openHandler;
    private final Consumer<CloseReason> closeHandler;

    private EventLoopGroup group;
    private Channel ch;

    private static final class WebSocketChannelHandler extends ChannelInitializer<SocketChannel> {

        private final String host;
        private final int port;
        private final SslContext sslCtx;
        private final WebSocketClientHandler handler;

        private WebSocketChannelHandler(String host, int port, SslContext sslCtx, WebSocketClientHandler handler) {
            this.host = host;
            this.port = port;
            this.sslCtx = sslCtx;
            this.handler = handler;
        }

        @Override
        protected void initChannel(SocketChannel ch) {
            ChannelPipeline p = ch.pipeline();
            if (sslCtx != null) {
                p.addLast(sslCtx.newHandler(ch.alloc(), host, port));
            }
            p.addLast(
                new HttpClientCodec(),
                new HttpObjectAggregator(8192),
                WebSocketClientCompressionHandler.INSTANCE,
                handler);
        }
    }

    SessionNettyImpl(ClientEndpointConfiguration cec, String path,
                            AtomicReference<ClientLogger> loggerReference,
                            Consumer<Object> messageHandler,
                            Consumer<Session> openHandler,
                            Consumer<CloseReason> closeHandler) {
        this.path = path;
        this.loggerReference = loggerReference;
        this.messageEncoder = cec.getMessageEncoder();
        this.messageDecoder = cec.getMessageDecoder();
        this.protocol = cec.getProtocol();
        this.userAgent = cec.getUserAgent();
        this.messageHandler = messageHandler;
        this.openHandler = openHandler;
        this.closeHandler = closeHandler;
    }

    void connect() throws URISyntaxException, SSLException, InterruptedException {
        URI uri = new URI(path);
        String scheme = uri.getScheme() == null ? "ws" : uri.getScheme();
        final String host = uri.getHost() == null ? "127.0.0.1" : uri.getHost();
        final int port;
        if (uri.getPort() == -1) {
            if ("ws".equalsIgnoreCase(scheme)) {
                port = 80;
            } else if ("wss".equalsIgnoreCase(scheme)) {
                port = 443;
            } else {
                port = -1;
            }
        } else {
            port = uri.getPort();
        }

        if (!"ws".equalsIgnoreCase(scheme) && !"wss".equalsIgnoreCase(scheme)) {
            throw new IllegalArgumentException("Only WS(S) is supported.");
        }

        final boolean ssl = "wss".equalsIgnoreCase(scheme);
        final SslContext sslCtx;
        if (ssl) {
            sslCtx = SslContextBuilder.forClient().trustManager(InsecureTrustManagerFactory.INSTANCE).build();
        } else {
            sslCtx = null;
        }

        group = new NioEventLoopGroup();

        final WebSocketClientHandler handler =
            new WebSocketClientHandler(
                WebSocketClientHandshakerFactory.newHandshaker(
                    uri, WebSocketVersion.V13, protocol, true,
                    new DefaultHttpHeaders().add(HttpHeaderName.USER_AGENT.getCaseInsensitiveName(), userAgent)),
                loggerReference, messageDecoder, messageHandler, closeHandler);

        Bootstrap b = new Bootstrap();
        b.group(group)
            .channel(NioSocketChannel.class)
            .handler(new WebSocketChannelHandler(host, port, sslCtx, handler));

        ch = b.connect(uri.getHost(), port).sync().channel();
        handler.handshakeFuture().sync();

        openHandler.accept(this);
    }

    @Override
    public boolean isOpen() {
        return ch != null && ch.isOpen();
    }

    @Override
    public void sendObjectAsync(Object data, SendHandler handler) {
        if (ch != null && ch.isOpen()) {
            try {
                String msg = messageEncoder.encode((WebPubSubMessage) data);
                WebSocketFrame frame = new TextWebSocketFrame(msg);
                ch.writeAndFlush(frame).addListener(future -> {
                    if (future.isSuccess()) {
                        handler.onResult(new SendResult());
                    } else {
                        handler.onResult(new SendResult(future.cause()));
                    }
                });
            } catch (EncodeException e) {
                handler.onResult(new SendResult(e));
            }
        } else {
            handler.onResult(new SendResult(new IllegalStateException("Channel is closed")));
        }
    }

    @Override
    public void close() {
        if (group != null) {
            try {
                if (ch != null && ch.isOpen()) {
                    ch.writeAndFlush(new CloseWebSocketFrame());
                    ch.closeFuture().sync();

                    closeHandler.accept(CloseReasons.NORMAL_CLOSURE.getCloseReason());
                }

                group.shutdownGracefully();
            } catch (Exception e) {
                throw loggerReference.get().logExceptionAsError(new ConnectFailedException("Failed to disconnect", e));
            }
        }
    }
}
