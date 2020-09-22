// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementEnableUnlicensedAdminstratorsRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementEnableUnlicensedAdminstratorsRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Enable Unlicensed Adminstrators Request Builder.
 */
public class DeviceManagementEnableUnlicensedAdminstratorsRequestBuilder extends BaseActionRequestBuilder implements IDeviceManagementEnableUnlicensedAdminstratorsRequestBuilder {

    /**
     * The request builder for this DeviceManagementEnableUnlicensedAdminstrators
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementEnableUnlicensedAdminstratorsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IDeviceManagementEnableUnlicensedAdminstratorsRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementEnableUnlicensedAdminstratorsRequest instance
     */
    public IDeviceManagementEnableUnlicensedAdminstratorsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IDeviceManagementEnableUnlicensedAdminstratorsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementEnableUnlicensedAdminstratorsRequest instance
     */
    public IDeviceManagementEnableUnlicensedAdminstratorsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementEnableUnlicensedAdminstratorsRequest request = new DeviceManagementEnableUnlicensedAdminstratorsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
