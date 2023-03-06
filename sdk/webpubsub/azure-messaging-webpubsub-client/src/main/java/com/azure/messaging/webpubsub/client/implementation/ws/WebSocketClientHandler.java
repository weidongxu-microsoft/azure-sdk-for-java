// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

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
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public final class WebSocketClientHandler extends SimpleChannelInboundHandler<Object> {

    private final WebSocketClientHandshaker handshaker;
    private final Consumer<Object> messageHandler;
    private final BiConsumer<Session, CloseReason> closeHandler;
    private ChannelPromise handshakeFuture;

    private static final MessageDecoder DECODER = new MessageDecoder();

    public WebSocketClientHandler(WebSocketClientHandshaker handshaker,
                                  Consumer<Object> messageHandler,
                                  BiConsumer<Session, CloseReason> closeHandler) {
        this.handshaker = handshaker;
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
            throw new IllegalStateException(
                "Unexpected FullHttpResponse (getStatus=" + response.status() + ", content=" + response.content().toString(CharsetUtil.UTF_8) + ')');
        }

        WebSocketFrame frame = (WebSocketFrame) msg;
        if (frame instanceof TextWebSocketFrame) {
            // Text
            TextWebSocketFrame textFrame = (TextWebSocketFrame) frame;
            Object wpsMessage = DECODER.decode(textFrame.text());
            messageHandler.accept(wpsMessage);
        } else if (frame instanceof PingWebSocketFrame) {
            // reply Pong to Ping
            ch.writeAndFlush(new PongWebSocketFrame());
        } else if (frame instanceof CloseWebSocketFrame) {
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
