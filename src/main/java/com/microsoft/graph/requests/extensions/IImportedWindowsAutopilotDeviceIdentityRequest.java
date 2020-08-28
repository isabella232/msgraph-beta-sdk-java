// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ImportedWindowsAutopilotDeviceIdentity;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Imported Windows Autopilot Device Identity Request.
 */
public interface IImportedWindowsAutopilotDeviceIdentityRequest extends IHttpRequest {

    /**
     * Gets the ImportedWindowsAutopilotDeviceIdentity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ImportedWindowsAutopilotDeviceIdentity> callback);

    /**
     * Gets the ImportedWindowsAutopilotDeviceIdentity from the service
     *
     * @return the ImportedWindowsAutopilotDeviceIdentity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ImportedWindowsAutopilotDeviceIdentity get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ImportedWindowsAutopilotDeviceIdentity> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ImportedWindowsAutopilotDeviceIdentity with a source
     *
     * @param sourceImportedWindowsAutopilotDeviceIdentity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ImportedWindowsAutopilotDeviceIdentity sourceImportedWindowsAutopilotDeviceIdentity, final ICallback<ImportedWindowsAutopilotDeviceIdentity> callback);

    /**
     * Patches this ImportedWindowsAutopilotDeviceIdentity with a source
     *
     * @param sourceImportedWindowsAutopilotDeviceIdentity the source object with updates
     * @return the updated ImportedWindowsAutopilotDeviceIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ImportedWindowsAutopilotDeviceIdentity patch(final ImportedWindowsAutopilotDeviceIdentity sourceImportedWindowsAutopilotDeviceIdentity) throws ClientException;

    /**
     * Posts a ImportedWindowsAutopilotDeviceIdentity with a new object
     *
     * @param newImportedWindowsAutopilotDeviceIdentity the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ImportedWindowsAutopilotDeviceIdentity newImportedWindowsAutopilotDeviceIdentity, final ICallback<ImportedWindowsAutopilotDeviceIdentity> callback);

    /**
     * Posts a ImportedWindowsAutopilotDeviceIdentity with a new object
     *
     * @param newImportedWindowsAutopilotDeviceIdentity the new object to create
     * @return the created ImportedWindowsAutopilotDeviceIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ImportedWindowsAutopilotDeviceIdentity post(final ImportedWindowsAutopilotDeviceIdentity newImportedWindowsAutopilotDeviceIdentity) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IImportedWindowsAutopilotDeviceIdentityRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IImportedWindowsAutopilotDeviceIdentityRequest expand(final String value);

}

