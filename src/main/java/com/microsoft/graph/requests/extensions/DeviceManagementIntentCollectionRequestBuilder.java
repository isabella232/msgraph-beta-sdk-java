// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceManagementIntent;
import com.microsoft.graph.models.extensions.DeviceManagementSettingInstance;
import com.microsoft.graph.models.extensions.DeviceManagementIntentAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementSettingComparison;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementIntentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Collection Request Builder.
 */
public class DeviceManagementIntentCollectionRequestBuilder extends BaseRequestBuilder implements IDeviceManagementIntentCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementIntentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDeviceManagementIntentCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceManagementIntentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceManagementIntentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceManagementIntentRequestBuilder byId(final String id) {
        return new DeviceManagementIntentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
