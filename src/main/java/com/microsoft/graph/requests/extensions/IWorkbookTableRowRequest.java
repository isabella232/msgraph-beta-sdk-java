// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookTableRow;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Table Row Request.
 */
public interface IWorkbookTableRowRequest extends IHttpRequest {

    /**
     * Gets the WorkbookTableRow from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super WorkbookTableRow> callback);

    /**
     * Gets the WorkbookTableRow from the service
     *
     * @return the WorkbookTableRow from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookTableRow get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super WorkbookTableRow> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookTableRow with a source
     *
     * @param sourceWorkbookTableRow the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookTableRow sourceWorkbookTableRow, final ICallback<? super WorkbookTableRow> callback);

    /**
     * Patches this WorkbookTableRow with a source
     *
     * @param sourceWorkbookTableRow the source object with updates
     * @return the updated WorkbookTableRow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookTableRow patch(final WorkbookTableRow sourceWorkbookTableRow) throws ClientException;

    /**
     * Posts a WorkbookTableRow with a new object
     *
     * @param newWorkbookTableRow the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookTableRow newWorkbookTableRow, final ICallback<? super WorkbookTableRow> callback);

    /**
     * Posts a WorkbookTableRow with a new object
     *
     * @param newWorkbookTableRow the new object to create
     * @return the created WorkbookTableRow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookTableRow post(final WorkbookTableRow newWorkbookTableRow) throws ClientException;

    /**
     * Posts a WorkbookTableRow with a new object
     *
     * @param newWorkbookTableRow the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final WorkbookTableRow newWorkbookTableRow, final ICallback<? super WorkbookTableRow> callback);

    /**
     * Posts a WorkbookTableRow with a new object
     *
     * @param newWorkbookTableRow the object to create/update
     * @return the created WorkbookTableRow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookTableRow put(final WorkbookTableRow newWorkbookTableRow) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookTableRowRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookTableRowRequest expand(final String value);

}

