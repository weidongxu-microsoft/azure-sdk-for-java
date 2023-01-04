// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Recovery plan group details. */
@Fluent
public final class RecoveryPlanGroup {
    /*
     * The group type.
     */
    @JsonProperty(value = "groupType", required = true)
    private RecoveryPlanGroupType groupType;

    /*
     * The list of protected items.
     */
    @JsonProperty(value = "replicationProtectedItems")
    private List<RecoveryPlanProtectedItem> replicationProtectedItems;

    /*
     * The start group actions.
     */
    @JsonProperty(value = "startGroupActions")
    private List<RecoveryPlanAction> startGroupActions;

    /*
     * The end group actions.
     */
    @JsonProperty(value = "endGroupActions")
    private List<RecoveryPlanAction> endGroupActions;

    /** Creates an instance of RecoveryPlanGroup class. */
    public RecoveryPlanGroup() {
    }

    /**
     * Get the groupType property: The group type.
     *
     * @return the groupType value.
     */
    public RecoveryPlanGroupType groupType() {
        return this.groupType;
    }

    /**
     * Set the groupType property: The group type.
     *
     * @param groupType the groupType value to set.
     * @return the RecoveryPlanGroup object itself.
     */
    public RecoveryPlanGroup withGroupType(RecoveryPlanGroupType groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * Get the replicationProtectedItems property: The list of protected items.
     *
     * @return the replicationProtectedItems value.
     */
    public List<RecoveryPlanProtectedItem> replicationProtectedItems() {
        return this.replicationProtectedItems;
    }

    /**
     * Set the replicationProtectedItems property: The list of protected items.
     *
     * @param replicationProtectedItems the replicationProtectedItems value to set.
     * @return the RecoveryPlanGroup object itself.
     */
    public RecoveryPlanGroup withReplicationProtectedItems(List<RecoveryPlanProtectedItem> replicationProtectedItems) {
        this.replicationProtectedItems = replicationProtectedItems;
        return this;
    }

    /**
     * Get the startGroupActions property: The start group actions.
     *
     * @return the startGroupActions value.
     */
    public List<RecoveryPlanAction> startGroupActions() {
        return this.startGroupActions;
    }

    /**
     * Set the startGroupActions property: The start group actions.
     *
     * @param startGroupActions the startGroupActions value to set.
     * @return the RecoveryPlanGroup object itself.
     */
    public RecoveryPlanGroup withStartGroupActions(List<RecoveryPlanAction> startGroupActions) {
        this.startGroupActions = startGroupActions;
        return this;
    }

    /**
     * Get the endGroupActions property: The end group actions.
     *
     * @return the endGroupActions value.
     */
    public List<RecoveryPlanAction> endGroupActions() {
        return this.endGroupActions;
    }

    /**
     * Set the endGroupActions property: The end group actions.
     *
     * @param endGroupActions the endGroupActions value to set.
     * @return the RecoveryPlanGroup object itself.
     */
    public RecoveryPlanGroup withEndGroupActions(List<RecoveryPlanAction> endGroupActions) {
        this.endGroupActions = endGroupActions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (groupType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property groupType in model RecoveryPlanGroup"));
        }
        if (replicationProtectedItems() != null) {
            replicationProtectedItems().forEach(e -> e.validate());
        }
        if (startGroupActions() != null) {
            startGroupActions().forEach(e -> e.validate());
        }
        if (endGroupActions() != null) {
            endGroupActions().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RecoveryPlanGroup.class);
}