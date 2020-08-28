// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PurchaseInvoiceLine;
import com.microsoft.graph.requests.extensions.IItemRequestBuilder;
import com.microsoft.graph.requests.extensions.ItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccountRequestBuilder;
import com.microsoft.graph.requests.extensions.AccountRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Purchase Invoice Line Request Builder.
 */
public class PurchaseInvoiceLineRequestBuilder extends BaseRequestBuilder implements IPurchaseInvoiceLineRequestBuilder {

    /**
     * The request builder for the PurchaseInvoiceLine
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PurchaseInvoiceLineRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IPurchaseInvoiceLineRequest instance
     */
    public IPurchaseInvoiceLineRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPurchaseInvoiceLineRequest instance
     */
    public IPurchaseInvoiceLineRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PurchaseInvoiceLineRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Item
     *
     * @return the IItemRequestBuilder instance
     */
    public IItemRequestBuilder item() {
        return new ItemRequestBuilder(getRequestUrlWithAdditionalSegment("item"), getClient(), null);
    }

    /**
     * Gets the request builder for Account
     *
     * @return the IAccountRequestBuilder instance
     */
    public IAccountRequestBuilder account() {
        return new AccountRequestBuilder(getRequestUrlWithAdditionalSegment("account"), getClient(), null);
    }
}
