// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.AgentUpgrade;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;

public final class AgentUpgradeTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AgentUpgrade model = BinaryData.fromString(
            "{\"desiredVersion\":\"seiphe\",\"correlationId\":\"ea0ed09e-8ff9-4c40-9f77-b42c5a7d8586\",\"enableAutomaticUpgrade\":true,\"lastAttemptDesiredVersion\":\"eyy\",\"lastAttemptTimestamp\":\"2021-09-18T17:01:56Z\",\"lastAttemptStatus\":\"Failed\",\"lastAttemptMessage\":\"lwtgrhpdj\"}")
            .toObject(AgentUpgrade.class);
        Assertions.assertEquals("seiphe", model.desiredVersion());
        Assertions.assertEquals(UUID.fromString("ea0ed09e-8ff9-4c40-9f77-b42c5a7d8586"), model.correlationId());
        Assertions.assertEquals(true, model.enableAutomaticUpgrade());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AgentUpgrade model = new AgentUpgrade().withDesiredVersion("seiphe")
            .withCorrelationId(UUID.fromString("ea0ed09e-8ff9-4c40-9f77-b42c5a7d8586"))
            .withEnableAutomaticUpgrade(true);
        model = BinaryData.fromObject(model).toObject(AgentUpgrade.class);
        Assertions.assertEquals("seiphe", model.desiredVersion());
        Assertions.assertEquals(UUID.fromString("ea0ed09e-8ff9-4c40-9f77-b42c5a7d8586"), model.correlationId());
        Assertions.assertEquals(true, model.enableAutomaticUpgrade());
    }
}
