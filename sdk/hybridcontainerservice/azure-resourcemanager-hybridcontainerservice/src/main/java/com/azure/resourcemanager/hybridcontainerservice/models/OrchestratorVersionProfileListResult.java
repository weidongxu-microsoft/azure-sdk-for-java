// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.resourcemanager.hybridcontainerservice.fluent.models.OrchestratorVersionProfileListResultInner;
import java.util.List;

/** An immutable client-side representation of OrchestratorVersionProfileListResult. */
public interface OrchestratorVersionProfileListResult {
    /**
     * Gets the orchestrators property: Profile of the orchestrator versions.
     *
     * @return the orchestrators value.
     */
    List<OrchestratorVersionProfile> orchestrators();

    /**
     * Gets the id property: Resource Id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Resource Name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource Type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the inner
     * com.azure.resourcemanager.hybridcontainerservice.fluent.models.OrchestratorVersionProfileListResultInner object.
     *
     * @return the inner object.
     */
    OrchestratorVersionProfileListResultInner innerModel();
}