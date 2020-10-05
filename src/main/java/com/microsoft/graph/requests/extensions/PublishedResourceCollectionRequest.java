// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnPremisesPublishingProfile;
import com.microsoft.graph.models.extensions.PublishedResource;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPublishedResourceCollectionPage;
import com.microsoft.graph.requests.extensions.PublishedResourceCollectionResponse;
import com.microsoft.graph.requests.extensions.IPublishedResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPublishedResourceCollectionRequest;
import com.microsoft.graph.requests.extensions.PublishedResourceCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Published Resource Collection Request.
 */
public class PublishedResourceCollectionRequest extends BaseCollectionRequest<PublishedResourceCollectionResponse, IPublishedResourceCollectionPage> implements IPublishedResourceCollectionRequest {

    /**
     * The request builder for this collection of PublishedResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PublishedResourceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PublishedResourceCollectionResponse.class, IPublishedResourceCollectionPage.class);
    }

    public void get(final ICallback<? super IPublishedResourceCollectionPage> callback) {
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

    public IPublishedResourceCollectionPage get() throws ClientException {
        final PublishedResourceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PublishedResource newPublishedResource, final ICallback<? super PublishedResource> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PublishedResourceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPublishedResource, callback);
    }

    public PublishedResource post(final PublishedResource newPublishedResource) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PublishedResourceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPublishedResource);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPublishedResourceCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PublishedResourceCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IPublishedResourceCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (PublishedResourceCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IPublishedResourceCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (PublishedResourceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPublishedResourceCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PublishedResourceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPublishedResourceCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PublishedResourceCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPublishedResourceCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PublishedResourceCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPublishedResourceCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPublishedResourceCollectionRequest)this;
    }
    public IPublishedResourceCollectionPage buildFromResponse(final PublishedResourceCollectionResponse response) {
        final IPublishedResourceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PublishedResourceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PublishedResourceCollectionPage page = new PublishedResourceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
