// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceHealthScriptRemediationHistory;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptGetRemediationHistoryRequest;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptGetRemediationHistoryRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script Get Remediation History Request.
 */
public class DeviceHealthScriptGetRemediationHistoryRequest extends BaseRequest implements IDeviceHealthScriptGetRemediationHistoryRequest {

    /**
     * The request for this DeviceHealthScriptGetRemediationHistory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceHealthScriptGetRemediationHistoryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceHealthScriptRemediationHistory.class);
    }

    /**
     * Gets the DeviceHealthScriptRemediationHistory
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceHealthScriptRemediationHistory> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceHealthScriptRemediationHistory
     *
     * @return the DeviceHealthScriptRemediationHistory
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public DeviceHealthScriptRemediationHistory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceHealthScriptGetRemediationHistoryRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceHealthScriptGetRemediationHistoryRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceHealthScriptGetRemediationHistoryRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceHealthScriptGetRemediationHistoryRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceHealthScriptGetRemediationHistoryRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceHealthScriptGetRemediationHistoryRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceHealthScriptGetRemediationHistoryRequest orderBy(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceHealthScriptGetRemediationHistoryRequest)this;
    }

}
