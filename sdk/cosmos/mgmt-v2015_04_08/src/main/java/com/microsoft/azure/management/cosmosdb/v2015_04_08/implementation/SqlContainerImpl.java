/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import com.microsoft.azure.management.cosmosdb.v2015_04_08.SqlContainer;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.SqlContainerCreateUpdateParameters;
import java.util.Map;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.ConflictResolutionPolicy;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.IndexingPolicy;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.ContainerPartitionKey;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.UniqueKeyPolicy;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.SqlContainerResource;
import rx.functions.Func1;

class SqlContainerImpl extends CreatableUpdatableImpl<SqlContainer, SqlContainerInner, SqlContainerImpl> implements SqlContainer, SqlContainer.Definition, SqlContainer.Update {
    private final CosmosDBManager manager;
    private String resourceGroupName;
    private String accountName;
    private String databaseName;
    private String containerName;
    private SqlContainerCreateUpdateParameters createOrUpdateParameter;

    SqlContainerImpl(String name, CosmosDBManager manager) {
        super(name, new SqlContainerInner());
        this.manager = manager;
        // Set resource name
        this.containerName = name;
        //
        this.createOrUpdateParameter = new SqlContainerCreateUpdateParameters();
    }

    SqlContainerImpl(SqlContainerInner inner, CosmosDBManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.containerName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "databaseAccounts");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        this.containerName = IdParsingUtils.getValueFromIdByName(inner.id(), "containers");
        //
        this.createOrUpdateParameter = new SqlContainerCreateUpdateParameters();
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public Observable<SqlContainer> createResourceAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.createUpdateSqlContainerAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName, this.createOrUpdateParameter)
            .map(new Func1<SqlContainerInner, SqlContainerInner>() {
               @Override
               public SqlContainerInner call(SqlContainerInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SqlContainer> updateResourceAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.createUpdateSqlContainerAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName, this.createOrUpdateParameter)
            .map(new Func1<SqlContainerInner, SqlContainerInner>() {
               @Override
               public SqlContainerInner call(SqlContainerInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SqlContainerInner> getInnerAsync() {
        DatabaseAccountsInner client = this.manager().inner().databaseAccounts();
        return client.getSqlContainerAsync(this.resourceGroupName, this.accountName, this.databaseName, this.containerName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new SqlContainerCreateUpdateParameters();
    }

    @Override
    public String _etag() {
        return this.inner()._etag();
    }

    @Override
    public String _rid() {
        return this.inner()._rid();
    }

    @Override
    public Object _ts() {
        return this.inner()._ts();
    }

    @Override
    public ConflictResolutionPolicy conflictResolutionPolicy() {
        return this.inner().conflictResolutionPolicy();
    }

    @Override
    public Integer defaultTtl() {
        return this.inner().defaultTtl();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public IndexingPolicy indexingPolicy() {
        return this.inner().indexingPolicy();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ContainerPartitionKey partitionKey() {
        return this.inner().partitionKey();
    }

    @Override
    public String sqlContainerId() {
        return this.inner().sqlContainerId();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public UniqueKeyPolicy uniqueKeyPolicy() {
        return this.inner().uniqueKeyPolicy();
    }

    @Override
    public SqlContainerImpl withExistingDatabasis(String resourceGroupName, String accountName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.databaseName = databaseName;
        return this;
    }

    @Override
    public SqlContainerImpl withOptions(Map<String, String> options) {
        this.createOrUpdateParameter.withOptions(options);
        return this;
    }

    @Override
    public SqlContainerImpl withResource(SqlContainerResource resource) {
        this.createOrUpdateParameter.withResource(resource);
        return this;
    }

}
