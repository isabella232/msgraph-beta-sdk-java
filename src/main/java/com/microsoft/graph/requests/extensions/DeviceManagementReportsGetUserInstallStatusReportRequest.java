// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementReportsGetUserInstallStatusReportBody;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetUserInstallStatusReportRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementReportsGetUserInstallStatusReportRequest;

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
 * The class for the Device Management Reports Get User Install Status Report Request.
 */
public class DeviceManagementReportsGetUserInstallStatusReportRequest extends BaseRequest implements IDeviceManagementReportsGetUserInstallStatusReportRequest {
    protected final DeviceManagementReportsGetUserInstallStatusReportBody body;

    /**
     * The request for this DeviceManagementReportsGetUserInstallStatusReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementReportsGetUserInstallStatusReportRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, java.io.InputStream.class);
        body = new DeviceManagementReportsGetUserInstallStatusReportBody();
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
    public IDeviceManagementReportsGetUserInstallStatusReportRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementReportsGetUserInstallStatusReportRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementReportsGetUserInstallStatusReportRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (DeviceManagementReportsGetUserInstallStatusReportRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementReportsGetUserInstallStatusReportRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementReportsGetUserInstallStatusReportRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceManagementReportsGetUserInstallStatusReportRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceManagementReportsGetUserInstallStatusReportRequest)this;
    }

}
