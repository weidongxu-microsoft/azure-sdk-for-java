// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client;

import com.azure.core.test.annotation.DoNotRecord;
import com.azure.core.util.BinaryData;
import com.azure.messaging.webpubsub.client.implementation.WebPubSubClientState;
import com.azure.messaging.webpubsub.client.models.WebPubSubDataType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class ClientTests extends TestBase {

    @Test
    @DoNotRecord(skipInPlayback = true)
    public void testClientState() {
        WebPubSubAsyncClient asyncClient = getClientBuilder().buildAsyncClient();

        Assertions.assertEquals(WebPubSubClientState.STOPPED, asyncClient.getClientState());

        Mono<Void> startMono = asyncClient.start().doOnSuccess(ignored -> {
            Assertions.assertEquals(WebPubSubClientState.CONNECTED, asyncClient.getClientState());
        });
        // test transient state of CONNECTING
        Mono<Void> verifyMono = Mono.delay(Duration.ofMillis(10)).then().doOnSuccess(ignored -> {
            Assertions.assertEquals(WebPubSubClientState.CONNECTING, asyncClient.getClientState());
        });
        startMono.and(verifyMono).block();

        asyncClient.stop().doOnSuccess(ignored -> {
            Assertions.assertEquals(WebPubSubClientState.STOPPED, asyncClient.getClientState());
        }).block();

        asyncClient.start().block();
        Assertions.assertEquals(WebPubSubClientState.CONNECTED, asyncClient.getClientState());
        asyncClient.stop().block();
        Assertions.assertEquals(WebPubSubClientState.STOPPED, asyncClient.getClientState());
    }

    @Test
    @DoNotRecord(skipInPlayback = true)
    public void testTwoClients() throws InterruptedException {
        String groupName = "group1";
        CountDownLatch latch = new CountDownLatch(1);

        WebPubSubClient client1 = getClientBuilder("user1")
            .processGroupMessageEvent(event -> {
                latch.countDown();
            })
            .buildClient();

        WebPubSubClient client2 = getClientBuilder("user2")
            .buildClient();

        client1.start();
        client2.start();

        client1.joinGroup(groupName);
        client2.joinGroup(groupName);

        client2.sendToGroup(groupName, BinaryData.fromString("hello"), WebPubSubDataType.TEXT);

        client2.stop();

        boolean success = latch.await(10, TimeUnit.SECONDS);
        client1.stop();

        Assertions.assertTrue(success);
        Assertions.assertEquals(0, latch.getCount());
    }

    @Test
    @DoNotRecord(skipInPlayback = true)
    public void testNoCredential() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            WebPubSubClient client = new WebPubSubClientBuilder().buildClient();
        });
    }

//    @Test
//    @DoNotRecord(skipInPlayback = true)
//    @Order(1000)    // last
//    public void testClosed() {
//        WebPubSubClient client = getClient();
//
//        Assertions.assertEquals(WebPubSubClientState.STOPPED, client.getClientState());
//
//        client.close();
//        Assertions.assertEquals(WebPubSubClientState.CLOSED, client.getClientState());
//
//        Assertions.assertThrows(IllegalStateException.class, () -> client.joinGroup("group"));
//    }
}
