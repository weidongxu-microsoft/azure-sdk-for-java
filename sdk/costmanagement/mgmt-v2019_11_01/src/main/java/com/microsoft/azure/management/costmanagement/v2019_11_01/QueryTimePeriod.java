/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2019_11_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The start and end date for pulling data for the query.
 */
public class QueryTimePeriod {
    /**
     * The start date to pull data from.
     */
    @JsonProperty(value = "from", required = true)
    private DateTime from;

    /**
     * The end date to pull data to.
     */
    @JsonProperty(value = "to", required = true)
    private DateTime to;

    /**
     * Get the start date to pull data from.
     *
     * @return the from value
     */
    public DateTime from() {
        return this.from;
    }

    /**
     * Set the start date to pull data from.
     *
     * @param from the from value to set
     * @return the QueryTimePeriod object itself.
     */
    public QueryTimePeriod withFrom(DateTime from) {
        this.from = from;
        return this;
    }

    /**
     * Get the end date to pull data to.
     *
     * @return the to value
     */
    public DateTime to() {
        return this.to;
    }

    /**
     * Set the end date to pull data to.
     *
     * @param to the to value to set
     * @return the QueryTimePeriod object itself.
     */
    public QueryTimePeriod withTo(DateTime to) {
        this.to = to;
        return this;
    }

}
