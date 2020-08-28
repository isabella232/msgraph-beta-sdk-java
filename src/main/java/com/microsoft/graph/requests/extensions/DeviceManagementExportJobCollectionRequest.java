// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementReports;
import com.microsoft.graph.models.extensions.DeviceManagementExportJob;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementExportJobCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementExportJobCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementExportJobCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExportJobCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementExportJobCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Export Job Collection Request.
 */
public class DeviceManagementExportJobCollectionRequest extends BaseCollectionRequest<DeviceManagementExportJobCollectionResponse, IDeviceManagementExportJobCollectionPage> implements IDeviceManagementExportJobCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementExportJob
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementExportJobCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementExportJobCollectionResponse.class, IDeviceManagementExportJobCollectionPage.class);
    }

    public void get(final ICallback<IDeviceManagementExportJobCollectionPage> callback) {
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

    public IDeviceManagementExportJobCollectionPage get() throws ClientException {
        final DeviceManagementExportJobCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementExportJob newDeviceManagementExportJob, final ICallback<DeviceManagementExportJob> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementExportJobRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementExportJob, callback);
    }

    public DeviceManagementExportJob post(final DeviceManagementExportJob newDeviceManagementExportJob) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementExportJobRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementExportJob);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementExportJobCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementExportJobCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementExportJobCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementExportJobCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementExportJobCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementExportJobCollectionRequest)this;
    }

    public IDeviceManagementExportJobCollectionPage buildFromResponse(final DeviceManagementExportJobCollectionResponse response) {
        final IDeviceManagementExportJobCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementExportJobCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementExportJobCollectionPage page = new DeviceManagementExportJobCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
