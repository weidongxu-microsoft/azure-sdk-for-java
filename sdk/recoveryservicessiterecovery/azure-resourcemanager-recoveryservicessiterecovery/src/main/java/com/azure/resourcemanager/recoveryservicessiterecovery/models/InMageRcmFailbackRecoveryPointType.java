// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The recovery point type. */
public final class InMageRcmFailbackRecoveryPointType extends ExpandableStringEnum<InMageRcmFailbackRecoveryPointType> {
    /** Static value ApplicationConsistent for InMageRcmFailbackRecoveryPointType. */
    public static final InMageRcmFailbackRecoveryPointType APPLICATION_CONSISTENT = fromString("ApplicationConsistent");

    /** Static value CrashConsistent for InMageRcmFailbackRecoveryPointType. */
    public static final InMageRcmFailbackRecoveryPointType CRASH_CONSISTENT = fromString("CrashConsistent");

    /**
     * Creates or finds a InMageRcmFailbackRecoveryPointType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InMageRcmFailbackRecoveryPointType.
     */
    @JsonCreator
    public static InMageRcmFailbackRecoveryPointType fromString(String name) {
        return fromString(name, InMageRcmFailbackRecoveryPointType.class);
    }

    /**
     * Gets known InMageRcmFailbackRecoveryPointType values.
     *
     * @return known InMageRcmFailbackRecoveryPointType values.
     */
    public static Collection<InMageRcmFailbackRecoveryPointType> values() {
        return values(InMageRcmFailbackRecoveryPointType.class);
    }
}