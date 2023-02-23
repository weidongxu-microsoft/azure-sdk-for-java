// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client;

import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import com.azure.messaging.webpubsub.WebPubSubServiceAsyncClient;
import com.azure.messaging.webpubsub.WebPubSubServiceClientBuilder;
import com.azure.messaging.webpubsub.client.models.GroupDataMessage;
import com.azure.messaging.webpubsub.client.models.WebPubSubClientCredential;
import com.azure.messaging.webpubsub.client.models.WebPubSubDataType;
import com.azure.messaging.webpubsub.models.GetClientAccessTokenOptions;
import com.azure.messaging.webpubsub.models.WebPubSubClientAccessToken;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicReference;

public class EchoSample {

    public static void main(String[] args) throws Exception {

        // browser https://learn.microsoft.com/azure/azure-web-pubsub/quickstart-live-demo

        final String groupName = "bot";
        final String userName = "bot1";

        // prepare the clientCredential
        WebPubSubServiceAsyncClient serviceClient = new WebPubSubServiceClientBuilder()
            .connectionString(Configuration.getGlobalConfiguration().get("CONNECTION_STRING"))
            .hub("hub1")
            .buildAsyncClient();
        WebPubSubClientCredential clientCredential = new WebPubSubClientCredential(Mono.defer(() ->
            serviceClient.getClientAccessToken(new GetClientAccessTokenOptions()
                    .setUserId(userName)
                    .addRole("webpubsub.joinLeaveGroup")
                    .addRole("webpubsub.sendToGroup"))
                .map(WebPubSubClientAccessToken::getUrl)));

        CompletableFuture<Void> clientStopped = new CompletableFuture<>();

        AtomicReference<WebPubSubClient> self = new AtomicReference<>();

        // create client
        WebPubSubClient client = new WebPubSubClientBuilder()
            .credential(clientCredential)
            .processGroupMessageEvent(event -> {
                String group = event.getMessage().getGroup();
                if (groupName.equals(event.getMessage().getGroup())
                    && !userName.equals(event.getMessage().getFromUserId())
                    && (event.getMessage().getDataType() == WebPubSubDataType.TEXT || event.getMessage().getDataType() == WebPubSubDataType.JSON)) {

                    String text = parseMessage(event.getMessage());
                    if ("exit".equals(text)) {
                        // asked to exit
                        self.get().sendToGroup(group, BinaryData.fromString("Goodbye."), WebPubSubDataType.TEXT);
                        self.get().stop();
                    } else {
                        // echo the message text
                        self.get().sendToGroup(group, BinaryData.fromString("Received: " + text), WebPubSubDataType.TEXT);
                    }
                }
            })
            .processStoppedEvent(event -> {
                clientStopped.complete(null);
            })
            .buildClient();

        self.set(client);

        // start client, join group and send "Hello"
        client.start();
        client.joinGroup(groupName);
        client.sendToGroup(groupName, BinaryData.fromString("Hello."), WebPubSubDataType.TEXT);

        // wait for client to stop
        clientStopped.get();
    }

    private static String parseMessage(GroupDataMessage message) {
        return message.getDataType() == WebPubSubDataType.TEXT
            ? message.getData().toString()
            : message.getData().toObject(String.class);
    }
}
