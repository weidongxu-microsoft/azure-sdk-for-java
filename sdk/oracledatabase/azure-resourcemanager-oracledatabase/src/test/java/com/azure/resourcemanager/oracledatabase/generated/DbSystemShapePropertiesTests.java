// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.oracledatabase.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.oracledatabase.models.DbSystemShapeProperties;

public final class DbSystemShapePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DbSystemShapeProperties model = BinaryData.fromString(
            "{\"shapeFamily\":\"lnjixisxya\",\"availableCoreCount\":1486510526,\"minimumCoreCount\":347364157,\"runtimeMinimumCoreCount\":1772436776,\"coreCountIncrement\":1260853084,\"minStorageCount\":2113030944,\"maxStorageCount\":2033382031,\"availableDataStoragePerServerInTbs\":91.76297293138525,\"availableMemoryPerNodeInGbs\":983085062,\"availableDbNodePerNodeInGbs\":1211885049,\"minCoreCountPerNode\":1066317539,\"availableMemoryInGbs\":643892740,\"minMemoryPerNodeInGbs\":712721872,\"availableDbNodeStorageInGbs\":462425094,\"minDbNodeStoragePerNodeInGbs\":417791826,\"availableDataStorageInTbs\":644635434,\"minDataStorageInTbs\":1975568377,\"minimumNodeCount\":1201064167,\"maximumNodeCount\":681203122,\"availableCoreCountPerNode\":245214837}")
            .toObject(DbSystemShapeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DbSystemShapeProperties model = new DbSystemShapeProperties();
        model = BinaryData.fromObject(model).toObject(DbSystemShapeProperties.class);
    }
}
