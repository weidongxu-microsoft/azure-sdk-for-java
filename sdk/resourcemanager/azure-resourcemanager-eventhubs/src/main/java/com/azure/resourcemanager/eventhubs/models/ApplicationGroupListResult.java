// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventhubs.fluent.models.ApplicationGroupInner;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The response from the List Application Groups operation.
 */
@Fluent
public final class ApplicationGroupListResult {
    /*
     * Result of the List Application Groups operation.
     */
    @JsonProperty(value = "value")
    private List<ApplicationGroupInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains an incomplete list of Authorization Rules
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Creates an instance of ApplicationGroupListResult class.
     */
    public ApplicationGroupListResult() {
    }

    /**
     * Get the value property: Result of the List Application Groups operation.
     *
     * @return the value value.
     */
    public List<ApplicationGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List Application Groups operation.
     *
     * @param value the value value to set.
     * @return the ApplicationGroupListResult object itself.
     */
    public ApplicationGroupListResult withValue(List<ApplicationGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains an incomplete list of
     * Authorization Rules.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
