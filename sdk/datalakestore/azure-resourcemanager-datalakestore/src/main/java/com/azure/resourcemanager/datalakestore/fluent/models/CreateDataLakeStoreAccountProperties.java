// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakestore.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datalakestore.models.CreateFirewallRuleWithAccountParameters;
import com.azure.resourcemanager.datalakestore.models.CreateTrustedIdProviderWithAccountParameters;
import com.azure.resourcemanager.datalakestore.models.CreateVirtualNetworkRuleWithAccountParameters;
import com.azure.resourcemanager.datalakestore.models.EncryptionConfig;
import com.azure.resourcemanager.datalakestore.models.EncryptionState;
import com.azure.resourcemanager.datalakestore.models.FirewallAllowAzureIpsState;
import com.azure.resourcemanager.datalakestore.models.FirewallState;
import com.azure.resourcemanager.datalakestore.models.TierType;
import com.azure.resourcemanager.datalakestore.models.TrustedIdProviderState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CreateDataLakeStoreAccountProperties model. */
@Fluent
public final class CreateDataLakeStoreAccountProperties {
    /*
     * The default owner group for all new folders and files created in the Data Lake Store account.
     */
    @JsonProperty(value = "defaultGroup")
    private String defaultGroup;

    /*
     * The Key Vault encryption configuration.
     */
    @JsonProperty(value = "encryptionConfig")
    private EncryptionConfig encryptionConfig;

    /*
     * The current state of encryption for this Data Lake Store account.
     */
    @JsonProperty(value = "encryptionState")
    private EncryptionState encryptionState;

    /*
     * The list of firewall rules associated with this Data Lake Store account.
     */
    @JsonProperty(value = "firewallRules")
    private List<CreateFirewallRuleWithAccountParameters> firewallRules;

    /*
     * The list of virtual network rules associated with this Data Lake Store account.
     */
    @JsonProperty(value = "virtualNetworkRules")
    private List<CreateVirtualNetworkRuleWithAccountParameters> virtualNetworkRules;

    /*
     * The current state of the IP address firewall for this Data Lake Store account.
     */
    @JsonProperty(value = "firewallState")
    private FirewallState firewallState;

    /*
     * The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall
     * is disabled, this is not enforced.
     */
    @JsonProperty(value = "firewallAllowAzureIps")
    private FirewallAllowAzureIpsState firewallAllowAzureIps;

    /*
     * The list of trusted identity providers associated with this Data Lake Store account.
     */
    @JsonProperty(value = "trustedIdProviders")
    private List<CreateTrustedIdProviderWithAccountParameters> trustedIdProviders;

    /*
     * The current state of the trusted identity provider feature for this Data Lake Store account.
     */
    @JsonProperty(value = "trustedIdProviderState")
    private TrustedIdProviderState trustedIdProviderState;

    /*
     * The commitment tier to use for next month.
     */
    @JsonProperty(value = "newTier")
    private TierType newTier;

    /** Creates an instance of CreateDataLakeStoreAccountProperties class. */
    public CreateDataLakeStoreAccountProperties() {
    }

    /**
     * Get the defaultGroup property: The default owner group for all new folders and files created in the Data Lake
     * Store account.
     *
     * @return the defaultGroup value.
     */
    public String defaultGroup() {
        return this.defaultGroup;
    }

    /**
     * Set the defaultGroup property: The default owner group for all new folders and files created in the Data Lake
     * Store account.
     *
     * @param defaultGroup the defaultGroup value to set.
     * @return the CreateDataLakeStoreAccountProperties object itself.
     */
    public CreateDataLakeStoreAccountProperties withDefaultGroup(String defaultGroup) {
        this.defaultGroup = defaultGroup;
        return this;
    }

    /**
     * Get the encryptionConfig property: The Key Vault encryption configuration.
     *
     * @return the encryptionConfig value.
     */
    public EncryptionConfig encryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * Set the encryptionConfig property: The Key Vault encryption configuration.
     *
     * @param encryptionConfig the encryptionConfig value to set.
     * @return the CreateDataLakeStoreAccountProperties object itself.
     */
    public CreateDataLakeStoreAccountProperties withEncryptionConfig(EncryptionConfig encryptionConfig) {
        this.encryptionConfig = encryptionConfig;
        return this;
    }

    /**
     * Get the encryptionState property: The current state of encryption for this Data Lake Store account.
     *
     * @return the encryptionState value.
     */
    public EncryptionState encryptionState() {
        return this.encryptionState;
    }

    /**
     * Set the encryptionState property: The current state of encryption for this Data Lake Store account.
     *
     * @param encryptionState the encryptionState value to set.
     * @return the CreateDataLakeStoreAccountProperties object itself.
     */
    public CreateDataLakeStoreAccountProperties withEncryptionState(EncryptionState encryptionState) {
        this.encryptionState = encryptionState;
        return this;
    }

    /**
     * Get the firewallRules property: The list of firewall rules associated with this Data Lake Store account.
     *
     * @return the firewallRules value.
     */
    public List<CreateFirewallRuleWithAccountParameters> firewallRules() {
        return this.firewallRules;
    }

