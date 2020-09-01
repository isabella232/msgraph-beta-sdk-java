// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookRangeBorder;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Range Border Request.
 */
public interface IWorkbookRangeBorderRequest extends IHttpRequest {

    /**
     * Gets the WorkbookRangeBorder from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookRangeBorder> callback);

    /**
     * Gets the WorkbookRangeBorder from the service
     *
     * @return the WorkbookRangeBorder from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookRangeBorder get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<WorkbookRangeBorder> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookRangeBorder with a source
     *
     * @param sourceWorkbookRangeBorder the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookRangeBorder sourceWorkbookRangeBorder, final ICallback<WorkbookRangeBorder> callback);

    /**
     * Patches this WorkbookRangeBorder with a source
     *
     * @param sourceWorkbookRangeBorder the source object with updates
     * @return the updated WorkbookRangeBorder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookRangeBorder patch(final WorkbookRangeBorder sourceWorkbookRangeBorder) throws ClientException;

    /**
     * Posts a WorkbookRangeBorder with a new object
     *
     * @param newWorkbookRangeBorder the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookRangeBorder newWorkbookRangeBorder, final ICallback<WorkbookRangeBorder> callback);

    /**
     * Posts a WorkbookRangeBorder with a new object
     *
     * @param newWorkbookRangeBorder the new object to create
     * @return the created WorkbookRangeBorder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookRangeBorder post(final WorkbookRangeBorder newWorkbookRangeBorder) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookRangeBorderRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookRangeBorderRequest expand(final String value);

}
