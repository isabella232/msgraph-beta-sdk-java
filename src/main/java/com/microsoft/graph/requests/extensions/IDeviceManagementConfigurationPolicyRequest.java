// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicy;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Configuration Policy Request.
 */
public interface IDeviceManagementConfigurationPolicyRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementConfigurationPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceManagementConfigurationPolicy> callback);

    /**
     * Gets the DeviceManagementConfigurationPolicy from the service
     *
     * @return the DeviceManagementConfigurationPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementConfigurationPolicy get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceManagementConfigurationPolicy> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementConfigurationPolicy with a source
     *
     * @param sourceDeviceManagementConfigurationPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementConfigurationPolicy sourceDeviceManagementConfigurationPolicy, final ICallback<? super DeviceManagementConfigurationPolicy> callback);

    /**
     * Patches this DeviceManagementConfigurationPolicy with a source
     *
     * @param sourceDeviceManagementConfigurationPolicy the source object with updates
     * @return the updated DeviceManagementConfigurationPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementConfigurationPolicy patch(final DeviceManagementConfigurationPolicy sourceDeviceManagementConfigurationPolicy) throws ClientException;

    /**
     * Posts a DeviceManagementConfigurationPolicy with a new object
     *
     * @param newDeviceManagementConfigurationPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementConfigurationPolicy newDeviceManagementConfigurationPolicy, final ICallback<? super DeviceManagementConfigurationPolicy> callback);

    /**
     * Posts a DeviceManagementConfigurationPolicy with a new object
     *
     * @param newDeviceManagementConfigurationPolicy the new object to create
     * @return the created DeviceManagementConfigurationPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementConfigurationPolicy post(final DeviceManagementConfigurationPolicy newDeviceManagementConfigurationPolicy) throws ClientException;

    /**
     * Posts a DeviceManagementConfigurationPolicy with a new object
     *
     * @param newDeviceManagementConfigurationPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementConfigurationPolicy newDeviceManagementConfigurationPolicy, final ICallback<? super DeviceManagementConfigurationPolicy> callback);

    /**
     * Posts a DeviceManagementConfigurationPolicy with a new object
     *
     * @param newDeviceManagementConfigurationPolicy the object to create/update
     * @return the created DeviceManagementConfigurationPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementConfigurationPolicy put(final DeviceManagementConfigurationPolicy newDeviceManagementConfigurationPolicy) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementConfigurationPolicyRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementConfigurationPolicyRequest expand(final String value);

}

