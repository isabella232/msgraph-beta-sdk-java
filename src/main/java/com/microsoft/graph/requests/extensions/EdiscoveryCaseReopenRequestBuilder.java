// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEdiscoveryCaseReopenRequest;
import com.microsoft.graph.requests.extensions.EdiscoveryCaseReopenRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Case Reopen Request Builder.
 */
public class EdiscoveryCaseReopenRequestBuilder extends BaseActionRequestBuilder implements IEdiscoveryCaseReopenRequestBuilder {

    /**
     * The request builder for this EdiscoveryCaseReopen
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryCaseReopenRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IEdiscoveryCaseReopenRequest
     *
     * @param requestOptions the options for the request
     * @return the IEdiscoveryCaseReopenRequest instance
     */
    public IEdiscoveryCaseReopenRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IEdiscoveryCaseReopenRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IEdiscoveryCaseReopenRequest instance
     */
    public IEdiscoveryCaseReopenRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        EdiscoveryCaseReopenRequest request = new EdiscoveryCaseReopenRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
