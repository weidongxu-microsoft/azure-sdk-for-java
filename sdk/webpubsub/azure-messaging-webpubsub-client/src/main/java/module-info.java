// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

module azure.messaging.webpubsub.client {
    requires transitive com.azure.core;

    requires javax.websocket.api;
    requires tyrus.core;
    requires tyrus.client;

    exports com.azure.messaging.webpubsub.client;
    exports com.azure.messaging.webpubsub.client.models;

    opens com.azure.messaging.webpubsub.client.implementation to
        com.azure.core,
        com.fasterxml.jackson.databind,
        javax.websocket.api,
        tyrus.core,
        tyrus.client;
}
