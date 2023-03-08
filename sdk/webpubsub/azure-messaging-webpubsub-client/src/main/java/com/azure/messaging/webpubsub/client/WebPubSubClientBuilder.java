// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.webpubsub.client;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.http.policy.ExponentialBackoff;
import com.azure.core.http.policy.FixedDelay;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryStrategy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.HttpClientOptions;
import com.azure.core.util.UserAgentUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.webpubsub.client.implementation.ws.Client;
import com.azure.messaging.webpubsub.client.models.ConnectedEvent;
import com.azure.messaging.webpubsub.client.models.DisconnectedEvent;
import com.azure.messaging.webpubsub.client.models.GroupMessageEvent;
import com.azure.messaging.webpubsub.client.models.ServerMessageEvent;
import com.azure.messaging.webpubsub.client.models.StoppedEvent;
import com.azure.messaging.webpubsub.client.models.WebPubSubClientCredential;
import com.azure.messaging.webpubsub.client.models.WebPubSubJsonReliableProtocol;
import com.azure.messaging.webpubsub.client.models.WebPubSubProtocol;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * The builder of WebPubSub client.
 */
@ServiceClientBuilder(serviceClients = {WebPubSubAsyncClient.class, WebPubSubClient.class})
public class WebPubSubClientBuilder implements ConfigurationTrait<WebPubSubClientBuilder> {

    private final ClientLogger logger = new ClientLogger(WebPubSubClientBuilder.class);

    private static final String PROPERTIES = "azure-messaging-webpubsub-client.properties";
    private static final String SDK_NAME = "name";
    private static final String SDK_VERSION = "version";

    private WebPubSubClientCredential credential;
    private String clientAccessUrl;

    private WebPubSubProtocol webPubSubProtocol = new WebPubSubJsonReliableProtocol();

    private ClientOptions clientOptions;
    private Configuration configuration;
    private final Map<String, String> properties;

    private RetryOptions retryOptions = null;
    private boolean autoReconnect = true;
    private boolean autoRestoreGroup = true;

    private Consumer<GroupMessageEvent> processGroupMessageEvent;
    private Consumer<ServerMessageEvent> processServerMessageEvent;
    private Consumer<ConnectedEvent> processConnectedEvent;
    private Consumer<DisconnectedEvent> processDisconnectedEvent;
    private Consumer<StoppedEvent> processStoppedEvent;

    Client client;

    /**
     * Creates a new instance of WebPubSubClientBuilder.
     */
    public WebPubSubClientBuilder() {
        properties = CoreUtils.getProperties(PROPERTIES);
    }

    /**
     * Sets the credential as the provider for client access URL.
     *
     * @param credential the credential as the provider for client access URL.
     * @return itself.
     */
    public WebPubSubClientBuilder credential(WebPubSubClientCredential credential) {
        this.credential = Objects.requireNonNull(credential);
        return this;
    }

    /**
     * Sets the credential as the provider for client access URL.
     *
     * @param clientAccessUrl the client access URL.
     * @return itself.
     */
    public WebPubSubClientBuilder clientAccessUrl(String clientAccessUrl) {
        this.clientAccessUrl = Objects.requireNonNull(clientAccessUrl);
        return this;
    }

    /**
     * Sets the protocol.
     *
     * @param webPubSubProtocol the protocol.
     * @return itself.
     */
    public WebPubSubClientBuilder protocol(WebPubSubProtocol webPubSubProtocol) {
        this.webPubSubProtocol = Objects.requireNonNull(webPubSubProtocol);
        return this;
    }

