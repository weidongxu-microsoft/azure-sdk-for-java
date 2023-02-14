// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.util.BinaryData;
import com.azure.core.util.IterableStream;
import com.azure.messaging.webpubsub.client.implementation.WebPubSubClientState;
import com.azure.messaging.webpubsub.client.models.ConnectedEvent;
import com.azure.messaging.webpubsub.client.models.DisconnectedEvent;
import com.azure.messaging.webpubsub.client.models.GroupMessageEvent;
import com.azure.messaging.webpubsub.client.models.SendEventOptions;
import com.azure.messaging.webpubsub.client.models.SendToGroupOptions;
import com.azure.messaging.webpubsub.client.models.ServerMessageEvent;
import com.azure.messaging.webpubsub.client.models.StoppedEvent;
import com.azure.messaging.webpubsub.client.models.WebPubSubDataType;
import com.azure.messaging.webpubsub.client.models.WebPubSubResult;
import reactor.core.scheduler.Schedulers;

import java.util.function.Consumer;

/**
 * The WebPubSubAsync client.
 */
@ServiceClient(builder = WebPubSubClientBuilder.class)
public class WebPubSubClient {

    private final WebPubSubAsyncClient client;

//    WebPubSubClient(WebPubSubAsyncClient client) {
//        this.client = client;
//    }

    WebPubSubClient(WebPubSubAsyncClient client,
                    Consumer<GroupMessageEvent> processGroupMessageEvent,
                    Consumer<ServerMessageEvent> processServerMessageEvent,
                    Consumer<ConnectedEvent> processConnectedEvent,
                    Consumer<DisconnectedEvent> processDisconnectedEvent,
                    Consumer<StoppedEvent> processStoppedEvent) {
        this.client = client;
        if (processGroupMessageEvent != null) {
            client.receiveGroupMessageEvents()
                .publishOn(Schedulers.boundedElastic())
                .subscribe(processGroupMessageEvent);
        }
        if (processServerMessageEvent != null) {
            client.receiveServerMessageEvents()
                .publishOn(Schedulers.boundedElastic())
                .subscribe(processServerMessageEvent);
        }
        if (processConnectedEvent != null) {
            client.receiveConnectedEvents()
                .publishOn(Schedulers.boundedElastic())
                .subscribe(processConnectedEvent);
        }
        if (processDisconnectedEvent != null) {
            client.receiveDisconnectedEvents()
                .publishOn(Schedulers.boundedElastic())
                .subscribe(processDisconnectedEvent);
        }
        if (processStoppedEvent != null) {
            client.receiveStoppedEvents()
                .publishOn(Schedulers.boundedElastic())
                .subscribe(processStoppedEvent);
        }
    }

    /**
     * Gets the connection ID.
     *
     * @return the connection ID.
     */
    public String getConnectionId() {
        return this.client.getConnectionId();
    }

    /**
     * Starts the client for connecting to the server.
     */
    public void start() {
        client.start().block();
    }

    /**
     * Stops the client for disconnecting from the server.
     */
    public void stop() {
        client.stop().block();
    }

//    /**
//     * Closes the client.
//     */
//    @Override
//    public void close() {
//        client.close();
//    }

    /**
     * Joins a group.
     *
     * @param group the group name.
     * @return the result.
     */
    public WebPubSubResult joinGroup(String group) {
        return client.joinGroup(group).block();
    }

    /**
     * Joins a group.
     *
     * @param group the group name.
     * @param ackId the ackId.
     * @return the result.
     */
    public WebPubSubResult joinGroup(String group, long ackId) {
        return client.joinGroup(group, ackId).block();
    }

    /**
     * Leaves a group.
     *
     * @param group the group name.
     * @return the result.
     */
    public WebPubSubResult leaveGroup(String group) {
        return client.leaveGroup(group).block();
    }

    /**
     * Leaves a group.
     *
     * @param group the group name.
     * @param ackId the ackId.
     * @return the result.
     */
    public WebPubSubResult leaveGroup(String group, long ackId) {
        return client.leaveGroup(group, ackId).block();
    }

    /**
     * Sends message to group.
     *
     * @param group the group name.
     * @param content the data.
     * @param dataType the data type.
     * @return the result.
     */
    public WebPubSubResult sendToGroup(String group, BinaryData content, WebPubSubDataType dataType) {
        return client.sendToGroup(group, content, dataType).block();
    }

    /**
     * Sends message to group.
     *
     * @param group the group name.
     * @param content the data.
     * @param dataType the data type.
     * @param options the options.
     * @return the result.
     */
    public WebPubSubResult sendToGroup(String group, BinaryData content, WebPubSubDataType dataType,
                                       SendToGroupOptions options) {
        return client.sendToGroup(group, content, dataType, options).block();
    }

    /**
     * Sends event.
     *
     * @param eventName the event name.
     * @param content the data.
     * @param dataType the data type.
     * @return the result.
     */
    public WebPubSubResult sendEvent(String eventName, BinaryData content, WebPubSubDataType dataType) {
        return client.sendEvent(eventName, content, dataType).block();
    }

    /**
     * Sends event.
     *
     * @param eventName the event name.
     * @param content the data.
     * @param dataType the data type.
     * @param options the options.
     * @return the result.
     */
    public WebPubSubResult sendEvent(String eventName, BinaryData content, WebPubSubDataType dataType,
                                           SendEventOptions options) {
        return client.sendEvent(eventName, content, dataType, options).block();
    }

    /**
     * Receives group message events.
     *
     * @return the Stream of group message events.
     */
    IterableStream<GroupMessageEvent> receiveGroupMessageEvents() {
        return new IterableStream<>(client.receiveGroupMessageEvents());
    }

    /**
     * Receives server message events.
     *
     * @return the Stream of server message events.
     */
    IterableStream<ServerMessageEvent> receiveServerMessageEvents() {
        return new IterableStream<>(client.receiveServerMessageEvents());
    }

    /**
     * Receives connected events.
     *
     * @return the Stream of connected events.
     */
    IterableStream<ConnectedEvent> receiveConnectedEvents() {
        return new IterableStream<>(client.receiveConnectedEvents());
    }

    /**
     * Receives disconnected events.
     *
     * @return the Stream of disconnected events.
     */
    IterableStream<DisconnectedEvent> receiveDisconnectedEvents() {
        return new IterableStream<>(client.receiveDisconnectedEvents());
    }

    /**
     * Receives stopped events.
     *
     * @return the Stream of stopped events.
     */
    IterableStream<StoppedEvent> receiveStoppedEvents() {
        return new IterableStream<>(client.receiveStoppedEvents());
    }

    WebPubSubClientState getClientState() {
        return this.client.getClientState();
    }
}
