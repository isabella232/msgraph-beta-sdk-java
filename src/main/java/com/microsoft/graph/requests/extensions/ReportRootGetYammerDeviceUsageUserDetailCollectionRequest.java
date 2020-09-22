// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.YammerDeviceUsageUserDetail;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageUserDetailCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageUserDetailCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Yammer Device Usage User Detail Collection Request.
 */
public class ReportRootGetYammerDeviceUsageUserDetailCollectionRequest extends BaseCollectionRequest<ReportRootGetYammerDeviceUsageUserDetailCollectionResponse, IReportRootGetYammerDeviceUsageUserDetailCollectionPage> implements IReportRootGetYammerDeviceUsageUserDetailCollectionRequest {


    /**
     * The request for this ReportRootGetYammerDeviceUsageUserDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetYammerDeviceUsageUserDetailCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetYammerDeviceUsageUserDetailCollectionResponse.class, IReportRootGetYammerDeviceUsageUserDetailCollectionPage.class);
    }


    public void get(final ICallback<IReportRootGetYammerDeviceUsageUserDetailCollectionPage> callback) {
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

    public IReportRootGetYammerDeviceUsageUserDetailCollectionPage get() throws ClientException {
        final ReportRootGetYammerDeviceUsageUserDetailCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetYammerDeviceUsageUserDetailCollectionPage buildFromResponse(final ReportRootGetYammerDeviceUsageUserDetailCollectionResponse response) {
        final IReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (com.microsoft.graph.models.extensions.DateOnly) null);
        } else {
            builder = null;
        }
        final IReportRootGetYammerDeviceUsageUserDetailCollectionPage page = new ReportRootGetYammerDeviceUsageUserDetailCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetYammerDeviceUsageUserDetailCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetYammerDeviceUsageUserDetailCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetYammerDeviceUsageUserDetailCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetYammerDeviceUsageUserDetailCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetYammerDeviceUsageUserDetailCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetYammerDeviceUsageUserDetailCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IReportRootGetYammerDeviceUsageUserDetailCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IReportRootGetYammerDeviceUsageUserDetailCollectionRequest)this;
    }

}
