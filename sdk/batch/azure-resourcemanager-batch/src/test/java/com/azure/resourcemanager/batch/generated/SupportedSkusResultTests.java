// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.fluent.models.SupportedSkuInner;
import com.azure.resourcemanager.batch.models.SupportedSkusResult;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public final class SupportedSkusResultTests {
    @Test
    public void testDeserialize() {
        SupportedSkusResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"pmivkwlzu\",\"familyName\":\"c\",\"capabilities\":[]}],\"nextLink\":\"nbacfi\"}")
                .toObject(SupportedSkusResult.class);
    }

    @Test
    public void testSerialize() {
        SupportedSkusResult model = new SupportedSkusResult().withValue(Arrays.asList(new SupportedSkuInner()));
        model = BinaryData.fromObject(model).toObject(SupportedSkusResult.class);
    }
}