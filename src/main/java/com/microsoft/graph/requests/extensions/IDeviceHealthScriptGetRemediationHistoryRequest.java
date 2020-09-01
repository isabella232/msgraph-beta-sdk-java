// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceHealthScriptRemediationHistory;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptGetRemediationHistoryRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Health Script Get Remediation History Request.
 */
public interface IDeviceHealthScriptGetRemediationHistoryRequest {

    /**
     * Gets the DeviceHealthScriptRemediationHistory
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceHealthScriptRemediationHistory> callback);

    /**
     * Gets the DeviceHealthScriptRemediationHistory
     *
     * @return the DeviceHealthScriptRemediationHistory
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    DeviceHealthScriptRemediationHistory get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceHealthScriptGetRemediationHistoryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceHealthScriptGetRemediationHistoryRequest expand(final String value);

}