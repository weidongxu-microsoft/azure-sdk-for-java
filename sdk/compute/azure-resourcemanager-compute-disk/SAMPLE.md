# Code snippets and samples


## DiskAccesses

- [CreateOrUpdate](#diskaccesses_createorupdate)
- [Delete](#diskaccesses_delete)
- [GetByResourceGroup](#diskaccesses_getbyresourcegroup)
- [GetPrivateLinkResources](#diskaccesses_getprivatelinkresources)
- [List](#diskaccesses_list)
- [ListByResourceGroup](#diskaccesses_listbyresourcegroup)
- [Update](#diskaccesses_update)

## DiskEncryptionSets

- [CreateOrUpdate](#diskencryptionsets_createorupdate)
- [Delete](#diskencryptionsets_delete)
- [GetByResourceGroup](#diskencryptionsets_getbyresourcegroup)
- [List](#diskencryptionsets_list)
- [ListAssociatedResources](#diskencryptionsets_listassociatedresources)
- [ListByResourceGroup](#diskencryptionsets_listbyresourcegroup)
- [Update](#diskencryptionsets_update)

## DiskRestorePoints

- [Get](#diskrestorepoints_get)
- [GrantAccess](#diskrestorepoints_grantaccess)
- [ListByRestorePoint](#diskrestorepoints_listbyrestorepoint)
- [RevokeAccess](#diskrestorepoints_revokeaccess)

## Disks

- [CreateOrUpdate](#disks_createorupdate)
- [Delete](#disks_delete)
- [GetByResourceGroup](#disks_getbyresourcegroup)
- [GrantAccess](#disks_grantaccess)
- [List](#disks_list)
- [ListByResourceGroup](#disks_listbyresourcegroup)
- [RevokeAccess](#disks_revokeaccess)
- [Update](#disks_update)

## PrivateEndpointConnections

- [DeleteAPrivateEndpointConnection](#privateendpointconnections_deleteaprivateendpointconnection)
- [GetAPrivateEndpointConnection](#privateendpointconnections_getaprivateendpointconnection)
- [ListPrivateEndpointConnections](#privateendpointconnections_listprivateendpointconnections)
- [UpdateAPrivateEndpointConnection](#privateendpointconnections_updateaprivateendpointconnection)

## Snapshots

- [CreateOrUpdate](#snapshots_createorupdate)
- [Delete](#snapshots_delete)
- [GetByResourceGroup](#snapshots_getbyresourcegroup)
- [GrantAccess](#snapshots_grantaccess)
- [List](#snapshots_list)
- [ListByResourceGroup](#snapshots_listbyresourcegroup)
- [RevokeAccess](#snapshots_revokeaccess)
- [Update](#snapshots_update)
### DiskAccesses_CreateOrUpdate

```java
/**
 * Samples for DiskAccesses CreateOrUpdate.
 */
public final class DiskAccessesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskAccessExamples/DiskAccess_Create.json
     */
    /**
     * Sample code: create a disk access resource.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createADiskAccessResource(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskAccesses()
            .define("myDiskAccess")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .create();
    }
}
```

### DiskAccesses_Delete

```java
/**
 * Samples for DiskAccesses Delete.
 */
public final class DiskAccessesDeleteSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskAccessExamples/DiskAccess_Delete.json
     */
    /**
     * Sample code: delete a disk access resource.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void deleteADiskAccessResource(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskAccesses().delete("myResourceGroup", "myDiskAccess", com.azure.core.util.Context.NONE);
    }
}
```

### DiskAccesses_GetByResourceGroup

```java
/**
 * Samples for DiskAccesses GetByResourceGroup.
 */
public final class DiskAccessesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskAccessExamples/DiskAccess_Get_WithPrivateEndpoints.json
     */
    /**
     * Sample code: get information about a disk access resource with private endpoints.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void getInformationAboutADiskAccessResourceWithPrivateEndpoints(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskAccesses()
            .getByResourceGroupWithResponse("myResourceGroup", "myDiskAccess", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2025-01-02/diskAccessExamples/DiskAccess_Get.json
     */
    /**
     * Sample code: get information about a disk access resource.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        getInformationAboutADiskAccessResource(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskAccesses()
            .getByResourceGroupWithResponse("myResourceGroup", "myDiskAccess", com.azure.core.util.Context.NONE);
    }
}
```

### DiskAccesses_GetPrivateLinkResources

```java
/**
 * Samples for DiskAccesses GetPrivateLinkResources.
 */
public final class DiskAccessesGetPrivateLinkResourcesSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskAccessExamples/DiskAccessPrivateLinkResources_Get.json
     */
    /**
     * Sample code: list all possible private link resources under disk access resource.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void listAllPossiblePrivateLinkResourcesUnderDiskAccessResource(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskAccesses()
            .getPrivateLinkResourcesWithResponse("myResourceGroup", "myDiskAccess", com.azure.core.util.Context.NONE);
    }
}
```

### DiskAccesses_List

```java
/**
 * Samples for DiskAccesses List.
 */
public final class DiskAccessesListSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskAccessExamples/DiskAccess_ListBySubscription.json
     */
    /**
     * Sample code: list all disk access resources in a subscription.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        listAllDiskAccessResourcesInASubscription(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskAccesses().list(com.azure.core.util.Context.NONE);
    }
}
```

### DiskAccesses_ListByResourceGroup

```java
/**
 * Samples for DiskAccesses ListByResourceGroup.
 */
public final class DiskAccessesListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskAccessExamples/DiskAccess_ListByResourceGroup.json
     */
    /**
     * Sample code: list all disk access resources in a resource group.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        listAllDiskAccessResourcesInAResourceGroup(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskAccesses().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### DiskAccesses_Update

```java
import com.azure.resourcemanager.compute.disk.models.DiskAccess;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DiskAccesses Update.
 */
public final class DiskAccessesUpdateSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskAccessExamples/DiskAccess_Update.json
     */
    /**
     * Sample code: update a disk access resource.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void updateADiskAccessResource(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        DiskAccess resource = manager.diskAccesses()
            .getByResourceGroupWithResponse("myResourceGroup", "myDiskAccess", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTags(mapOf("department", "Development", "project", "PrivateEndpoints")).apply();
    }

    // Use "Map.of" if available
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
```

### DiskEncryptionSets_CreateOrUpdate

```java
import com.azure.resourcemanager.compute.disk.models.DiskEncryptionSetIdentityType;
import com.azure.resourcemanager.compute.disk.models.DiskEncryptionSetType;
import com.azure.resourcemanager.compute.disk.models.EncryptionSetIdentity;
import com.azure.resourcemanager.compute.disk.models.KeyForDiskEncryptionSet;
import com.azure.resourcemanager.compute.disk.models.SourceVault;
import com.azure.resourcemanager.compute.disk.models.UserAssignedIdentitiesValue;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DiskEncryptionSets CreateOrUpdate.
 */
public final class DiskEncryptionSetsCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * 2025-01-02/diskEncryptionSetExamples/DiskEncryptionSet_Create_WithKeyVaultFromADifferentTenant.json
     */
    /**
     * Sample code: create a disk encryption set with key vault from a different tenant.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createADiskEncryptionSetWithKeyVaultFromADifferentTenant(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskEncryptionSets()
            .define("myDiskEncryptionSet")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withIdentity(new EncryptionSetIdentity().withType(DiskEncryptionSetIdentityType.USER_ASSIGNED)
                .withUserAssignedIdentities(mapOf(
                    "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}",
                    new UserAssignedIdentitiesValue())))
            .withEncryptionType(DiskEncryptionSetType.ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY)
            .withActiveKey(new KeyForDiskEncryptionSet().withKeyUrl("fakeTokenPlaceholder"))
            .withFederatedClientId("00000000-0000-0000-0000-000000000000")
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskEncryptionSetExamples/DiskEncryptionSet_Create.json
     */
    /**
     * Sample code: create a disk encryption set.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createADiskEncryptionSet(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskEncryptionSets()
            .define("myDiskEncryptionSet")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withIdentity(new EncryptionSetIdentity().withType(DiskEncryptionSetIdentityType.SYSTEM_ASSIGNED))
            .withEncryptionType(DiskEncryptionSetType.ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY)
            .withActiveKey(new KeyForDiskEncryptionSet().withSourceVault(new SourceVault().withId(
                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.KeyVault/vaults/myVMVault"))
                .withKeyUrl("fakeTokenPlaceholder"))
            .create();
    }

    /*
     * x-ms-original-file:
     * 2025-01-02/diskEncryptionSetExamples/DiskEncryptionSet_Create_WithKeyVaultFromADifferentSubscription.json
     */
    /**
     * Sample code: create a disk encryption set with key vault from a different subscription.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createADiskEncryptionSetWithKeyVaultFromADifferentSubscription(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskEncryptionSets()
            .define("myDiskEncryptionSet")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withIdentity(new EncryptionSetIdentity().withType(DiskEncryptionSetIdentityType.SYSTEM_ASSIGNED))
            .withEncryptionType(DiskEncryptionSetType.ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY)
            .withActiveKey(new KeyForDiskEncryptionSet().withKeyUrl("fakeTokenPlaceholder"))
            .create();
    }

    // Use "Map.of" if available
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
```

### DiskEncryptionSets_Delete

```java
/**
 * Samples for DiskEncryptionSets Delete.
 */
public final class DiskEncryptionSetsDeleteSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskEncryptionSetExamples/DiskEncryptionSet_Delete.json
     */
    /**
     * Sample code: delete a disk encryption set.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void deleteADiskEncryptionSet(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskEncryptionSets().delete("myResourceGroup", "myDiskEncryptionSet", com.azure.core.util.Context.NONE);
    }
}
```

### DiskEncryptionSets_GetByResourceGroup

```java
/**
 * Samples for DiskEncryptionSets GetByResourceGroup.
 */
public final class DiskEncryptionSetsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskEncryptionSetExamples/DiskEncryptionSet_Get.json
     */
    /**
     * Sample code: get information about a disk encryption set.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        getInformationAboutADiskEncryptionSet(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskEncryptionSets()
            .getByResourceGroupWithResponse("myResourceGroup", "myDiskEncryptionSet", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2025-01-02/diskEncryptionSetExamples/DiskEncryptionSet_Get_WithAutoKeyRotationError.json
     */
    /**
     * Sample code: get information about a disk encryption set when auto-key rotation failed.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void getInformationAboutADiskEncryptionSetWhenAutoKeyRotationFailed(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskEncryptionSets()
            .getByResourceGroupWithResponse("myResourceGroup", "myDiskEncryptionSet", com.azure.core.util.Context.NONE);
    }
}
```

### DiskEncryptionSets_List

```java
/**
 * Samples for DiskEncryptionSets List.
 */
public final class DiskEncryptionSetsListSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskEncryptionSetExamples/DiskEncryptionSet_ListBySubscription.json
     */
    /**
     * Sample code: list all disk encryption sets in a subscription.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        listAllDiskEncryptionSetsInASubscription(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskEncryptionSets().list(com.azure.core.util.Context.NONE);
    }
}
```

### DiskEncryptionSets_ListAssociatedResources

```java
/**
 * Samples for DiskEncryptionSets ListAssociatedResources.
 */
public final class DiskEncryptionSetsListAssociatedResourcesSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskEncryptionSetExamples/DiskEncryptionSet_ListAssociatedResources.json
     */
    /**
     * Sample code: list all resources that are encrypted with this disk encryption set.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void listAllResourcesThatAreEncryptedWithThisDiskEncryptionSet(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskEncryptionSets()
            .listAssociatedResources("myResourceGroup", "myDiskEncryptionSet", com.azure.core.util.Context.NONE);
    }
}
```

### DiskEncryptionSets_ListByResourceGroup

```java
/**
 * Samples for DiskEncryptionSets ListByResourceGroup.
 */
public final class DiskEncryptionSetsListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskEncryptionSetExamples/DiskEncryptionSet_ListByResourceGroup.json
     */
    /**
     * Sample code: list all disk encryption sets in a resource group.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        listAllDiskEncryptionSetsInAResourceGroup(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskEncryptionSets().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### DiskEncryptionSets_Update

```java
import com.azure.resourcemanager.compute.disk.models.DiskEncryptionSet;
import com.azure.resourcemanager.compute.disk.models.DiskEncryptionSetIdentityType;
import com.azure.resourcemanager.compute.disk.models.DiskEncryptionSetType;
import com.azure.resourcemanager.compute.disk.models.EncryptionSetIdentity;
import com.azure.resourcemanager.compute.disk.models.KeyForDiskEncryptionSet;
import com.azure.resourcemanager.compute.disk.models.SourceVault;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for DiskEncryptionSets Update.
 */
public final class DiskEncryptionSetsUpdateSamples {
    /*
     * x-ms-original-file:
     * 2025-01-02/diskEncryptionSetExamples/DiskEncryptionSet_Update_WithRotationToLatestKeyVersionEnabledInProgress.
     * json
     */
    /**
     * Sample code: update a disk encryption set with rotationToLatestKeyVersionEnabled set to true - Updating.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void updateADiskEncryptionSetWithRotationToLatestKeyVersionEnabledSetToTrueUpdating(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        DiskEncryptionSet resource = manager.diskEncryptionSets()
            .getByResourceGroupWithResponse("myResourceGroup", "myDiskEncryptionSet", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withIdentity(new EncryptionSetIdentity().withType(DiskEncryptionSetIdentityType.SYSTEM_ASSIGNED))
            .withEncryptionType(DiskEncryptionSetType.ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY)
            .withActiveKey(new KeyForDiskEncryptionSet().withKeyUrl("fakeTokenPlaceholder"))
            .withRotationToLatestKeyVersionEnabled(true)
            .apply();
    }

    /*
     * x-ms-original-file:
     * 2025-01-02/diskEncryptionSetExamples/DiskEncryptionSet_Update_WithRotationToLatestKeyVersionEnabled.json
     */
    /**
     * Sample code: update a disk encryption set with rotationToLatestKeyVersionEnabled set to true - Succeeded.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void updateADiskEncryptionSetWithRotationToLatestKeyVersionEnabledSetToTrueSucceeded(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        DiskEncryptionSet resource = manager.diskEncryptionSets()
            .getByResourceGroupWithResponse("myResourceGroup", "myDiskEncryptionSet", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withIdentity(new EncryptionSetIdentity().withType(DiskEncryptionSetIdentityType.SYSTEM_ASSIGNED))
            .withEncryptionType(DiskEncryptionSetType.ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY)
            .withActiveKey(new KeyForDiskEncryptionSet().withKeyUrl("fakeTokenPlaceholder"))
            .withRotationToLatestKeyVersionEnabled(true)
            .apply();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskEncryptionSetExamples/DiskEncryptionSet_Update.json
     */
    /**
     * Sample code: update a disk encryption set.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void updateADiskEncryptionSet(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        DiskEncryptionSet resource = manager.diskEncryptionSets()
            .getByResourceGroupWithResponse("myResourceGroup", "myDiskEncryptionSet", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("department", "Development", "project", "Encryption"))
            .withEncryptionType(DiskEncryptionSetType.ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY)
            .withActiveKey(new KeyForDiskEncryptionSet().withSourceVault(new SourceVault().withId(
                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.KeyVault/vaults/myVMVault"))
                .withKeyUrl("fakeTokenPlaceholder"))
            .apply();
    }

    // Use "Map.of" if available
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
```

### DiskRestorePoints_Get

```java
/**
 * Samples for DiskRestorePoints Get.
 */
public final class DiskRestorePointsGetSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskRestorePointExamples/DiskRestorePoint_Get.json
     */
    /**
     * Sample code: get an incremental disk restorePoint resource.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        getAnIncrementalDiskRestorePointResource(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskRestorePoints()
            .getWithResponse("myResourceGroup", "rpc", "vmrp",
                "TestDisk45ceb03433006d1baee0_b70cd924-3362-4a80-93c2-9415eaa12745", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * 2025-01-02/diskRestorePointExamples/DiskRestorePoint_Get_WhenSourceResourceIsFromDifferentRegion.json
     */
    /**
     * Sample code: get an incremental disk restorePoint when source resource is from a different region.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void getAnIncrementalDiskRestorePointWhenSourceResourceIsFromADifferentRegion(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskRestorePoints()
            .getWithResponse("myResourceGroup", "rpc", "vmrp",
                "TestDisk45ceb03433006d1baee0_b70cd924-3362-4a80-93c2-9415eaa12745", com.azure.core.util.Context.NONE);
    }
}
```

### DiskRestorePoints_GrantAccess

```java
import com.azure.resourcemanager.compute.disk.models.AccessLevel;
import com.azure.resourcemanager.compute.disk.models.FileFormat;
import com.azure.resourcemanager.compute.disk.models.GrantAccessData;

/**
 * Samples for DiskRestorePoints GrantAccess.
 */
public final class DiskRestorePointsGrantAccessSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskRestorePointExamples/DiskRestorePoint_BeginGetAccess.json
     */
    /**
     * Sample code: grants access to a diskRestorePoint.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        grantsAccessToADiskRestorePoint(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskRestorePoints()
            .grantAccess("myResourceGroup", "rpc", "vmrp",
                "TestDisk45ceb03433006d1baee0_b70cd924-3362-4a80-93c2-9415eaa12745",
                new GrantAccessData().withAccess(AccessLevel.READ)
                    .withDurationInSeconds(300)
                    .withFileFormat(FileFormat.VHDX),
                com.azure.core.util.Context.NONE);
    }
}
```

### DiskRestorePoints_ListByRestorePoint

```java
/**
 * Samples for DiskRestorePoints ListByRestorePoint.
 */
public final class DiskRestorePointsListByRestorePointSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskRestorePointExamples/DiskRestorePoint_ListByVmRestorePoint.json
     */
    /**
     * Sample code: get an incremental disk restorePoint resource.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        getAnIncrementalDiskRestorePointResource(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskRestorePoints()
            .listByRestorePoint("myResourceGroup", "rpc", "vmrp", com.azure.core.util.Context.NONE);
    }
}
```

### DiskRestorePoints_RevokeAccess

```java
/**
 * Samples for DiskRestorePoints RevokeAccess.
 */
public final class DiskRestorePointsRevokeAccessSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskRestorePointExamples/DiskRestorePoint_EndGetAccess.json
     */
    /**
     * Sample code: revokes access to a diskRestorePoint.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        revokesAccessToADiskRestorePoint(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.diskRestorePoints()
            .revokeAccess("myResourceGroup", "rpc", "vmrp",
                "TestDisk45ceb03433006d1baee0_b70cd924-3362-4a80-93c2-9415eaa12745", com.azure.core.util.Context.NONE);
    }
}
```

### Disks_CreateOrUpdate

```java
import com.azure.resourcemanager.compute.disk.models.AvailabilityPolicy;
import com.azure.resourcemanager.compute.disk.models.AvailabilityPolicyDiskDelay;
import com.azure.resourcemanager.compute.disk.models.CreationData;
import com.azure.resourcemanager.compute.disk.models.DataAccessAuthMode;
import com.azure.resourcemanager.compute.disk.models.DiskCreateOption;
import com.azure.resourcemanager.compute.disk.models.DiskSecurityProfile;
import com.azure.resourcemanager.compute.disk.models.DiskSecurityTypes;
import com.azure.resourcemanager.compute.disk.models.DiskSku;
import com.azure.resourcemanager.compute.disk.models.DiskStorageAccountTypes;
import com.azure.resourcemanager.compute.disk.models.Encryption;
import com.azure.resourcemanager.compute.disk.models.EncryptionType;
import com.azure.resourcemanager.compute.disk.models.ExtendedLocation;
import com.azure.resourcemanager.compute.disk.models.ExtendedLocationTypes;
import com.azure.resourcemanager.compute.disk.models.ImageDiskReference;
import com.azure.resourcemanager.compute.disk.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.disk.models.OperatingSystemTypes;

/**
 * Samples for Disks CreateOrUpdate.
 */
public final class DisksCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_FromUploadPreparedSecure.json
     */
    /**
     * Sample code: create a managed disk from UploadPreparedSecure create option.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedDiskFromUploadPreparedSecureCreateOption(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.UPLOAD_PREPARED_SECURE)
                .withUploadSizeBytes(10737418752L))
            .withSecurityProfile(new DiskSecurityProfile().withSecurityType(DiskSecurityTypes.TRUSTED_LAUNCH))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_WithOptimizedForFrequentAttach.json
     */
    /**
     * Sample code: create a managed disk with optimizedForFrequentAttach.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedDiskWithOptimizedForFrequentAttach(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(200)
            .withOptimizedForFrequentAttach(true)
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_ByCopyingASnapshot.json
     */
    /**
     * Sample code: create a managed disk by copying a snapshot.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        createAManagedDiskByCopyingASnapshot(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY)
                .withSourceResourceId(
                    "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot"))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_FromImportSecure.json
     */
    /**
     * Sample code: create a managed disk from ImportSecure create option.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedDiskFromImportSecureCreateOption(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.IMPORT_SECURE)
                .withStorageAccountId(
                    "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount")
                .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd")
                .withSecurityDataUri("https://mystorageaccount.blob.core.windows.net/osimages/vmgs.vhd"))
            .withSecurityProfile(new DiskSecurityProfile()
                .withSecurityType(DiskSecurityTypes.CONFIDENTIAL_VM_VMGUEST_STATE_ONLY_ENCRYPTED_WITH_PLATFORM_KEY))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_ByImportingBlobFromADifferentSubscription.json
     */
    /**
     * Sample code: create a managed disk by importing an unmanaged blob from a different subscription.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedDiskByImportingAnUnmanagedBlobFromADifferentSubscription(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.IMPORT)
                .withStorageAccountId(
                    "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount")
                .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd"))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_ConfidentialVMSupportedDiskEncryptedWithCMK.json
     */
    /**
     * Sample code: create a confidential VM supported disk encrypted with customer managed key.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAConfidentialVMSupportedDiskEncryptedWithCustomerManagedKey(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.FROM_IMAGE)
                .withImageReference(new ImageDiskReference().withId(
                    "/Subscriptions/{subscriptionId}/Providers/Microsoft.Compute/Locations/westus/Publishers/{publisher}/ArtifactTypes/VMImage/Offers/{offer}/Skus/{sku}/Versions/1.0.0")))
            .withSecurityProfile(new DiskSecurityProfile()
                .withSecurityType(DiskSecurityTypes.CONFIDENTIAL_VM_DISK_ENCRYPTED_WITH_CUSTOMER_KEY)
                .withSecureVMDiskEncryptionSetId(
                    "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{diskEncryptionSetName}"))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_Empty.json
     */
    /**
     * Sample code: create an empty managed disk.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAnEmptyManagedDisk(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(200)
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_FromAnElasticSanVolumeSnapshot.json
     */
    /**
     * Sample code: create a managed disk from elastic san volume snapshot.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedDiskFromElasticSanVolumeSnapshot(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY_FROM_SAN_SNAPSHOT)
                .withElasticSanResourceId(
                    "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.ElasticSan/elasticSans/myElasticSan/volumegroups/myElasticSanVolumeGroup/snapshots/myElasticSanVolumeSnapshot"))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_WithDataAccessAuthMode.json
     */
    /**
     * Sample code: create a managed disk with dataAccessAuthMode.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        createAManagedDiskWithDataAccessAuthMode(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(200)
            .withDataAccessAuthMode(DataAccessAuthMode.AZURE_ACTIVE_DIRECTORY)
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_FromAPlatformImage.json
     */
    /**
     * Sample code: create a managed disk from a platform image.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        createAManagedDiskFromAPlatformImage(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.FROM_IMAGE)
                .withImageReference(new ImageDiskReference().withId(
                    "/Subscriptions/{subscriptionId}/Providers/Microsoft.Compute/Locations/westus/Publishers/{publisher}/ArtifactTypes/VMImage/Offers/{offer}/Skus/{sku}/Versions/1.0.0")))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_WithLogicalSectorSize.json
     */
    /**
     * Sample code: create an ultra managed disk with logicalSectorSize 512E.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAnUltraManagedDiskWithLogicalSectorSize512E(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withSku(new DiskSku().withName(DiskStorageAccountTypes.ULTRA_SSD_LRS))
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY).withLogicalSectorSize(512))
            .withDiskSizeGB(200)
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_PerformancePlus.json
     */
    /**
     * Sample code: create a managed disk with performancePlus.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        createAManagedDiskWithPerformancePlus(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.UPLOAD).withPerformancePlus(true))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_InExtendedLocation.json
     */
    /**
     * Sample code: create an empty managed disk in extended location.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        createAnEmptyManagedDiskInExtendedLocation(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withExtendedLocation(
                new ExtendedLocation().withName("{edge-zone-id}").withType(ExtendedLocationTypes.EDGE_ZONE))
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(200)
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_ByImportingBlobFromTheSameSubscription.json
     */
    /**
     * Sample code: create a managed disk by importing an unmanaged blob from the same subscription.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedDiskByImportingAnUnmanagedBlobFromTheSameSubscription(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.IMPORT)
                .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd"))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_FromImportSecure_WithVMMetadata.json
     */
    /**
     * Sample code: create a managed disk from ImportSecure create option with metadata URI for Confidential VM.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedDiskFromImportSecureCreateOptionWithMetadataURIForConfidentialVM(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.IMPORT_SECURE)
                .withStorageAccountId(
                    "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount")
                .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd")
                .withSecurityDataUri("https://mystorageaccount.blob.core.windows.net/osimages/vmgs.vhd")
                .withSecurityMetadataUri("https://mystorageaccount.blob.core.windows.net/osimages/vmmd.vhd"))
            .withSecurityProfile(new DiskSecurityProfile()
                .withSecurityType(DiskSecurityTypes.CONFIDENTIAL_VM_VMGUEST_STATE_ONLY_ENCRYPTED_WITH_PLATFORM_KEY))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_WithPremiumV2_LRSAccountType.json
     */
    /**
     * Sample code: create a managed disk with premium v2 account type.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        createAManagedDiskWithPremiumV2AccountType(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myPremiumV2Disk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withSku(new DiskSku().withName(DiskStorageAccountTypes.PREMIUM_V2_LRS))
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(200)
            .withDiskIopsReadWrite(125L)
            .withDiskMBpsReadWrite(3000L)
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_WithDiskEncryptionSet.json
     */
    /**
     * Sample code: create a managed disk and associate with disk encryption set.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedDiskAndAssociateWithDiskEncryptionSet(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(200)
            .withEncryption(new Encryption().withDiskEncryptionSetId(
                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}"))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_FromAnAzureComputeGalleryDirectSharedImage.json
     */
    /**
     * Sample code: create a managed disk from an Azure Compute Gallery direct shared image.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedDiskFromAnAzureComputeGalleryDirectSharedImage(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.FROM_IMAGE)
                .withGalleryImageReference(new ImageDiskReference().withSharedGalleryImageId(
                    "/SharedGalleries/{sharedGalleryUniqueName}/Images/{imageName}/Versions/1.0.0")))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_WithSecurityProfile.json
     */
    /**
     * Sample code: create a managed disk with security profile.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        createAManagedDiskWithSecurityProfile(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("North Central US")
            .withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.FROM_IMAGE)
                .withImageReference(new ImageDiskReference().withId(
                    "/Subscriptions/{subscriptionId}/Providers/Microsoft.Compute/Locations/uswest/Publishers/Microsoft/ArtifactTypes/VMImage/Offers/{offer}")))
            .withSecurityProfile(new DiskSecurityProfile().withSecurityType(DiskSecurityTypes.TRUSTED_LAUNCH))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_WithDiskAccess.json
     */
    /**
     * Sample code: create a managed disk and associate with disk access resource.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedDiskAndAssociateWithDiskAccessResource(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(200)
            .withNetworkAccessPolicy(NetworkAccessPolicy.ALLOW_PRIVATE)
            .withDiskAccessId(
                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskAccesses/{existing-diskAccess-name}")
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_WithSSDZRSAccountType.json
     */
    /**
     * Sample code: create a managed disk with ssd zrs account type.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        createAManagedDiskWithSsdZrsAccountType(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withSku(new DiskSku().withName(DiskStorageAccountTypes.PREMIUM_ZRS))
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(200)
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_FromAnAzureComputeGalleryCommunityImage.json
     */
    /**
     * Sample code: create a managed disk from an Azure Compute Gallery community image.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedDiskFromAnAzureComputeGalleryCommunityImage(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.FROM_IMAGE)
                .withGalleryImageReference(new ImageDiskReference().withCommunityGalleryImageId(
                    "/CommunityGalleries/{communityGalleryPublicGalleryName}/Images/{imageName}/Versions/1.0.0")))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_FromAnAzureComputeGalleryImage.json
     */
    /**
     * Sample code: create a managed disk from an Azure Compute Gallery image.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedDiskFromAnAzureComputeGalleryImage(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withOsType(OperatingSystemTypes.WINDOWS)
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.FROM_IMAGE)
                .withGalleryImageReference(new ImageDiskReference().withId(
                    "/Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/Providers/Microsoft.Compute/Galleries/{galleryName}/Images/{imageName}/Versions/1.0.0")))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_CreateOrUpdate_AvailabilityPolicy.json
     */
    /**
     * Sample code: create a managed disk with availability policy.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        createAManagedDiskWithAvailabilityPolicy(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY))
            .withDiskSizeGB(1024)
            .withAvailabilityPolicy(
                new AvailabilityPolicy().withActionOnDiskDelay(AvailabilityPolicyDiskDelay.AUTOMATIC_REATTACH))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_UploadDisk.json
     */
    /**
     * Sample code: create a managed upload disk.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedUploadDisk(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(
                new CreationData().withCreateOption(DiskCreateOption.UPLOAD).withUploadSizeBytes(10737418752L))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_WithUltraSSD_ReadOnly.json
     */
    /**
     * Sample code: create a managed disk with ultra account type with readOnly property set.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedDiskWithUltraAccountTypeWithReadOnlyPropertySet(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myUltraReadOnlyDisk")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withSku(new DiskSku().withName(DiskStorageAccountTypes.ULTRA_SSD_LRS))
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.EMPTY).withLogicalSectorSize(4096))
            .withDiskSizeGB(200)
            .withDiskIopsReadWrite(125L)
            .withDiskMBpsReadWrite(3000L)
            .withEncryption(new Encryption().withType(EncryptionType.ENCRYPTION_AT_REST_WITH_PLATFORM_KEY))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Create_FromAnExistingManagedDisk.json
     */
    /**
     * Sample code: create a managed disk from an existing managed disk in the same or different subscription.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createAManagedDiskFromAnExistingManagedDiskInTheSameOrDifferentSubscription(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .define("myDisk2")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY)
                .withSourceResourceId(
                    "subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/myDisk1"))
            .create();
    }
}
```

### Disks_Delete

```java
/**
 * Samples for Disks Delete.
 */
public final class DisksDeleteSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Delete.json
     */
    /**
     * Sample code: delete a managed disk.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void deleteAManagedDisk(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks().delete("myResourceGroup", "myDisk", com.azure.core.util.Context.NONE);
    }
}
```

### Disks_GetByResourceGroup

```java
/**
 * Samples for Disks GetByResourceGroup.
 */
public final class DisksGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Get.json
     */
    /**
     * Sample code: get information about a managed disk.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        getInformationAboutAManagedDisk(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .getByResourceGroupWithResponse("myResourceGroup", "myManagedDisk", com.azure.core.util.Context.NONE);
    }
}
```

### Disks_GrantAccess

```java
import com.azure.resourcemanager.compute.disk.models.AccessLevel;
import com.azure.resourcemanager.compute.disk.models.FileFormat;
import com.azure.resourcemanager.compute.disk.models.GrantAccessData;

/**
 * Samples for Disks GrantAccess.
 */
public final class DisksGrantAccessSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_BeginGetAccess_WithVMGuestStateAndVMMetadata.json
     */
    /**
     * Sample code: get sas on managed disk, VM guest state and VM metadata for Confidential VM.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void getSasOnManagedDiskVMGuestStateAndVMMetadataForConfidentialVM(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .grantAccess("myResourceGroup", "myDisk",
                new GrantAccessData().withAccess(AccessLevel.READ)
                    .withDurationInSeconds(300)
                    .withGetSecureVMGuestStateSas(true),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_BeginGetAccess_WithVMGuestState.json
     */
    /**
     * Sample code: get sas on managed disk and VM guest state.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        getSasOnManagedDiskAndVMGuestState(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .grantAccess("myResourceGroup", "myDisk",
                new GrantAccessData().withAccess(AccessLevel.READ)
                    .withDurationInSeconds(300)
                    .withGetSecureVMGuestStateSas(true),
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_BeginGetAccess.json
     */
    /**
     * Sample code: get a sas on a managed disk.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void getASasOnAManagedDisk(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks()
            .grantAccess("myResourceGroup", "myDisk",
                new GrantAccessData().withAccess(AccessLevel.READ)
                    .withDurationInSeconds(300)
                    .withFileFormat(FileFormat.VHD),
                com.azure.core.util.Context.NONE);
    }
}
```

### Disks_List

```java
/**
 * Samples for Disks List.
 */
public final class DisksListSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_ListBySubscription.json
     */
    /**
     * Sample code: list all managed disks in a subscription.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        listAllManagedDisksInASubscription(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks().list(com.azure.core.util.Context.NONE);
    }
}
```

### Disks_ListByResourceGroup

```java
/**
 * Samples for Disks ListByResourceGroup.
 */
public final class DisksListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_ListByResourceGroup.json
     */
    /**
     * Sample code: list all managed disks in a resource group.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        listAllManagedDisksInAResourceGroup(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### Disks_RevokeAccess

```java
/**
 * Samples for Disks RevokeAccess.
 */
public final class DisksRevokeAccessSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_EndGetAccess.json
     */
    /**
     * Sample code: revoke access to a managed disk.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void revokeAccessToAManagedDisk(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.disks().revokeAccess("myResourceGroup", "myDisk", com.azure.core.util.Context.NONE);
    }
}
```

### Disks_Update

```java
import com.azure.resourcemanager.compute.disk.models.Architecture;
import com.azure.resourcemanager.compute.disk.models.Disk;
import com.azure.resourcemanager.compute.disk.models.DiskPurchasePlan;
import com.azure.resourcemanager.compute.disk.models.NetworkAccessPolicy;
import com.azure.resourcemanager.compute.disk.models.SupportedCapabilities;

/**
 * Samples for Disks Update.
 */
public final class DisksUpdateSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Update_ToAddArchitecture.json
     */
    /**
     * Sample code: update a managed disk to add architecture.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        updateAManagedDiskToAddArchitecture(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        Disk resource = manager.disks()
            .getByResourceGroupWithResponse("myResourceGroup", "myDisk", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withSupportedCapabilities(new SupportedCapabilities().withArchitecture(Architecture.ARM64))
            .apply();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Update_AddPurchasePlan.json
     */
    /**
     * Sample code: update a managed disk to add purchase plan.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        updateAManagedDiskToAddPurchasePlan(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        Disk resource = manager.disks()
            .getByResourceGroupWithResponse("myResourceGroup", "myDisk", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withPurchasePlan(new DiskPurchasePlan().withName("myPurchasePlanName")
                .withPublisher("myPurchasePlanPublisher")
                .withProduct("myPurchasePlanProduct")
                .withPromotionCode("fakeTokenPlaceholder"))
            .apply();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Update_DisableOptimizedForFrequentAttach.json
     */
    /**
     * Sample code: update a managed disk to disable optimizedForFrequentAttach.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void updateAManagedDiskToDisableOptimizedForFrequentAttach(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        Disk resource = manager.disks()
            .getByResourceGroupWithResponse("myResourceGroup", "myDisk", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withOptimizedForFrequentAttach(false).apply();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Update_AddDiskControllerTypes.json
     */
    /**
     * Sample code: update a managed disk with diskControllerTypes.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        updateAManagedDiskWithDiskControllerTypes(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        Disk resource = manager.disks()
            .getByResourceGroupWithResponse("myResourceGroup", "myDisk", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withSupportedCapabilities(new SupportedCapabilities().withDiskControllerTypes("SCSI"))
            .apply();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Update_AddSupportsHibernation.json
     */
    /**
     * Sample code: update a managed disk to add supportsHibernation.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        updateAManagedDiskToAddSupportsHibernation(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        Disk resource = manager.disks()
            .getByResourceGroupWithResponse("myResourceGroup", "myDisk", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withSupportsHibernation(true).apply();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_CreateOrUpdate_BurstingEnabled.json
     */
    /**
     * Sample code: create or update a bursting enabled managed disk.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        createOrUpdateABurstingEnabledManagedDisk(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        Disk resource = manager.disks()
            .getByResourceGroupWithResponse("myResourceGroup", "myDisk", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withDiskSizeGB(1024).withBurstingEnabled(true).apply();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Update_DisableBursting.json
     */
    /**
     * Sample code: update a managed disk to disable bursting.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        updateAManagedDiskToDisableBursting(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        Disk resource = manager.disks()
            .getByResourceGroupWithResponse("myResourceGroup", "myDisk", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withBurstingEnabled(false).apply();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Update_RemoveDiskAccess.json
     */
    /**
     * Sample code: update managed disk to remove disk access resource association.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void updateManagedDiskToRemoveDiskAccessResourceAssociation(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        Disk resource = manager.disks()
            .getByResourceGroupWithResponse("myResourceGroup", "myDisk", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withNetworkAccessPolicy(NetworkAccessPolicy.ALLOW_ALL).apply();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Update_AddAcceleratedNetworking.json
     */
    /**
     * Sample code: update a managed disk to add accelerated networking.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void updateAManagedDiskToAddAcceleratedNetworking(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        Disk resource = manager.disks()
            .getByResourceGroupWithResponse("myResourceGroup", "myDisk", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withSupportedCapabilities(new SupportedCapabilities().withAcceleratedNetwork(false)).apply();
    }

    /*
     * x-ms-original-file: 2025-01-02/diskExamples/Disk_Update_ChangeTier.json
     */
    /**
     * Sample code: update a managed disk to change tier.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        updateAManagedDiskToChangeTier(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        Disk resource = manager.disks()
            .getByResourceGroupWithResponse("myResourceGroup", "myDisk", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withTier("P30").apply();
    }
}
```

### PrivateEndpointConnections_DeleteAPrivateEndpointConnection

```java
/**
 * Samples for PrivateEndpointConnections DeleteAPrivateEndpointConnection.
 */
public final class PrivateEndpointConnectionsDeleteAPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskAccessExamples/DiskAccessPrivateEndpointConnection_Delete.json
     */
    /**
     * Sample code: delete a private endpoint connection under a disk access resource.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void deleteAPrivateEndpointConnectionUnderADiskAccessResource(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.privateEndpointConnections()
            .deleteAPrivateEndpointConnection("myResourceGroup", "myDiskAccess", "myPrivateEndpointConnection",
                com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_GetAPrivateEndpointConnection

```java
/**
 * Samples for PrivateEndpointConnections GetAPrivateEndpointConnection.
 */
public final class PrivateEndpointConnectionsGetAPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskAccessExamples/DiskAccessPrivateEndpointConnection_Get.json
     */
    /**
     * Sample code: get information about a private endpoint connection under a disk access resource.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void getInformationAboutAPrivateEndpointConnectionUnderADiskAccessResource(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.privateEndpointConnections()
            .getAPrivateEndpointConnectionWithResponse("myResourceGroup", "myDiskAccess", "myPrivateEndpointConnection",
                com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_ListPrivateEndpointConnections

```java
/**
 * Samples for PrivateEndpointConnections ListPrivateEndpointConnections.
 */
public final class PrivateEndpointConnectionsListPrivateEndpointConnectionsSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskAccessExamples/DiskAccessPrivateEndpointConnection_ListByDiskAccess.json
     */
    /**
     * Sample code: get information about a private endpoint connection under a disk access resource.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void getInformationAboutAPrivateEndpointConnectionUnderADiskAccessResource(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.privateEndpointConnections()
            .listPrivateEndpointConnections("myResourceGroup", "myDiskAccess", com.azure.core.util.Context.NONE);
    }
}
```

### PrivateEndpointConnections_UpdateAPrivateEndpointConnection

```java
import com.azure.resourcemanager.compute.disk.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.compute.disk.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.compute.disk.models.PrivateLinkServiceConnectionState;

/**
 * Samples for PrivateEndpointConnections UpdateAPrivateEndpointConnection.
 */
public final class PrivateEndpointConnectionsUpdateAPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: 2025-01-02/diskAccessExamples/DiskAccessPrivateEndpointConnection_Approve.json
     */
    /**
     * Sample code: approve a Private Endpoint Connection under a disk access resource.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void approveAPrivateEndpointConnectionUnderADiskAccessResource(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.privateEndpointConnections()
            .updateAPrivateEndpointConnection("myResourceGroup", "myDiskAccess", "myPrivateEndpointConnection",
                new PrivateEndpointConnectionInner().withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState().withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("Approving myPrivateEndpointConnection")),
                com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_CreateOrUpdate

```java
import com.azure.resourcemanager.compute.disk.models.CreationData;
import com.azure.resourcemanager.compute.disk.models.DiskCreateOption;
import com.azure.resourcemanager.compute.disk.models.ProvisionedBandwidthCopyOption;

/**
 * Samples for Snapshots CreateOrUpdate.
 */
public final class SnapshotsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: 2025-01-02/snapshotExamples/Snapshot_Create_FromAnExistingSnapshot.json
     */
    /**
     * Sample code: Create a snapshot from an existing snapshot in the same or a different subscription.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createASnapshotFromAnExistingSnapshotInTheSameOrADifferentSubscription(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.snapshots()
            .define("mySnapshot2")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY)
                .withSourceResourceId(
                    "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot1"))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/snapshotExamples/Snapshot_Create_FromAnElasticSanVolumeSnapshot.json
     */
    /**
     * Sample code: Create a snapshot from an elastic san volume snapshot.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createASnapshotFromAnElasticSanVolumeSnapshot(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.snapshots()
            .define("mySnapshot")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY_FROM_SAN_SNAPSHOT)
                .withElasticSanResourceId(
                    "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.ElasticSan/elasticSans/myElasticSan/volumegroups/myElasticSanVolumeGroup/snapshots/myElasticSanVolumeSnapshot"))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/snapshotExamples/Snapshot_Create_InstantAccessSnapshot.json
     */
    /**
     * Sample code: create a snapshot which can be instantly accessable.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createASnapshotWhichCanBeInstantlyAccessable(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.snapshots()
            .define("mySnapshot2")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY)
                .withSourceResourceId(
                    "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/myDisk1")
                .withInstantAccessDurationMinutes(120L))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/snapshotExamples/Snapshot_Create_EnhancedProvisionedBandwidthCopySpeed.json
     */
    /**
     * Sample code: Create a snapshot from an existing snapshot in the same or a different subscription in a different
     * region with quicker copy speed.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        createASnapshotFromAnExistingSnapshotInTheSameOrADifferentSubscriptionInADifferentRegionWithQuickerCopySpeed(
            com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.snapshots()
            .define("mySnapshot2")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY_START)
                .withSourceResourceId(
                    "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot1")
                .withProvisionedBandwidthCopySpeed(ProvisionedBandwidthCopyOption.ENHANCED))
            .create();
    }

    /*
     * x-ms-original-file: 2025-01-02/snapshotExamples/Snapshot_Create_FromAnExistingSnapshotInDifferentRegion.json
     */
    /**
     * Sample code: Create a snapshot from an existing snapshot in the same or a different subscription in a different
     * region.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createASnapshotFromAnExistingSnapshotInTheSameOrADifferentSubscriptionInADifferentRegion(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.snapshots()
            .define("mySnapshot2")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.COPY_START)
                .withSourceResourceId(
                    "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot1"))
            .create();
    }

    /*
     * x-ms-original-file:
     * 2025-01-02/snapshotExamples/Snapshot_Create_ByImportingAnUnmanagedBlobFromTheSameSubscription.json
     */
    /**
     * Sample code: Create a snapshot by importing an unmanaged blob from the same subscription.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createASnapshotByImportingAnUnmanagedBlobFromTheSameSubscription(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.snapshots()
            .define("mySnapshot1")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.IMPORT)
                .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd"))
            .create();
    }

    /*
     * x-ms-original-file:
     * 2025-01-02/snapshotExamples/Snapshot_Create_ByImportingAnUnmanagedBlobFromADifferentSubscription.json
     */
    /**
     * Sample code: Create a snapshot by importing an unmanaged blob from a different subscription.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void createASnapshotByImportingAnUnmanagedBlobFromADifferentSubscription(
        com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.snapshots()
            .define("mySnapshot1")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withCreationData(new CreationData().withCreateOption(DiskCreateOption.IMPORT)
                .withStorageAccountId(
                    "subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount")
                .withSourceUri("https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd"))
            .create();
    }
}
```

### Snapshots_Delete

```java
/**
 * Samples for Snapshots Delete.
 */
public final class SnapshotsDeleteSamples {
    /*
     * x-ms-original-file: 2025-01-02/snapshotExamples/Snapshot_Delete.json
     */
    /**
     * Sample code: Delete a snapshot.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void deleteASnapshot(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.snapshots().delete("myResourceGroup", "mySnapshot", com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_GetByResourceGroup

```java
/**
 * Samples for Snapshots GetByResourceGroup.
 */
public final class SnapshotsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: 2025-01-02/snapshotExamples/Snapshot_GetIncrementalSnapshot.json
     */
    /**
     * Sample code: Get information about an incremental snapshot.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        getInformationAboutAnIncrementalSnapshot(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.snapshots()
            .getByResourceGroupWithResponse("myResourceGroup", "myIncrementalSnapshot",
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2025-01-02/snapshotExamples/Snapshot_Get.json
     */
    /**
     * Sample code: Get information about a snapshot.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void getInformationAboutASnapshot(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.snapshots()
            .getByResourceGroupWithResponse("myResourceGroup", "mySnapshot", com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_GrantAccess

```java
import com.azure.resourcemanager.compute.disk.models.AccessLevel;
import com.azure.resourcemanager.compute.disk.models.FileFormat;
import com.azure.resourcemanager.compute.disk.models.GrantAccessData;

/**
 * Samples for Snapshots GrantAccess.
 */
public final class SnapshotsGrantAccessSamples {
    /*
     * x-ms-original-file: 2025-01-02/snapshotExamples/Snapshot_BeginGetAccess.json
     */
    /**
     * Sample code: Get a sas on a snapshot.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void getASasOnASnapshot(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.snapshots()
            .grantAccess("myResourceGroup", "mySnapshot",
                new GrantAccessData().withAccess(AccessLevel.READ)
                    .withDurationInSeconds(300)
                    .withFileFormat(FileFormat.VHDX),
                com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_List

```java
/**
 * Samples for Snapshots List.
 */
public final class SnapshotsListSamples {
    /*
     * x-ms-original-file: 2025-01-02/snapshotExamples/Snapshot_ListBySubscription.json
     */
    /**
     * Sample code: List all snapshots in a subscription.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        listAllSnapshotsInASubscription(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.snapshots().list(com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_ListByResourceGroup

```java
/**
 * Samples for Snapshots ListByResourceGroup.
 */
public final class SnapshotsListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2025-01-02/snapshotExamples/Snapshot_ListByResourceGroup.json
     */
    /**
     * Sample code: List all snapshots in a resource group.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        listAllSnapshotsInAResourceGroup(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.snapshots().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_RevokeAccess

```java
/**
 * Samples for Snapshots RevokeAccess.
 */
public final class SnapshotsRevokeAccessSamples {
    /*
     * x-ms-original-file: 2025-01-02/snapshotExamples/Snapshot_EndGetAccess.json
     */
    /**
     * Sample code: Revoke access to a snapshot.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void revokeAccessToASnapshot(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        manager.snapshots().revokeAccess("myResourceGroup", "mySnapshot", com.azure.core.util.Context.NONE);
    }
}
```

### Snapshots_Update

```java
import com.azure.resourcemanager.compute.disk.models.Snapshot;
import com.azure.resourcemanager.compute.disk.models.SupportedCapabilities;
import java.util.HashMap;
import java.util.Map;

/**
 * Samples for Snapshots Update.
 */
public final class SnapshotsUpdateSamples {
    /*
     * x-ms-original-file: 2025-01-02/snapshotExamples/Snapshot_Update_WithAcceleratedNetwork.json
     */
    /**
     * Sample code: Update a snapshot with accelerated networking.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void
        updateASnapshotWithAcceleratedNetworking(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        Snapshot resource = manager.snapshots()
            .getByResourceGroupWithResponse("myResourceGroup", "mySnapshot", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("department", "Development", "project", "UpdateSnapshots"))
            .withDiskSizeGB(20)
            .withSupportedCapabilities(new SupportedCapabilities().withAcceleratedNetwork(false))
            .apply();
    }

    /*
     * x-ms-original-file: 2025-01-02/snapshotExamples/Snapshot_Update.json
     */
    /**
     * Sample code: Update a snapshot.
     * 
     * @param manager Entry point to ComputeDiskManager.
     */
    public static void updateASnapshot(com.azure.resourcemanager.compute.disk.ComputeDiskManager manager) {
        Snapshot resource = manager.snapshots()
            .getByResourceGroupWithResponse("myResourceGroup", "mySnapshot", com.azure.core.util.Context.NONE)
            .getValue();
        resource.update()
            .withTags(mapOf("department", "Development", "project", "UpdateSnapshots"))
            .withDiskSizeGB(20)
            .apply();
    }

    // Use "Map.of" if available
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
```

