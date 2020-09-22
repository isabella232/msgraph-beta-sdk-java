// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.models.extensions.Currency;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ICurrencyCollectionPage;
import com.microsoft.graph.requests.extensions.CurrencyCollectionResponse;
import com.microsoft.graph.requests.extensions.ICurrencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICurrencyCollectionRequest;
import com.microsoft.graph.requests.extensions.CurrencyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Currency Collection Request.
 */
public class CurrencyCollectionRequest extends BaseCollectionRequest<CurrencyCollectionResponse, ICurrencyCollectionPage> implements ICurrencyCollectionRequest {

    /**
     * The request builder for this collection of Currency
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CurrencyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CurrencyCollectionResponse.class, ICurrencyCollectionPage.class);
    }

    public void get(final ICallback<ICurrencyCollectionPage> callback) {
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

    public ICurrencyCollectionPage get() throws ClientException {
        final CurrencyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Currency newCurrency, final ICallback<Currency> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new CurrencyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCurrency, callback);
    }

    public Currency post(final Currency newCurrency) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CurrencyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCurrency);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICurrencyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CurrencyCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ICurrencyCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (CurrencyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICurrencyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CurrencyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ICurrencyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (CurrencyCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ICurrencyCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (CurrencyCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ICurrencyCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ICurrencyCollectionRequest)this;
    }
    public ICurrencyCollectionPage buildFromResponse(final CurrencyCollectionResponse response) {
        final ICurrencyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new CurrencyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final CurrencyCollectionPage page = new CurrencyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
