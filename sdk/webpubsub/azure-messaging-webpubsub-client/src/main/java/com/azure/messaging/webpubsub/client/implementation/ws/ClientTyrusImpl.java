// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.webpubsub.client.implementation.MessageDecoder;
import com.azure.messaging.webpubsub.client.implementation.MessageEncoder;
import com.azure.messaging.webpubsub.client.models.ConnectFailedException;
import org.glassfish.tyrus.client.ClientManager;

import javax.websocket.ClientEndpointConfig;
import javax.websocket.CloseReason;
import javax.websocket.EndpointConfig;
import java.net.URI;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public final class ClientTyrusImpl implements Client {

    private final ClientManager clientManager;

    public ClientTyrusImpl() {
        clientManager = ClientManager.createClient();
    }

    @Override
    public Session connectToServer(ClientEndpointConfiguration cec, String path,
                                   AtomicReference<ClientLogger> loggerReference,
                                   Consumer<Object> messageHandler,
                                   BiConsumer<Session, EndpointConfig> openHandler,
                                   BiConsumer<Session, CloseReason> closeHandler) {

        ClientEndpoint endpoint = new ClientEndpoint(loggerReference, messageHandler, openHandler, closeHandler);

        ClientEndpointConfig config = ClientEndpointConfig.Builder.create()
            .preferredSubprotocols(Collections.singletonList(cec.getProtocol()))
            .encoders(Collections.singletonList(MessageEncoder.class))
            .decoders(Collections.singletonList(MessageDecoder.class))
            .build();

        try {
            return new SessionTyrusImpl(clientManager.connectToServer(endpoint, config, new URI(path)), loggerReference);
        } catch (Exception e) {
            throw loggerReference.get().logExceptionAsError(new ConnectFailedException("Failed to connect", e));
        }
    }
}
