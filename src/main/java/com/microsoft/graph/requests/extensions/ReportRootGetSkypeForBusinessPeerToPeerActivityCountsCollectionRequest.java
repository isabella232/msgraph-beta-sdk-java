// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Peer To Peer Activity Counts Collection Request.
 */
public class ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest extends BaseCollectionRequest<ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionResponse, IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionPage> implements IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest {


    /**
     * The request for this ReportRootGetSkypeForBusinessPeerToPeerActivityCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionResponse.class, IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionPage.class);
    }


    public void get(final ICallback<? super IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionPage> callback) {
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

    public IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionPage get() throws ClientException {
        final ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionPage buildFromResponse(final ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionResponse response) {
        final IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null);
        } else {
            builder = null;
        }
        final IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionPage page = new ReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IReportRootGetSkypeForBusinessPeerToPeerActivityCountsCollectionRequest)this;
    }

}
