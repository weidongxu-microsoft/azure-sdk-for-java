// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.FlexibleServerEditionCapability;

public final class FlexibleServerEditionCapabilityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FlexibleServerEditionCapability model =
            BinaryData
                .fromString(
                    "{\"name\":\"qduujitcjczdz\",\"supportedStorageEditions\":[{\"name\":\"hkr\",\"supportedStorageMB\":[],\"status\":\"ppdsbdkvwrwj\"},{\"name\":\"usnhutje\",\"supportedStorageMB\":[],\"status\":\"ldhugjzzdatqxh\"}],\"supportedServerVersions\":[{\"name\":\"eablg\",\"supportedVersionsToUpgrade\":[\"ti\",\"ndv\",\"aozwyiftyhxhu\",\"okftyxolniwpwcuk\"],\"supportedVcores\":[],\"status\":\"iawxklry\"},{\"name\":\"wckbasyypnd\",\"supportedVersionsToUpgrade\":[\"gcbacphejkot\",\"nqgoulzndli\"],\"supportedVcores\":[],\"status\":\"kgfg\"},{\"name\":\"madgakeqsrxyb\",\"supportedVersionsToUpgrade\":[\"e\",\"qytbciq\",\"ouf\",\"mmnkzsmodmgl\"],\"supportedVcores\":[],\"status\":\"b\"}],\"status\":\"tmut\"}")
                .toObject(FlexibleServerEditionCapability.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FlexibleServerEditionCapability model = new FlexibleServerEditionCapability();
        model = BinaryData.fromObject(model).toObject(FlexibleServerEditionCapability.class);
    }
}