    /**
     * Set the firewallRules property: The list of firewall rules associated with this Data Lake Store account.
     *
     * @param firewallRules the firewallRules value to set.
     * @return the CreateDataLakeStoreAccountProperties object itself.
     */
    public CreateDataLakeStoreAccountProperties withFirewallRules(
        List<CreateFirewallRuleWithAccountParameters> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }

    /**
     * Get the virtualNetworkRules property: The list of virtual network rules associated with this Data Lake Store
     * account.
     *
     * @return the virtualNetworkRules value.
     */
    public List<CreateVirtualNetworkRuleWithAccountParameters> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: The list of virtual network rules associated with this Data Lake Store
     * account.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the CreateDataLakeStoreAccountProperties object itself.
     */
    public CreateDataLakeStoreAccountProperties withVirtualNetworkRules(
        List<CreateVirtualNetworkRuleWithAccountParameters> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the firewallState property: The current state of the IP address firewall for this Data Lake Store account.
     *
     * @return the firewallState value.
     */
    public FirewallState firewallState() {
        return this.firewallState;
    }

    /**
     * Set the firewallState property: The current state of the IP address firewall for this Data Lake Store account.
     *
     * @param firewallState the firewallState value to set.
     * @return the CreateDataLakeStoreAccountProperties object itself.
     */
    public CreateDataLakeStoreAccountProperties withFirewallState(FirewallState firewallState) {
        this.firewallState = firewallState;
        return this;
    }

    /**
     * Get the firewallAllowAzureIps property: The current state of allowing or disallowing IPs originating within Azure
     * through the firewall. If the firewall is disabled, this is not enforced.
     *
     * @return the firewallAllowAzureIps value.
     */
    public FirewallAllowAzureIpsState firewallAllowAzureIps() {
        return this.firewallAllowAzureIps;
    }

    /**
     * Set the firewallAllowAzureIps property: The current state of allowing or disallowing IPs originating within Azure
     * through the firewall. If the firewall is disabled, this is not enforced.
     *
     * @param firewallAllowAzureIps the firewallAllowAzureIps value to set.
     * @return the CreateDataLakeStoreAccountProperties object itself.
     */
    public CreateDataLakeStoreAccountProperties withFirewallAllowAzureIps(
        FirewallAllowAzureIpsState firewallAllowAzureIps) {
        this.firewallAllowAzureIps = firewallAllowAzureIps;
        return this;
    }

    /**
     * Get the trustedIdProviders property: The list of trusted identity providers associated with this Data Lake Store
     * account.
     *
     * @return the trustedIdProviders value.
     */
    public List<CreateTrustedIdProviderWithAccountParameters> trustedIdProviders() {
        return this.trustedIdProviders;
    }

    /**
     * Set the trustedIdProviders property: The list of trusted identity providers associated with this Data Lake Store
     * account.
     *
     * @param trustedIdProviders the trustedIdProviders value to set.
     * @return the CreateDataLakeStoreAccountProperties object itself.
     */
    public CreateDataLakeStoreAccountProperties withTrustedIdProviders(
        List<CreateTrustedIdProviderWithAccountParameters> trustedIdProviders) {
        this.trustedIdProviders = trustedIdProviders;
        return this;
    }

    /**
     * Get the trustedIdProviderState property: The current state of the trusted identity provider feature for this Data
     * Lake Store account.
     *
     * @return the trustedIdProviderState value.
     */
    public TrustedIdProviderState trustedIdProviderState() {
        return this.trustedIdProviderState;
    }

    /**
     * Set the trustedIdProviderState property: The current state of the trusted identity provider feature for this Data
     * Lake Store account.
     *
     * @param trustedIdProviderState the trustedIdProviderState value to set.
     * @return the CreateDataLakeStoreAccountProperties object itself.
     */
    public CreateDataLakeStoreAccountProperties withTrustedIdProviderState(
        TrustedIdProviderState trustedIdProviderState) {
        this.trustedIdProviderState = trustedIdProviderState;
        return this;
    }

    /**
     * Get the newTier property: The commitment tier to use for next month.
     *
     * @return the newTier value.
     */
    public TierType newTier() {
        return this.newTier;
    }

    /**
     * Set the newTier property: The commitment tier to use for next month.
     *
     * @param newTier the newTier value to set.
     * @return the CreateDataLakeStoreAccountProperties object itself.
     */
    public CreateDataLakeStoreAccountProperties withNewTier(TierType newTier) {
        this.newTier = newTier;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (encryptionConfig() != null) {
            encryptionConfig().validate();
        }
        if (firewallRules() != null) {
            firewallRules().forEach(e -> e.validate());
        }
        if (virtualNetworkRules() != null) {
            virtualNetworkRules().forEach(e -> e.validate());
        }
        if (trustedIdProviders() != null) {
            trustedIdProviders().forEach(e -> e.validate());
        }
    }
}