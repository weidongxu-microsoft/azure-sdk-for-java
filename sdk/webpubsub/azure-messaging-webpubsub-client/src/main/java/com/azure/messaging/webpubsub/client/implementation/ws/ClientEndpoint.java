// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

import com.azure.core.util.logging.ClientLogger;

import javax.websocket.CloseReason;
import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

final class ClientEndpoint extends Endpoint {

    private final Consumer<Object> messageHandler;
    private final Consumer<Session> openHandler;
    private final Consumer<CloseReason> closeHandler;
    private final AtomicReference<ClientLogger> loggerReference;

    ClientEndpoint(AtomicReference<ClientLogger> loggerReference,
                          Consumer<Object> messageHandler,
                          Consumer<Session> openHandler,
                          Consumer<CloseReason> closeHandler) {
        this.messageHandler = messageHandler;
        this.openHandler = openHandler;
        this.closeHandler = closeHandler;
        this.loggerReference = loggerReference;
    }

    @Override
    public void onOpen(javax.websocket.Session session, EndpointConfig config) {
        session.addMessageHandler((MessageHandler.Whole<Object>) messageHandler::accept);

        openHandler.accept(new SessionTyrusImpl(session, loggerReference));
    }

    @Override
    public void onClose(javax.websocket.Session session, CloseReason closeReason) {
        closeHandler.accept(closeReason);
    }
}
