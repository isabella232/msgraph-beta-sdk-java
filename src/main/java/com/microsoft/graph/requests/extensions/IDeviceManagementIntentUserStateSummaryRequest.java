// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementIntentUserStateSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Intent User State Summary Request.
 */
public interface IDeviceManagementIntentUserStateSummaryRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementIntentUserStateSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceManagementIntentUserStateSummary> callback);

    /**
     * Gets the DeviceManagementIntentUserStateSummary from the service
     *
     * @return the DeviceManagementIntentUserStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementIntentUserStateSummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceManagementIntentUserStateSummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementIntentUserStateSummary with a source
     *
     * @param sourceDeviceManagementIntentUserStateSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementIntentUserStateSummary sourceDeviceManagementIntentUserStateSummary, final ICallback<? super DeviceManagementIntentUserStateSummary> callback);

    /**
     * Patches this DeviceManagementIntentUserStateSummary with a source
     *
     * @param sourceDeviceManagementIntentUserStateSummary the source object with updates
     * @return the updated DeviceManagementIntentUserStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementIntentUserStateSummary patch(final DeviceManagementIntentUserStateSummary sourceDeviceManagementIntentUserStateSummary) throws ClientException;

    /**
     * Posts a DeviceManagementIntentUserStateSummary with a new object
     *
     * @param newDeviceManagementIntentUserStateSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementIntentUserStateSummary newDeviceManagementIntentUserStateSummary, final ICallback<? super DeviceManagementIntentUserStateSummary> callback);

    /**
     * Posts a DeviceManagementIntentUserStateSummary with a new object
     *
     * @param newDeviceManagementIntentUserStateSummary the new object to create
     * @return the created DeviceManagementIntentUserStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementIntentUserStateSummary post(final DeviceManagementIntentUserStateSummary newDeviceManagementIntentUserStateSummary) throws ClientException;

    /**
     * Posts a DeviceManagementIntentUserStateSummary with a new object
     *
     * @param newDeviceManagementIntentUserStateSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementIntentUserStateSummary newDeviceManagementIntentUserStateSummary, final ICallback<? super DeviceManagementIntentUserStateSummary> callback);

    /**
     * Posts a DeviceManagementIntentUserStateSummary with a new object
     *
     * @param newDeviceManagementIntentUserStateSummary the object to create/update
     * @return the created DeviceManagementIntentUserStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementIntentUserStateSummary put(final DeviceManagementIntentUserStateSummary newDeviceManagementIntentUserStateSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementIntentUserStateSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementIntentUserStateSummaryRequest expand(final String value);

}

