// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.SensitivityLabelInner;
import com.azure.resourcemanager.synapse.fluent.models.SensitivityLabelUpdateInner;
import com.azure.resourcemanager.synapse.models.SensitivityLabelRank;
import com.azure.resourcemanager.synapse.models.SensitivityLabelUpdateKind;
import com.azure.resourcemanager.synapse.models.SensitivityLabelUpdateList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SensitivityLabelUpdateListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SensitivityLabelUpdateList model = BinaryData.fromString(
            "{\"operations\":[{\"properties\":{\"op\":\"set\",\"schema\":\"fvpgshoxgsg\",\"table\":\"p\",\"column\":\"gzdjtxvzf\",\"sensitivityLabel\":{\"properties\":{\"schemaName\":\"gaqvlgafcqusrd\",\"tableName\":\"t\",\"columnName\":\"sdtutnwlduyc\",\"labelName\":\"zhyrmewipmve\",\"labelId\":\"xukuqgsj\",\"informationType\":\"undxgketw\",\"informationTypeId\":\"hzjhf\",\"isDisabled\":true,\"rank\":\"High\"},\"managedBy\":\"uvgp\",\"id\":\"uneqsxvmhf\",\"name\":\"uzjyihsasbhudypo\",\"type\":\"yue\"}},\"id\":\"slynsqyrpfoo\",\"name\":\"rlttymsjnygqdnfw\",\"type\":\"zdzgtilaxhnfhqly\"},{\"properties\":{\"op\":\"set\",\"schema\":\"ouwivkxoyzunbixx\",\"table\":\"ti\",\"column\":\"vcpwpgclrc\",\"sensitivityLabel\":{\"properties\":{\"schemaName\":\"oxfrkenxpmyyefr\",\"tableName\":\"pdnqqskawaoqvmmb\",\"columnName\":\"qfr\",\"labelName\":\"lkzmegnitgvkxl\",\"labelId\":\"qdrfegcealzxwhc\",\"informationType\":\"symoyq\",\"informationTypeId\":\"wigdi\",\"isDisabled\":false,\"rank\":\"Critical\"},\"managedBy\":\"omfaj\",\"id\":\"wasqvdaeyyg\",\"name\":\"xakjsqzhzb\",\"type\":\"zkgimsid\"}},\"id\":\"asi\",\"name\":\"ddyvvjskgfmo\",\"type\":\"wa\"}]}")
            .toObject(SensitivityLabelUpdateList.class);
        Assertions.assertEquals(SensitivityLabelUpdateKind.SET, model.operations().get(0).op());
        Assertions.assertEquals("fvpgshoxgsg", model.operations().get(0).schema());
        Assertions.assertEquals("p", model.operations().get(0).table());
        Assertions.assertEquals("gzdjtxvzf", model.operations().get(0).column());
        Assertions.assertEquals("zhyrmewipmve", model.operations().get(0).sensitivityLabel().labelName());
        Assertions.assertEquals("xukuqgsj", model.operations().get(0).sensitivityLabel().labelId());
        Assertions.assertEquals("undxgketw", model.operations().get(0).sensitivityLabel().informationType());
        Assertions.assertEquals("hzjhf", model.operations().get(0).sensitivityLabel().informationTypeId());
        Assertions.assertEquals(SensitivityLabelRank.HIGH, model.operations().get(0).sensitivityLabel().rank());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SensitivityLabelUpdateList model = new SensitivityLabelUpdateList().withOperations(Arrays.asList(
            new SensitivityLabelUpdateInner().withOp(SensitivityLabelUpdateKind.SET)
                .withSchema("fvpgshoxgsg")
                .withTable("p")
                .withColumn("gzdjtxvzf")
                .withSensitivityLabel(new SensitivityLabelInner().withLabelName("zhyrmewipmve")
                    .withLabelId("xukuqgsj")
                    .withInformationType("undxgketw")
                    .withInformationTypeId("hzjhf")
                    .withRank(SensitivityLabelRank.HIGH)),
            new SensitivityLabelUpdateInner().withOp(SensitivityLabelUpdateKind.SET)
                .withSchema("ouwivkxoyzunbixx")
                .withTable("ti")
                .withColumn("vcpwpgclrc")
                .withSensitivityLabel(new SensitivityLabelInner().withLabelName("lkzmegnitgvkxl")
                    .withLabelId("qdrfegcealzxwhc")
                    .withInformationType("symoyq")
                    .withInformationTypeId("wigdi")
                    .withRank(SensitivityLabelRank.CRITICAL))));
        model = BinaryData.fromObject(model).toObject(SensitivityLabelUpdateList.class);
        Assertions.assertEquals(SensitivityLabelUpdateKind.SET, model.operations().get(0).op());
        Assertions.assertEquals("fvpgshoxgsg", model.operations().get(0).schema());
        Assertions.assertEquals("p", model.operations().get(0).table());
        Assertions.assertEquals("gzdjtxvzf", model.operations().get(0).column());
        Assertions.assertEquals("zhyrmewipmve", model.operations().get(0).sensitivityLabel().labelName());
        Assertions.assertEquals("xukuqgsj", model.operations().get(0).sensitivityLabel().labelId());
        Assertions.assertEquals("undxgketw", model.operations().get(0).sensitivityLabel().informationType());
        Assertions.assertEquals("hzjhf", model.operations().get(0).sensitivityLabel().informationTypeId());
        Assertions.assertEquals(SensitivityLabelRank.HIGH, model.operations().get(0).sensitivityLabel().rank());
    }
}