    /**
     * Sets the retry options when sending messages.
     *
     * @param retryOptions the retry options.
     * @return itself.
     */
    public WebPubSubClientBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = Objects.requireNonNull(retryOptions);
        return this;
    }

    /**
     * Allows for setting common properties such as application ID, headers, proxy configuration, etc.
     *
     * @param clientOptions A configured instance of {@link HttpClientOptions}.
     * @return Returns the same concrete type with the appropriate properties updated, to allow for fluent chaining of
     *      operations.
     */
    public WebPubSubClientBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WebPubSubClientBuilder configuration(final Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /**
     * Sets whether automatically reconnect after disconnect.
     *
     * @param autoReconnect whether automatically reconnect after disconnect.
     * @return itself.
     */
    public WebPubSubClientBuilder autoReconnect(boolean autoReconnect) {
        this.autoReconnect = autoReconnect;
        return this;
    }

    /**
     * Sets whether automatically restore joined groups after reconnect.
     *
     * @param autoRestoreGroup whether automatically restore joined groups after reconnect.
     * @return itself.
     */
    public WebPubSubClientBuilder autoRestoreGroup(boolean autoRestoreGroup) {
        this.autoRestoreGroup = autoRestoreGroup;
        return this;
    }

    /**
     * The function that is called for each group message event received by this client.
     *
     * @param processGroupMessageEvent the callback that is called when a group message event is received.
     * @return itself.
     */
    public WebPubSubClientBuilder processGroupMessageEvent(Consumer<GroupMessageEvent> processGroupMessageEvent) {
        this.processGroupMessageEvent = Objects.requireNonNull(processGroupMessageEvent);
        return this;
    }

    /**
     * The function that is called for each server message event received by this client.
     *
     * @param processServerMessageEvent the callback that is called when a server message event is received.
     * @return itself.
     */
    public WebPubSubClientBuilder processServerMessageEvent(Consumer<ServerMessageEvent> processServerMessageEvent) {
        this.processServerMessageEvent = Objects.requireNonNull(processServerMessageEvent);
        return this;
    }

    /**
     * The function that is called for each connected event received by this client.
     *
     * @param processConnectedEvent the callback that is called when a connected event is received.
     * @return itself.
     */
    public WebPubSubClientBuilder processConnectedEvent(Consumer<ConnectedEvent> processConnectedEvent) {
        this.processConnectedEvent = Objects.requireNonNull(processConnectedEvent);
        return this;
    }

    /**
     * The function that is called for each disconnected event.
     *
     * @param processDisconnectedEvent the callback that is called when a disconnected event is received.
     * @return itself.
     */
    public WebPubSubClientBuilder processDisconnectedEvent(Consumer<DisconnectedEvent> processDisconnectedEvent) {
        this.processDisconnectedEvent = Objects.requireNonNull(processDisconnectedEvent);
        return this;
    }

    /**
     * The function that is called for each stopped event.
     *
     * @param processStoppedEvent the callback that is called when a stopped event is received.
     * @return itself.
     */
    public WebPubSubClientBuilder processStoppedEvent(Consumer<StoppedEvent> processStoppedEvent) {
        this.processStoppedEvent = Objects.requireNonNull(processStoppedEvent);
        return this;
    }

    /**
     * Builds the client.
     *
     * @return the client.
     */
    public WebPubSubClient buildClient() {
        return new WebPubSubClient(
            this.buildAsyncClient(),
            processGroupMessageEvent,
            processServerMessageEvent,
            processConnectedEvent,
            processDisconnectedEvent,
            processStoppedEvent);
    }

    /**
     * Builds the asynchronous client.
     *
     * @return the asynchronous client.
     */
    WebPubSubAsyncClient buildAsyncClient() {
        // retryOptions
        RetryStrategy retryStrategy;
        if (retryOptions != null) {
            if (retryOptions.getExponentialBackoffOptions() != null) {
                retryStrategy = new ExponentialBackoff(retryOptions.getExponentialBackoffOptions());
            } else if (retryOptions.getFixedDelayOptions() != null) {
                retryStrategy = new FixedDelay(retryOptions.getFixedDelayOptions());
            } else {
                throw logger.logExceptionAsError(
                    new IllegalArgumentException("'retryOptions' didn't define any retry strategy options"));
            }
        } else {
            retryStrategy = new ExponentialBackoff();
        }

        // credential
        Mono<String> clientAccessUrlProvider = null;
        if (credential != null) {
            clientAccessUrlProvider = credential.getClientAccessUrl();
        } else if (clientAccessUrl != null) {
            clientAccessUrlProvider = Mono.just(clientAccessUrl);
        } else {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("Credentials have not been set. "
                    + "They can be set using: clientAccessUrl(String), credential(WebPubSubClientCredential)"));
        }

        // user-agent
        final String clientName = properties.getOrDefault(SDK_NAME, "UnknownName");
        final String clientVersion = properties.getOrDefault(SDK_VERSION, "UnknownVersion");
        String applicationId = CoreUtils.getApplicationId(clientOptions, null);
        String userAgent = UserAgentUtil.toUserAgentString(applicationId, clientName, clientVersion,
            configuration == null ? Configuration.getGlobalConfiguration() : configuration);

        return new WebPubSubAsyncClient(
            client, clientAccessUrlProvider, webPubSubProtocol,
            applicationId, userAgent,
            retryStrategy, autoReconnect, autoRestoreGroup);
    }
}
