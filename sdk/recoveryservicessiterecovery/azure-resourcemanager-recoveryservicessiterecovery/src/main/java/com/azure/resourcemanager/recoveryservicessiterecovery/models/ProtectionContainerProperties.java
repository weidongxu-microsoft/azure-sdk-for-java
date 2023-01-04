// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Protection profile custom data details. */
@Fluent
public final class ProtectionContainerProperties {
    /*
     * Fabric friendly name.
     */
    @JsonProperty(value = "fabricFriendlyName")
    private String fabricFriendlyName;

    /*
     * The name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * The fabric type.
     */
    @JsonProperty(value = "fabricType")
    private String fabricType;

    /*
     * Number of protected PEs.
     */
    @JsonProperty(value = "protectedItemCount")
    private Integer protectedItemCount;

    /*
     * The pairing status of this cloud.
     */
    @JsonProperty(value = "pairingStatus")
    private String pairingStatus;

    /*
     * The role of this cloud.
     */
    @JsonProperty(value = "role")
    private String role;

    /*
     * Fabric specific details.
     */
    @JsonProperty(value = "fabricSpecificDetails")
    private ProtectionContainerFabricSpecificDetails fabricSpecificDetails;

    /** Creates an instance of ProtectionContainerProperties class. */
    public ProtectionContainerProperties() {
    }

    /**
     * Get the fabricFriendlyName property: Fabric friendly name.
     *
     * @return the fabricFriendlyName value.
     */
    public String fabricFriendlyName() {
        return this.fabricFriendlyName;
    }

    /**
     * Set the fabricFriendlyName property: Fabric friendly name.
     *
     * @param fabricFriendlyName the fabricFriendlyName value to set.
     * @return the ProtectionContainerProperties object itself.
     */
    public ProtectionContainerProperties withFabricFriendlyName(String fabricFriendlyName) {
        this.fabricFriendlyName = fabricFriendlyName;
        return this;
    }

    /**
     * Get the friendlyName property: The name.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: The name.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the ProtectionContainerProperties object itself.
     */
    public ProtectionContainerProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the fabricType property: The fabric type.
     *
     * @return the fabricType value.
     */
    public String fabricType() {
        return this.fabricType;
    }

    /**
     * Set the fabricType property: The fabric type.
     *
     * @param fabricType the fabricType value to set.
     * @return the ProtectionContainerProperties object itself.
     */
    public ProtectionContainerProperties withFabricType(String fabricType) {
        this.fabricType = fabricType;
        return this;
    }

    /**
     * Get the protectedItemCount property: Number of protected PEs.
     *
     * @return the protectedItemCount value.
     */
    public Integer protectedItemCount() {
        return this.protectedItemCount;
    }

    /**
     * Set the protectedItemCount property: Number of protected PEs.
     *
     * @param protectedItemCount the protectedItemCount value to set.
     * @return the ProtectionContainerProperties object itself.
     */
    public ProtectionContainerProperties withProtectedItemCount(Integer protectedItemCount) {
        this.protectedItemCount = protectedItemCount;
        return this;
    }

    /**
     * Get the pairingStatus property: The pairing status of this cloud.
     *
     * @return the pairingStatus value.
     */
    public String pairingStatus() {
        return this.pairingStatus;
    }

    /**
     * Set the pairingStatus property: The pairing status of this cloud.
     *
     * @param pairingStatus the pairingStatus value to set.
     * @return the ProtectionContainerProperties object itself.
     */
    public ProtectionContainerProperties withPairingStatus(String pairingStatus) {
        this.pairingStatus = pairingStatus;
        return this;
    }

    /**
     * Get the role property: The role of this cloud.
     *
     * @return the role value.
     */
    public String role() {
        return this.role;
    }

    /**
     * Set the role property: The role of this cloud.
     *
     * @param role the role value to set.
     * @return the ProtectionContainerProperties object itself.
     */
    public ProtectionContainerProperties withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * Get the fabricSpecificDetails property: Fabric specific details.
     *
     * @return the fabricSpecificDetails value.
     */
    public ProtectionContainerFabricSpecificDetails fabricSpecificDetails() {
        return this.fabricSpecificDetails;
    }

    /**
     * Set the fabricSpecificDetails property: Fabric specific details.
     *
     * @param fabricSpecificDetails the fabricSpecificDetails value to set.
     * @return the ProtectionContainerProperties object itself.
     */
    public ProtectionContainerProperties withFabricSpecificDetails(
        ProtectionContainerFabricSpecificDetails fabricSpecificDetails) {
        this.fabricSpecificDetails = fabricSpecificDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fabricSpecificDetails() != null) {
            fabricSpecificDetails().validate();
        }
    }
}