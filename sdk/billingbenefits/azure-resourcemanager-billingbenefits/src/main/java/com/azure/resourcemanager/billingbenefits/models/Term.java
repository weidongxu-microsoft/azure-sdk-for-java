// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Represent benefit term in ISO 8601 format. */
public final class Term extends ExpandableStringEnum<Term> {
    /** Static value P1Y for Term. */
    public static final Term P1Y = fromString("P1Y");

    /** Static value P3Y for Term. */
    public static final Term P3Y = fromString("P3Y");

    /** Static value P5Y for Term. */
    public static final Term P5Y = fromString("P5Y");

    /**
     * Creates a new instance of Term value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public Term() {
    }

    /**
     * Creates or finds a Term from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Term.
     */
    @JsonCreator
    public static Term fromString(String name) {
        return fromString(name, Term.class);
    }

    /**
     * Gets known Term values.
     *
     * @return known Term values.
     */
    public static Collection<Term> values() {
        return values(Term.class);
    }
}