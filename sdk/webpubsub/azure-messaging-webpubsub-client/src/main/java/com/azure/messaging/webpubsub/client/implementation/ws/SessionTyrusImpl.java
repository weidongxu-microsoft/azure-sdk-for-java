// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.webpubsub.client.models.ConnectFailedException;

import javax.websocket.CloseReason;
import javax.websocket.SendHandler;
import java.util.concurrent.atomic.AtomicReference;

public final class SessionTyrusImpl implements Session {

    private final javax.websocket.Session session;
    private final AtomicReference<ClientLogger> loggerReference;

    public SessionTyrusImpl(javax.websocket.Session session, AtomicReference<ClientLogger> loggerReference) {
        this.session = session;
        this.loggerReference = loggerReference;
    }

    @Override
    public boolean isOpen() {
        return session.isOpen();
    }

    @Override
    public void sendObjectAsync(Object data, SendHandler handler) {
        session.getAsyncRemote().sendObject(data, handler);
    }

    @Override
    public void close(CloseReason closeReason) {
        try {
            session.close(closeReason);
        } catch (Exception e) {
            throw loggerReference.get().logExceptionAsError(new ConnectFailedException("Failed to connect", e));
        }
    }
}
