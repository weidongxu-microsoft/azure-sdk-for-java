// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

import javax.websocket.CloseReason;
import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import javax.websocket.Session;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public final class ClientEndpoint extends Endpoint {

    private final Consumer<Object> messageHandler;
    private final BiConsumer<Session, EndpointConfig> openHandler;
    private final BiConsumer<Session, CloseReason> closeHandler;

    public ClientEndpoint(Consumer<Object> messageHandler,
                          BiConsumer<Session, EndpointConfig> openHandler,
                          BiConsumer<Session, CloseReason> closeHandler) {
        this.messageHandler = messageHandler;
        this.openHandler = openHandler;
        this.closeHandler = closeHandler;
    }

    @Override
    public void onOpen(Session session, EndpointConfig config) {
        session.addMessageHandler((MessageHandler.Whole<Object>) messageHandler::accept);

        openHandler.accept(session, config);
    }

    @Override
    public void onClose(Session session, CloseReason closeReason) {
        closeHandler.accept(session, closeReason);
    }
}
