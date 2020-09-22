// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.generated.GlobalDeviceHealthScriptState;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptAreGlobalScriptsAvailableRequest;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptAreGlobalScriptsAvailableRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script Are Global Scripts Available Request.
 */
public class DeviceHealthScriptAreGlobalScriptsAvailableRequest extends BaseRequest implements IDeviceHealthScriptAreGlobalScriptsAvailableRequest {

    /**
     * The request for this DeviceHealthScriptAreGlobalScriptsAvailable
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceHealthScriptAreGlobalScriptsAvailableRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GlobalDeviceHealthScriptState.class);
    }

    /**
     * Gets the GlobalDeviceHealthScriptState
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GlobalDeviceHealthScriptState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GlobalDeviceHealthScriptState
     *
     * @return the GlobalDeviceHealthScriptState
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public GlobalDeviceHealthScriptState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceHealthScriptAreGlobalScriptsAvailableRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceHealthScriptAreGlobalScriptsAvailableRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceHealthScriptAreGlobalScriptsAvailableRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceHealthScriptAreGlobalScriptsAvailableRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceHealthScriptAreGlobalScriptsAvailableRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceHealthScriptAreGlobalScriptsAvailableRequest)this;
    }

}
