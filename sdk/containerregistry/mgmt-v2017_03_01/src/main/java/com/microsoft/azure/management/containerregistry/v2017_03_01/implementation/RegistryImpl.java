/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2017_03_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.containerregistry.v2017_03_01.Registry;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2017_03_01.RegistryUpdateParameters;
import com.microsoft.azure.management.containerregistry.v2017_03_01.RegistryCreateParameters;
import org.joda.time.DateTime;
import com.microsoft.azure.management.containerregistry.v2017_03_01.ProvisioningState;
import com.microsoft.azure.management.containerregistry.v2017_03_01.Sku;
import com.microsoft.azure.management.containerregistry.v2017_03_01.StorageAccountProperties;
import com.microsoft.azure.management.containerregistry.v2017_03_01.StorageAccountParameters;
import rx.functions.Func1;

class RegistryImpl extends GroupableResourceCoreImpl<Registry, RegistryInner, RegistryImpl, ContainerRegistryManager> implements Registry, Registry.Definition, Registry.Update {
    private RegistryCreateParameters createParameter;
    private RegistryUpdateParameters updateParameter;
    RegistryImpl(String name, RegistryInner inner, ContainerRegistryManager manager) {
        super(name, inner, manager);
        this.createParameter = new RegistryCreateParameters();
        this.updateParameter = new RegistryUpdateParameters();
    }

    @Override
    public Observable<Registry> createResourceAsync() {
        RegistriesInner client = this.manager().inner().registries();
        this.createParameter.withLocation(inner().location());
        this.createParameter.withTags(inner().getTags());
        return client.createAsync(this.resourceGroupName(), this.name(), this.createParameter)
            .map(new Func1<RegistryInner, RegistryInner>() {
               @Override
               public RegistryInner call(RegistryInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Registry> updateResourceAsync() {
        RegistriesInner client = this.manager().inner().registries();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<RegistryInner, RegistryInner>() {
               @Override
               public RegistryInner call(RegistryInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RegistryInner> getInnerAsync() {
        RegistriesInner client = this.manager().inner().registries();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new RegistryCreateParameters();
        this.updateParameter = new RegistryUpdateParameters();
    }

    @Override
    public Boolean adminUserEnabled() {
        return this.inner().adminUserEnabled();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public String loginServer() {
        return this.inner().loginServer();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public StorageAccountProperties storageAccount() {
        return this.inner().storageAccount();
    }

    @Override
    public RegistryImpl withSku(Sku sku) {
        this.createParameter.withSku(sku);
        return this;
    }

    @Override
    public RegistryImpl withStorageAccount(StorageAccountParameters storageAccount) {
        if (isInCreateMode()) {
            this.createParameter.withStorageAccount(storageAccount);
        } else {
            this.updateParameter.withStorageAccount(storageAccount);
        }
        return this;
    }

    @Override
    public RegistryImpl withAdminUserEnabled(Boolean adminUserEnabled) {
        if (isInCreateMode()) {
            this.createParameter.withAdminUserEnabled(adminUserEnabled);
        } else {
            this.updateParameter.withAdminUserEnabled(adminUserEnabled);
        }
        return this;
    }

}
