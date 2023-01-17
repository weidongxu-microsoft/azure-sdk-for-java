// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The date range for data in the export. This should only be specified with timeFrame set to 'Custom'. The maximum date
 * range is 3 months.
 */
@Fluent
public final class ExportTimePeriod {
    /*
     * The start date for export data.
     */
    @JsonProperty(value = "from", required = true)
    private OffsetDateTime from;

    /*
     * The end date for export data.
     */
    @JsonProperty(value = "to", required = true)
    private OffsetDateTime to;

    /** Creates an instance of ExportTimePeriod class. */
    public ExportTimePeriod() {
    }

    /**
     * Get the from property: The start date for export data.
     *
     * @return the from value.
     */
    public OffsetDateTime from() {
        return this.from;
    }

    /**
     * Set the from property: The start date for export data.
     *
     * @param from the from value to set.
     * @return the ExportTimePeriod object itself.
     */
    public ExportTimePeriod withFrom(OffsetDateTime from) {
        this.from = from;
        return this;
    }

    /**
     * Get the to property: The end date for export data.
     *
     * @return the to value.
     */
    public OffsetDateTime to() {
        return this.to;
    }

    /**
     * Set the to property: The end date for export data.
     *
     * @param to the to value to set.
     * @return the ExportTimePeriod object itself.
     */
    public ExportTimePeriod withTo(OffsetDateTime to) {
        this.to = to;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (from() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property from in model ExportTimePeriod"));
        }
        if (to() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property to in model ExportTimePeriod"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExportTimePeriod.class);
}