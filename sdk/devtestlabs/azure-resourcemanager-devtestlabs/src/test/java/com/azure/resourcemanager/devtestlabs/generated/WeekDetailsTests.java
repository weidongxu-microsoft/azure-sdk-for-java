// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.WeekDetails;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WeekDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WeekDetails model =
            BinaryData
                .fromString("{\"weekdays\":[\"bezy\",\"uokktwhrdxwz\",\"wqsmbsur\",\"xim\"],\"time\":\"yocf\"}")
                .toObject(WeekDetails.class);
        Assertions.assertEquals("bezy", model.weekdays().get(0));
        Assertions.assertEquals("yocf", model.time());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WeekDetails model =
            new WeekDetails().withWeekdays(Arrays.asList("bezy", "uokktwhrdxwz", "wqsmbsur", "xim")).withTime("yocf");
        model = BinaryData.fromObject(model).toObject(WeekDetails.class);
        Assertions.assertEquals("bezy", model.weekdays().get(0));
        Assertions.assertEquals("yocf", model.time());
    }
}