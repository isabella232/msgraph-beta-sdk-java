// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceShellScript;
import com.microsoft.graph.models.extensions.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementScriptAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceShellScriptCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceShellScriptCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceShellScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceShellScriptCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceShellScriptCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Shell Script Collection Request.
 */
public class DeviceShellScriptCollectionRequest extends BaseCollectionRequest<DeviceShellScriptCollectionResponse, IDeviceShellScriptCollectionPage> implements IDeviceShellScriptCollectionRequest {

    /**
     * The request builder for this collection of DeviceShellScript
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceShellScriptCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceShellScriptCollectionResponse.class, IDeviceShellScriptCollectionPage.class);
    }

    public void get(final ICallback<IDeviceShellScriptCollectionPage> callback) {
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

    public IDeviceShellScriptCollectionPage get() throws ClientException {
        final DeviceShellScriptCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceShellScript newDeviceShellScript, final ICallback<DeviceShellScript> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceShellScriptRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceShellScript, callback);
    }

    public DeviceShellScript post(final DeviceShellScript newDeviceShellScript) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceShellScriptRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceShellScript);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceShellScriptCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceShellScriptCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceShellScriptCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceShellScriptCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceShellScriptCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceShellScriptCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceShellScriptCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceShellScriptCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceShellScriptCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceShellScriptCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceShellScriptCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceShellScriptCollectionRequest)this;
    }
    public IDeviceShellScriptCollectionPage buildFromResponse(final DeviceShellScriptCollectionResponse response) {
        final IDeviceShellScriptCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceShellScriptCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceShellScriptCollectionPage page = new DeviceShellScriptCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
