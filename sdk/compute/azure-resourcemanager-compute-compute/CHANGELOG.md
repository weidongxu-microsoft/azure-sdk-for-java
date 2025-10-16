# Release History

## 1.0.0 (2025-10-16)

- Azure Resource Manager Compute client library for Java. This package contains Microsoft Azure SDK for Compute Management SDK. Compute Client. Package api-version 2025-04-01. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.VirtualMachineListResult` was removed

#### `models.DedicatedHostListResult` was removed

#### `models.AvailabilitySetListResult` was removed

#### `models.CapacityReservationGroupListResult` was removed

#### `models.DedicatedHostGroupListResult` was removed

#### `models.VirtualMachineScaleSetListOSUpgradeHistory` was removed

#### `models.VirtualMachineRunCommandsListResult` was removed

#### `models.RunCommandListResult` was removed

#### `models.CapacityReservationListResult` was removed

#### `models.RestorePointCollectionListResult` was removed

#### `models.SshPublicKeysGroupListResult` was removed

#### `models.VirtualMachineScaleSetListResult` was removed

#### `models.DedicatedHostSizeListResult` was removed

#### `models.OperationListResult` was removed

#### `models.ImageListResult` was removed

#### `models.VirtualMachineScaleSetVMListResult` was removed

#### `models.VirtualMachineSizeListResult` was removed

#### `models.VirtualMachineScaleSetListWithLinkResult` was removed

#### `models.ListUsagesResult` was removed

#### `models.ProximityPlacementGroupListResult` was removed

#### `models.VirtualMachineScaleSetListSkusResult` was removed

#### `models.VirtualMachineScaleSetExtensionListResult` was removed

#### `models.VirtualMachineExtensionHandlerInstanceView` was modified

* `VirtualMachineExtensionHandlerInstanceView()` was changed to private access
* `withTypeHandlerVersion(java.lang.String)` was removed
* `withType(java.lang.String)` was removed
* `withStatus(models.InstanceViewStatus)` was removed

#### `models.DiskRestorePointInstanceView` was modified

* `DiskRestorePointInstanceView()` was changed to private access
* `withId(java.lang.String)` was removed
* `withReplicationStatus(models.DiskRestorePointReplicationStatus)` was removed

#### `models.RollingUpgradeProgressInfo` was modified

* `RollingUpgradeProgressInfo()` was changed to private access

#### `models.CapacityReservationGroupInstanceView` was modified

* `CapacityReservationGroupInstanceView()` was changed to private access

#### `models.DedicatedHostInstanceViewWithName` was modified

* `DedicatedHostInstanceViewWithName()` was changed to private access
* `withAvailableCapacity(models.DedicatedHostAvailableCapacity)` was removed
* `withStatuses(java.util.List)` was removed

#### `models.SubResourceWithColocationStatus` was modified

* `SubResourceWithColocationStatus()` was changed to private access
* `withId(java.lang.String)` was removed
* `withColocationStatus(models.InstanceViewStatus)` was removed

#### `models.VirtualMachineScaleSetVMExtensionsSummary` was modified

* `VirtualMachineScaleSetVMExtensionsSummary()` was changed to private access

#### `models.CapacityReservationUtilization` was modified

* `CapacityReservationUtilization()` was changed to private access

#### `models.OrchestrationServiceSummary` was modified

* `OrchestrationServiceSummary()` was changed to private access

#### `models.AutomaticOSUpgradeProperties` was modified

* `AutomaticOSUpgradeProperties()` was changed to private access
* `withAutomaticOSUpgradeSupported(boolean)` was removed

#### `models.DiskInstanceView` was modified

* `DiskInstanceView()` was changed to private access
* `withStatuses(java.util.List)` was removed
* `withEncryptionSettings(java.util.List)` was removed
* `withName(java.lang.String)` was removed

#### `models.VirtualMachineAgentInstanceView` was modified

* `VirtualMachineAgentInstanceView()` was changed to private access
* `withExtensionHandlers(java.util.List)` was removed
* `withStatuses(java.util.List)` was removed
* `withVmAgentVersion(java.lang.String)` was removed

#### `models.BootDiagnosticsInstanceView` was modified

* `BootDiagnosticsInstanceView()` was changed to private access

#### `models.PurchasePlan` was modified

* `PurchasePlan()` was changed to private access
* `withPublisher(java.lang.String)` was removed
* `withProduct(java.lang.String)` was removed
* `withName(java.lang.String)` was removed

#### `models.RunCommandParameterDefinition` was modified

* `RunCommandParameterDefinition()` was changed to private access
* `withDefaultValue(java.lang.String)` was removed
* `withType(java.lang.String)` was removed
* `withName(java.lang.String)` was removed
* `withRequired(java.lang.Boolean)` was removed

#### `ComputeManager` was modified

* `fluent.AzureComputeResourceManagementApi serviceClient()` -> `fluent.ComputeManagementClient serviceClient()`

#### `models.LastPatchInstallationSummary` was modified

* `LastPatchInstallationSummary()` was changed to private access

#### `models.VirtualMachineSoftwarePatchProperties` was modified

* `VirtualMachineSoftwarePatchProperties()` was changed to private access

#### `models.AlternativeOption` was modified

* `AlternativeOption()` was changed to private access
* `withValue(java.lang.String)` was removed
* `withType(models.AlternativeType)` was removed

#### `models.VirtualMachineHealthStatus` was modified

* `VirtualMachineHealthStatus()` was changed to private access

#### `models.VirtualMachineScaleSetMigrationInfo` was modified

* `VirtualMachineScaleSetMigrationInfo()` was changed to private access

#### `models.DataDiskImage` was modified

* `DataDiskImage()` was changed to private access

#### `models.VirtualMachineStatusCodeCount` was modified

* `VirtualMachineStatusCodeCount()` was changed to private access

#### `models.MaintenanceRedeployStatus` was modified

* `MaintenanceRedeployStatus()` was changed to private access
* `withMaintenanceWindowStartTime(java.time.OffsetDateTime)` was removed
* `withLastOperationMessage(java.lang.String)` was removed
* `withLastOperationResultCode(models.MaintenanceOperationResultCodeTypes)` was removed
* `withPreMaintenanceWindowEndTime(java.time.OffsetDateTime)` was removed
* `withIsCustomerInitiatedMaintenanceAllowed(java.lang.Boolean)` was removed
* `withPreMaintenanceWindowStartTime(java.time.OffsetDateTime)` was removed
* `withMaintenanceWindowEndTime(java.time.OffsetDateTime)` was removed

#### `models.PatchInstallationDetail` was modified

* `PatchInstallationDetail()` was changed to private access

#### `models.OperationDisplay` was modified

* `OperationDisplay()` was changed to private access

#### `models.CapacityReservationInstanceViewWithName` was modified

* `CapacityReservationInstanceViewWithName()` was changed to private access
* `withStatuses(java.util.List)` was removed
* `withUtilizationInfo(models.CapacityReservationUtilization)` was removed

#### `models.DedicatedHostGroupInstanceView` was modified

* `DedicatedHostGroupInstanceView()` was changed to private access
* `withHosts(java.util.List)` was removed

#### `models.InnerError` was modified

* `InnerError()` was changed to private access
* `withExceptiontype(java.lang.String)` was removed
* `withErrordetail(java.lang.String)` was removed

#### `models.DefaultVirtualMachineScaleSetInfo` was modified

* `DefaultVirtualMachineScaleSetInfo()` was changed to private access

#### `models.UsageName` was modified

* `UsageName()` was changed to private access
* `withLocalizedValue(java.lang.String)` was removed
* `withValue(java.lang.String)` was removed

#### `models.VirtualMachineScaleSetSkuCapacity` was modified

* `VirtualMachineScaleSetSkuCapacity()` was changed to private access

#### `models.DedicatedHostAvailableCapacity` was modified

* `DedicatedHostAvailableCapacity()` was changed to private access
* `withAllocatableVMs(java.util.List)` was removed

#### `models.DisallowedConfiguration` was modified

* `DisallowedConfiguration()` was changed to private access
* `withVmDiskType(models.VmDiskTypes)` was removed

#### `models.VirtualMachineScaleSetInstanceViewStatusesSummary` was modified

* `VirtualMachineScaleSetInstanceViewStatusesSummary()` was changed to private access

#### `models.VirtualMachinePatchStatus` was modified

* `VirtualMachinePatchStatus()` was changed to private access
* `withAvailablePatchSummary(models.AvailablePatchSummary)` was removed
* `withLastPatchInstallationSummary(models.LastPatchInstallationSummary)` was removed

#### `models.ImageDeprecationStatus` was modified

* `ImageDeprecationStatus()` was changed to private access
* `withImageState(models.ImageState)` was removed
* `withScheduledDeprecationTime(java.time.OffsetDateTime)` was removed
* `withAlternativeOption(models.AlternativeOption)` was removed

#### `models.CapacityReservationInstanceView` was modified

* `models.CapacityReservationInstanceView withUtilizationInfo(models.CapacityReservationUtilization)` -> `models.CapacityReservationInstanceView withUtilizationInfo(models.CapacityReservationUtilization)`
* `models.CapacityReservationInstanceView withStatuses(java.util.List)` -> `models.CapacityReservationInstanceView withStatuses(java.util.List)`

#### `models.UpgradeOperationHistoryStatus` was modified

* `UpgradeOperationHistoryStatus()` was changed to private access

#### `models.RestorePointInstanceView` was modified

* `RestorePointInstanceView()` was changed to private access
* `withStatuses(java.util.List)` was removed
* `withDiskRestorePoints(java.util.List)` was removed

#### `models.VirtualMachineRunCommandInstanceView` was modified

* `VirtualMachineRunCommandInstanceView()` was changed to private access
* `withOutput(java.lang.String)` was removed
* `withExitCode(java.lang.Integer)` was removed
* `withStartTime(java.time.OffsetDateTime)` was removed
* `withStatuses(java.util.List)` was removed
* `withExecutionMessage(java.lang.String)` was removed
* `withEndTime(java.time.OffsetDateTime)` was removed
* `withError(java.lang.String)` was removed
* `withExecutionState(models.ExecutionState)` was removed

#### `models.ApiError` was modified

* `ApiError()` was changed to private access

#### `models.RollbackStatusInfo` was modified

* `RollbackStatusInfo()` was changed to private access

#### `models.OSDiskImage` was modified

* `OSDiskImage()` was changed to private access
* `withOperatingSystem(models.OperatingSystemTypes)` was removed

#### `models.RollingUpgradeRunningStatus` was modified

* `RollingUpgradeRunningStatus()` was changed to private access

#### `models.DedicatedHostAllocatableVM` was modified

* `DedicatedHostAllocatableVM()` was changed to private access
* `withCount(java.lang.Double)` was removed
* `withVmSize(java.lang.String)` was removed

#### `models.LogAnalyticsOutput` was modified

* `LogAnalyticsOutput()` was changed to private access

#### `models.DedicatedHostInstanceView` was modified

* `models.DedicatedHostInstanceView withStatuses(java.util.List)` -> `models.DedicatedHostInstanceView withStatuses(java.util.List)`
* `models.DedicatedHostInstanceView withAvailableCapacity(models.DedicatedHostAvailableCapacity)` -> `models.DedicatedHostInstanceView withAvailableCapacity(models.DedicatedHostAvailableCapacity)`

#### `models.VirtualMachineImageFeature` was modified

* `VirtualMachineImageFeature()` was changed to private access
* `withValue(java.lang.String)` was removed
* `withName(java.lang.String)` was removed

#### `models.DiskRestorePointReplicationStatus` was modified

* `DiskRestorePointReplicationStatus()` was changed to private access
* `withCompletionPercent(java.lang.Integer)` was removed
* `withStatus(models.InstanceViewStatus)` was removed

#### `models.UpgradeOperationHistoricalStatusInfoProperties` was modified

* `UpgradeOperationHistoricalStatusInfoProperties()` was changed to private access

#### `models.AvailablePatchSummary` was modified

* `AvailablePatchSummary()` was changed to private access

### Features Added

* `models.SnapshotAccessState` was added

#### `models.DiskRestorePointInstanceView` was modified

* `snapshotAccessState()` was added

#### `models.RestorePoint` was modified

* `instantAccessDurationMinutes()` was added

#### `models.DedicatedHostInstanceViewWithName` was modified

* `statuses()` was added
* `availableCapacity()` was added

#### `models.RestorePointCollection` was modified

* `instantAccess()` was added

#### `models.DataDisk` was modified

* `withDiskIopsReadWrite(java.lang.Long)` was added
* `withDiskMBpsReadWrite(java.lang.Long)` was added

#### `models.RestorePointCollection$Definition` was modified

* `withInstantAccess(java.lang.Boolean)` was added

#### `models.RestorePointCollectionUpdate` was modified

* `withInstantAccess(java.lang.Boolean)` was added
* `instantAccess()` was added

#### `models.CapacityReservationInstanceViewWithName` was modified

* `statuses()` was added
* `utilizationInfo()` was added

#### `models.RestorePoint$Definition` was modified

* `withInstantAccessDurationMinutes(java.lang.Integer)` was added

#### `models.AdditionalCapabilities` was modified

* `withEnableFips1403Encryption(java.lang.Boolean)` was added
* `enableFips1403Encryption()` was added

#### `models.RestorePointCollection$Update` was modified

* `withInstantAccess(java.lang.Boolean)` was added

## 1.0.0-beta.1 (2025-10-14)

- Azure Resource Manager Compute client library for Java. This package contains Microsoft Azure SDK for Compute Management SDK. Compute Client. Package tag package-compute-compute. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
### Features Added

- Initial release for the azure-resourcemanager-compute-compute Java SDK.
