/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedapplications.v2019_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * JIT approver definition.
 */
public class JitApproverDefinition {
    /**
     * The approver service principal Id.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * The approver type. Possible values include: 'user', 'group'.
     */
    @JsonProperty(value = "type")
    private JitApproverType type;

    /**
     * The approver display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Get the approver service principal Id.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the approver service principal Id.
     *
     * @param id the id value to set
     * @return the JitApproverDefinition object itself.
     */
    public JitApproverDefinition withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the approver type. Possible values include: 'user', 'group'.
     *
     * @return the type value
     */
    public JitApproverType type() {
        return this.type;
    }

    /**
     * Set the approver type. Possible values include: 'user', 'group'.
     *
     * @param type the type value to set
     * @return the JitApproverDefinition object itself.
     */
    public JitApproverDefinition withType(JitApproverType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the approver display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the approver display name.
     *
     * @param displayName the displayName value to set
     * @return the JitApproverDefinition object itself.
     */
    public JitApproverDefinition withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

}
