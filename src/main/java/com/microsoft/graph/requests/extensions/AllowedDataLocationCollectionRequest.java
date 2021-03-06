// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AllowedDataLocation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAllowedDataLocationCollectionPage;
import com.microsoft.graph.requests.extensions.AllowedDataLocationCollectionResponse;
import com.microsoft.graph.requests.extensions.IAllowedDataLocationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAllowedDataLocationCollectionRequest;
import com.microsoft.graph.requests.extensions.AllowedDataLocationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Allowed Data Location Collection Request.
 */
public class AllowedDataLocationCollectionRequest extends BaseCollectionRequest<AllowedDataLocationCollectionResponse, IAllowedDataLocationCollectionPage> implements IAllowedDataLocationCollectionRequest {

    /**
     * The request builder for this collection of AllowedDataLocation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AllowedDataLocationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AllowedDataLocationCollectionResponse.class, IAllowedDataLocationCollectionPage.class);
    }

    public void get(final ICallback<? super IAllowedDataLocationCollectionPage> callback) {
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

    public IAllowedDataLocationCollectionPage get() throws ClientException {
        final AllowedDataLocationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AllowedDataLocation newAllowedDataLocation, final ICallback<? super AllowedDataLocation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AllowedDataLocationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAllowedDataLocation, callback);
    }

    public AllowedDataLocation post(final AllowedDataLocation newAllowedDataLocation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AllowedDataLocationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAllowedDataLocation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAllowedDataLocationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AllowedDataLocationCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IAllowedDataLocationCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (AllowedDataLocationCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IAllowedDataLocationCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (AllowedDataLocationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAllowedDataLocationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AllowedDataLocationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAllowedDataLocationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AllowedDataLocationCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IAllowedDataLocationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (AllowedDataLocationCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IAllowedDataLocationCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IAllowedDataLocationCollectionRequest)this;
    }
    public IAllowedDataLocationCollectionPage buildFromResponse(final AllowedDataLocationCollectionResponse response) {
        final IAllowedDataLocationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AllowedDataLocationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AllowedDataLocationCollectionPage page = new AllowedDataLocationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
