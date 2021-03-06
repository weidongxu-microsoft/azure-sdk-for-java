/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2015_03_20.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata for a workspace that isn't linked to an Azure subscription.
 */
public class LinkTargetInner {
    /**
     * The GUID that uniquely identifies the workspace.
     */
    @JsonProperty(value = "customerId")
    private String customerId;

    /**
     * The display name of the workspace.
     */
    @JsonProperty(value = "accountName")
    private String displayName;

    /**
     * The DNS valid workspace name.
     */
    @JsonProperty(value = "workspaceName")
    private String workspaceName;

    /**
     * The location of the workspace.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the GUID that uniquely identifies the workspace.
     *
     * @return the customerId value
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Set the GUID that uniquely identifies the workspace.
     *
     * @param customerId the customerId value to set
     * @return the LinkTargetInner object itself.
     */
    public LinkTargetInner withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Get the display name of the workspace.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name of the workspace.
     *
     * @param displayName the displayName value to set
     * @return the LinkTargetInner object itself.
     */
    public LinkTargetInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the DNS valid workspace name.
     *
     * @return the workspaceName value
     */
    public String workspaceName() {
        return this.workspaceName;
    }

    /**
     * Set the DNS valid workspace name.
     *
     * @param workspaceName the workspaceName value to set
     * @return the LinkTargetInner object itself.
     */
    public LinkTargetInner withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    /**
     * Get the location of the workspace.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location of the workspace.
     *
     * @param location the location value to set
     * @return the LinkTargetInner object itself.
     */
    public LinkTargetInner withLocation(String location) {
        this.location = location;
        return this;
    }

}
