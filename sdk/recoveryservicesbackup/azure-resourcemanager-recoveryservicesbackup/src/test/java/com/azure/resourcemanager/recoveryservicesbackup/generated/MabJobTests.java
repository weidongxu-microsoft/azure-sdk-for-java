// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupManagementType;
import com.azure.resourcemanager.recoveryservicesbackup.models.JobSupportedAction;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabErrorInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabJob;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabJobExtendedInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabJobTaskDetails;
import com.azure.resourcemanager.recoveryservicesbackup.models.MabServerType;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadType;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MabJobTests {
    @Test
    public void testDeserialize() {
        MabJob model =
            BinaryData
                .fromString(
                    "{\"jobType\":\"MabJob\",\"duration\":\"PT65H36M23S\",\"actionsInfo\":[\"Invalid\",\"Retriable\",\"Invalid\",\"Cancellable\"],\"mabServerName\":\"zhrgmqgjsxvpqc\",\"mabServerType\":\"AzureSqlContainer\",\"workloadType\":\"SQLDataBase\",\"errorDetails\":[{\"errorString\":\"hsqqgvriibakcl\",\"recommendations\":[\"fr\",\"xousxauzl\",\"vsg\",\"wohqfzizvu\"]}],\"extendedInfo\":{\"tasksList\":[{\"taskId\":\"svth\",\"startTime\":\"2021-07-04T11:04:10Z\",\"endTime\":\"2021-03-05T16:41:13Z\",\"duration\":\"PT133H10M52S\",\"status\":\"vmribiat\"},{\"taskId\":\"plucfotangcfhnyk\",\"startTime\":\"2021-04-07T10:16:52Z\",\"endTime\":\"2021-02-07T12:46:46Z\",\"duration\":\"PT221H57M54S\",\"status\":\"wlmzqwmvtxnjmxmc\"},{\"taskId\":\"udtc\",\"startTime\":\"2021-01-01T06:59:38Z\",\"endTime\":\"2021-04-13T08:58:27Z\",\"duration\":\"PT184H46M33S\",\"status\":\"k\"},{\"taskId\":\"fabuiyjibu\",\"startTime\":\"2021-07-04T05:28:17Z\",\"endTime\":\"2021-10-23T05:21:09Z\",\"duration\":\"PT49H3M48S\",\"status\":\"iknp\"}],\"propertyBag\":{\"ipq\":\"gjiuqhibto\",\"tvqylkmqpzoyhlfb\":\"jedmurrxxgewp\"},\"dynamicErrorMessage\":\"wgcloxoebqinji\"},\"entityFriendlyName\":\"wjfuj\",\"backupManagementType\":\"MAB\",\"operation\":\"cbahhpzpofoiy\",\"status\":\"p\",\"startTime\":\"2021-05-29T00:16:26Z\",\"endTime\":\"2021-09-14T14:45:14Z\",\"activityId\":\"kholvd\"}")
                .toObject(MabJob.class);
        Assertions.assertEquals("wjfuj", model.entityFriendlyName());
        Assertions.assertEquals(BackupManagementType.MAB, model.backupManagementType());
        Assertions.assertEquals("cbahhpzpofoiy", model.operation());
        Assertions.assertEquals("p", model.status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-29T00:16:26Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-14T14:45:14Z"), model.endTime());
        Assertions.assertEquals("kholvd", model.activityId());
        Assertions.assertEquals(Duration.parse("PT65H36M23S"), model.duration());
        Assertions.assertEquals(JobSupportedAction.INVALID, model.actionsInfo().get(0));
        Assertions.assertEquals("zhrgmqgjsxvpqc", model.mabServerName());
        Assertions.assertEquals(MabServerType.AZURE_SQL_CONTAINER, model.mabServerType());
        Assertions.assertEquals(WorkloadType.SQLDATA_BASE, model.workloadType());
        Assertions.assertEquals("svth", model.extendedInfo().tasksList().get(0).taskId());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-07-04T11:04:10Z"), model.extendedInfo().tasksList().get(0).startTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-03-05T16:41:13Z"), model.extendedInfo().tasksList().get(0).endTime());
        Assertions.assertEquals(Duration.parse("PT133H10M52S"), model.extendedInfo().tasksList().get(0).duration());
        Assertions.assertEquals("vmribiat", model.extendedInfo().tasksList().get(0).status());
        Assertions.assertEquals("gjiuqhibto", model.extendedInfo().propertyBag().get("ipq"));
        Assertions.assertEquals("wgcloxoebqinji", model.extendedInfo().dynamicErrorMessage());
    }

    @Test
    public void testSerialize() {
        MabJob model =
            new MabJob()
                .withEntityFriendlyName("wjfuj")
                .withBackupManagementType(BackupManagementType.MAB)
                .withOperation("cbahhpzpofoiy")
                .withStatus("p")
                .withStartTime(OffsetDateTime.parse("2021-05-29T00:16:26Z"))
                .withEndTime(OffsetDateTime.parse("2021-09-14T14:45:14Z"))
                .withActivityId("kholvd")
                .withDuration(Duration.parse("PT65H36M23S"))
                .withActionsInfo(
                    Arrays
                        .asList(
                            JobSupportedAction.INVALID,
                            JobSupportedAction.RETRIABLE,
                            JobSupportedAction.INVALID,
                            JobSupportedAction.CANCELLABLE))
                .withMabServerName("zhrgmqgjsxvpqc")
                .withMabServerType(MabServerType.AZURE_SQL_CONTAINER)
                .withWorkloadType(WorkloadType.SQLDATA_BASE)
                .withErrorDetails(Arrays.asList(new MabErrorInfo()))
                .withExtendedInfo(
                    new MabJobExtendedInfo()
                        .withTasksList(
                            Arrays
                                .asList(
                                    new MabJobTaskDetails()
                                        .withTaskId("svth")
                                        .withStartTime(OffsetDateTime.parse("2021-07-04T11:04:10Z"))
                                        .withEndTime(OffsetDateTime.parse("2021-03-05T16:41:13Z"))
                                        .withDuration(Duration.parse("PT133H10M52S"))
                                        .withStatus("vmribiat"),
                                    new MabJobTaskDetails()
                                        .withTaskId("plucfotangcfhnyk")
                                        .withStartTime(OffsetDateTime.parse("2021-04-07T10:16:52Z"))
                                        .withEndTime(OffsetDateTime.parse("2021-02-07T12:46:46Z"))
                                        .withDuration(Duration.parse("PT221H57M54S"))
                                        .withStatus("wlmzqwmvtxnjmxmc"),
                                    new MabJobTaskDetails()
                                        .withTaskId("udtc")
                                        .withStartTime(OffsetDateTime.parse("2021-01-01T06:59:38Z"))
                                        .withEndTime(OffsetDateTime.parse("2021-04-13T08:58:27Z"))
                                        .withDuration(Duration.parse("PT184H46M33S"))
                                        .withStatus("k"),
                                    new MabJobTaskDetails()
                                        .withTaskId("fabuiyjibu")
                                        .withStartTime(OffsetDateTime.parse("2021-07-04T05:28:17Z"))
                                        .withEndTime(OffsetDateTime.parse("2021-10-23T05:21:09Z"))
                                        .withDuration(Duration.parse("PT49H3M48S"))
                                        .withStatus("iknp")))
                        .withPropertyBag(mapOf("ipq", "gjiuqhibto", "tvqylkmqpzoyhlfb", "jedmurrxxgewp"))
                        .withDynamicErrorMessage("wgcloxoebqinji"));
        model = BinaryData.fromObject(model).toObject(MabJob.class);
        Assertions.assertEquals("wjfuj", model.entityFriendlyName());
        Assertions.assertEquals(BackupManagementType.MAB, model.backupManagementType());
        Assertions.assertEquals("cbahhpzpofoiy", model.operation());
        Assertions.assertEquals("p", model.status());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-29T00:16:26Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-14T14:45:14Z"), model.endTime());
        Assertions.assertEquals("kholvd", model.activityId());
        Assertions.assertEquals(Duration.parse("PT65H36M23S"), model.duration());
        Assertions.assertEquals(JobSupportedAction.INVALID, model.actionsInfo().get(0));
        Assertions.assertEquals("zhrgmqgjsxvpqc", model.mabServerName());
        Assertions.assertEquals(MabServerType.AZURE_SQL_CONTAINER, model.mabServerType());
        Assertions.assertEquals(WorkloadType.SQLDATA_BASE, model.workloadType());
        Assertions.assertEquals("svth", model.extendedInfo().tasksList().get(0).taskId());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-07-04T11:04:10Z"), model.extendedInfo().tasksList().get(0).startTime());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-03-05T16:41:13Z"), model.extendedInfo().tasksList().get(0).endTime());
        Assertions.assertEquals(Duration.parse("PT133H10M52S"), model.extendedInfo().tasksList().get(0).duration());
        Assertions.assertEquals("vmribiat", model.extendedInfo().tasksList().get(0).status());
        Assertions.assertEquals("gjiuqhibto", model.extendedInfo().propertyBag().get("ipq"));
        Assertions.assertEquals("wgcloxoebqinji", model.extendedInfo().dynamicErrorMessage());
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