// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InternetGatewayPatchableProperties;
import org.junit.jupiter.api.Assertions;

public final class InternetGatewayPatchablePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InternetGatewayPatchableProperties model = BinaryData.fromString("{\"internetGatewayRuleId\":\"qhnlbqnbld\"}")
            .toObject(InternetGatewayPatchableProperties.class);
        Assertions.assertEquals("qhnlbqnbld", model.internetGatewayRuleId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InternetGatewayPatchableProperties model
            = new InternetGatewayPatchableProperties().withInternetGatewayRuleId("qhnlbqnbld");
        model = BinaryData.fromObject(model).toObject(InternetGatewayPatchableProperties.class);
        Assertions.assertEquals("qhnlbqnbld", model.internetGatewayRuleId());
    }
}
