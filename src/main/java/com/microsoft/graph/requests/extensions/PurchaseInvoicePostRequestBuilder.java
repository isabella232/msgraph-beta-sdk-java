// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPurchaseInvoicePostRequest;
import com.microsoft.graph.requests.extensions.PurchaseInvoicePostRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Purchase Invoice Post Request Builder.
 */
public class PurchaseInvoicePostRequestBuilder extends BaseActionRequestBuilder implements IPurchaseInvoicePostRequestBuilder {

    /**
     * The request builder for this PurchaseInvoicePost
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PurchaseInvoicePostRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IPurchaseInvoicePostRequest
     *
     * @param requestOptions the options for the request
     * @return the IPurchaseInvoicePostRequest instance
     */
    public IPurchaseInvoicePostRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IPurchaseInvoicePostRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IPurchaseInvoicePostRequest instance
     */
    public IPurchaseInvoicePostRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PurchaseInvoicePostRequest request = new PurchaseInvoicePostRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
