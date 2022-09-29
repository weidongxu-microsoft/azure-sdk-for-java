// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.EventGridConnectionProperties;
import com.azure.resourcemanager.kusto.models.BlobStorageEventType;
import com.azure.resourcemanager.kusto.models.DatabaseRouting;
import com.azure.resourcemanager.kusto.models.EventGridDataFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class EventGridConnectionPropertiesTests {
    @Test
    public void testDeserialize() {
        EventGridConnectionProperties model =
            BinaryData
                .fromString(
                    "{\"storageAccountResourceId\":\"zi\",\"eventGridResourceId\":\"yuhqlbjbsybbqwrv\",\"eventHubResourceId\":\"ldgmfpgvmpip\",\"consumerGroup\":\"slthaq\",\"tableName\":\"ss\",\"mappingRuleName\":\"u\",\"dataFormat\":\"SOHSV\",\"ignoreFirstRecord\":false,\"blobStorageEventType\":\"Microsoft.Storage.BlobRenamed\",\"managedIdentityResourceId\":\"pdrhne\",\"managedIdentityObjectId\":\"owqkdwytisi\",\"databaseRouting\":\"Single\",\"provisioningState\":\"Failed\"}")
                .toObject(EventGridConnectionProperties.class);
        Assertions.assertEquals("zi", model.storageAccountResourceId());
        Assertions.assertEquals("yuhqlbjbsybbqwrv", model.eventGridResourceId());
        Assertions.assertEquals("ldgmfpgvmpip", model.eventHubResourceId());
        Assertions.assertEquals("slthaq", model.consumerGroup());
        Assertions.assertEquals("ss", model.tableName());
        Assertions.assertEquals("u", model.mappingRuleName());
        Assertions.assertEquals(EventGridDataFormat.SOHSV, model.dataFormat());
        Assertions.assertEquals(false, model.ignoreFirstRecord());
        Assertions.assertEquals(BlobStorageEventType.MICROSOFT_STORAGE_BLOB_RENAMED, model.blobStorageEventType());
        Assertions.assertEquals("pdrhne", model.managedIdentityResourceId());
        Assertions.assertEquals(DatabaseRouting.SINGLE, model.databaseRouting());
    }

    @Test
    public void testSerialize() {
        EventGridConnectionProperties model =
            new EventGridConnectionProperties()
                .withStorageAccountResourceId("zi")
                .withEventGridResourceId("yuhqlbjbsybbqwrv")
                .withEventHubResourceId("ldgmfpgvmpip")
                .withConsumerGroup("slthaq")
                .withTableName("ss")
                .withMappingRuleName("u")
                .withDataFormat(EventGridDataFormat.SOHSV)
                .withIgnoreFirstRecord(false)
                .withBlobStorageEventType(BlobStorageEventType.MICROSOFT_STORAGE_BLOB_RENAMED)
                .withManagedIdentityResourceId("pdrhne")
                .withDatabaseRouting(DatabaseRouting.SINGLE);
        model = BinaryData.fromObject(model).toObject(EventGridConnectionProperties.class);
        Assertions.assertEquals("zi", model.storageAccountResourceId());
        Assertions.assertEquals("yuhqlbjbsybbqwrv", model.eventGridResourceId());
        Assertions.assertEquals("ldgmfpgvmpip", model.eventHubResourceId());
        Assertions.assertEquals("slthaq", model.consumerGroup());
        Assertions.assertEquals("ss", model.tableName());
        Assertions.assertEquals("u", model.mappingRuleName());
        Assertions.assertEquals(EventGridDataFormat.SOHSV, model.dataFormat());
        Assertions.assertEquals(false, model.ignoreFirstRecord());
        Assertions.assertEquals(BlobStorageEventType.MICROSOFT_STORAGE_BLOB_RENAMED, model.blobStorageEventType());
        Assertions.assertEquals("pdrhne", model.managedIdentityResourceId());
        Assertions.assertEquals(DatabaseRouting.SINGLE, model.databaseRouting());
    }
}