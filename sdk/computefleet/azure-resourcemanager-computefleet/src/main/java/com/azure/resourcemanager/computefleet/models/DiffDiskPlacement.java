// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computefleet.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Specifies the ephemeral disk placement for operating system disk. This property
 * can be used by user in the request to choose the location i.e, cache disk or
 * resource disk space for Ephemeral OS disk provisioning. For more information on
 * Ephemeral OS disk size requirements, please refer Ephemeral OS disk size
 * requirements for Windows VM at
 * https://learn.microsoft.com/azure/virtual-machines/windows/ephemeral-os-disks#size-requirements
 * and Linux VM at
 * https://learn.microsoft.com/azure/virtual-machines/linux/ephemeral-os-disks#size-requirements
 * Minimum api-version for NvmeDisk: 2024-03-01.
 */
public final class DiffDiskPlacement extends ExpandableStringEnum<DiffDiskPlacement> {
    /**
     * CacheDisk option.
     */
    public static final DiffDiskPlacement CACHE_DISK = fromString("CacheDisk");

    /**
     * Resource Disk option.
     */
    public static final DiffDiskPlacement RESOURCE_DISK = fromString("ResourceDisk");

    /**
     * NvmeDisk option.
     */
    public static final DiffDiskPlacement NVME_DISK = fromString("NvmeDisk");

    /**
     * Creates a new instance of DiffDiskPlacement value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DiffDiskPlacement() {
    }

    /**
     * Creates or finds a DiffDiskPlacement from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DiffDiskPlacement.
     */
    public static DiffDiskPlacement fromString(String name) {
        return fromString(name, DiffDiskPlacement.class);
    }

    /**
     * Gets known DiffDiskPlacement values.
     * 
     * @return known DiffDiskPlacement values.
     */
    public static Collection<DiffDiskPlacement> values() {
        return values(DiffDiskPlacement.class);
    }
}
