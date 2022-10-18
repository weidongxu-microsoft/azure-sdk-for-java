// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.SecretsCollectionInner;
import com.azure.resourcemanager.appcontainers.models.ContainerAppSecret;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public final class SecretsCollectionInnerTests {
    @Test
    public void testDeserialize() {
        SecretsCollectionInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"racstwity\",\"value\":\"evxccedcp\"},{\"name\":\"dyodnwzxltj\",\"value\":\"nhltiugcxn\"},{\"name\":\"vwxqibyqunyo\",\"value\":\"wlmdjrkv\"},{\"name\":\"bvfvpdbod\",\"value\":\"izsjqlhkrr\"}]}")
                .toObject(SecretsCollectionInner.class);
    }

    @Test
    public void testSerialize() {
        SecretsCollectionInner model =
            new SecretsCollectionInner()
                .withValue(
                    Arrays
                        .asList(
                            new ContainerAppSecret(),
                            new ContainerAppSecret(),
                            new ContainerAppSecret(),
                            new ContainerAppSecret()));
        model = BinaryData.fromObject(model).toObject(SecretsCollectionInner.class);
    }
}