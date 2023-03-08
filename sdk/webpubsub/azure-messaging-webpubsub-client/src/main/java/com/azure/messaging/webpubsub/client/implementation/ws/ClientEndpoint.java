// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

import com.azure.core.util.logging.ClientLogger;

import javax.websocket.CloseReason;
import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public final class ClientEndpoint extends Endpoint {

    private final Consumer<Object> messageHandler;
    private final BiConsumer<Session, EndpointConfig> openHandler;
    private final BiConsumer<Session, CloseReason> closeHandler;
    private final AtomicReference<ClientLogger> loggerReference;

    public ClientEndpoint(AtomicReference<ClientLogger> loggerReference,
                          Consumer<Object> messageHandler,
                          BiConsumer<Session, EndpointConfig> openHandler,
                          BiConsumer<Session, CloseReason> closeHandler) {
        this.messageHandler = messageHandler;
        this.openHandler = openHandler;
        this.closeHandler = closeHandler;
        this.loggerReference = loggerReference;
    }

    @Override
    public void onOpen(javax.websocket.Session session, EndpointConfig config) {
        session.addMessageHandler((MessageHandler.Whole<Object>) messageHandler::accept);

        openHandler.accept(new SessionTyrusImpl(session, loggerReference), config);
    }

    @Override
    public void onClose(javax.websocket.Session session, CloseReason closeReason) {
        closeHandler.accept(new SessionTyrusImpl(session, loggerReference), closeReason);
    }
}
