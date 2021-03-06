// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsUniversalAppXContainedApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Universal App XContained App Request.
 */
public interface IWindowsUniversalAppXContainedAppRequest extends IHttpRequest {

    /**
     * Gets the WindowsUniversalAppXContainedApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WindowsUniversalAppXContainedApp> callback);

    /**
     * Gets the WindowsUniversalAppXContainedApp from the service
     *
     * @return the WindowsUniversalAppXContainedApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsUniversalAppXContainedApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WindowsUniversalAppXContainedApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsUniversalAppXContainedApp with a source
     *
     * @param sourceWindowsUniversalAppXContainedApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsUniversalAppXContainedApp sourceWindowsUniversalAppXContainedApp, final ICallback<? super WindowsUniversalAppXContainedApp> callback);

    /**
     * Patches this WindowsUniversalAppXContainedApp with a source
     *
     * @param sourceWindowsUniversalAppXContainedApp the source object with updates
     * @return the updated WindowsUniversalAppXContainedApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsUniversalAppXContainedApp patch(final WindowsUniversalAppXContainedApp sourceWindowsUniversalAppXContainedApp) throws ClientException;

    /**
     * Posts a WindowsUniversalAppXContainedApp with a new object
     *
     * @param newWindowsUniversalAppXContainedApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsUniversalAppXContainedApp newWindowsUniversalAppXContainedApp, final ICallback<? super WindowsUniversalAppXContainedApp> callback);

    /**
     * Posts a WindowsUniversalAppXContainedApp with a new object
     *
     * @param newWindowsUniversalAppXContainedApp the new object to create
     * @return the created WindowsUniversalAppXContainedApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsUniversalAppXContainedApp post(final WindowsUniversalAppXContainedApp newWindowsUniversalAppXContainedApp) throws ClientException;

    /**
     * Posts a WindowsUniversalAppXContainedApp with a new object
     *
     * @param newWindowsUniversalAppXContainedApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WindowsUniversalAppXContainedApp newWindowsUniversalAppXContainedApp, final ICallback<? super WindowsUniversalAppXContainedApp> callback);

    /**
     * Posts a WindowsUniversalAppXContainedApp with a new object
     *
     * @param newWindowsUniversalAppXContainedApp the object to create/update
     * @return the created WindowsUniversalAppXContainedApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsUniversalAppXContainedApp put(final WindowsUniversalAppXContainedApp newWindowsUniversalAppXContainedApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsUniversalAppXContainedAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsUniversalAppXContainedAppRequest expand(final String value);

}

