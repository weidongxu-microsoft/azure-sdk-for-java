// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.impactreporting.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.impactreporting.models.Content;
import org.junit.jupiter.api.Assertions;

public final class ContentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Content model
            = BinaryData.fromString("{\"title\":\"a\",\"description\":\"hrzayvvtpgvdf\"}").toObject(Content.class);
        Assertions.assertEquals("a", model.title());
        Assertions.assertEquals("hrzayvvtpgvdf", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Content model = new Content().withTitle("a").withDescription("hrzayvvtpgvdf");
        model = BinaryData.fromObject(model).toObject(Content.class);
        Assertions.assertEquals("a", model.title());
        Assertions.assertEquals("hrzayvvtpgvdf", model.description());
    }
}
