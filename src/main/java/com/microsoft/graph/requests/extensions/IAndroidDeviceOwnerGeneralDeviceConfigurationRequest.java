// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerGeneralDeviceConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Device Owner General Device Configuration Request.
 */
public interface IAndroidDeviceOwnerGeneralDeviceConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AndroidDeviceOwnerGeneralDeviceConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidDeviceOwnerGeneralDeviceConfiguration> callback);

    /**
     * Gets the AndroidDeviceOwnerGeneralDeviceConfiguration from the service
     *
     * @return the AndroidDeviceOwnerGeneralDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceOwnerGeneralDeviceConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidDeviceOwnerGeneralDeviceConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidDeviceOwnerGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidDeviceOwnerGeneralDeviceConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidDeviceOwnerGeneralDeviceConfiguration sourceAndroidDeviceOwnerGeneralDeviceConfiguration, final ICallback<AndroidDeviceOwnerGeneralDeviceConfiguration> callback);

    /**
     * Patches this AndroidDeviceOwnerGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidDeviceOwnerGeneralDeviceConfiguration the source object with updates
     * @return the updated AndroidDeviceOwnerGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceOwnerGeneralDeviceConfiguration patch(final AndroidDeviceOwnerGeneralDeviceConfiguration sourceAndroidDeviceOwnerGeneralDeviceConfiguration) throws ClientException;

    /**
     * Posts a AndroidDeviceOwnerGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerGeneralDeviceConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidDeviceOwnerGeneralDeviceConfiguration newAndroidDeviceOwnerGeneralDeviceConfiguration, final ICallback<AndroidDeviceOwnerGeneralDeviceConfiguration> callback);

    /**
     * Posts a AndroidDeviceOwnerGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidDeviceOwnerGeneralDeviceConfiguration the new object to create
     * @return the created AndroidDeviceOwnerGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceOwnerGeneralDeviceConfiguration post(final AndroidDeviceOwnerGeneralDeviceConfiguration newAndroidDeviceOwnerGeneralDeviceConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidDeviceOwnerGeneralDeviceConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidDeviceOwnerGeneralDeviceConfigurationRequest expand(final String value);

}

