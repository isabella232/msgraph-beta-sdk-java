// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailboxUsageMailboxCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetMailboxUsageMailboxCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageMailboxCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetMailboxUsageMailboxCountsCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Mailbox Usage Mailbox Counts Collection Request.
 */
public class ReportRootGetMailboxUsageMailboxCountsCollectionRequest extends BaseCollectionRequest<ReportRootGetMailboxUsageMailboxCountsCollectionResponse, IReportRootGetMailboxUsageMailboxCountsCollectionPage> implements IReportRootGetMailboxUsageMailboxCountsCollectionRequest {


    /**
     * The request for this ReportRootGetMailboxUsageMailboxCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetMailboxUsageMailboxCountsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetMailboxUsageMailboxCountsCollectionResponse.class, IReportRootGetMailboxUsageMailboxCountsCollectionPage.class);
    }


    public void get(final ICallback<? super IReportRootGetMailboxUsageMailboxCountsCollectionPage> callback) {
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

    public IReportRootGetMailboxUsageMailboxCountsCollectionPage get() throws ClientException {
        final ReportRootGetMailboxUsageMailboxCountsCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetMailboxUsageMailboxCountsCollectionPage buildFromResponse(final ReportRootGetMailboxUsageMailboxCountsCollectionResponse response) {
        final IReportRootGetMailboxUsageMailboxCountsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetMailboxUsageMailboxCountsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null);
        } else {
            builder = null;
        }
        final IReportRootGetMailboxUsageMailboxCountsCollectionPage page = new ReportRootGetMailboxUsageMailboxCountsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetMailboxUsageMailboxCountsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetMailboxUsageMailboxCountsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetMailboxUsageMailboxCountsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetMailboxUsageMailboxCountsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetMailboxUsageMailboxCountsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetMailboxUsageMailboxCountsCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IReportRootGetMailboxUsageMailboxCountsCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IReportRootGetMailboxUsageMailboxCountsCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IReportRootGetMailboxUsageMailboxCountsCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IReportRootGetMailboxUsageMailboxCountsCollectionRequest)this;
    }

}
