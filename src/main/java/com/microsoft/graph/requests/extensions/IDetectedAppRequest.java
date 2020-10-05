// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DetectedApp;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Detected App Request.
 */
public interface IDetectedAppRequest extends IHttpRequest {

    /**
     * Gets the DetectedApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DetectedApp> callback);

    /**
     * Gets the DetectedApp from the service
     *
     * @return the DetectedApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DetectedApp get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DetectedApp> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DetectedApp with a source
     *
     * @param sourceDetectedApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DetectedApp sourceDetectedApp, final ICallback<? super DetectedApp> callback);

    /**
     * Patches this DetectedApp with a source
     *
     * @param sourceDetectedApp the source object with updates
     * @return the updated DetectedApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DetectedApp patch(final DetectedApp sourceDetectedApp) throws ClientException;

    /**
     * Posts a DetectedApp with a new object
     *
     * @param newDetectedApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DetectedApp newDetectedApp, final ICallback<? super DetectedApp> callback);

    /**
     * Posts a DetectedApp with a new object
     *
     * @param newDetectedApp the new object to create
     * @return the created DetectedApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DetectedApp post(final DetectedApp newDetectedApp) throws ClientException;

    /**
     * Posts a DetectedApp with a new object
     *
     * @param newDetectedApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DetectedApp newDetectedApp, final ICallback<? super DetectedApp> callback);

    /**
     * Posts a DetectedApp with a new object
     *
     * @param newDetectedApp the object to create/update
     * @return the created DetectedApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DetectedApp put(final DetectedApp newDetectedApp) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDetectedAppRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDetectedAppRequest expand(final String value);

}

