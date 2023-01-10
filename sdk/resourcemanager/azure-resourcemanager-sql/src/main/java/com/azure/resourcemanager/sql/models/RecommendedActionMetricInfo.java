// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * Contains time series of various impacted metrics for an Azure SQL Database, Server or Elastic Pool Recommended
 * Action.
 */
@Immutable
public final class RecommendedActionMetricInfo {
    /*
     * Gets the name of the metric. e.g., CPU, Number of Queries.
     */
    @JsonProperty(value = "metricName", access = JsonProperty.Access.WRITE_ONLY)
    private String metricName;

    /*
     * Gets the unit in which metric is measured. e.g., DTU, Frequency
     */
    @JsonProperty(value = "unit", access = JsonProperty.Access.WRITE_ONLY)
    private String unit;

    /*
     * Gets the duration of time interval for the value given by this MetricInfo. e.g., PT1H (1 hour)
     */
    @JsonProperty(value = "timeGrain", access = JsonProperty.Access.WRITE_ONLY)
    private String timeGrain;

    /*
     * Gets the start time of time interval given by this MetricInfo.
     */
    @JsonProperty(value = "startTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime startTime;

    /*
     * Gets the value of the metric in the time interval given by this MetricInfo.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private Double value;

    /** Creates an instance of RecommendedActionMetricInfo class. */
    public RecommendedActionMetricInfo() {
    }

    /**
     * Get the metricName property: Gets the name of the metric. e.g., CPU, Number of Queries.
     *
     * @return the metricName value.
     */
    public String metricName() {
        return this.metricName;
    }

    /**
     * Get the unit property: Gets the unit in which metric is measured. e.g., DTU, Frequency.
     *
     * @return the unit value.
     */
    public String unit() {
        return this.unit;
    }

    /**
     * Get the timeGrain property: Gets the duration of time interval for the value given by this MetricInfo. e.g., PT1H
     * (1 hour).
     *
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Get the startTime property: Gets the start time of time interval given by this MetricInfo.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the value property: Gets the value of the metric in the time interval given by this MetricInfo.
     *
     * @return the value value.
     */
    public Double value() {
        return this.value;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}