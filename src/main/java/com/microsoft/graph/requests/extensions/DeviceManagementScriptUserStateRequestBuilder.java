// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementScriptUserState;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptDeviceStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script User State Request Builder.
 */
public class DeviceManagementScriptUserStateRequestBuilder extends BaseRequestBuilder implements IDeviceManagementScriptUserStateRequestBuilder {

    /**
     * The request builder for the DeviceManagementScriptUserState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementScriptUserStateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementScriptUserStateRequest instance
     */
    public IDeviceManagementScriptUserStateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementScriptUserStateRequest instance
     */
    public IDeviceManagementScriptUserStateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceManagementScriptUserStateRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceManagementScriptDeviceStateCollectionRequestBuilder deviceRunStates() {
        return new DeviceManagementScriptDeviceStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceRunStates"), getClient(), null);
    }

    public IDeviceManagementScriptDeviceStateRequestBuilder deviceRunStates(final String id) {
        return new DeviceManagementScriptDeviceStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceRunStates") + "/" + id, getClient(), null);
    }
}
