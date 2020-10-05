// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ISiteGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SiteGetActivitiesByIntervalCollectionPage;
import com.microsoft.graph.requests.extensions.SiteGetActivitiesByIntervalCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Get Activities By Interval Collection Request.
 */
public class SiteGetActivitiesByIntervalCollectionRequest extends BaseCollectionRequest<SiteGetActivitiesByIntervalCollectionResponse, ISiteGetActivitiesByIntervalCollectionPage> implements ISiteGetActivitiesByIntervalCollectionRequest {


    /**
     * The request for this SiteGetActivitiesByInterval
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SiteGetActivitiesByIntervalCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SiteGetActivitiesByIntervalCollectionResponse.class, ISiteGetActivitiesByIntervalCollectionPage.class);
    }


    public void get(final ICallback<? super ISiteGetActivitiesByIntervalCollectionPage> callback) {
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

    public ISiteGetActivitiesByIntervalCollectionPage get() throws ClientException {
        final SiteGetActivitiesByIntervalCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public ISiteGetActivitiesByIntervalCollectionPage buildFromResponse(final SiteGetActivitiesByIntervalCollectionResponse response) {
        final ISiteGetActivitiesByIntervalCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SiteGetActivitiesByIntervalCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null, (String) null, (String) null);
        } else {
            builder = null;
        }
        final ISiteGetActivitiesByIntervalCollectionPage page = new SiteGetActivitiesByIntervalCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISiteGetActivitiesByIntervalCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ISiteGetActivitiesByIntervalCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISiteGetActivitiesByIntervalCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ISiteGetActivitiesByIntervalCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISiteGetActivitiesByIntervalCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ISiteGetActivitiesByIntervalCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ISiteGetActivitiesByIntervalCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ISiteGetActivitiesByIntervalCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ISiteGetActivitiesByIntervalCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ISiteGetActivitiesByIntervalCollectionRequest)this;
    }

}
