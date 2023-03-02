// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client.implementation.ws;

import javax.websocket.CloseReason;
import javax.websocket.SendHandler;

public interface Session {

    boolean isOpen();

    void sendObject(Object data, SendHandler handler);

    void close(CloseReason closeReason);
}
