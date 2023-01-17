// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.TransferBillingSubscriptionRequestProperties;
import org.junit.jupiter.api.Assertions;

public final class TransferBillingSubscriptionRequestPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TransferBillingSubscriptionRequestProperties model =
            BinaryData
                .fromString("{\"destinationInvoiceSectionId\":\"u\"}")
                .toObject(TransferBillingSubscriptionRequestProperties.class);
        Assertions.assertEquals("u", model.destinationInvoiceSectionId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TransferBillingSubscriptionRequestProperties model =
            new TransferBillingSubscriptionRequestProperties().withDestinationInvoiceSectionId("u");
        model = BinaryData.fromObject(model).toObject(TransferBillingSubscriptionRequestProperties.class);
        Assertions.assertEquals("u", model.destinationInvoiceSectionId());
    }
}