// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.mongocluster.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mongocluster.fluent.models.CheckNameAvailabilityResponseInner;
import com.azure.resourcemanager.mongocluster.fluent.models.ListConnectionStringsResultInner;
import com.azure.resourcemanager.mongocluster.fluent.models.MongoClusterInner;
import com.azure.resourcemanager.mongocluster.models.CheckNameAvailabilityRequest;
import com.azure.resourcemanager.mongocluster.models.MongoClusterUpdate;

/**
 * An instance of this class provides access to all the operations defined in MongoClustersClient.
 */
public interface MongoClustersClient {
    /**
     * Gets information about a mongo cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a mongo cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<MongoClusterInner> getByResourceGroupWithResponse(String resourceGroupName, String mongoClusterName,
        Context context);

    /**
     * Gets information about a mongo cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about a mongo cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MongoClusterInner getByResourceGroup(String resourceGroupName, String mongoClusterName);

    /**
     * Create or update a mongo cluster. Update overwrites all properties for the resource. To only modify some of the
     * properties, use PATCH.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a mongo cluster resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MongoClusterInner>, MongoClusterInner> beginCreateOrUpdate(String resourceGroupName,
        String mongoClusterName, MongoClusterInner resource);

    /**
     * Create or update a mongo cluster. Update overwrites all properties for the resource. To only modify some of the
     * properties, use PATCH.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a mongo cluster resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MongoClusterInner>, MongoClusterInner> beginCreateOrUpdate(String resourceGroupName,
        String mongoClusterName, MongoClusterInner resource, Context context);

    /**
     * Create or update a mongo cluster. Update overwrites all properties for the resource. To only modify some of the
     * properties, use PATCH.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param resource Resource create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a mongo cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MongoClusterInner createOrUpdate(String resourceGroupName, String mongoClusterName, MongoClusterInner resource);

    /**
     * Create or update a mongo cluster. Update overwrites all properties for the resource. To only modify some of the
     * properties, use PATCH.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param resource Resource create parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a mongo cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MongoClusterInner createOrUpdate(String resourceGroupName, String mongoClusterName, MongoClusterInner resource,
        Context context);

    /**
     * Updates an existing mongo cluster. The request body can contain one to many of the properties present in the
     * normal mongo cluster definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a mongo cluster resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MongoClusterInner>, MongoClusterInner> beginUpdate(String resourceGroupName,
        String mongoClusterName, MongoClusterUpdate properties);

    /**
     * Updates an existing mongo cluster. The request body can contain one to many of the properties present in the
     * normal mongo cluster definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of represents a mongo cluster resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<MongoClusterInner>, MongoClusterInner> beginUpdate(String resourceGroupName,
        String mongoClusterName, MongoClusterUpdate properties, Context context);

    /**
     * Updates an existing mongo cluster. The request body can contain one to many of the properties present in the
     * normal mongo cluster definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param properties The resource properties to be updated.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a mongo cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MongoClusterInner update(String resourceGroupName, String mongoClusterName, MongoClusterUpdate properties);

    /**
     * Updates an existing mongo cluster. The request body can contain one to many of the properties present in the
     * normal mongo cluster definition.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param properties The resource properties to be updated.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a mongo cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    MongoClusterInner update(String resourceGroupName, String mongoClusterName, MongoClusterUpdate properties,
        Context context);

    /**
     * Deletes a mongo cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String mongoClusterName);

    /**
     * Deletes a mongo cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String mongoClusterName, Context context);

    /**
     * Deletes a mongo cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String mongoClusterName);

    /**
     * Deletes a mongo cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String mongoClusterName, Context context);

    /**
     * List all the mongo clusters in a given resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a MongoCluster list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MongoClusterInner> listByResourceGroup(String resourceGroupName);

    /**
     * List all the mongo clusters in a given resource group.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a MongoCluster list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MongoClusterInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List all the mongo clusters in a given subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a MongoCluster list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MongoClusterInner> list();

    /**
     * List all the mongo clusters in a given subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of a MongoCluster list operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<MongoClusterInner> list(Context context);

    /**
     * List mongo cluster connection strings. This includes the default connection string using SCRAM-SHA-256, as well
     * as other connection strings supported by the cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connection strings for the given mongo cluster along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ListConnectionStringsResultInner> listConnectionStringsWithResponse(String resourceGroupName,
        String mongoClusterName, Context context);

    /**
     * List mongo cluster connection strings. This includes the default connection string using SCRAM-SHA-256, as well
     * as other connection strings supported by the cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param mongoClusterName The name of the mongo cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the connection strings for the given mongo cluster.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ListConnectionStringsResultInner listConnectionStrings(String resourceGroupName, String mongoClusterName);

    /**
     * Check if mongo cluster name is available for use.
     * 
     * @param location The name of the Azure region.
     * @param body The CheckAvailability request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityResponseInner> checkNameAvailabilityWithResponse(String location,
        CheckNameAvailabilityRequest body, Context context);

    /**
     * Check if mongo cluster name is available for use.
     * 
     * @param location The name of the Azure region.
     * @param body The CheckAvailability request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the check availability result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityResponseInner checkNameAvailability(String location, CheckNameAvailabilityRequest body);
}
