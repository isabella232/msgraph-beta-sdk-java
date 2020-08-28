// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementIntentSettingCategory;
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
 * The class for the Device Management Intent Setting Category Request Builder.
 */
public class DeviceManagementIntentSettingCategoryRequestBuilder extends BaseRequestBuilder implements IDeviceManagementIntentSettingCategoryRequestBuilder {

    /**
     * The request builder for the DeviceManagementIntentSettingCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementIntentSettingCategoryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDeviceManagementIntentSettingCategoryRequest instance
     */
    public IDeviceManagementIntentSettingCategoryRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementIntentSettingCategoryRequest instance
     */
    public IDeviceManagementIntentSettingCategoryRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceManagementIntentSettingCategoryRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceManagementSettingDefinitionCollectionRequestBuilder settingDefinitions() {
        return new DeviceManagementSettingDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settingDefinitions"), getClient(), null);
    }

    public IDeviceManagementSettingDefinitionRequestBuilder settingDefinitions(final String id) {
        return new DeviceManagementSettingDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("settingDefinitions") + "/" + id, getClient(), null);
    }
    public IDeviceManagementSettingInstanceCollectionRequestBuilder settings() {
        return new DeviceManagementSettingInstanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }

    public IDeviceManagementSettingInstanceRequestBuilder settings(final String id) {
        return new DeviceManagementSettingInstanceRequestBuilder(getRequestUrlWithAdditionalSegment("settings") + "/" + id, getClient(), null);
    }
}
