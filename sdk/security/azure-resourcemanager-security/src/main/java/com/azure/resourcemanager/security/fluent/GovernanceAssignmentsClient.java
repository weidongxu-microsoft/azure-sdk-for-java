// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.security.fluent.models.GovernanceAssignmentInner;

/** An instance of this class provides access to all the operations defined in GovernanceAssignmentsClient. */
public interface GovernanceAssignmentsClient {
    /**
     * Get security governanceAssignments on all your resources inside a scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security governanceAssignments on all your resources inside a scope as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GovernanceAssignmentInner> list(String scope, String assessmentName);

    /**
     * Get security governanceAssignments on all your resources inside a scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security governanceAssignments on all your resources inside a scope as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<GovernanceAssignmentInner> list(String scope, String assessmentName, Context context);

    /**
     * Get a specific governanceAssignment for the requested scope by AssignmentKey.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param assignmentKey The security governance assignment key - the assessment key of the required governance
     *     assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceAssignment for the requested scope by AssignmentKey.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GovernanceAssignmentInner get(String scope, String assessmentName, String assignmentKey);

    /**
     * Get a specific governanceAssignment for the requested scope by AssignmentKey.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param assignmentKey The security governance assignment key - the assessment key of the required governance
     *     assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific governanceAssignment for the requested scope by AssignmentKey along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GovernanceAssignmentInner> getWithResponse(
        String scope, String assessmentName, String assignmentKey, Context context);

    /**
     * Creates or update a security GovernanceAssignment on the given subscription.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param assignmentKey The security governance assignment key - the assessment key of the required governance
     *     assignment.
     * @param governanceAssignment GovernanceAssignment over a subscription scope.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security GovernanceAssignment over a given scope.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    GovernanceAssignmentInner createOrUpdate(
        String scope, String assessmentName, String assignmentKey, GovernanceAssignmentInner governanceAssignment);

    /**
     * Creates or update a security GovernanceAssignment on the given subscription.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param assignmentKey The security governance assignment key - the assessment key of the required governance
     *     assignment.
     * @param governanceAssignment GovernanceAssignment over a subscription scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return security GovernanceAssignment over a given scope along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<GovernanceAssignmentInner> createOrUpdateWithResponse(
        String scope,
        String assessmentName,
        String assignmentKey,
        GovernanceAssignmentInner governanceAssignment,
        Context context);

    /**
     * Delete a GovernanceAssignment over a given scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param assignmentKey The security governance assignment key - the assessment key of the required governance
     *     assignment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String scope, String assessmentName, String assignmentKey);

    /**
     * Delete a GovernanceAssignment over a given scope.
     *
     * @param scope Scope of the query, can be subscription (/subscriptions/0b06d9ea-afe6-4779-bd59-30e5c2d9d13f) or
     *     management group (/providers/Microsoft.Management/managementGroups/mgName).
     * @param assessmentName The Assessment Key - Unique key for the assessment type.
     * @param assignmentKey The security governance assignment key - the assessment key of the required governance
     *     assignment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String scope, String assessmentName, String assignmentKey, Context context);
}