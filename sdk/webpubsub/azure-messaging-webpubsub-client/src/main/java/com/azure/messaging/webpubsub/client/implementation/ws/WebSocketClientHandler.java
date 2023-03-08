// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.webpubsub.client.implementation.MessageDecoder;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.websocketx.CloseWebSocketFrame;
import io.netty.handler.codec.http.websocketx.PingWebSocketFrame;
import io.netty.handler.codec.http.websocketx.PongWebSocketFrame;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketClientHandshaker;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketHandshakeException;
import io.netty.util.CharsetUtil;

import javax.websocket.CloseReason;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public final class WebSocketClientHandler extends SimpleChannelInboundHandler<Object> {

    private final WebSocketClientHandshaker handshaker;
    private ChannelPromise handshakeFuture;

    private final AtomicReference<ClientLogger> loggerReference;
    private final MessageDecoder messageDecoder;
    private final Consumer<Object> messageHandler;
    private final BiConsumer<Session, CloseReason> closeHandler;

    public WebSocketClientHandler(WebSocketClientHandshaker handshaker,
                                  AtomicReference<ClientLogger> loggerReference,
                                  MessageDecoder messageDecoder,
                                  Consumer<Object> messageHandler,
                                  BiConsumer<Session, CloseReason> closeHandler) {
        this.handshaker = handshaker;
        this.loggerReference = loggerReference;
        this.messageDecoder = messageDecoder;
        this.messageHandler = messageHandler;
        this.closeHandler = closeHandler;
    }

    public ChannelFuture handshakeFuture() {
        return handshakeFuture;
    }

    @Override
    public void handlerAdded(ChannelHandlerContext ctx) {
        handshakeFuture = ctx.newPromise();
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        handshaker.handshake(ctx.channel());
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
        Channel ch = ctx.channel();
        if (handshakeFuture != null && !handshaker.isHandshakeComplete()) {
            try {
                handshaker.finishHandshake(ch, (FullHttpResponse) msg);
                handshakeFuture.setSuccess();
            } catch (WebSocketHandshakeException e) {
                handshakeFuture.setFailure(e);
            }
            return;
        }

        if (msg instanceof FullHttpResponse) {
            FullHttpResponse response = (FullHttpResponse) msg;
            throw loggerReference.get().logExceptionAsError(new IllegalStateException("Unexpected FullHttpResponse (getStatus=" + response.status() + ", content=" + response.content().toString(CharsetUtil.UTF_8) + ')'));
        }

        WebSocketFrame frame = (WebSocketFrame) msg;
        if (frame instanceof TextWebSocketFrame) {
            loggerReference.get().atVerbose().log("Received TextWebSocketFrame");
            // Text
            TextWebSocketFrame textFrame = (TextWebSocketFrame) frame;
            Object wpsMessage = messageDecoder.decode(textFrame.text());
            messageHandler.accept(wpsMessage);
        } else if (frame instanceof PingWebSocketFrame) {
            loggerReference.get().atVerbose().log("Received PingWebSocketFrame");
            // reply Pong to Ping
            ch.writeAndFlush(new PongWebSocketFrame());
        } else if (frame instanceof PongWebSocketFrame) {
            loggerReference.get().atVerbose().log("Received PongWebSocketFrame");
        } else if (frame instanceof CloseWebSocketFrame) {
            loggerReference.get().atVerbose().log("Received CloseWebSocketFrame");
            // Close
            CloseWebSocketFrame closeFrame = (CloseWebSocketFrame) frame;
            ch.close().addListener(future -> {
                closeHandler.accept(null, new CloseReason(CloseReason.CloseCodes.getCloseCode(closeFrame.statusCode()), closeFrame.reasonText()));
            });
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        if (handshakeFuture != null && !handshakeFuture.isDone()) {
            handshakeFuture.setFailure(cause);
        }
        ctx.close();
    }
}
