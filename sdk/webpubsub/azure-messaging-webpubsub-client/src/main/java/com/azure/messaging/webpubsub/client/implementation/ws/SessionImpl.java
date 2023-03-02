// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.webpubsub.client.models.ConnectFailedException;

import javax.websocket.CloseReason;
import javax.websocket.SendHandler;

public final class SessionImpl implements Session {

    private final javax.websocket.Session session;
    private final ClientLogger logger;

    public SessionImpl(javax.websocket.Session session, ClientLogger logger) {
        this.session = session;
        this.logger = logger;
    }

    @Override
    public boolean isOpen() {
        return session.isOpen();
    }

    @Override
    public void sendObject(Object data, SendHandler handler) {
        session.getAsyncRemote().sendObject(data, handler);
    }

    @Override
    public void close(CloseReason closeReason) {
        try {
            session.close(closeReason);
        } catch (Exception e) {
            throw logger.logExceptionAsError(new ConnectFailedException("Failed to connect", e));
        }
    }
}
