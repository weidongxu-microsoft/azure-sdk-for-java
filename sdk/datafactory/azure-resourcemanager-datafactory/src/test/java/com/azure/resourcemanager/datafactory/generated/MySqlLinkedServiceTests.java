// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureKeyVaultSecretReference;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.MySqlLinkedService;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MySqlLinkedServiceTests {
    @Test
    public void testDeserialize() {
        MySqlLinkedService model =
            BinaryData
                .fromString(
                    "{\"type\":\"MySql\",\"typeProperties\":{\"password\":{\"type\":\"AzureKeyVaultSecret\"}},\"connectVia\":{\"referenceName\":\"yq\",\"parameters\":{}},\"description\":\"qxutrpbrruyuua\",\"parameters\":{\"jwcolbm\":{\"type\":\"Bool\"},\"nwtpcpahprz\":{\"type\":\"Array\"},\"hmtfho\":{\"type\":\"Bool\"},\"zcmjhngxnoqrxt\":{\"type\":\"Float\"}},\"annotations\":[],\"\":{}}")
                .toObject(MySqlLinkedService.class);
        Assertions.assertEquals("yq", model.connectVia().referenceName());
        Assertions.assertEquals("qxutrpbrruyuua", model.description());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("jwcolbm").type());
    }

    @Test
    public void testSerialize() {
        MySqlLinkedService model =
            new MySqlLinkedService()
                .withConnectVia(new IntegrationRuntimeReference().withReferenceName("yq").withParameters(mapOf()))
                .withDescription("qxutrpbrruyuua")
                .withParameters(
                    mapOf(
                        "jwcolbm",
                        new ParameterSpecification().withType(ParameterType.BOOL),
                        "nwtpcpahprz",
                        new ParameterSpecification().withType(ParameterType.ARRAY),
                        "hmtfho",
                        new ParameterSpecification().withType(ParameterType.BOOL),
                        "zcmjhngxnoqrxt",
                        new ParameterSpecification().withType(ParameterType.FLOAT)))
                .withAnnotations(Arrays.asList())
                .withPassword(new AzureKeyVaultSecretReference());
        model = BinaryData.fromObject(model).toObject(MySqlLinkedService.class);
        Assertions.assertEquals("yq", model.connectVia().referenceName());
        Assertions.assertEquals("qxutrpbrruyuua", model.description());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("jwcolbm").type());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}