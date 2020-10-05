// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementDerivedCredentialSettings;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Derived Credential Settings Request.
 */
public class DeviceManagementDerivedCredentialSettingsRequest extends BaseRequest implements IDeviceManagementDerivedCredentialSettingsRequest {
	
    /**
     * The request for the DeviceManagementDerivedCredentialSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementDerivedCredentialSettingsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementDerivedCredentialSettings.class);
    }

    /**
     * Gets the DeviceManagementDerivedCredentialSettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceManagementDerivedCredentialSettings> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementDerivedCredentialSettings from the service
     *
     * @return the DeviceManagementDerivedCredentialSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementDerivedCredentialSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceManagementDerivedCredentialSettings> callback) {
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
     * Patches this DeviceManagementDerivedCredentialSettings with a source
     *
     * @param sourceDeviceManagementDerivedCredentialSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementDerivedCredentialSettings sourceDeviceManagementDerivedCredentialSettings, final ICallback<? super DeviceManagementDerivedCredentialSettings> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementDerivedCredentialSettings);
    }

    /**
     * Patches this DeviceManagementDerivedCredentialSettings with a source
     *
     * @param sourceDeviceManagementDerivedCredentialSettings the source object with updates
     * @return the updated DeviceManagementDerivedCredentialSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementDerivedCredentialSettings patch(final DeviceManagementDerivedCredentialSettings sourceDeviceManagementDerivedCredentialSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementDerivedCredentialSettings);
    }

    /**
     * Creates a DeviceManagementDerivedCredentialSettings with a new object
     *
     * @param newDeviceManagementDerivedCredentialSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementDerivedCredentialSettings newDeviceManagementDerivedCredentialSettings, final ICallback<? super DeviceManagementDerivedCredentialSettings> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementDerivedCredentialSettings);
    }

    /**
     * Creates a DeviceManagementDerivedCredentialSettings with a new object
     *
     * @param newDeviceManagementDerivedCredentialSettings the new object to create
     * @return the created DeviceManagementDerivedCredentialSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementDerivedCredentialSettings post(final DeviceManagementDerivedCredentialSettings newDeviceManagementDerivedCredentialSettings) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementDerivedCredentialSettings);
    }

    /**
     * Creates a DeviceManagementDerivedCredentialSettings with a new object
     *
     * @param newDeviceManagementDerivedCredentialSettings the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceManagementDerivedCredentialSettings newDeviceManagementDerivedCredentialSettings, final ICallback<? super DeviceManagementDerivedCredentialSettings> callback) {
        send(HttpMethod.PUT, callback, newDeviceManagementDerivedCredentialSettings);
    }

    /**
     * Creates a DeviceManagementDerivedCredentialSettings with a new object
     *
     * @param newDeviceManagementDerivedCredentialSettings the object to create/update
     * @return the created DeviceManagementDerivedCredentialSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementDerivedCredentialSettings put(final DeviceManagementDerivedCredentialSettings newDeviceManagementDerivedCredentialSettings) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementDerivedCredentialSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementDerivedCredentialSettingsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceManagementDerivedCredentialSettingsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementDerivedCredentialSettingsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceManagementDerivedCredentialSettingsRequest)this;
     }

}

