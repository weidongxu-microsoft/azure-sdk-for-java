# Release History

## 1.0.0 (2025-10-14)

- Azure Resource Manager Compute Disk client library for Java. This package contains Microsoft Azure SDK for Compute Disk Management SDK. Compute Client. Package api-version 2025-01-02. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).

### Breaking Changes

#### `models.DiskEncryptionSetList` was removed

#### `models.DiskList` was removed

#### `models.PrivateEndpointConnectionListResult` was removed

#### `models.SnapshotList` was removed

#### `models.ResourceUriList` was removed

#### `models.DiskRestorePointList` was removed

#### `models.DiskAccessList` was removed

#### `models.ShareInfoElement` was modified

* `ShareInfoElement()` was changed to private access

#### `models.ApiError` was modified

* `ApiError()` was changed to private access

#### `models.InnerError` was modified

* `InnerError()` was changed to private access
* `withExceptiontype(java.lang.String)` was removed
* `withErrordetail(java.lang.String)` was removed

#### `models.DiskRestorePoint` was modified

* `java.lang.Float completionPercent()` -> `java.lang.Double completionPercent()`

#### `models.Disk$Definition` was modified

* `withCompletionPercent(java.lang.Float)` was removed

#### `models.PropertyUpdatesInProgress` was modified

* `PropertyUpdatesInProgress()` was changed to private access
* `withTargetTier(java.lang.String)` was removed

#### `ComputeDiskManager` was modified

* `fluent.AzureComputeResourceManagementApi serviceClient()` -> `fluent.ComputeDiskManagementClient serviceClient()`

#### `models.Snapshot$Definition` was modified

* `withCompletionPercent(java.lang.Float)` was removed

#### `models.PrivateLinkResource` was modified

* `PrivateLinkResource()` was changed to private access
* `withRequiredZoneNames(java.util.List)` was removed

#### `models.Snapshot` was modified

* `java.lang.Float completionPercent()` -> `java.lang.Double completionPercent()`

#### `models.DiskAccesses` was modified

* `deleteAPrivateEndpointConnection(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `listPrivateEndpointConnections(java.lang.String,java.lang.String)` was removed
* `listPrivateEndpointConnections(java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `getAPrivateEndpointConnectionWithResponse(java.lang.String,java.lang.String,java.lang.String,com.azure.core.util.Context)` was removed
* `deleteAPrivateEndpointConnection(java.lang.String,java.lang.String,java.lang.String)` was removed
* `getAPrivateEndpointConnection(java.lang.String,java.lang.String,java.lang.String)` was removed
* `updateAPrivateEndpointConnection(java.lang.String,java.lang.String,java.lang.String,fluent.models.PrivateEndpointConnectionInner)` was removed
* `updateAPrivateEndpointConnection(java.lang.String,java.lang.String,java.lang.String,fluent.models.PrivateEndpointConnectionInner,com.azure.core.util.Context)` was removed

#### `models.PrivateEndpoint` was modified

* `PrivateEndpoint()` was changed to private access

#### `models.Disk` was modified

* `java.lang.Float completionPercent()` -> `java.lang.Double completionPercent()`

### Features Added

* `models.PrivateEndpointConnections` was added

#### `models.Disk$Definition` was modified

* `withCompletionPercent(java.lang.Double)` was added

#### `ComputeDiskManager` was modified

* `privateEndpointConnections()` was added

#### `models.Snapshot$Definition` was modified

* `withCompletionPercent(java.lang.Double)` was added

## 1.0.0-beta.1 (2025-10-14)

- Azure Resource Manager ComputeDisk client library for Java. This package contains Microsoft Azure SDK for ComputeDisk Management SDK. Compute Client. Package tag package-compute-disk. For documentation on how to use this package, please see [Azure Management Libraries for Java](https://aka.ms/azsdk/java/mgmt).
### Features Added

- Initial release for the azure-resourcemanager-compute-disk Java SDK.
