// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PipelineElapsedTimeMetricPolicy;
import org.junit.jupiter.api.Test;

public final class PipelineElapsedTimeMetricPolicyTests {
    @Test
    public void testDeserialize() {
        PipelineElapsedTimeMetricPolicy model =
            BinaryData.fromString("{}").toObject(PipelineElapsedTimeMetricPolicy.class);
    }

    @Test
    public void testSerialize() {
        PipelineElapsedTimeMetricPolicy model = new PipelineElapsedTimeMetricPolicy();
        model = BinaryData.fromObject(model).toObject(PipelineElapsedTimeMetricPolicy.class);
    }
}