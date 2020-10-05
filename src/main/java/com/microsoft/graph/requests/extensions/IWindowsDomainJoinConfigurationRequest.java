// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsDomainJoinConfiguration;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Domain Join Configuration Request.
 */
public interface IWindowsDomainJoinConfigurationRequest extends IHttpRequest {

    /**
     * Gets the WindowsDomainJoinConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WindowsDomainJoinConfiguration> callback);

    /**
     * Gets the WindowsDomainJoinConfiguration from the service
     *
     * @return the WindowsDomainJoinConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDomainJoinConfiguration get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WindowsDomainJoinConfiguration> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsDomainJoinConfiguration with a source
     *
     * @param sourceWindowsDomainJoinConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsDomainJoinConfiguration sourceWindowsDomainJoinConfiguration, final ICallback<? super WindowsDomainJoinConfiguration> callback);

    /**
     * Patches this WindowsDomainJoinConfiguration with a source
     *
     * @param sourceWindowsDomainJoinConfiguration the source object with updates
     * @return the updated WindowsDomainJoinConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDomainJoinConfiguration patch(final WindowsDomainJoinConfiguration sourceWindowsDomainJoinConfiguration) throws ClientException;

    /**
     * Posts a WindowsDomainJoinConfiguration with a new object
     *
     * @param newWindowsDomainJoinConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsDomainJoinConfiguration newWindowsDomainJoinConfiguration, final ICallback<? super WindowsDomainJoinConfiguration> callback);

    /**
     * Posts a WindowsDomainJoinConfiguration with a new object
     *
     * @param newWindowsDomainJoinConfiguration the new object to create
     * @return the created WindowsDomainJoinConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDomainJoinConfiguration post(final WindowsDomainJoinConfiguration newWindowsDomainJoinConfiguration) throws ClientException;

    /**
     * Posts a WindowsDomainJoinConfiguration with a new object
     *
     * @param newWindowsDomainJoinConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsDomainJoinConfiguration newWindowsDomainJoinConfiguration, final ICallback<? super WindowsDomainJoinConfiguration> callback);

    /**
     * Posts a WindowsDomainJoinConfiguration with a new object
     *
     * @param newWindowsDomainJoinConfiguration the object to create/update
     * @return the created WindowsDomainJoinConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsDomainJoinConfiguration put(final WindowsDomainJoinConfiguration newWindowsDomainJoinConfiguration) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsDomainJoinConfigurationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsDomainJoinConfigurationRequest expand(final String value);

}

