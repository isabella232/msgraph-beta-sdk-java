// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidForWorkEnterpriseWiFiConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android For Work Enterprise Wi Fi Configuration Request.
 */
public interface IAndroidForWorkEnterpriseWiFiConfigurationRequest extends IHttpRequest {

    /**
     * Gets the AndroidForWorkEnterpriseWiFiConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AndroidForWorkEnterpriseWiFiConfiguration> callback);

    /**
     * Gets the AndroidForWorkEnterpriseWiFiConfiguration from the service
     *
     * @return the AndroidForWorkEnterpriseWiFiConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkEnterpriseWiFiConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AndroidForWorkEnterpriseWiFiConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidForWorkEnterpriseWiFiConfiguration with a source
     *
     * @param sourceAndroidForWorkEnterpriseWiFiConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidForWorkEnterpriseWiFiConfiguration sourceAndroidForWorkEnterpriseWiFiConfiguration, final ICallback<? super AndroidForWorkEnterpriseWiFiConfiguration> callback);

    /**
     * Patches this AndroidForWorkEnterpriseWiFiConfiguration with a source
     *
     * @param sourceAndroidForWorkEnterpriseWiFiConfiguration the source object with updates
     * @return the updated AndroidForWorkEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkEnterpriseWiFiConfiguration patch(final AndroidForWorkEnterpriseWiFiConfiguration sourceAndroidForWorkEnterpriseWiFiConfiguration) throws ClientException;

    /**
     * Posts a AndroidForWorkEnterpriseWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkEnterpriseWiFiConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidForWorkEnterpriseWiFiConfiguration newAndroidForWorkEnterpriseWiFiConfiguration, final ICallback<? super AndroidForWorkEnterpriseWiFiConfiguration> callback);

    /**
     * Posts a AndroidForWorkEnterpriseWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkEnterpriseWiFiConfiguration the new object to create
     * @return the created AndroidForWorkEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkEnterpriseWiFiConfiguration post(final AndroidForWorkEnterpriseWiFiConfiguration newAndroidForWorkEnterpriseWiFiConfiguration) throws ClientException;

    /**
     * Posts a AndroidForWorkEnterpriseWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkEnterpriseWiFiConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AndroidForWorkEnterpriseWiFiConfiguration newAndroidForWorkEnterpriseWiFiConfiguration, final ICallback<? super AndroidForWorkEnterpriseWiFiConfiguration> callback);

    /**
     * Posts a AndroidForWorkEnterpriseWiFiConfiguration with a new object
     *
     * @param newAndroidForWorkEnterpriseWiFiConfiguration the object to create/update
     * @return the created AndroidForWorkEnterpriseWiFiConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkEnterpriseWiFiConfiguration put(final AndroidForWorkEnterpriseWiFiConfiguration newAndroidForWorkEnterpriseWiFiConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidForWorkEnterpriseWiFiConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidForWorkEnterpriseWiFiConfigurationRequest expand(final String value);

}

