// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementCollectionSettingDefinition;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Collection Setting Definition Request.
 */
public class DeviceManagementCollectionSettingDefinitionRequest extends BaseRequest implements IDeviceManagementCollectionSettingDefinitionRequest {
	
    /**
     * The request for the DeviceManagementCollectionSettingDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementCollectionSettingDefinitionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementCollectionSettingDefinition.class);
    }

    /**
     * Gets the DeviceManagementCollectionSettingDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementCollectionSettingDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementCollectionSettingDefinition from the service
     *
     * @return the DeviceManagementCollectionSettingDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementCollectionSettingDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementCollectionSettingDefinition> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementCollectionSettingDefinition with a source
     *
     * @param sourceDeviceManagementCollectionSettingDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementCollectionSettingDefinition sourceDeviceManagementCollectionSettingDefinition, final ICallback<DeviceManagementCollectionSettingDefinition> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementCollectionSettingDefinition);
    }

    /**
     * Patches this DeviceManagementCollectionSettingDefinition with a source
     *
     * @param sourceDeviceManagementCollectionSettingDefinition the source object with updates
     * @return the updated DeviceManagementCollectionSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementCollectionSettingDefinition patch(final DeviceManagementCollectionSettingDefinition sourceDeviceManagementCollectionSettingDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementCollectionSettingDefinition);
    }

    /**
     * Creates a DeviceManagementCollectionSettingDefinition with a new object
     *
     * @param newDeviceManagementCollectionSettingDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementCollectionSettingDefinition newDeviceManagementCollectionSettingDefinition, final ICallback<DeviceManagementCollectionSettingDefinition> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementCollectionSettingDefinition);
    }

    /**
     * Creates a DeviceManagementCollectionSettingDefinition with a new object
     *
     * @param newDeviceManagementCollectionSettingDefinition the new object to create
     * @return the created DeviceManagementCollectionSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementCollectionSettingDefinition post(final DeviceManagementCollectionSettingDefinition newDeviceManagementCollectionSettingDefinition) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementCollectionSettingDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementCollectionSettingDefinitionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementCollectionSettingDefinitionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementCollectionSettingDefinitionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementCollectionSettingDefinitionRequest)this;
     }

}
