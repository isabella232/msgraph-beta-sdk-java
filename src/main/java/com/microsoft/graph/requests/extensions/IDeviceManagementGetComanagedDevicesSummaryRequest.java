// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ComanagedDevicesSummary;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetComanagedDevicesSummaryRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Get Comanaged Devices Summary Request.
 */
public interface IDeviceManagementGetComanagedDevicesSummaryRequest {

    /**
     * Gets the ComanagedDevicesSummary
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ComanagedDevicesSummary> callback);

    /**
     * Gets the ComanagedDevicesSummary
     *
     * @return the ComanagedDevicesSummary
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    ComanagedDevicesSummary get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementGetComanagedDevicesSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementGetComanagedDevicesSummaryRequest expand(final String value);

}
