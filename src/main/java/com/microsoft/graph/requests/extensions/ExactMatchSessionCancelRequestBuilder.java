// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IExactMatchSessionCancelRequest;
import com.microsoft.graph.requests.extensions.ExactMatchSessionCancelRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Session Cancel Request Builder.
 */
public class ExactMatchSessionCancelRequestBuilder extends BaseActionRequestBuilder implements IExactMatchSessionCancelRequestBuilder {

    /**
     * The request builder for this ExactMatchSessionCancel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExactMatchSessionCancelRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IExactMatchSessionCancelRequest
     *
     * @return the IExactMatchSessionCancelRequest instance
     */
    public IExactMatchSessionCancelRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IExactMatchSessionCancelRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IExactMatchSessionCancelRequest instance
     */
    public IExactMatchSessionCancelRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ExactMatchSessionCancelRequest request = new ExactMatchSessionCancelRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}