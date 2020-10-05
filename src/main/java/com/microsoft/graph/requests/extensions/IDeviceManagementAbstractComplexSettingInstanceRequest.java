// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementAbstractComplexSettingInstance;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Abstract Complex Setting Instance Request.
 */
public interface IDeviceManagementAbstractComplexSettingInstanceRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementAbstractComplexSettingInstance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DeviceManagementAbstractComplexSettingInstance> callback);

    /**
     * Gets the DeviceManagementAbstractComplexSettingInstance from the service
     *
     * @return the DeviceManagementAbstractComplexSettingInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementAbstractComplexSettingInstance get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DeviceManagementAbstractComplexSettingInstance> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementAbstractComplexSettingInstance with a source
     *
     * @param sourceDeviceManagementAbstractComplexSettingInstance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementAbstractComplexSettingInstance sourceDeviceManagementAbstractComplexSettingInstance, final ICallback<? super DeviceManagementAbstractComplexSettingInstance> callback);

    /**
     * Patches this DeviceManagementAbstractComplexSettingInstance with a source
     *
     * @param sourceDeviceManagementAbstractComplexSettingInstance the source object with updates
     * @return the updated DeviceManagementAbstractComplexSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementAbstractComplexSettingInstance patch(final DeviceManagementAbstractComplexSettingInstance sourceDeviceManagementAbstractComplexSettingInstance) throws ClientException;

    /**
     * Posts a DeviceManagementAbstractComplexSettingInstance with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingInstance the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementAbstractComplexSettingInstance newDeviceManagementAbstractComplexSettingInstance, final ICallback<? super DeviceManagementAbstractComplexSettingInstance> callback);

    /**
     * Posts a DeviceManagementAbstractComplexSettingInstance with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingInstance the new object to create
     * @return the created DeviceManagementAbstractComplexSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementAbstractComplexSettingInstance post(final DeviceManagementAbstractComplexSettingInstance newDeviceManagementAbstractComplexSettingInstance) throws ClientException;

    /**
     * Posts a DeviceManagementAbstractComplexSettingInstance with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingInstance the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DeviceManagementAbstractComplexSettingInstance newDeviceManagementAbstractComplexSettingInstance, final ICallback<? super DeviceManagementAbstractComplexSettingInstance> callback);

    /**
     * Posts a DeviceManagementAbstractComplexSettingInstance with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingInstance the object to create/update
     * @return the created DeviceManagementAbstractComplexSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementAbstractComplexSettingInstance put(final DeviceManagementAbstractComplexSettingInstance newDeviceManagementAbstractComplexSettingInstance) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementAbstractComplexSettingInstanceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementAbstractComplexSettingInstanceRequest expand(final String value);

}

