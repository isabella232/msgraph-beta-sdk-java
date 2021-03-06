// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICloudPCReprovisionRequest;
import com.microsoft.graph.requests.extensions.CloudPCReprovisionRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud PCReprovision Request Builder.
 */
public class CloudPCReprovisionRequestBuilder extends BaseActionRequestBuilder implements ICloudPCReprovisionRequestBuilder {

    /**
     * The request builder for this CloudPCReprovision
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudPCReprovisionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the ICloudPCReprovisionRequest
     *
     * @param requestOptions the options for the request
     * @return the ICloudPCReprovisionRequest instance
     */
    public ICloudPCReprovisionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ICloudPCReprovisionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ICloudPCReprovisionRequest instance
     */
    public ICloudPCReprovisionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        CloudPCReprovisionRequest request = new CloudPCReprovisionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
