// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.resourcemanager.synapse.models.DataMaskingFunction;
import com.azure.resourcemanager.synapse.models.DataMaskingRuleState;

/**
 * Samples for DataMaskingRules CreateOrUpdate.
 */
public final class DataMaskingRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-03-01/examples/
     * DataMaskingRuleCreateOrUpdateDefaultMin.json
     */
    /**
     * Sample code: Create/Update data masking rule for default min.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void
        createUpdateDataMaskingRuleForDefaultMin(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.dataMaskingRules()
            .define("rule1")
            .withExistingSqlPool("sqlcrudtest-6852", "sqlcrudtest-2080", "sqlcrudtest-331")
            .withSchemaName("dbo")
            .withTableName("Table_1")
            .withColumnName("test1")
            .withMaskingFunction(DataMaskingFunction.DEFAULT)
            .create();
    }

    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-03-01/examples/
     * DataMaskingRuleCreateOrUpdateDefaultMax.json
     */
    /**
     * Sample code: Create/Update data masking rule for default max.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void
        createUpdateDataMaskingRuleForDefaultMax(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.dataMaskingRules()
            .define("rule1")
            .withExistingSqlPool("sqlcrudtest-6852", "sqlcrudtest-2080", "sqlcrudtest-331")
            .withAliasName("nickname")
            .withRuleState(DataMaskingRuleState.ENABLED)
            .withSchemaName("dbo")
            .withTableName("Table_1")
            .withColumnName("test1")
            .withMaskingFunction(DataMaskingFunction.DEFAULT)
            .create();
    }

    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-03-01/examples/
     * DataMaskingRuleCreateOrUpdateText.json
     */
    /**
     * Sample code: Create/Update data masking rule for text.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void createUpdateDataMaskingRuleForText(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.dataMaskingRules()
            .define("rule1")
            .withExistingSqlPool("sqlcrudtest-6852", "sqlcrudtest-2080", "sqlcrudtest-331")
            .withSchemaName("dbo")
            .withTableName("Table_1")
            .withColumnName("test1")
            .withMaskingFunction(DataMaskingFunction.TEXT)
            .withPrefixSize("1")
            .withSuffixSize("0")
            .withReplacementString("asdf")
            .create();
    }

    /*
     * x-ms-original-file: specification/synapse/resource-manager/Microsoft.Synapse/stable/2021-03-01/examples/
     * DataMaskingRuleCreateOrUpdateNumber.json
     */
    /**
     * Sample code: Create/Update data masking rule for numbers.
     * 
     * @param manager Entry point to SynapseManager.
     */
    public static void createUpdateDataMaskingRuleForNumbers(com.azure.resourcemanager.synapse.SynapseManager manager) {
        manager.dataMaskingRules()
            .define("rule1")
            .withExistingSqlPool("sqlcrudtest-6852", "sqlcrudtest-2080", "sqlcrudtest-331")
            .withSchemaName("dbo")
            .withTableName("Table_1")
            .withColumnName("test1")
            .withMaskingFunction(DataMaskingFunction.NUMBER)
            .withNumberFrom("0")
            .withNumberTo("2")
            .create();
    }
}
