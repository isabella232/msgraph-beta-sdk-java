// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SiteActivitySummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityUserCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveActivityUserCountsCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get One Drive Activity User Counts Collection Request.
 */
public class ReportRootGetOneDriveActivityUserCountsCollectionRequest extends BaseCollectionRequest<ReportRootGetOneDriveActivityUserCountsCollectionResponse, IReportRootGetOneDriveActivityUserCountsCollectionPage> implements IReportRootGetOneDriveActivityUserCountsCollectionRequest {


    /**
     * The request for this ReportRootGetOneDriveActivityUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOneDriveActivityUserCountsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetOneDriveActivityUserCountsCollectionResponse.class, IReportRootGetOneDriveActivityUserCountsCollectionPage.class);
    }


    public void get(final ICallback<IReportRootGetOneDriveActivityUserCountsCollectionPage> callback) {
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

    public IReportRootGetOneDriveActivityUserCountsCollectionPage get() throws ClientException {
        final ReportRootGetOneDriveActivityUserCountsCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetOneDriveActivityUserCountsCollectionPage buildFromResponse(final ReportRootGetOneDriveActivityUserCountsCollectionResponse response) {
        final IReportRootGetOneDriveActivityUserCountsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetOneDriveActivityUserCountsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null);
        } else {
            builder = null;
        }
        final IReportRootGetOneDriveActivityUserCountsCollectionPage page = new ReportRootGetOneDriveActivityUserCountsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetOneDriveActivityUserCountsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetOneDriveActivityUserCountsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetOneDriveActivityUserCountsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetOneDriveActivityUserCountsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetOneDriveActivityUserCountsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetOneDriveActivityUserCountsCollectionRequest)this;
    }

}