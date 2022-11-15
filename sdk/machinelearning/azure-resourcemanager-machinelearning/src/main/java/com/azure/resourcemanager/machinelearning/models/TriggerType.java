// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TriggerType. */
public final class TriggerType extends ExpandableStringEnum<TriggerType> {
    /** Static value Recurrence for TriggerType. */
    public static final TriggerType RECURRENCE = fromString("Recurrence");

    /** Static value Cron for TriggerType. */
    public static final TriggerType CRON = fromString("Cron");

    /**
     * Creates or finds a TriggerType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TriggerType.
     */
    @JsonCreator
    public static TriggerType fromString(String name) {
        return fromString(name, TriggerType.class);
    }

    /**
     * Gets known TriggerType values.
     *
     * @return known TriggerType values.
     */
    public static Collection<TriggerType> values() {
        return values(TriggerType.class);
    }
}