// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ImportedWindowsAutopilotDeviceIdentityUpload;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Imported Windows Autopilot Device Identity Upload Request.
 */
public interface IImportedWindowsAutopilotDeviceIdentityUploadRequest extends IHttpRequest {

    /**
     * Gets the ImportedWindowsAutopilotDeviceIdentityUpload from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ImportedWindowsAutopilotDeviceIdentityUpload> callback);

    /**
     * Gets the ImportedWindowsAutopilotDeviceIdentityUpload from the service
     *
     * @return the ImportedWindowsAutopilotDeviceIdentityUpload from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ImportedWindowsAutopilotDeviceIdentityUpload get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ImportedWindowsAutopilotDeviceIdentityUpload> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ImportedWindowsAutopilotDeviceIdentityUpload with a source
     *
     * @param sourceImportedWindowsAutopilotDeviceIdentityUpload the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ImportedWindowsAutopilotDeviceIdentityUpload sourceImportedWindowsAutopilotDeviceIdentityUpload, final ICallback<ImportedWindowsAutopilotDeviceIdentityUpload> callback);

    /**
     * Patches this ImportedWindowsAutopilotDeviceIdentityUpload with a source
     *
     * @param sourceImportedWindowsAutopilotDeviceIdentityUpload the source object with updates
     * @return the updated ImportedWindowsAutopilotDeviceIdentityUpload
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ImportedWindowsAutopilotDeviceIdentityUpload patch(final ImportedWindowsAutopilotDeviceIdentityUpload sourceImportedWindowsAutopilotDeviceIdentityUpload) throws ClientException;

    /**
     * Posts a ImportedWindowsAutopilotDeviceIdentityUpload with a new object
     *
     * @param newImportedWindowsAutopilotDeviceIdentityUpload the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ImportedWindowsAutopilotDeviceIdentityUpload newImportedWindowsAutopilotDeviceIdentityUpload, final ICallback<ImportedWindowsAutopilotDeviceIdentityUpload> callback);

    /**
     * Posts a ImportedWindowsAutopilotDeviceIdentityUpload with a new object
     *
     * @param newImportedWindowsAutopilotDeviceIdentityUpload the new object to create
     * @return the created ImportedWindowsAutopilotDeviceIdentityUpload
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ImportedWindowsAutopilotDeviceIdentityUpload post(final ImportedWindowsAutopilotDeviceIdentityUpload newImportedWindowsAutopilotDeviceIdentityUpload) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IImportedWindowsAutopilotDeviceIdentityUploadRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IImportedWindowsAutopilotDeviceIdentityUploadRequest expand(final String value);

}

