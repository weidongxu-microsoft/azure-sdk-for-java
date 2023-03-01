// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.webpubsub.client.models.ConnectFailedException;
import org.glassfish.tyrus.client.ClientManager;

import javax.websocket.ClientEndpointConfig;
import javax.websocket.CloseReason;
import javax.websocket.DeploymentException;
import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
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

        ClientEndpoint endpoint = new ClientEndpoint(messageHandler, openHandler, closeHandler);

        try {
            return clientManager.connectToServer(endpoint, cec, new URI(path));
        } catch (URISyntaxException | DeploymentException | IOException e) {
            throw logger.logExceptionAsError(new ConnectFailedException("Failed to connect", e));
        }
    }
}
