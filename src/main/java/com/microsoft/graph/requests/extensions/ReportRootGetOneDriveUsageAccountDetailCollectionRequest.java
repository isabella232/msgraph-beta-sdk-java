// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OneDriveUsageAccountDetail;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageAccountDetailCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOneDriveUsageAccountDetailCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get One Drive Usage Account Detail Collection Request.
 */
public class ReportRootGetOneDriveUsageAccountDetailCollectionRequest extends BaseCollectionRequest<ReportRootGetOneDriveUsageAccountDetailCollectionResponse, IReportRootGetOneDriveUsageAccountDetailCollectionPage> implements IReportRootGetOneDriveUsageAccountDetailCollectionRequest {


    /**
     * The request for this ReportRootGetOneDriveUsageAccountDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOneDriveUsageAccountDetailCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ReportRootGetOneDriveUsageAccountDetailCollectionResponse.class, IReportRootGetOneDriveUsageAccountDetailCollectionPage.class);
    }


    public void get(final ICallback<IReportRootGetOneDriveUsageAccountDetailCollectionPage> callback) {
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

    public IReportRootGetOneDriveUsageAccountDetailCollectionPage get() throws ClientException {
        final ReportRootGetOneDriveUsageAccountDetailCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IReportRootGetOneDriveUsageAccountDetailCollectionPage buildFromResponse(final ReportRootGetOneDriveUsageAccountDetailCollectionResponse response) {
        final IReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ReportRootGetOneDriveUsageAccountDetailCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (com.microsoft.graph.models.extensions.DateOnly) null);
        } else {
            builder = null;
        }
        final IReportRootGetOneDriveUsageAccountDetailCollectionPage page = new ReportRootGetOneDriveUsageAccountDetailCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetOneDriveUsageAccountDetailCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IReportRootGetOneDriveUsageAccountDetailCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IReportRootGetOneDriveUsageAccountDetailCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IReportRootGetOneDriveUsageAccountDetailCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetOneDriveUsageAccountDetailCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IReportRootGetOneDriveUsageAccountDetailCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IReportRootGetOneDriveUsageAccountDetailCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IReportRootGetOneDriveUsageAccountDetailCollectionRequest)this;
    }

}
