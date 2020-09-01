// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EmailActivityUserDetail;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetEmailActivityUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailActivityUserDetailCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetEmailActivityUserDetailCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Email Activity User Detail Collection Request.
 */
public class ReportRootGetEmailActivityUserDetailCollectionRequest extends BaseCollectionRequest<ReportRootGetEmailActivityUserDetailCollectionResponse, IReportRootGetEmailActivityUserDetailCollectionPage> implements IReportRootGetEmailActivityUserDetailCollectionRequest {


    /**
     * The request for this ReportRootGetEmailActivityUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetEmailActivityUserDetailCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetEmailActivityUserDetailCollectionResponse.class, IReportRootGetEmailActivityUserDetailCollectionPage.class);
    }


    public void get(final ICallback<IReportRootGetEmailActivityUserDetailCollectionPage> callback) {
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

    public IReportRootGetEmailActivityUserDetailCollectionPage get() throws ClientException {
        final ReportRootGetEmailActivityUserDetailCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetEmailActivityUserDetailCollectionPage buildFromResponse(final ReportRootGetEmailActivityUserDetailCollectionResponse response) {
        final IReportRootGetEmailActivityUserDetailCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetEmailActivityUserDetailCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (com.microsoft.graph.models.extensions.DateOnly) null);
        } else {
            builder = null;
        }
        final IReportRootGetEmailActivityUserDetailCollectionPage page = new ReportRootGetEmailActivityUserDetailCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetEmailActivityUserDetailCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetEmailActivityUserDetailCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetEmailActivityUserDetailCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetEmailActivityUserDetailCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetEmailActivityUserDetailCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetEmailActivityUserDetailCollectionRequest)this;
    }

}