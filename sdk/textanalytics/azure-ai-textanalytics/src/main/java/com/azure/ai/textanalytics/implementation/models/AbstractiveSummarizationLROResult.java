// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;

/** An object representing the results for an Abstractive Summarization task. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("AbstractiveSummarizationLROResults")
@Fluent
public final class AbstractiveSummarizationLROResult extends AnalyzeTextLROResult {
    /*
     * An object representing the pre-build summarization results of each document.
     */
    @JsonProperty(value = "results", required = true)
    private AbstractiveSummarizationResult results;

    /**
     * Get the results property: An object representing the pre-build summarization results of each document.
     *
     * @return the results value.
     */
    public AbstractiveSummarizationResult getResults() {
        return this.results;
    }

    /**
     * Set the results property: An object representing the pre-build summarization results of each document.
     *
     * @param results the results value to set.
     * @return the AbstractiveSummarizationLROResult object itself.
     */
    public AbstractiveSummarizationLROResult setResults(AbstractiveSummarizationResult results) {
        this.results = results;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AbstractiveSummarizationLROResult setTaskName(String taskName) {
        super.setTaskName(taskName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AbstractiveSummarizationLROResult setLastUpdateDateTime(OffsetDateTime lastUpdateDateTime) {
        super.setLastUpdateDateTime(lastUpdateDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AbstractiveSummarizationLROResult setStatus(State status) {
        super.setStatus(status);
        return this;
    }
}