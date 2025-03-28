// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.generated;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import java.io.IOException;

/**
 * Samples for AvsAssessmentsOperations DownloadUrl.
 */
public final class AvsAssessmentsOperationsDownloadUrlSamples {
    /*
     * x-ms-original-file:
     * specification/migrate/resource-manager/Microsoft.Migrate/AssessmentProjects/stable/2023-03-15/examples/
     * AvsAssessmentsOperations_DownloadUrl_MaximumSet_Gen.json
     */
    /**
     * Sample code: AvsAssessmentsOperations_DownloadUrl_MaximumSet_Gen.
     * 
     * @param manager Entry point to MigrationAssessmentManager.
     */
    public static void avsAssessmentsOperationsDownloadUrlMaximumSetGen(
        com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager manager) throws IOException {
        manager.avsAssessmentsOperations()
            .downloadUrl("ayagrawrg", "app18700project", "kuchatur-test", "asm2",
                SerializerFactory.createDefaultManagementSerializerAdapter()
                    .deserialize("{}", Object.class, SerializerEncoding.JSON),
                com.azure.core.util.Context.NONE);
    }
}
