// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementAutopilotEvent;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Autopilot Event Request.
 */
public interface IDeviceManagementAutopilotEventRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementAutopilotEvent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceManagementAutopilotEvent> callback);

    /**
     * Gets the DeviceManagementAutopilotEvent from the service
     *
     * @return the DeviceManagementAutopilotEvent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementAutopilotEvent get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceManagementAutopilotEvent> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementAutopilotEvent with a source
     *
     * @param sourceDeviceManagementAutopilotEvent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementAutopilotEvent sourceDeviceManagementAutopilotEvent, final ICallback<DeviceManagementAutopilotEvent> callback);

    /**
     * Patches this DeviceManagementAutopilotEvent with a source
     *
     * @param sourceDeviceManagementAutopilotEvent the source object with updates
     * @return the updated DeviceManagementAutopilotEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementAutopilotEvent patch(final DeviceManagementAutopilotEvent sourceDeviceManagementAutopilotEvent) throws ClientException;

    /**
     * Posts a DeviceManagementAutopilotEvent with a new object
     *
     * @param newDeviceManagementAutopilotEvent the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementAutopilotEvent newDeviceManagementAutopilotEvent, final ICallback<DeviceManagementAutopilotEvent> callback);

    /**
     * Posts a DeviceManagementAutopilotEvent with a new object
     *
     * @param newDeviceManagementAutopilotEvent the new object to create
     * @return the created DeviceManagementAutopilotEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementAutopilotEvent post(final DeviceManagementAutopilotEvent newDeviceManagementAutopilotEvent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementAutopilotEventRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementAutopilotEventRequest expand(final String value);

}

