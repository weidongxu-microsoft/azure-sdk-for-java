// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.BillingCurrency;
import com.azure.resourcemanager.machinelearning.models.EstimatedVMPrice;
import com.azure.resourcemanager.machinelearning.models.EstimatedVMPrices;
import com.azure.resourcemanager.machinelearning.models.UnitOfMeasure;
import com.azure.resourcemanager.machinelearning.models.VMPriceOSType;
import com.azure.resourcemanager.machinelearning.models.VMTier;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class EstimatedVMPricesTests {
    @Test
    public void testDeserialize() {
        EstimatedVMPrices model =
            BinaryData
                .fromString(
                    "{\"billingCurrency\":\"USD\",\"unitOfMeasure\":\"OneHour\",\"values\":[{\"retailPrice\":45.736942050047844,\"osType\":\"Windows\",\"vmTier\":\"LowPriority\"}]}")
                .toObject(EstimatedVMPrices.class);
        Assertions.assertEquals(BillingCurrency.USD, model.billingCurrency());
        Assertions.assertEquals(UnitOfMeasure.ONE_HOUR, model.unitOfMeasure());
        Assertions.assertEquals(45.736942050047844, model.values().get(0).retailPrice());
        Assertions.assertEquals(VMPriceOSType.WINDOWS, model.values().get(0).osType());
        Assertions.assertEquals(VMTier.LOW_PRIORITY, model.values().get(0).vmTier());
    }

    @Test
    public void testSerialize() {
        EstimatedVMPrices model =
            new EstimatedVMPrices()
                .withBillingCurrency(BillingCurrency.USD)
                .withUnitOfMeasure(UnitOfMeasure.ONE_HOUR)
                .withValues(
                    Arrays
                        .asList(
                            new EstimatedVMPrice()
                                .withRetailPrice(45.736942050047844)
                                .withOsType(VMPriceOSType.WINDOWS)
                                .withVmTier(VMTier.LOW_PRIORITY)));
        model = BinaryData.fromObject(model).toObject(EstimatedVMPrices.class);
        Assertions.assertEquals(BillingCurrency.USD, model.billingCurrency());
        Assertions.assertEquals(UnitOfMeasure.ONE_HOUR, model.unitOfMeasure());
        Assertions.assertEquals(45.736942050047844, model.values().get(0).retailPrice());
        Assertions.assertEquals(VMPriceOSType.WINDOWS, model.values().get(0).osType());
        Assertions.assertEquals(VMTier.LOW_PRIORITY, model.values().get(0).vmTier());
    }
}