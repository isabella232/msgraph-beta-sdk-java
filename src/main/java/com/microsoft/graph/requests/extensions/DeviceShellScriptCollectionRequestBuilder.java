// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceShellScript;
import com.microsoft.graph.models.extensions.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementScriptAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceShellScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceShellScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceShellScriptCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Shell Script Collection Request Builder.
 */
public class DeviceShellScriptCollectionRequestBuilder extends BaseRequestBuilder implements IDeviceShellScriptCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceShellScriptCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDeviceShellScriptCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDeviceShellScriptCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceShellScriptCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceShellScriptRequestBuilder byId(final String id) {
        return new DeviceShellScriptRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
