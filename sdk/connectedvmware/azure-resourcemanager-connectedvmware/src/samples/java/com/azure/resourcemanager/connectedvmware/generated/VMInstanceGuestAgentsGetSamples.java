// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.generated;

/**
 * Samples for VMInstanceGuestAgents Get.
 */
public final class VMInstanceGuestAgentsGetSamples {
    /*
     * x-ms-original-file:
     * specification/connectedvmware/resource-manager/Microsoft.ConnectedVMwarevSphere/stable/2023-10-01/examples/
     * GetVMInstanceGuestAgent.json
     */
    /**
     * Sample code: GetGuestAgent.
     * 
     * @param manager Entry point to ConnectedVMwareManager.
     */
    public static void getGuestAgent(com.azure.resourcemanager.connectedvmware.ConnectedVMwareManager manager) {
        manager.vMInstanceGuestAgents()
            .getWithResponse(
                "subscriptions/fd3c3665-1729-4b7b-9a38-238e83b0f98b/resourceGroups/testrg/providers/Microsoft.HybridCompute/machines/DemoVM",
                com.azure.core.util.Context.NONE);
    }
}
