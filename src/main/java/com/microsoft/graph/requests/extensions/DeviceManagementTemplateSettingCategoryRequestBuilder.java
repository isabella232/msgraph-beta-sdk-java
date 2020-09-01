// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementTemplateSettingCategory;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Template Setting Category Request Builder.
 */
public class DeviceManagementTemplateSettingCategoryRequestBuilder extends BaseRequestBuilder implements IDeviceManagementTemplateSettingCategoryRequestBuilder {

    /**
     * The request builder for the DeviceManagementTemplateSettingCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementTemplateSettingCategoryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDeviceManagementTemplateSettingCategoryRequest instance
     */
    public IDeviceManagementTemplateSettingCategoryRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementTemplateSettingCategoryRequest instance
     */
    public IDeviceManagementTemplateSettingCategoryRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceManagementTemplateSettingCategoryRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceManagementSettingDefinitionCollectionRequestBuilder settingDefinitions() {
        return new DeviceManagementSettingDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settingDefinitions"), getClient(), null);
    }

    public IDeviceManagementSettingDefinitionRequestBuilder settingDefinitions(final String id) {
        return new DeviceManagementSettingDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("settingDefinitions") + "/" + id, getClient(), null);
    }
    public IDeviceManagementSettingInstanceCollectionRequestBuilder recommendedSettings() {
        return new DeviceManagementSettingInstanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("recommendedSettings"), getClient(), null);
    }

    public IDeviceManagementSettingInstanceRequestBuilder recommendedSettings(final String id) {
        return new DeviceManagementSettingInstanceRequestBuilder(getRequestUrlWithAdditionalSegment("recommendedSettings") + "/" + id, getClient(), null);
    }
}