// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSetting;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSettingDefinition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.ReferenceRequestBody;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSettingDefinition;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Setting Definition Collection Reference Request.
 */
public class DeviceManagementConfigurationSettingDefinitionCollectionReferenceRequest extends BaseCollectionRequest<DeviceManagementConfigurationSettingDefinitionCollectionResponse, IDeviceManagementConfigurationSettingDefinitionCollectionPage> implements IDeviceManagementConfigurationSettingDefinitionCollectionReferenceRequest {

    /**
     * The request builder for this collection of DeviceManagementConfigurationSettingDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementConfigurationSettingDefinitionCollectionReferenceRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementConfigurationSettingDefinitionCollectionResponse.class, IDeviceManagementConfigurationSettingDefinitionCollectionPage.class);
    }

    public void post(final DeviceManagementConfigurationSettingDefinition newDeviceManagementConfigurationSettingDefinition, final ICallback<? super DeviceManagementConfigurationSettingDefinition> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceManagement/settingDefinitions/" + newDeviceManagementConfigurationSettingDefinition.id);
        new DeviceManagementConfigurationSettingDefinitionWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementConfigurationSettingDefinition, body, callback);
    }

    public DeviceManagementConfigurationSettingDefinition post(final DeviceManagementConfigurationSettingDefinition newDeviceManagementConfigurationSettingDefinition) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceManagement/settingDefinitions/" + newDeviceManagementConfigurationSettingDefinition.id);
        return new DeviceManagementConfigurationSettingDefinitionWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getHeaders())
                .post(newDeviceManagementConfigurationSettingDefinition, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationSettingDefinitionCollectionReferenceRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementConfigurationSettingDefinitionCollectionReferenceRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationSettingDefinitionCollectionReferenceRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceManagementConfigurationSettingDefinitionCollectionReferenceRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the sort clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationSettingDefinitionCollectionReferenceRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceManagementConfigurationSettingDefinitionCollectionReferenceRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationSettingDefinitionCollectionReferenceRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementConfigurationSettingDefinitionCollectionReferenceRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementConfigurationSettingDefinitionCollectionReferenceRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementConfigurationSettingDefinitionCollectionReferenceRequest)this;
    }
}
