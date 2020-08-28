// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrintUsageSummaryByUser;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Usage Summary By User Request.
 */
public interface IPrintUsageSummaryByUserRequest extends IHttpRequest {

    /**
     * Gets the PrintUsageSummaryByUser from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<PrintUsageSummaryByUser> callback);

    /**
     * Gets the PrintUsageSummaryByUser from the service
     *
     * @return the PrintUsageSummaryByUser from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageSummaryByUser get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<PrintUsageSummaryByUser> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PrintUsageSummaryByUser with a source
     *
     * @param sourcePrintUsageSummaryByUser the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PrintUsageSummaryByUser sourcePrintUsageSummaryByUser, final ICallback<PrintUsageSummaryByUser> callback);

    /**
     * Patches this PrintUsageSummaryByUser with a source
     *
     * @param sourcePrintUsageSummaryByUser the source object with updates
     * @return the updated PrintUsageSummaryByUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageSummaryByUser patch(final PrintUsageSummaryByUser sourcePrintUsageSummaryByUser) throws ClientException;

    /**
     * Posts a PrintUsageSummaryByUser with a new object
     *
     * @param newPrintUsageSummaryByUser the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PrintUsageSummaryByUser newPrintUsageSummaryByUser, final ICallback<PrintUsageSummaryByUser> callback);

    /**
     * Posts a PrintUsageSummaryByUser with a new object
     *
     * @param newPrintUsageSummaryByUser the new object to create
     * @return the created PrintUsageSummaryByUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrintUsageSummaryByUser post(final PrintUsageSummaryByUser newPrintUsageSummaryByUser) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrintUsageSummaryByUserRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrintUsageSummaryByUserRequest expand(final String value);

}

