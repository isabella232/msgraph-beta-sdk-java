// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceRegistrationPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Registration Policy Request.
 */
public interface IDeviceRegistrationPolicyRequest extends IHttpRequest {

    /**
     * Gets the DeviceRegistrationPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceRegistrationPolicy> callback);

    /**
     * Gets the DeviceRegistrationPolicy from the service
     *
     * @return the DeviceRegistrationPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceRegistrationPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceRegistrationPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceRegistrationPolicy with a source
     *
     * @param sourceDeviceRegistrationPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceRegistrationPolicy sourceDeviceRegistrationPolicy, final ICallback<DeviceRegistrationPolicy> callback);

    /**
     * Patches this DeviceRegistrationPolicy with a source
     *
     * @param sourceDeviceRegistrationPolicy the source object with updates
     * @return the updated DeviceRegistrationPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceRegistrationPolicy patch(final DeviceRegistrationPolicy sourceDeviceRegistrationPolicy) throws ClientException;

    /**
     * Posts a DeviceRegistrationPolicy with a new object
     *
     * @param newDeviceRegistrationPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceRegistrationPolicy newDeviceRegistrationPolicy, final ICallback<DeviceRegistrationPolicy> callback);

    /**
     * Posts a DeviceRegistrationPolicy with a new object
     *
     * @param newDeviceRegistrationPolicy the new object to create
     * @return the created DeviceRegistrationPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceRegistrationPolicy post(final DeviceRegistrationPolicy newDeviceRegistrationPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceRegistrationPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceRegistrationPolicyRequest expand(final String value);

}

