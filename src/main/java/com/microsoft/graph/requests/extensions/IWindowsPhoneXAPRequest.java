// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsPhoneXAP;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Phone XAPRequest.
 */
public interface IWindowsPhoneXAPRequest extends IHttpRequest {

    /**
     * Gets the WindowsPhoneXAP from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WindowsPhoneXAP> callback);

    /**
     * Gets the WindowsPhoneXAP from the service
     *
     * @return the WindowsPhoneXAP from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhoneXAP get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<WindowsPhoneXAP> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WindowsPhoneXAP with a source
     *
     * @param sourceWindowsPhoneXAP the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WindowsPhoneXAP sourceWindowsPhoneXAP, final ICallback<WindowsPhoneXAP> callback);

    /**
     * Patches this WindowsPhoneXAP with a source
     *
     * @param sourceWindowsPhoneXAP the source object with updates
     * @return the updated WindowsPhoneXAP
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhoneXAP patch(final WindowsPhoneXAP sourceWindowsPhoneXAP) throws ClientException;

    /**
     * Posts a WindowsPhoneXAP with a new object
     *
     * @param newWindowsPhoneXAP the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WindowsPhoneXAP newWindowsPhoneXAP, final ICallback<WindowsPhoneXAP> callback);

    /**
     * Posts a WindowsPhoneXAP with a new object
     *
     * @param newWindowsPhoneXAP the new object to create
     * @return the created WindowsPhoneXAP
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WindowsPhoneXAP post(final WindowsPhoneXAP newWindowsPhoneXAP) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsPhoneXAPRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsPhoneXAPRequest expand(final String value);

}

