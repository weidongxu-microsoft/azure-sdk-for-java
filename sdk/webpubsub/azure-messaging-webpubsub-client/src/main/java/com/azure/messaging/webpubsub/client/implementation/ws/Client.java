// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

import com.azure.core.util.logging.ClientLogger;

import javax.websocket.CloseReason;
import javax.websocket.EndpointConfig;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public interface Client {

    // Session requires isOpen, close, sendObject

    Session connectToServer(ClientEndpointConfiguration cec, String path,
                            AtomicReference<ClientLogger> loggerReference,
                            Consumer<Object> messageHandler,
                            BiConsumer<Session, EndpointConfig> openHandler,
                            BiConsumer<Session, CloseReason> closeHandler);
}
