// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ServiceNowSource;
import org.junit.jupiter.api.Test;

public final class ServiceNowSourceTests {
    @Test
    public void testDeserialize() {
        ServiceNowSource model =
            BinaryData.fromString("{\"type\":\"ServiceNowSource\",\"\":{}}").toObject(ServiceNowSource.class);
    }

    @Test
    public void testSerialize() {
        ServiceNowSource model = new ServiceNowSource();
        model = BinaryData.fromObject(model).toObject(ServiceNowSource.class);
    }
}