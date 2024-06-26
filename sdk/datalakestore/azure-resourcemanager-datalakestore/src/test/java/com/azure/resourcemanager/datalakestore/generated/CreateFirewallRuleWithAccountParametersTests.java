// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datalakestore.models.CreateFirewallRuleWithAccountParameters;
import org.junit.jupiter.api.Assertions;

public final class CreateFirewallRuleWithAccountParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CreateFirewallRuleWithAccountParameters model =
            BinaryData
                .fromString(
                    "{\"name\":\"zxtheotusivyevcc\",\"properties\":{\"startIpAddress\":\"qi\",\"endIpAddress\":\"nhungbw\"}}")
                .toObject(CreateFirewallRuleWithAccountParameters.class);
        Assertions.assertEquals("zxtheotusivyevcc", model.name());
        Assertions.assertEquals("qi", model.startIpAddress());
        Assertions.assertEquals("nhungbw", model.endIpAddress());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CreateFirewallRuleWithAccountParameters model =
            new CreateFirewallRuleWithAccountParameters()
                .withName("zxtheotusivyevcc")
                .withStartIpAddress("qi")
                .withEndIpAddress("nhungbw");
        model = BinaryData.fromObject(model).toObject(CreateFirewallRuleWithAccountParameters.class);
        Assertions.assertEquals("zxtheotusivyevcc", model.name());
        Assertions.assertEquals("qi", model.startIpAddress());
        Assertions.assertEquals("nhungbw", model.endIpAddress());
    }
}
