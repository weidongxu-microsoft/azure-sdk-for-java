// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

import javax.websocket.SendHandler;

public interface Session {

    boolean isOpen();

    void sendObjectAsync(Object data, SendHandler handler);

    void close();
}
