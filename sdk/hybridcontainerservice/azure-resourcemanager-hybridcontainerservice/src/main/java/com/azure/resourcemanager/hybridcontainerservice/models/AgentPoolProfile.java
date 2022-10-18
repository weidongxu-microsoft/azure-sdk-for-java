// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** NodePool configuration. */
@Fluent
public class AgentPoolProfile {
    /*
     * Count - Number of agents to host docker containers. Allowed values must be in the range of 1 to 100 (inclusive).
     * The default value is 1.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * AvailabilityZones - The list of Availability zones to use for nodes. Datacenter racks modelled as zones
     */
    @JsonProperty(value = "availabilityZones")
    private List<String> availabilityZones;

    /*
     * The maximum number of nodes for auto-scaling
     */
    @JsonProperty(value = "maxCount")
    private Integer maxCount;

    /*
     * The maximum number of pods that can run on a node.
     */
    @JsonProperty(value = "maxPods")
    private Integer maxPods;

    /*
     * The minimum number of nodes for auto-scaling
     */
    @JsonProperty(value = "minCount")
    private Integer minCount;

    /*
     * Mode - AgentPoolMode represents mode of an agent pool. Possible values include: 'System', 'LB', 'User'. Default
     * is 'User'
     */
    @JsonProperty(value = "mode")
    private Mode mode;

    /*
     * NodeLabels - Agent pool node labels to be persisted across all nodes in agent pool.
     */
    @JsonProperty(value = "nodeLabels")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> nodeLabels;

    /*
     * NodeTaints - Taints added to new nodes during node pool create and scale. For example, key=value:NoSchedule.
     */
    @JsonProperty(value = "nodeTaints")
    private List<String> nodeTaints;

    /*
     * OsType - OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux. Possible values
     * include: 'Linux', 'Windows'
     */
    @JsonProperty(value = "osType")
    private OsType osType;

    /*
     * The version of node image
     */
    @JsonProperty(value = "nodeImageVersion")
    private String nodeImageVersion;

    /*
     * VmSize - The size of the agent pool VMs.
     */
    @JsonProperty(value = "vmSize")
    private String vmSize;

    /*
     * The underlying cloud infra provider properties.
     */
    @JsonProperty(value = "cloudProviderProfile")
    private CloudProviderProfile cloudProviderProfile;

    /** Creates an instance of AgentPoolProfile class. */
    public AgentPoolProfile() {
    }

