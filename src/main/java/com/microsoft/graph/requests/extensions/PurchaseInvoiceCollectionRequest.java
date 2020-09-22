// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.models.extensions.PurchaseInvoice;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPurchaseInvoiceCollectionPage;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceCollectionResponse;
import com.microsoft.graph.requests.extensions.IPurchaseInvoiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPurchaseInvoiceCollectionRequest;
import com.microsoft.graph.requests.extensions.PurchaseInvoiceCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Purchase Invoice Collection Request.
 */
public class PurchaseInvoiceCollectionRequest extends BaseCollectionRequest<PurchaseInvoiceCollectionResponse, IPurchaseInvoiceCollectionPage> implements IPurchaseInvoiceCollectionRequest {

    /**
     * The request builder for this collection of PurchaseInvoice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PurchaseInvoiceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PurchaseInvoiceCollectionResponse.class, IPurchaseInvoiceCollectionPage.class);
    }

    public void get(final ICallback<IPurchaseInvoiceCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IPurchaseInvoiceCollectionPage get() throws ClientException {
        final PurchaseInvoiceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PurchaseInvoice newPurchaseInvoice, final ICallback<PurchaseInvoice> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PurchaseInvoiceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPurchaseInvoice, callback);
    }

    public PurchaseInvoice post(final PurchaseInvoice newPurchaseInvoice) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PurchaseInvoiceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPurchaseInvoice);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPurchaseInvoiceCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PurchaseInvoiceCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IPurchaseInvoiceCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (PurchaseInvoiceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPurchaseInvoiceCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PurchaseInvoiceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPurchaseInvoiceCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PurchaseInvoiceCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPurchaseInvoiceCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PurchaseInvoiceCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPurchaseInvoiceCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPurchaseInvoiceCollectionRequest)this;
    }
    public IPurchaseInvoiceCollectionPage buildFromResponse(final PurchaseInvoiceCollectionResponse response) {
        final IPurchaseInvoiceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PurchaseInvoiceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PurchaseInvoiceCollectionPage page = new PurchaseInvoiceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
