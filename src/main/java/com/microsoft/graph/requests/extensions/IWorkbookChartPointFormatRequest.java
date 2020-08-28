// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookChartPointFormat;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Point Format Request.
 */
public interface IWorkbookChartPointFormatRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartPointFormat from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<WorkbookChartPointFormat> callback);

    /**
     * Gets the WorkbookChartPointFormat from the service
     *
     * @return the WorkbookChartPointFormat from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartPointFormat get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<WorkbookChartPointFormat> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookChartPointFormat with a source
     *
     * @param sourceWorkbookChartPointFormat the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final WorkbookChartPointFormat sourceWorkbookChartPointFormat, final ICallback<WorkbookChartPointFormat> callback);

    /**
     * Patches this WorkbookChartPointFormat with a source
     *
     * @param sourceWorkbookChartPointFormat the source object with updates
     * @return the updated WorkbookChartPointFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartPointFormat patch(final WorkbookChartPointFormat sourceWorkbookChartPointFormat) throws ClientException;

    /**
     * Posts a WorkbookChartPointFormat with a new object
     *
     * @param newWorkbookChartPointFormat the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final WorkbookChartPointFormat newWorkbookChartPointFormat, final ICallback<WorkbookChartPointFormat> callback);

    /**
     * Posts a WorkbookChartPointFormat with a new object
     *
     * @param newWorkbookChartPointFormat the new object to create
     * @return the created WorkbookChartPointFormat
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    WorkbookChartPointFormat post(final WorkbookChartPointFormat newWorkbookChartPointFormat) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWorkbookChartPointFormatRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWorkbookChartPointFormatRequest expand(final String value);

}

