// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.TiIndicator;
import com.microsoft.graph.models.extensions.ResultInfo;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ITiIndicatorCollectionPage;
import com.microsoft.graph.requests.extensions.TiIndicatorCollectionResponse;
import com.microsoft.graph.requests.extensions.ITiIndicatorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorCollectionRequest;
import com.microsoft.graph.requests.extensions.TiIndicatorCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ti Indicator Collection Request.
 */
public class TiIndicatorCollectionRequest extends BaseCollectionRequest<TiIndicatorCollectionResponse, ITiIndicatorCollectionPage> implements ITiIndicatorCollectionRequest {

    /**
     * The request builder for this collection of TiIndicator
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TiIndicatorCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TiIndicatorCollectionResponse.class, ITiIndicatorCollectionPage.class);
    }

    public void get(final ICallback<ITiIndicatorCollectionPage> callback) {
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

    public ITiIndicatorCollectionPage get() throws ClientException {
        final TiIndicatorCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TiIndicator newTiIndicator, final ICallback<TiIndicator> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TiIndicatorRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTiIndicator, callback);
    }

    public TiIndicator post(final TiIndicator newTiIndicator) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TiIndicatorRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTiIndicator);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITiIndicatorCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TiIndicatorCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ITiIndicatorCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (TiIndicatorCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITiIndicatorCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TiIndicatorCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITiIndicatorCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (TiIndicatorCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ITiIndicatorCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (TiIndicatorCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ITiIndicatorCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ITiIndicatorCollectionRequest)this;
    }
    public ITiIndicatorCollectionPage buildFromResponse(final TiIndicatorCollectionResponse response) {
        final ITiIndicatorCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TiIndicatorCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TiIndicatorCollectionPage page = new TiIndicatorCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