    /**
     * Get the count property: Count - Number of agents to host docker containers. Allowed values must be in the range
     * of 1 to 100 (inclusive). The default value is 1.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Count - Number of agents to host docker containers. Allowed values must be in the range
     * of 1 to 100 (inclusive). The default value is 1.
     *
     * @param count the count value to set.
     * @return the AgentPoolProfile object itself.
     */
    public AgentPoolProfile withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the availabilityZones property: AvailabilityZones - The list of Availability zones to use for nodes.
     * Datacenter racks modelled as zones.
     *
     * @return the availabilityZones value.
     */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }

    /**
     * Set the availabilityZones property: AvailabilityZones - The list of Availability zones to use for nodes.
     * Datacenter racks modelled as zones.
     *
     * @param availabilityZones the availabilityZones value to set.
     * @return the AgentPoolProfile object itself.
     */
    public AgentPoolProfile withAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    /**
     * Get the maxCount property: The maximum number of nodes for auto-scaling.
     *
     * @return the maxCount value.
     */
    public Integer maxCount() {
        return this.maxCount;
    }

    /**
     * Set the maxCount property: The maximum number of nodes for auto-scaling.
     *
     * @param maxCount the maxCount value to set.
     * @return the AgentPoolProfile object itself.
     */
    public AgentPoolProfile withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * Get the maxPods property: The maximum number of pods that can run on a node.
     *
     * @return the maxPods value.
     */
    public Integer maxPods() {
        return this.maxPods;
    }

    /**
     * Set the maxPods property: The maximum number of pods that can run on a node.
     *
     * @param maxPods the maxPods value to set.
     * @return the AgentPoolProfile object itself.
     */
    public AgentPoolProfile withMaxPods(Integer maxPods) {
        this.maxPods = maxPods;
        return this;
    }

    /**
     * Get the minCount property: The minimum number of nodes for auto-scaling.
     *
     * @return the minCount value.
     */
    public Integer minCount() {
        return this.minCount;
    }

    /**
     * Set the minCount property: The minimum number of nodes for auto-scaling.
     *
     * @param minCount the minCount value to set.
     * @return the AgentPoolProfile object itself.
     */
    public AgentPoolProfile withMinCount(Integer minCount) {
        this.minCount = minCount;
        return this;
    }

    /**
     * Get the mode property: Mode - AgentPoolMode represents mode of an agent pool. Possible values include: 'System',
     * 'LB', 'User'. Default is 'User'.
     *
     * @return the mode value.
     */
    public Mode mode() {
        return this.mode;
    }

    /**
     * Set the mode property: Mode - AgentPoolMode represents mode of an agent pool. Possible values include: 'System',
     * 'LB', 'User'. Default is 'User'.
     *
     * @param mode the mode value to set.
     * @return the AgentPoolProfile object itself.
     */
    public AgentPoolProfile withMode(Mode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get the nodeLabels property: NodeLabels - Agent pool node labels to be persisted across all nodes in agent pool.
     *
     * @return the nodeLabels value.
     */
    public Map<String, String> nodeLabels() {
        return this.nodeLabels;
    }

    /**
     * Set the nodeLabels property: NodeLabels - Agent pool node labels to be persisted across all nodes in agent pool.
     *
     * @param nodeLabels the nodeLabels value to set.
     * @return the AgentPoolProfile object itself.
     */
    public AgentPoolProfile withNodeLabels(Map<String, String> nodeLabels) {
        this.nodeLabels = nodeLabels;
        return this;
    }

    /**
     * Get the nodeTaints property: NodeTaints - Taints added to new nodes during node pool create and scale. For
     * example, key=value:NoSchedule.
     *
     * @return the nodeTaints value.
     */
    public List<String> nodeTaints() {
        return this.nodeTaints;
    }

    /**
     * Set the nodeTaints property: NodeTaints - Taints added to new nodes during node pool create and scale. For
     * example, key=value:NoSchedule.
     *
     * @param nodeTaints the nodeTaints value to set.
     * @return the AgentPoolProfile object itself.
     */
    public AgentPoolProfile withNodeTaints(List<String> nodeTaints) {
        this.nodeTaints = nodeTaints;
        return this;
    }

    /**
     * Get the osType property: OsType - OsType to be used to specify os type. Choose from Linux and Windows. Default to
     * Linux. Possible values include: 'Linux', 'Windows'.
     *
     * @return the osType value.
     */
    public OsType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: OsType - OsType to be used to specify os type. Choose from Linux and Windows. Default to
     * Linux. Possible values include: 'Linux', 'Windows'.
     *
     * @param osType the osType value to set.
     * @return the AgentPoolProfile object itself.
     */
    public AgentPoolProfile withOsType(OsType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the nodeImageVersion property: The version of node image.
     *
     * @return the nodeImageVersion value.
     */
    public String nodeImageVersion() {
        return this.nodeImageVersion;
    }

    /**
     * Set the nodeImageVersion property: The version of node image.
     *
     * @param nodeImageVersion the nodeImageVersion value to set.
     * @return the AgentPoolProfile object itself.
     */
    public AgentPoolProfile withNodeImageVersion(String nodeImageVersion) {
        this.nodeImageVersion = nodeImageVersion;
        return this;
    }

    /**
     * Get the vmSize property: VmSize - The size of the agent pool VMs.
     *
     * @return the vmSize value.
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: VmSize - The size of the agent pool VMs.
     *
     * @param vmSize the vmSize value to set.
     * @return the AgentPoolProfile object itself.
     */
    public AgentPoolProfile withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the cloudProviderProfile property: The underlying cloud infra provider properties.
     *
     * @return the cloudProviderProfile value.
     */
    public CloudProviderProfile cloudProviderProfile() {
        return this.cloudProviderProfile;
    }

    /**
     * Set the cloudProviderProfile property: The underlying cloud infra provider properties.
     *
     * @param cloudProviderProfile the cloudProviderProfile value to set.
     * @return the AgentPoolProfile object itself.
     */
    public AgentPoolProfile withCloudProviderProfile(CloudProviderProfile cloudProviderProfile) {
        this.cloudProviderProfile = cloudProviderProfile;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cloudProviderProfile() != null) {
            cloudProviderProfile().validate();
        }
    }
}