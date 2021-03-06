/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity source for SAP ECC source.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SapEccSource.class)
@JsonTypeName("SapEccSource")
public class SapEccSource extends TabularSource {
    /**
     * SAP ECC OData query. For example, "$top=1". Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /**
     * Get sAP ECC OData query. For example, "$top=1". Type: string (or Expression with resultType string).
     *
     * @return the query value
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set sAP ECC OData query. For example, "$top=1". Type: string (or Expression with resultType string).
     *
     * @param query the query value to set
     * @return the SapEccSource object itself.
     */
    public SapEccSource withQuery(Object query) {
        this.query = query;
        return this;
    }

}
