// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementReportsGetHistoricalReportBody;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetHistoricalReportRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementReportsGetHistoricalReportRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Get Historical Report Request.
 */
public class DeviceManagementReportsGetHistoricalReportRequest extends BaseRequest implements IDeviceManagementReportsGetHistoricalReportRequest {
    protected final DeviceManagementReportsGetHistoricalReportBody body;

    /**
     * The request for this DeviceManagementReportsGetHistoricalReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementReportsGetHistoricalReportRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, java.io.InputStream.class);
        body = new DeviceManagementReportsGetHistoricalReportBody();
    }

    public void post(final ICallback<java.io.InputStream> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public java.io.InputStream post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementReportsGetHistoricalReportRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementReportsGetHistoricalReportRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementReportsGetHistoricalReportRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (DeviceManagementReportsGetHistoricalReportRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementReportsGetHistoricalReportRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementReportsGetHistoricalReportRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceManagementReportsGetHistoricalReportRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceManagementReportsGetHistoricalReportRequest)this;
    }

}
