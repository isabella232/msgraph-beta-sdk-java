// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementComplexSettingDefinition;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Complex Setting Definition Request.
 */
public interface IDeviceManagementComplexSettingDefinitionRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementComplexSettingDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceManagementComplexSettingDefinition> callback);

    /**
     * Gets the DeviceManagementComplexSettingDefinition from the service
     *
     * @return the DeviceManagementComplexSettingDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementComplexSettingDefinition get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceManagementComplexSettingDefinition> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementComplexSettingDefinition with a source
     *
     * @param sourceDeviceManagementComplexSettingDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementComplexSettingDefinition sourceDeviceManagementComplexSettingDefinition, final ICallback<? super DeviceManagementComplexSettingDefinition> callback);

    /**
     * Patches this DeviceManagementComplexSettingDefinition with a source
     *
     * @param sourceDeviceManagementComplexSettingDefinition the source object with updates
     * @return the updated DeviceManagementComplexSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementComplexSettingDefinition patch(final DeviceManagementComplexSettingDefinition sourceDeviceManagementComplexSettingDefinition) throws ClientException;

    /**
     * Posts a DeviceManagementComplexSettingDefinition with a new object
     *
     * @param newDeviceManagementComplexSettingDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementComplexSettingDefinition newDeviceManagementComplexSettingDefinition, final ICallback<? super DeviceManagementComplexSettingDefinition> callback);

    /**
     * Posts a DeviceManagementComplexSettingDefinition with a new object
     *
     * @param newDeviceManagementComplexSettingDefinition the new object to create
     * @return the created DeviceManagementComplexSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementComplexSettingDefinition post(final DeviceManagementComplexSettingDefinition newDeviceManagementComplexSettingDefinition) throws ClientException;

    /**
     * Posts a DeviceManagementComplexSettingDefinition with a new object
     *
     * @param newDeviceManagementComplexSettingDefinition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementComplexSettingDefinition newDeviceManagementComplexSettingDefinition, final ICallback<? super DeviceManagementComplexSettingDefinition> callback);

    /**
     * Posts a DeviceManagementComplexSettingDefinition with a new object
     *
     * @param newDeviceManagementComplexSettingDefinition the object to create/update
     * @return the created DeviceManagementComplexSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementComplexSettingDefinition put(final DeviceManagementComplexSettingDefinition newDeviceManagementComplexSettingDefinition) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementComplexSettingDefinitionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementComplexSettingDefinitionRequest expand(final String value);

}

