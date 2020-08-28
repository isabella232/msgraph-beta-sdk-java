// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.YammerActivitySummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Yammer Activity Summary Request.
 */
public interface IYammerActivitySummaryRequest extends IHttpRequest {

    /**
     * Gets the YammerActivitySummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<YammerActivitySummary> callback);

    /**
     * Gets the YammerActivitySummary from the service
     *
     * @return the YammerActivitySummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    YammerActivitySummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<YammerActivitySummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this YammerActivitySummary with a source
     *
     * @param sourceYammerActivitySummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final YammerActivitySummary sourceYammerActivitySummary, final ICallback<YammerActivitySummary> callback);

    /**
     * Patches this YammerActivitySummary with a source
     *
     * @param sourceYammerActivitySummary the source object with updates
     * @return the updated YammerActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    YammerActivitySummary patch(final YammerActivitySummary sourceYammerActivitySummary) throws ClientException;

    /**
     * Posts a YammerActivitySummary with a new object
     *
     * @param newYammerActivitySummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final YammerActivitySummary newYammerActivitySummary, final ICallback<YammerActivitySummary> callback);

    /**
     * Posts a YammerActivitySummary with a new object
     *
     * @param newYammerActivitySummary the new object to create
     * @return the created YammerActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    YammerActivitySummary post(final YammerActivitySummary newYammerActivitySummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IYammerActivitySummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IYammerActivitySummaryRequest expand(final String value);

}

