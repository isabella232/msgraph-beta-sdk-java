// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceHealthScriptRunSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Health Script Run Summary Request.
 */
public interface IDeviceHealthScriptRunSummaryRequest extends IHttpRequest {

    /**
     * Gets the DeviceHealthScriptRunSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceHealthScriptRunSummary> callback);

    /**
     * Gets the DeviceHealthScriptRunSummary from the service
     *
     * @return the DeviceHealthScriptRunSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScriptRunSummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceHealthScriptRunSummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceHealthScriptRunSummary with a source
     *
     * @param sourceDeviceHealthScriptRunSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceHealthScriptRunSummary sourceDeviceHealthScriptRunSummary, final ICallback<? super DeviceHealthScriptRunSummary> callback);

    /**
     * Patches this DeviceHealthScriptRunSummary with a source
     *
     * @param sourceDeviceHealthScriptRunSummary the source object with updates
     * @return the updated DeviceHealthScriptRunSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScriptRunSummary patch(final DeviceHealthScriptRunSummary sourceDeviceHealthScriptRunSummary) throws ClientException;

    /**
     * Posts a DeviceHealthScriptRunSummary with a new object
     *
     * @param newDeviceHealthScriptRunSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceHealthScriptRunSummary newDeviceHealthScriptRunSummary, final ICallback<? super DeviceHealthScriptRunSummary> callback);

    /**
     * Posts a DeviceHealthScriptRunSummary with a new object
     *
     * @param newDeviceHealthScriptRunSummary the new object to create
     * @return the created DeviceHealthScriptRunSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScriptRunSummary post(final DeviceHealthScriptRunSummary newDeviceHealthScriptRunSummary) throws ClientException;

    /**
     * Posts a DeviceHealthScriptRunSummary with a new object
     *
     * @param newDeviceHealthScriptRunSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceHealthScriptRunSummary newDeviceHealthScriptRunSummary, final ICallback<? super DeviceHealthScriptRunSummary> callback);

    /**
     * Posts a DeviceHealthScriptRunSummary with a new object
     *
     * @param newDeviceHealthScriptRunSummary the object to create/update
     * @return the created DeviceHealthScriptRunSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceHealthScriptRunSummary put(final DeviceHealthScriptRunSummary newDeviceHealthScriptRunSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceHealthScriptRunSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceHealthScriptRunSummaryRequest expand(final String value);

}

