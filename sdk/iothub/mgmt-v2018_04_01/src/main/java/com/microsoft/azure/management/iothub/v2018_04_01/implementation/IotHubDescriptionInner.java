/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01.implementation;

import com.microsoft.azure.management.iothub.v2018_04_01.IotHubProperties;
import com.microsoft.azure.management.iothub.v2018_04_01.IotHubSkuInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Resource;

/**
 * The description of the IoT hub.
 */
public class IotHubDescriptionInner extends Resource {
    /**
     * The Etag field is *not* required. If it is provided in the response
     * body, it must also be provided as a header per the normal ETag
     * convention.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * IotHub properties.
     */
    @JsonProperty(value = "properties")
    private IotHubProperties properties;

    /**
     * IotHub SKU info.
     */
    @JsonProperty(value = "sku", required = true)
    private IotHubSkuInfo sku;

    /**
     * Get the Etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal ETag convention.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the Etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal ETag convention.
     *
     * @param etag the etag value to set
     * @return the IotHubDescriptionInner object itself.
     */
    public IotHubDescriptionInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get iotHub properties.
     *
     * @return the properties value
     */
    public IotHubProperties properties() {
        return this.properties;
    }

    /**
     * Set iotHub properties.
     *
     * @param properties the properties value to set
     * @return the IotHubDescriptionInner object itself.
     */
    public IotHubDescriptionInner withProperties(IotHubProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get iotHub SKU info.
     *
     * @return the sku value
     */
    public IotHubSkuInfo sku() {
        return this.sku;
    }

    /**
     * Set iotHub SKU info.
     *
     * @param sku the sku value to set
     * @return the IotHubDescriptionInner object itself.
     */
    public IotHubDescriptionInner withSku(IotHubSkuInfo sku) {
        this.sku = sku;
        return this;
    }

}
