// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityUserCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Organizer Activity User Counts Collection Request.
 */
public class ReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequest extends BaseCollectionRequest<ReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionResponse, IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionPage> implements IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequest {


    /**
     * The request for this ReportRootGetSkypeForBusinessOrganizerActivityUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionResponse.class, IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionPage.class);
    }


    public void get(final ICallback<IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionPage> callback) {
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

    public IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionPage get() throws ClientException {
        final ReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionPage buildFromResponse(final ReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionResponse response) {
        final IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null);
        } else {
            builder = null;
        }
        final IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionPage page = new ReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IReportRootGetSkypeForBusinessOrganizerActivityUserCountsCollectionRequest)this;
    }

}
