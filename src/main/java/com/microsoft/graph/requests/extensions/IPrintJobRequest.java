// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrintJob;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Job Request.
 */
public interface IPrintJobRequest extends IHttpRequest {

    /**
     * Gets the PrintJob from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PrintJob> callback);

    /**
     * Gets the PrintJob from the service
     *
     * @return the PrintJob from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintJob get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PrintJob> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PrintJob with a source
     *
     * @param sourcePrintJob the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PrintJob sourcePrintJob, final ICallback<? super PrintJob> callback);

    /**
     * Patches this PrintJob with a source
     *
     * @param sourcePrintJob the source object with updates
     * @return the updated PrintJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintJob patch(final PrintJob sourcePrintJob) throws ClientException;

    /**
     * Posts a PrintJob with a new object
     *
     * @param newPrintJob the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PrintJob newPrintJob, final ICallback<? super PrintJob> callback);

    /**
     * Posts a PrintJob with a new object
     *
     * @param newPrintJob the new object to create
     * @return the created PrintJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintJob post(final PrintJob newPrintJob) throws ClientException;

    /**
     * Posts a PrintJob with a new object
     *
     * @param newPrintJob the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PrintJob newPrintJob, final ICallback<? super PrintJob> callback);

    /**
     * Posts a PrintJob with a new object
     *
     * @param newPrintJob the object to create/update
     * @return the created PrintJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintJob put(final PrintJob newPrintJob) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrintJobRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrintJobRequest expand(final String value);

}

