// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.generated;

/**
 * Samples for CreationSupported List.
 */
public final class CreationSupportedListSamples {
    /*
     * x-ms-original-file:
     * specification/datadog/resource-manager/Microsoft.Datadog/stable/2023-01-01/examples/CreationSupported_List.json
     */
    /**
     * Sample code: CreationSupported_List.
     * 
     * @param manager Entry point to MicrosoftDatadogManager.
     */
    public static void creationSupportedList(com.azure.resourcemanager.datadog.MicrosoftDatadogManager manager) {
        manager.creationSupporteds().list("00000000-0000-0000-0000", com.azure.core.util.Context.NONE);
    }
}
