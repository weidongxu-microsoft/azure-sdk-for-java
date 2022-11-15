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
import com.azure.resourcemanager.machinelearning.models.VirtualMachineSize;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VirtualMachineSizeTests {
    @Test
    public void testDeserialize() {
        VirtualMachineSize model =
            BinaryData
                .fromString(
                    "{\"name\":\"aamdect\",\"family\":\"f\",\"vCPUs\":1860942440,\"gpus\":993666965,\"osVhdSizeMB\":230831104,\"maxResourceVolumeMB\":796129419,\"memoryGB\":78.8172659538708,\"lowPriorityCapable\":true,\"premiumIO\":false,\"estimatedVMPrices\":{\"billingCurrency\":\"USD\",\"unitOfMeasure\":\"OneHour\",\"values\":[{\"retailPrice\":43.63741417101916,\"osType\":\"Linux\",\"vmTier\":\"Standard\"},{\"retailPrice\":10.488278430863074,\"osType\":\"Windows\",\"vmTier\":\"LowPriority\"},{\"retailPrice\":12.69677181728943,\"osType\":\"Windows\",\"vmTier\":\"Standard\"},{\"retailPrice\":38.22056349066922,\"osType\":\"Linux\",\"vmTier\":\"LowPriority\"}]},\"supportedComputeTypes\":[\"pkc\",\"t\",\"pngjcrcczsqpjhvm\"]}")
                .toObject(VirtualMachineSize.class);
        Assertions.assertEquals(BillingCurrency.USD, model.estimatedVMPrices().billingCurrency());
        Assertions.assertEquals(UnitOfMeasure.ONE_HOUR, model.estimatedVMPrices().unitOfMeasure());
        Assertions.assertEquals(43.63741417101916, model.estimatedVMPrices().values().get(0).retailPrice());
        Assertions.assertEquals(VMPriceOSType.LINUX, model.estimatedVMPrices().values().get(0).osType());
        Assertions.assertEquals(VMTier.STANDARD, model.estimatedVMPrices().values().get(0).vmTier());
        Assertions.assertEquals("pkc", model.supportedComputeTypes().get(0));
    }

    @Test
    public void testSerialize() {
        VirtualMachineSize model =
            new VirtualMachineSize()
                .withEstimatedVMPrices(
                    new EstimatedVMPrices()
                        .withBillingCurrency(BillingCurrency.USD)
                        .withUnitOfMeasure(UnitOfMeasure.ONE_HOUR)
                        .withValues(
                            Arrays
                                .asList(
                                    new EstimatedVMPrice()
                                        .withRetailPrice(43.63741417101916)
                                        .withOsType(VMPriceOSType.LINUX)
                                        .withVmTier(VMTier.STANDARD),
                                    new EstimatedVMPrice()
                                        .withRetailPrice(10.488278430863074)
                                        .withOsType(VMPriceOSType.WINDOWS)
                                        .withVmTier(VMTier.LOW_PRIORITY),
                                    new EstimatedVMPrice()
                                        .withRetailPrice(12.69677181728943)
                                        .withOsType(VMPriceOSType.WINDOWS)
                                        .withVmTier(VMTier.STANDARD),
                                    new EstimatedVMPrice()
                                        .withRetailPrice(38.22056349066922)
                                        .withOsType(VMPriceOSType.LINUX)
                                        .withVmTier(VMTier.LOW_PRIORITY))))
                .withSupportedComputeTypes(Arrays.asList("pkc", "t", "pngjcrcczsqpjhvm"));
        model = BinaryData.fromObject(model).toObject(VirtualMachineSize.class);
        Assertions.assertEquals(BillingCurrency.USD, model.estimatedVMPrices().billingCurrency());
        Assertions.assertEquals(UnitOfMeasure.ONE_HOUR, model.estimatedVMPrices().unitOfMeasure());
        Assertions.assertEquals(43.63741417101916, model.estimatedVMPrices().values().get(0).retailPrice());
        Assertions.assertEquals(VMPriceOSType.LINUX, model.estimatedVMPrices().values().get(0).osType());
        Assertions.assertEquals(VMTier.STANDARD, model.estimatedVMPrices().values().get(0).vmTier());
        Assertions.assertEquals("pkc", model.supportedComputeTypes().get(0));
    }
}