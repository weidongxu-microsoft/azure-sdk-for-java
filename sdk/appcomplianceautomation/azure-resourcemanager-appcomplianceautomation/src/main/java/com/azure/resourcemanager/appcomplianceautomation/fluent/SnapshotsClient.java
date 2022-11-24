// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appcomplianceautomation.fluent.models.SnapshotResourceInner;

/** An instance of this class provides access to all the operations defined in SnapshotsClient. */
public interface SnapshotsClient {
    /**
     * Get the AppComplianceAutomation snapshot list.
     *
     * @param reportName Report Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation snapshot list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SnapshotResourceInner> list(String reportName);

    /**
     * Get the AppComplianceAutomation snapshot list.
     *
     * @param reportName Report Name.
     * @param skipToken Skip over when retrieving results.
     * @param top Number of elements to return when retrieving results.
     * @param select OData Select statement. Limits the properties on each entry to just those requested, e.g.
     *     ?$select=reportName,id.
     * @param reportCreatorTenantId The tenant id of the report creator.
     * @param offerGuid The offerGuid which mapping to the reports.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the AppComplianceAutomation snapshot list as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SnapshotResourceInner> list(
        String reportName,
        String skipToken,
        Integer top,
        String select,
        String reportCreatorTenantId,
        String offerGuid,
        Context context);
}