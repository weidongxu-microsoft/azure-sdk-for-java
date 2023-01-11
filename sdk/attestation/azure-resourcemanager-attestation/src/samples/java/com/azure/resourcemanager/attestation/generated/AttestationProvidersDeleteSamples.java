// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.attestation.generated;

/** Samples for AttestationProviders Delete. */
public final class AttestationProvidersDeleteSamples {
    /*
     * x-ms-original-file: specification/attestation/resource-manager/Microsoft.Attestation/stable/2020-10-01/examples/Delete_AttestationProvider.json
     */
    /**
     * Sample code: AttestationProviders_Delete.
     *
     * @param manager Entry point to AttestationManager.
     */
    public static void attestationProvidersDelete(com.azure.resourcemanager.attestation.AttestationManager manager) {
        manager
            .attestationProviders()
            .deleteByResourceGroupWithResponse(
                "sample-resource-group", "myattestationprovider", com.azure.core.util.Context.NONE);
    }
}