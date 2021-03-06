/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.ServiceTopologies;
import com.microsoft.azure.management.deploymentmanager.v2019_11_01_preview.ServiceTopologyResource;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class ServiceTopologiesImpl extends GroupableResourcesCoreImpl<ServiceTopologyResource, ServiceTopologyResourceImpl, ServiceTopologyResourceInner, ServiceTopologiesInner, DeploymentManagerManager>  implements ServiceTopologies {
    protected ServiceTopologiesImpl(DeploymentManagerManager manager) {
        super(manager.inner().serviceTopologies(), manager);
    }

    @Override
    protected Observable<ServiceTopologyResourceInner> getInnerAsync(String resourceGroupName, String name) {
        ServiceTopologiesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ServiceTopologiesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<ServiceTopologyResource> listByResourceGroup(String resourceGroupName) {
        ServiceTopologiesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ServiceTopologyResource> listByResourceGroupAsync(String resourceGroupName) {
        ServiceTopologiesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<ServiceTopologyResourceInner>, Observable<ServiceTopologyResourceInner>>() {
            @Override
            public Observable<ServiceTopologyResourceInner> call(Page<ServiceTopologyResourceInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<ServiceTopologyResourceInner, ServiceTopologyResource>() {
            @Override
            public ServiceTopologyResource call(ServiceTopologyResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ServiceTopologyResourceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected ServiceTopologyResourceImpl wrapModel(ServiceTopologyResourceInner inner) {
        return  new ServiceTopologyResourceImpl(inner.name(), inner, manager());
    }

    @Override
    protected ServiceTopologyResourceImpl wrapModel(String name) {
        return new ServiceTopologyResourceImpl(name, new ServiceTopologyResourceInner(), this.manager());
    }

}
