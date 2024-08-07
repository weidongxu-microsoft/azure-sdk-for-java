// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.ClientDiscoveryForLogSpecification;
import org.junit.jupiter.api.Assertions;

public final class ClientDiscoveryForLogSpecificationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClientDiscoveryForLogSpecification model
            = BinaryData.fromString("{\"blobDuration\":\"aodxo\",\"displayName\":\"bdxkqpxokaj\",\"name\":\"npime\"}")
                .toObject(ClientDiscoveryForLogSpecification.class);
        Assertions.assertEquals("aodxo", model.blobDuration());
        Assertions.assertEquals("bdxkqpxokaj", model.displayName());
        Assertions.assertEquals("npime", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClientDiscoveryForLogSpecification model = new ClientDiscoveryForLogSpecification().withBlobDuration("aodxo")
            .withDisplayName("bdxkqpxokaj")
            .withName("npime");
        model = BinaryData.fromObject(model).toObject(ClientDiscoveryForLogSpecification.class);
        Assertions.assertEquals("aodxo", model.blobDuration());
        Assertions.assertEquals("bdxkqpxokaj", model.displayName());
        Assertions.assertEquals("npime", model.name());
    }
}
