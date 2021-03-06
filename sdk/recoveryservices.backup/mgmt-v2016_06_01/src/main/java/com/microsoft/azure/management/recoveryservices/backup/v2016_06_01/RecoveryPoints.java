/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import rx.Observable;
import com.microsoft.azure.management.recoveryservices.backup.v2016_06_01.implementation.RecoveryPointsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing RecoveryPoints.
 */
public interface RecoveryPoints extends HasInner<RecoveryPointsInner> {
    /**
     * Provides the backup data for the RecoveryPointID. This is an asynchronous operation. To learn the status of the operation, call the GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with backup item.
     * @param containerName The container name associated with backup item.
     * @param protectedItemName The name of the backup item used in this GET operation.
     * @param recoveryPointId The RecoveryPointID associated with this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryPointResource> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId);

    /**
     * Lists the recovery points, or backup copies, for the specified backup item.
     *
     * @param vaultName The name of the Recovery Services vault.
     * @param resourceGroupName The name of the resource group associated with the Recovery Services vault.
     * @param fabricName The fabric name associated with the backup item.
     * @param containerName The container name associated with the backup item.
     * @param protectedItemName The name of backup item used in this GET operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RecoveryPointResource> listAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName);

}
