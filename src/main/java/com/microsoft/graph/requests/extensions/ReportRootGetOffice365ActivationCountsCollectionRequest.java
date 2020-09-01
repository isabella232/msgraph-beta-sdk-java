// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365ActivationCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetOffice365ActivationCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365ActivationCountsCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Activation Counts Collection Request.
 */
public class ReportRootGetOffice365ActivationCountsCollectionRequest extends BaseCollectionRequest<ReportRootGetOffice365ActivationCountsCollectionResponse, IReportRootGetOffice365ActivationCountsCollectionPage> implements IReportRootGetOffice365ActivationCountsCollectionRequest {


    /**
     * The request for this ReportRootGetOffice365ActivationCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOffice365ActivationCountsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetOffice365ActivationCountsCollectionResponse.class, IReportRootGetOffice365ActivationCountsCollectionPage.class);
    }


    public void get(final ICallback<IReportRootGetOffice365ActivationCountsCollectionPage> callback) {
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

    public IReportRootGetOffice365ActivationCountsCollectionPage get() throws ClientException {
        final ReportRootGetOffice365ActivationCountsCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetOffice365ActivationCountsCollectionPage buildFromResponse(final ReportRootGetOffice365ActivationCountsCollectionResponse response) {
        final IReportRootGetOffice365ActivationCountsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetOffice365ActivationCountsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IReportRootGetOffice365ActivationCountsCollectionPage page = new ReportRootGetOffice365ActivationCountsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetOffice365ActivationCountsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetOffice365ActivationCountsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetOffice365ActivationCountsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetOffice365ActivationCountsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetOffice365ActivationCountsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetOffice365ActivationCountsCollectionRequest)this;
    }

}