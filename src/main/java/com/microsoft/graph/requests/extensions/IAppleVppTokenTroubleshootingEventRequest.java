// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AppleVppTokenTroubleshootingEvent;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Apple Vpp Token Troubleshooting Event Request.
 */
public interface IAppleVppTokenTroubleshootingEventRequest extends IHttpRequest {

    /**
     * Gets the AppleVppTokenTroubleshootingEvent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AppleVppTokenTroubleshootingEvent> callback);

    /**
     * Gets the AppleVppTokenTroubleshootingEvent from the service
     *
     * @return the AppleVppTokenTroubleshootingEvent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppleVppTokenTroubleshootingEvent get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AppleVppTokenTroubleshootingEvent> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AppleVppTokenTroubleshootingEvent with a source
     *
     * @param sourceAppleVppTokenTroubleshootingEvent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AppleVppTokenTroubleshootingEvent sourceAppleVppTokenTroubleshootingEvent, final ICallback<? super AppleVppTokenTroubleshootingEvent> callback);

    /**
     * Patches this AppleVppTokenTroubleshootingEvent with a source
     *
     * @param sourceAppleVppTokenTroubleshootingEvent the source object with updates
     * @return the updated AppleVppTokenTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppleVppTokenTroubleshootingEvent patch(final AppleVppTokenTroubleshootingEvent sourceAppleVppTokenTroubleshootingEvent) throws ClientException;

    /**
     * Posts a AppleVppTokenTroubleshootingEvent with a new object
     *
     * @param newAppleVppTokenTroubleshootingEvent the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AppleVppTokenTroubleshootingEvent newAppleVppTokenTroubleshootingEvent, final ICallback<? super AppleVppTokenTroubleshootingEvent> callback);

    /**
     * Posts a AppleVppTokenTroubleshootingEvent with a new object
     *
     * @param newAppleVppTokenTroubleshootingEvent the new object to create
     * @return the created AppleVppTokenTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppleVppTokenTroubleshootingEvent post(final AppleVppTokenTroubleshootingEvent newAppleVppTokenTroubleshootingEvent) throws ClientException;

    /**
     * Posts a AppleVppTokenTroubleshootingEvent with a new object
     *
     * @param newAppleVppTokenTroubleshootingEvent the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AppleVppTokenTroubleshootingEvent newAppleVppTokenTroubleshootingEvent, final ICallback<? super AppleVppTokenTroubleshootingEvent> callback);

    /**
     * Posts a AppleVppTokenTroubleshootingEvent with a new object
     *
     * @param newAppleVppTokenTroubleshootingEvent the object to create/update
     * @return the created AppleVppTokenTroubleshootingEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AppleVppTokenTroubleshootingEvent put(final AppleVppTokenTroubleshootingEvent newAppleVppTokenTroubleshootingEvent) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAppleVppTokenTroubleshootingEventRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAppleVppTokenTroubleshootingEventRequest expand(final String value);

}

