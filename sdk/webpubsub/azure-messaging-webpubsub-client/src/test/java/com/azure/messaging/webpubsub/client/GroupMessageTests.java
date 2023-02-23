// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client;

import com.azure.core.test.annotation.DoNotRecord;
import com.azure.core.util.BinaryData;
import com.azure.messaging.webpubsub.client.models.SendMessageFailedException;
import com.azure.messaging.webpubsub.client.models.SendToGroupOptions;
import com.azure.messaging.webpubsub.client.models.WebPubSubDataType;
import com.azure.messaging.webpubsub.client.models.WebPubSubResult;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class GroupMessageTests extends TestBase {

    private static final String GROUP = "group";
    private static final String HELLO = "hello";
    private static final BinaryData HELLO_DATA = BinaryData.fromString(HELLO);

    @Test
    @DoNotRecord(skipInPlayback = true)
    public void testSendMessageBeforeStart() {
        WebPubSubClient client = getClient();
        Assertions.assertThrows(SendMessageFailedException.class, () -> client.sendToGroup(GROUP, HELLO));
    }

    @Test
    @DoNotRecord(skipInPlayback = true)
    public void testSendMessage() {
        WebPubSubClient client = getClient();
        try {
            client.start();

            WebPubSubResult result = client.sendToGroup(GROUP, HELLO);
            Assertions.assertNotNull(result.getAckId());

            // send with explicit ackId
            long ackId = new Random().nextLong() & Long.MAX_VALUE;
            result = client.sendToGroup(GROUP, HELLO_DATA, WebPubSubDataType.TEXT, new SendToGroupOptions().setAckId(ackId));
            Assertions.assertEquals(ackId, result.getAckId());
        } finally {
            client.stop();
        }
    }
}
