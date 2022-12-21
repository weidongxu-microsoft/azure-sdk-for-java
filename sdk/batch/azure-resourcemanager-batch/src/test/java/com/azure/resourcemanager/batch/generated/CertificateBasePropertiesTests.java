// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.CertificateBaseProperties;
import com.azure.resourcemanager.batch.models.CertificateFormat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CertificateBasePropertiesTests {
    @Test
    public void testDeserialize() {
        CertificateBaseProperties model =
            BinaryData
                .fromString("{\"thumbprintAlgorithm\":\"tko\",\"thumbprint\":\"kouknvudwtiu\",\"format\":\"Cer\"}")
                .toObject(CertificateBaseProperties.class);
        Assertions.assertEquals("tko", model.thumbprintAlgorithm());
        Assertions.assertEquals("kouknvudwtiu", model.thumbprint());
        Assertions.assertEquals(CertificateFormat.CER, model.format());
    }

    @Test
    public void testSerialize() {
        CertificateBaseProperties model =
            new CertificateBaseProperties()
                .withThumbprintAlgorithm("tko")
                .withThumbprint("kouknvudwtiu")
                .withFormat(CertificateFormat.CER);
        model = BinaryData.fromObject(model).toObject(CertificateBaseProperties.class);
        Assertions.assertEquals("tko", model.thumbprintAlgorithm());
        Assertions.assertEquals("kouknvudwtiu", model.thumbprint());
        Assertions.assertEquals(CertificateFormat.CER, model.format());
    }
}