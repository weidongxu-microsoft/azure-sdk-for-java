// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.education.fluent.models.GrantDetailProperties;
import org.junit.jupiter.api.Test;

public final class GrantDetailPropertiesTests {
    @Test
    public void testDeserialize() {
        GrantDetailProperties model =
            BinaryData
                .fromString(
                    "{\"offerCap\":{\"currency\":\"xzjnchgejs\",\"value\":77.65428},\"effectiveDate\":\"2021-03-15T02:51:44Z\",\"offerType\":\"Academic\",\"expirationDate\":\"2021-10-26T17:31:17Z\",\"status\":\"Active\",\"allocatedBudget\":{\"currency\":\"jwyahuxinpmqnja\",\"value\":93.690834}}")
                .toObject(GrantDetailProperties.class);
    }

    @Test
    public void testSerialize() {
        GrantDetailProperties model = new GrantDetailProperties();
        model = BinaryData.fromObject(model).toObject(GrantDetailProperties.class);
    }
}