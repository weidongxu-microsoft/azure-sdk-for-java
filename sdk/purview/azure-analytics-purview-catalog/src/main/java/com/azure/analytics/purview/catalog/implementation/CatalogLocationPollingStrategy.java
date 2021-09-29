// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.analytics.purview.catalog.implementation;

import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.util.polling.LocationPollingStrategy;
import com.azure.core.util.polling.PollResponse;
import com.azure.core.util.polling.PollingContext;
import com.azure.core.util.serializer.ObjectSerializer;
import com.azure.core.util.serializer.TypeReference;
import reactor.core.publisher.Mono;

import java.net.MalformedURLException;
import java.net.URL;

public class CatalogLocationPollingStrategy<T, U> extends LocationPollingStrategy<T, U> {

    public static final String LOCATION = "Location";

    public CatalogLocationPollingStrategy(HttpPipeline httpPipeline) {
        super(httpPipeline);
    }

    public CatalogLocationPollingStrategy(HttpPipeline httpPipeline, ObjectSerializer serializer) {
        super(httpPipeline, serializer);
    }

    @Override
    public Mono<PollResponse<T>> onInitialResponse(Response<?> response, PollingContext<T> pollingContext,
                                                   TypeReference<T> pollResponseType) {
        return super.onInitialResponse(response, pollingContext, pollResponseType)
            .map(r -> {
                try {
                    String location = pollingContext.getData(LOCATION);
                    URL locationUrl = new URL(location);
                    URL locationUrlModified = new URL(locationUrl.getProtocol(), locationUrl.getHost(), locationUrl.getPort(),
                        locationUrl.getPath().replace("/api/", "/catalog/api/atlas/v2/")
                            + (locationUrl.getQuery() == null ? "" : ("?" + locationUrl.getQuery())), null);
                    pollingContext.setData(LOCATION, locationUrlModified.toString());
                } catch (MalformedURLException e) {
                    // TODO
                }
                return r;
            });
    }
}
