// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementReportsGetUnhealthyDefenderAgentsReportBody;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest;

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
 * The class for the Device Management Reports Get Unhealthy Defender Agents Report Request.
 */
public class DeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest extends BaseRequest implements IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest {
    protected final DeviceManagementReportsGetUnhealthyDefenderAgentsReportBody body;

    /**
     * The request for this DeviceManagementReportsGetUnhealthyDefenderAgentsReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, java.io.InputStream.class);
        body = new DeviceManagementReportsGetUnhealthyDefenderAgentsReportBody();
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
    public IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (DeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementReportsGetUnhealthyDefenderAgentsReportRequest)this;
    }

}
