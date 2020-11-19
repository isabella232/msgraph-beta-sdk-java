// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSettingDefinition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Setting Definition Reference Request.
 */
public class DeviceManagementConfigurationSettingDefinitionReferenceRequest extends BaseRequest implements IDeviceManagementConfigurationSettingDefinitionReferenceRequest {

    /**
     * The request for the DeviceManagementConfigurationSettingDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementConfigurationSettingDefinitionReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementConfigurationSettingDefinition.class);
    }

    public void delete(final ICallback<? super DeviceManagementConfigurationSettingDefinition> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public DeviceManagementConfigurationSettingDefinition delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationSettingDefinitionReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementConfigurationSettingDefinitionReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationSettingDefinitionReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementConfigurationSettingDefinitionReferenceRequest)this;
    }
    /**
     * Puts the DeviceManagementConfigurationSettingDefinition
     *
     * @param srcDeviceManagementConfigurationSettingDefinition the DeviceManagementConfigurationSettingDefinition reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(DeviceManagementConfigurationSettingDefinition srcDeviceManagementConfigurationSettingDefinition, final ICallback<? super DeviceManagementConfigurationSettingDefinition> callback) {
        send(HttpMethod.PUT, callback, srcDeviceManagementConfigurationSettingDefinition);
    }

    /**
     * Puts the DeviceManagementConfigurationSettingDefinition
     *
     * @param srcDeviceManagementConfigurationSettingDefinition the DeviceManagementConfigurationSettingDefinition reference to PUT
     * @return the DeviceManagementConfigurationSettingDefinition
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public DeviceManagementConfigurationSettingDefinition put(DeviceManagementConfigurationSettingDefinition srcDeviceManagementConfigurationSettingDefinition) throws ClientException {
        return send(HttpMethod.PUT, srcDeviceManagementConfigurationSettingDefinition);
    }
}
