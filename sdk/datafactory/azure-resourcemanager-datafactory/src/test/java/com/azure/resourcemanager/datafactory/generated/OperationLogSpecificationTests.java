// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OperationLogSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationLogSpecificationTests {
    @Test
    public void testDeserialize() {
        OperationLogSpecification model =
            BinaryData
                .fromString("{\"name\":\"iqfouflmmnkz\",\"displayName\":\"odmgl\",\"blobDuration\":\"gpbkwtmut\"}")
                .toObject(OperationLogSpecification.class);
        Assertions.assertEquals("iqfouflmmnkz", model.name());
        Assertions.assertEquals("odmgl", model.displayName());
        Assertions.assertEquals("gpbkwtmut", model.blobDuration());
    }

    @Test
    public void testSerialize() {
        OperationLogSpecification model =
            new OperationLogSpecification()
                .withName("iqfouflmmnkz")
                .withDisplayName("odmgl")
                .withBlobDuration("gpbkwtmut");
        model = BinaryData.fromObject(model).toObject(OperationLogSpecification.class);
        Assertions.assertEquals("iqfouflmmnkz", model.name());
        Assertions.assertEquals("odmgl", model.displayName());
        Assertions.assertEquals("gpbkwtmut", model.blobDuration());
    }
}