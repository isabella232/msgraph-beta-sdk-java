// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365GroupsActivityFileCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityFileCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityFileCountsCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Groups Activity File Counts Collection Request.
 */
public class ReportRootGetOffice365GroupsActivityFileCountsCollectionRequest extends BaseCollectionRequest<ReportRootGetOffice365GroupsActivityFileCountsCollectionResponse, IReportRootGetOffice365GroupsActivityFileCountsCollectionPage> implements IReportRootGetOffice365GroupsActivityFileCountsCollectionRequest {


    /**
     * The request for this ReportRootGetOffice365GroupsActivityFileCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOffice365GroupsActivityFileCountsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetOffice365GroupsActivityFileCountsCollectionResponse.class, IReportRootGetOffice365GroupsActivityFileCountsCollectionPage.class);
    }


    public void get(final ICallback<IReportRootGetOffice365GroupsActivityFileCountsCollectionPage> callback) {
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

    public IReportRootGetOffice365GroupsActivityFileCountsCollectionPage get() throws ClientException {
        final ReportRootGetOffice365GroupsActivityFileCountsCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetOffice365GroupsActivityFileCountsCollectionPage buildFromResponse(final ReportRootGetOffice365GroupsActivityFileCountsCollectionResponse response) {
        final IReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetOffice365GroupsActivityFileCountsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null);
        } else {
            builder = null;
        }
        final IReportRootGetOffice365GroupsActivityFileCountsCollectionPage page = new ReportRootGetOffice365GroupsActivityFileCountsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetOffice365GroupsActivityFileCountsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetOffice365GroupsActivityFileCountsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetOffice365GroupsActivityFileCountsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetOffice365GroupsActivityFileCountsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetOffice365GroupsActivityFileCountsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetOffice365GroupsActivityFileCountsCollectionRequest)this;
    }

}
