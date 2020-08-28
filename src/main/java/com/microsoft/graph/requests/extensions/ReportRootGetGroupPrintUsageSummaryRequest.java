// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPrintUsageSummary;
import com.microsoft.graph.requests.extensions.IReportRootGetGroupPrintUsageSummaryRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetGroupPrintUsageSummaryRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Group Print Usage Summary Request.
 */
public class ReportRootGetGroupPrintUsageSummaryRequest extends BaseRequest implements IReportRootGetGroupPrintUsageSummaryRequest {

    /**
     * The request for this ReportRootGetGroupPrintUsageSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetGroupPrintUsageSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPrintUsageSummary.class);
    }

    /**
     * Gets the GroupPrintUsageSummary
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GroupPrintUsageSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupPrintUsageSummary
     *
     * @return the GroupPrintUsageSummary
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public GroupPrintUsageSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IReportRootGetGroupPrintUsageSummaryRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ReportRootGetGroupPrintUsageSummaryRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IReportRootGetGroupPrintUsageSummaryRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ReportRootGetGroupPrintUsageSummaryRequest)this;
    }

}
