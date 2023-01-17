// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deploymentmanager.models.RolloutOperationInfo;

public final class RolloutOperationInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RolloutOperationInfo model =
            BinaryData
                .fromString(
                    "{\"retryAttempt\":592172158,\"skipSucceededOnRetry\":true,\"startTime\":\"2021-07-03T11:10:37Z\",\"endTime\":\"2021-01-19T20:45:38Z\"}")
                .toObject(RolloutOperationInfo.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RolloutOperationInfo model = new RolloutOperationInfo();
        model = BinaryData.fromObject(model).toObject(RolloutOperationInfo.class);
    }
}