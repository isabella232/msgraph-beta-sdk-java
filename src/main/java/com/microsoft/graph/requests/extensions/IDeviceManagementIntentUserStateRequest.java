// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementIntentUserState;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Intent User State Request.
 */
public interface IDeviceManagementIntentUserStateRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementIntentUserState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceManagementIntentUserState> callback);

    /**
     * Gets the DeviceManagementIntentUserState from the service
     *
     * @return the DeviceManagementIntentUserState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementIntentUserState get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceManagementIntentUserState> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementIntentUserState with a source
     *
     * @param sourceDeviceManagementIntentUserState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementIntentUserState sourceDeviceManagementIntentUserState, final ICallback<DeviceManagementIntentUserState> callback);

    /**
     * Patches this DeviceManagementIntentUserState with a source
     *
     * @param sourceDeviceManagementIntentUserState the source object with updates
     * @return the updated DeviceManagementIntentUserState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementIntentUserState patch(final DeviceManagementIntentUserState sourceDeviceManagementIntentUserState) throws ClientException;

    /**
     * Posts a DeviceManagementIntentUserState with a new object
     *
     * @param newDeviceManagementIntentUserState the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementIntentUserState newDeviceManagementIntentUserState, final ICallback<DeviceManagementIntentUserState> callback);

    /**
     * Posts a DeviceManagementIntentUserState with a new object
     *
     * @param newDeviceManagementIntentUserState the new object to create
     * @return the created DeviceManagementIntentUserState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementIntentUserState post(final DeviceManagementIntentUserState newDeviceManagementIntentUserState) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementIntentUserStateRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementIntentUserStateRequest expand(final String value);

}

