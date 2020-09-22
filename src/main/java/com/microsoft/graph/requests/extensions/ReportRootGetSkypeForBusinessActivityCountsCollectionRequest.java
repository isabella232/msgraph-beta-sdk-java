// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessActivityCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessActivityCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessActivityCountsCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Activity Counts Collection Request.
 */
public class ReportRootGetSkypeForBusinessActivityCountsCollectionRequest extends BaseCollectionRequest<ReportRootGetSkypeForBusinessActivityCountsCollectionResponse, IReportRootGetSkypeForBusinessActivityCountsCollectionPage> implements IReportRootGetSkypeForBusinessActivityCountsCollectionRequest {


    /**
     * The request for this ReportRootGetSkypeForBusinessActivityCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetSkypeForBusinessActivityCountsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetSkypeForBusinessActivityCountsCollectionResponse.class, IReportRootGetSkypeForBusinessActivityCountsCollectionPage.class);
    }


    public void get(final ICallback<IReportRootGetSkypeForBusinessActivityCountsCollectionPage> callback) {
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

    public IReportRootGetSkypeForBusinessActivityCountsCollectionPage get() throws ClientException {
        final ReportRootGetSkypeForBusinessActivityCountsCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetSkypeForBusinessActivityCountsCollectionPage buildFromResponse(final ReportRootGetSkypeForBusinessActivityCountsCollectionResponse response) {
        final IReportRootGetSkypeForBusinessActivityCountsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetSkypeForBusinessActivityCountsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null);
        } else {
            builder = null;
        }
        final IReportRootGetSkypeForBusinessActivityCountsCollectionPage page = new ReportRootGetSkypeForBusinessActivityCountsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessActivityCountsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetSkypeForBusinessActivityCountsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessActivityCountsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetSkypeForBusinessActivityCountsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessActivityCountsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetSkypeForBusinessActivityCountsCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessActivityCountsCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IReportRootGetSkypeForBusinessActivityCountsCollectionRequest)this;
    }

}
