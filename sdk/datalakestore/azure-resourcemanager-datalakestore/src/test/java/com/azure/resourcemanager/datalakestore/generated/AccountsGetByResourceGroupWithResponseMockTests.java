// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.datalakestore.DataLakeStoreManager;
import com.azure.resourcemanager.datalakestore.models.DataLakeStoreAccount;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AccountsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"identity\":{\"principalId\":\"fd77ed63-4786-4c29-b12a-4be323179679\",\"tenantId\":\"2ee98339-ac2f-4035-b930-d055e4defbd0\"},\"properties\":{\"defaultGroup\":\"rjcxerfuwu\",\"encryptionConfig\":{\"type\":\"ServiceManaged\"},\"encryptionState\":\"Disabled\",\"encryptionProvisioningState\":\"Creating\",\"firewallRules\":[],\"virtualNetworkRules\":[],\"firewallState\":\"Disabled\",\"firewallAllowAzureIps\":\"Disabled\",\"trustedIdProviders\":[],\"trustedIdProviderState\":\"Enabled\",\"newTier\":\"Commitment_500TB\",\"currentTier\":\"Commitment_100TB\",\"accountId\":\"f9928d90-dd9d-4964-99c3-f21a09b2fdd1\",\"provisioningState\":\"Undeleting\",\"state\":\"Suspended\",\"creationTime\":\"2021-02-07T10:30:53Z\",\"lastModifiedTime\":\"2021-01-29T11:34:22Z\",\"endpoint\":\"qgidokgjljyo\"},\"location\":\"gvcl\",\"tags\":{\"bijhtxfvgxbf\":\"sncghkjeszz\",\"ec\":\"mxnehmp\",\"gr\":\"godebfqkkrbmpu\"},\"id\":\"wflzlfbxzpuzy\",\"name\":\"ispnqzahmgkbrp\",\"type\":\"y\"}";

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

        DataLakeStoreManager manager =
            DataLakeStoreManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        DataLakeStoreAccount response =
            manager
                .accounts()
                .getByResourceGroupWithResponse("fcivfsnkym", "ctq", com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("gvcl", response.location());
        Assertions.assertEquals("sncghkjeszz", response.tags().get("bijhtxfvgxbf"));
    }
}