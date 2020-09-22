// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ActivityStatistics;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IActivityStatisticsCollectionPage;
import com.microsoft.graph.requests.extensions.ActivityStatisticsCollectionResponse;
import com.microsoft.graph.requests.extensions.IActivityStatisticsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IActivityStatisticsCollectionRequest;
import com.microsoft.graph.requests.extensions.ActivityStatisticsCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity Statistics Collection Request.
 */
public class ActivityStatisticsCollectionRequest extends BaseCollectionRequest<ActivityStatisticsCollectionResponse, IActivityStatisticsCollectionPage> implements IActivityStatisticsCollectionRequest {

    /**
     * The request builder for this collection of ActivityStatistics
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ActivityStatisticsCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ActivityStatisticsCollectionResponse.class, IActivityStatisticsCollectionPage.class);
    }

    public void get(final ICallback<IActivityStatisticsCollectionPage> callback) {
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

    public IActivityStatisticsCollectionPage get() throws ClientException {
        final ActivityStatisticsCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ActivityStatistics newActivityStatistics, final ICallback<ActivityStatistics> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ActivityStatisticsRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newActivityStatistics, callback);
    }

    public ActivityStatistics post(final ActivityStatistics newActivityStatistics) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ActivityStatisticsRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newActivityStatistics);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IActivityStatisticsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ActivityStatisticsCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IActivityStatisticsCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ActivityStatisticsCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IActivityStatisticsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ActivityStatisticsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IActivityStatisticsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ActivityStatisticsCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IActivityStatisticsCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ActivityStatisticsCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IActivityStatisticsCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IActivityStatisticsCollectionRequest)this;
    }
    public IActivityStatisticsCollectionPage buildFromResponse(final ActivityStatisticsCollectionResponse response) {
        final IActivityStatisticsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ActivityStatisticsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ActivityStatisticsCollectionPage page = new ActivityStatisticsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
