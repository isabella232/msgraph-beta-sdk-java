// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IIosVppAppRevokeUserLicenseRequest;
import com.microsoft.graph.requests.extensions.IosVppAppRevokeUserLicenseRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp App Revoke User License Request Builder.
 */
public class IosVppAppRevokeUserLicenseRequestBuilder extends BaseActionRequestBuilder implements IIosVppAppRevokeUserLicenseRequestBuilder {

    /**
     * The request builder for this IosVppAppRevokeUserLicense
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param userId the userId
     * @param notifyManagedDevices the notifyManagedDevices
     */
    public IosVppAppRevokeUserLicenseRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String userId, final Boolean notifyManagedDevices) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("userId", userId);
        bodyParams.put("notifyManagedDevices", notifyManagedDevices);
    }

    /**
     * Creates the IIosVppAppRevokeUserLicenseRequest
     *
     * @param requestOptions the options for the request
     * @return the IIosVppAppRevokeUserLicenseRequest instance
     */
    public IIosVppAppRevokeUserLicenseRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IIosVppAppRevokeUserLicenseRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IIosVppAppRevokeUserLicenseRequest instance
     */
    public IIosVppAppRevokeUserLicenseRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        IosVppAppRevokeUserLicenseRequest request = new IosVppAppRevokeUserLicenseRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("userId")) {
            request.body.userId = getParameter("userId");
        }

        if (hasParameter("notifyManagedDevices")) {
            request.body.notifyManagedDevices = getParameter("notifyManagedDevices");
        }

        return request;
    }
}
