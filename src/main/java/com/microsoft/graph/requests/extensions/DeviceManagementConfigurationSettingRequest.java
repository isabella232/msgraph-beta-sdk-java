// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSetting;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationSettingDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Setting Request.
 */
public class DeviceManagementConfigurationSettingRequest extends BaseRequest implements IDeviceManagementConfigurationSettingRequest {
	
    /**
     * The request for the DeviceManagementConfigurationSetting
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementConfigurationSettingRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementConfigurationSetting.class);
    }

    /**
     * Gets the DeviceManagementConfigurationSetting from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceManagementConfigurationSetting> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementConfigurationSetting from the service
     *
     * @return the DeviceManagementConfigurationSetting from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementConfigurationSetting get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceManagementConfigurationSetting> callback) {
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
     * Patches this DeviceManagementConfigurationSetting with a source
     *
     * @param sourceDeviceManagementConfigurationSetting the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementConfigurationSetting sourceDeviceManagementConfigurationSetting, final ICallback<? super DeviceManagementConfigurationSetting> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementConfigurationSetting);
    }

    /**
     * Patches this DeviceManagementConfigurationSetting with a source
     *
     * @param sourceDeviceManagementConfigurationSetting the source object with updates
     * @return the updated DeviceManagementConfigurationSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementConfigurationSetting patch(final DeviceManagementConfigurationSetting sourceDeviceManagementConfigurationSetting) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementConfigurationSetting);
    }

    /**
     * Creates a DeviceManagementConfigurationSetting with a new object
     *
     * @param newDeviceManagementConfigurationSetting the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementConfigurationSetting newDeviceManagementConfigurationSetting, final ICallback<? super DeviceManagementConfigurationSetting> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementConfigurationSetting);
    }

    /**
     * Creates a DeviceManagementConfigurationSetting with a new object
     *
     * @param newDeviceManagementConfigurationSetting the new object to create
     * @return the created DeviceManagementConfigurationSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementConfigurationSetting post(final DeviceManagementConfigurationSetting newDeviceManagementConfigurationSetting) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementConfigurationSetting);
    }

    /**
     * Creates a DeviceManagementConfigurationSetting with a new object
     *
     * @param newDeviceManagementConfigurationSetting the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceManagementConfigurationSetting newDeviceManagementConfigurationSetting, final ICallback<? super DeviceManagementConfigurationSetting> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementConfigurationSetting);
    }

    /**
     * Creates a DeviceManagementConfigurationSetting with a new object
     *
     * @param newDeviceManagementConfigurationSetting the object to create/update
     * @return the created DeviceManagementConfigurationSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementConfigurationSetting put(final DeviceManagementConfigurationSetting newDeviceManagementConfigurationSetting) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementConfigurationSetting);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementConfigurationSettingRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementConfigurationSettingRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementConfigurationSettingRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementConfigurationSettingRequest)this;
     }

}

