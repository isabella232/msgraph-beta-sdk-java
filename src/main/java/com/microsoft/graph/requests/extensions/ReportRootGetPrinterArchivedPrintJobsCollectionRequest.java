// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ArchivedPrintJob;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetPrinterArchivedPrintJobsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetPrinterArchivedPrintJobsCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Printer Archived Print Jobs Collection Request.
 */
public class ReportRootGetPrinterArchivedPrintJobsCollectionRequest extends BaseCollectionRequest<ReportRootGetPrinterArchivedPrintJobsCollectionResponse, IReportRootGetPrinterArchivedPrintJobsCollectionPage> implements IReportRootGetPrinterArchivedPrintJobsCollectionRequest {


    /**
     * The request for this ReportRootGetPrinterArchivedPrintJobs
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetPrinterArchivedPrintJobsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetPrinterArchivedPrintJobsCollectionResponse.class, IReportRootGetPrinterArchivedPrintJobsCollectionPage.class);
    }


    public void get(final ICallback<? super IReportRootGetPrinterArchivedPrintJobsCollectionPage> callback) {
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

    public IReportRootGetPrinterArchivedPrintJobsCollectionPage get() throws ClientException {
        final ReportRootGetPrinterArchivedPrintJobsCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetPrinterArchivedPrintJobsCollectionPage buildFromResponse(final ReportRootGetPrinterArchivedPrintJobsCollectionResponse response) {
        final IReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetPrinterArchivedPrintJobsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null, (java.util.Calendar) null, (java.util.Calendar) null);
        } else {
            builder = null;
        }
        final IReportRootGetPrinterArchivedPrintJobsCollectionPage page = new ReportRootGetPrinterArchivedPrintJobsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetPrinterArchivedPrintJobsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetPrinterArchivedPrintJobsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetPrinterArchivedPrintJobsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetPrinterArchivedPrintJobsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetPrinterArchivedPrintJobsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetPrinterArchivedPrintJobsCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IReportRootGetPrinterArchivedPrintJobsCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IReportRootGetPrinterArchivedPrintJobsCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IReportRootGetPrinterArchivedPrintJobsCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IReportRootGetPrinterArchivedPrintJobsCollectionRequest)this;
    }

}
