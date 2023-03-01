// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

module azure.messaging.webpubsub.client {
    requires transitive com.azure.core;

    requires javax.websocket.api;
    requires tyrus.core;
    requires tyrus.client;

    exports com.azure.messaging.webpubsub.client;

    opens com.azure.messaging.webpubsub.client.implementation to
        com.azure.core,
        com.fasterxml.jackson.databind,
        javax.websocket.api,
        tyrus.core,
        tyrus.client;

    requires transitive com.azure.core.test;
    requires com.azure.http.netty;
    requires com.azure.messaging.webpubsub;
    requires org.junit.jupiter.api;
    requires org.junit.jupiter.engine;
    requires org.junit.jupiter.params;
    requires org.mockito;
    requires net.bytebuddy;
    requires net.bytebuddy.agent;
}
