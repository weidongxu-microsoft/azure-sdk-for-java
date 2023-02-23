// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client;

import com.azure.core.util.Configuration;
import com.azure.messaging.webpubsub.WebPubSubServiceAsyncClient;
import com.azure.messaging.webpubsub.WebPubSubServiceClientBuilder;
import com.azure.messaging.webpubsub.client.models.SendToGroupOptions;
import com.azure.messaging.webpubsub.client.models.WebPubSubClientCredential;
import com.azure.messaging.webpubsub.client.models.WebPubSubDataType;
import com.azure.messaging.webpubsub.models.GetClientAccessTokenOptions;
import com.azure.messaging.webpubsub.models.WebPubSubClientAccessToken;
import reactor.core.publisher.Mono;

public class HelloWorldSample {

    public static void main(String[] args) throws Exception {

        // browser https://learn.microsoft.com/azure/azure-web-pubsub/quickstart-live-demo

        // prepare the clientCredential
        WebPubSubServiceAsyncClient serviceClient = new WebPubSubServiceClientBuilder()
            .connectionString(Configuration.getGlobalConfiguration().get("CONNECTION_STRING"))
            .hub("hub1")
            .buildAsyncClient();
        WebPubSubClientCredential clientCredential = new WebPubSubClientCredential(Mono.defer(() ->
            serviceClient.getClientAccessToken(new GetClientAccessTokenOptions()
                    .setUserId("bot1")
                    .addRole("webpubsub.joinLeaveGroup")
                    .addRole("webpubsub.sendToGroup"))
                .map(WebPubSubClientAccessToken::getUrl)));

        // create client
        WebPubSubAsyncClient client = new WebPubSubClientBuilder()
            .credential(clientCredential)
            .buildAsyncClient();

        String groupName = "bot";

        // subscribe to messages, and send reply
        client.receiveGroupMessageEvents()
            .filter(message -> groupName.equals(message.getMessage().getGroup()) && !"bot1".equals(message.getMessage().getFromUserId()))
            .concatMap(message -> {
                String group = message.getMessage().getGroup();
                if (message.getMessage().getDataType() == WebPubSubDataType.TEXT || message.getMessage().getDataType() == WebPubSubDataType.JSON) {
                    String text = message.getMessage().getData().toString();
                    if ("exit".equals(text) || "\"exit\"".equals(text)) {
                        // asked to exit
                        return client.sendToGroup(group, "Goodbye.")
                            .then(client.stop());
                    } else {
                        return client.sendToGroup(group, "Received: " + text);
                    }
                } else {
                    return client.sendToGroup(group, "Sorry, I do not understand.");
                }
            }).subscribe();

        // start client, join group and send "Hello"
        client.start()
            .then(client.joinGroup(groupName))
            .then(client.sendToGroup(groupName, "Hello.", new SendToGroupOptions().setNoEcho(true)))
            .subscribe();

        // wait for client to stop
        client.receiveStoppedEvents().blockFirst();
        client.close();
    }
}
