// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.mariadb.MariaDBManager;
import com.azure.resourcemanager.mariadb.models.VirtualNetworkRule;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class VirtualNetworkRulesCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        String responseStr
            = "{\"properties\":{\"virtualNetworkSubnetId\":\"vwz\",\"ignoreMissingVnetServiceEndpoint\":true,\"state\":\"Unknown\"},\"id\":\"mctlpdngitv\",\"name\":\"bmhrixkwmyijejv\",\"type\":\"grhbpn\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MariaDBManager manager = MariaDBManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        VirtualNetworkRule response = manager.virtualNetworkRules()
            .define("x")
            .withExistingServer("aatjinrvgoupmfi", "bfggjioolvr")
            .withVirtualNetworkSubnetId("tkkgllqwjy")
            .withIgnoreMissingVnetServiceEndpoint(true)
            .create();

        Assertions.assertEquals("vwz", response.virtualNetworkSubnetId());
        Assertions.assertEquals(true, response.ignoreMissingVnetServiceEndpoint());
    }
}
