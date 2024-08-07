// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import org.junit.jupiter.api.Assertions;

public final class DatasetFolderTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatasetFolder model = BinaryData.fromString("{\"name\":\"eyvpnqicvinvkj\"}").toObject(DatasetFolder.class);
        Assertions.assertEquals("eyvpnqicvinvkj", model.name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatasetFolder model = new DatasetFolder().withName("eyvpnqicvinvkj");
        model = BinaryData.fromObject(model).toObject(DatasetFolder.class);
        Assertions.assertEquals("eyvpnqicvinvkj", model.name());
    }
}
