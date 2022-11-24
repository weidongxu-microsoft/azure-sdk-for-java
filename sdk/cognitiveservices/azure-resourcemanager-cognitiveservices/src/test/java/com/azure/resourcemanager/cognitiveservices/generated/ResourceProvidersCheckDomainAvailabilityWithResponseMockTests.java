// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager;
import com.azure.resourcemanager.cognitiveservices.models.CheckDomainAvailabilityParameter;
import com.azure.resourcemanager.cognitiveservices.models.DomainAvailability;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ResourceProvidersCheckDomainAvailabilityWithResponseMockTests {
    @Test
    public void testCheckDomainAvailabilityWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"isSubdomainAvailable\":false,\"reason\":\"fpwpjylwbt\",\"subdomainName\":\"flsjc\",\"type\":\"szfjvfbgofelja\",\"kind\":\"qmqhldvriii\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        CognitiveServicesManager manager =
            CognitiveServicesManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        DomainAvailability response =
            manager
                .resourceProviders()
                .checkDomainAvailabilityWithResponse(
                    new CheckDomainAvailabilityParameter().withSubdomainName("rgz").withType("frl").withKind("szrnwo"),
                    Context.NONE)
                .getValue();

        Assertions.assertEquals(false, response.isSubdomainAvailable());
        Assertions.assertEquals("fpwpjylwbt", response.reason());
        Assertions.assertEquals("flsjc", response.subdomainName());
        Assertions.assertEquals("szfjvfbgofelja", response.type());
        Assertions.assertEquals("qmqhldvriii", response.kind());
    }
}