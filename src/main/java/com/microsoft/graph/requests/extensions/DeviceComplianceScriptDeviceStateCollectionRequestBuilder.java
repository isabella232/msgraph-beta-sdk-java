// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceComplianceScript;
import com.microsoft.graph.models.extensions.DeviceComplianceScriptDeviceState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceComplianceScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScriptDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScriptDeviceStateCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Script Device State Collection Request Builder.
 */
public class DeviceComplianceScriptDeviceStateCollectionRequestBuilder extends BaseRequestBuilder implements IDeviceComplianceScriptDeviceStateCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceComplianceScript
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceScriptDeviceStateCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDeviceComplianceScriptDeviceStateCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceComplianceScriptDeviceStateCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceComplianceScriptDeviceStateCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceComplianceScriptDeviceStateRequestBuilder byId(final String id) {
        return new DeviceComplianceScriptDeviceStateRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}