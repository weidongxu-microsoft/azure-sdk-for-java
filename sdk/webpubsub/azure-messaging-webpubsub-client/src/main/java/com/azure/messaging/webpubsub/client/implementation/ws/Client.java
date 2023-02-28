// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

import javax.websocket.ClientEndpointConfig;
import javax.websocket.CloseReason;
import javax.websocket.DeploymentException;
import javax.websocket.EndpointConfig;
import javax.websocket.Session;
import java.io.IOException;
import java.net.URI;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public interface Client {

    // Session requires isOpen, close, sendObject

    Session connectToServer(ClientEndpointConfig cec, URI path,
                            Consumer<Object> messageHandler,
                            BiConsumer<Session, EndpointConfig> openHandler,
                            BiConsumer<Session, CloseReason> closeHandler) throws
        DeploymentException, IOException;
}
