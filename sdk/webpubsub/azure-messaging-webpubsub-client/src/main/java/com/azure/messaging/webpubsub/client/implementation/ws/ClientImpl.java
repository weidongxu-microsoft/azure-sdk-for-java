// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.webpubsub.client.models.ConnectFailedException;
import org.glassfish.tyrus.client.ClientManager;

import javax.websocket.ClientEndpointConfig;
import javax.websocket.CloseReason;
import javax.websocket.EndpointConfig;
import java.net.URI;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public final class ClientImpl implements Client {

    private final ClientManager clientManager;

    public ClientImpl() {
        clientManager = ClientManager.createClient();
    }

    @Override
    public Session connectToServer(ClientEndpointConfig cec, String path,
                                   ClientLogger logger,
                                   Consumer<Object> messageHandler,
                                   BiConsumer<Session, EndpointConfig> openHandler,
                                   BiConsumer<Session, CloseReason> closeHandler) {

        ClientEndpoint endpoint = new ClientEndpoint(logger, messageHandler, openHandler, closeHandler);

        try {
            return new SessionImpl(clientManager.connectToServer(endpoint, cec, new URI(path)), logger);
        } catch (Exception e) {
            throw logger.logExceptionAsError(new ConnectFailedException("Failed to connect", e));
        }
    }
}
