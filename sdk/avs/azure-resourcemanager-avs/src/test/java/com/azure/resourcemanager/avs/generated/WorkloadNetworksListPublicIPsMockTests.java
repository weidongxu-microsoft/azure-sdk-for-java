// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.avs.AvsManager;
import com.azure.resourcemanager.avs.models.WorkloadNetworkPublicIp;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class WorkloadNetworksListPublicIPsMockTests {
    @Test
    public void testListPublicIPs() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"displayName\":\"yo\",\"numberOfPublicIPs\":8001190211178708850,\"publicIPBlock\":\"uuxvnsasbcry\",\"provisioningState\":\"Succeeded\"},\"id\":\"zrxklobd\",\"name\":\"nazpmk\",\"type\":\"lmv\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AvsManager manager = AvsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<WorkloadNetworkPublicIp> response = manager.workloadNetworks()
            .listPublicIPs("pxbannovvoxc", "ytprwnwvroev", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("yo", response.iterator().next().displayName());
        Assertions.assertEquals(8001190211178708850L, response.iterator().next().numberOfPublicIPs());
    }
}
