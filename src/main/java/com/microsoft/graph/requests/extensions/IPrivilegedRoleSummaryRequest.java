// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrivilegedRoleSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Summary Request.
 */
public interface IPrivilegedRoleSummaryRequest extends IHttpRequest {

    /**
     * Gets the PrivilegedRoleSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<PrivilegedRoleSummary> callback);

    /**
     * Gets the PrivilegedRoleSummary from the service
     *
     * @return the PrivilegedRoleSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrivilegedRoleSummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<PrivilegedRoleSummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PrivilegedRoleSummary with a source
     *
     * @param sourcePrivilegedRoleSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PrivilegedRoleSummary sourcePrivilegedRoleSummary, final ICallback<PrivilegedRoleSummary> callback);

    /**
     * Patches this PrivilegedRoleSummary with a source
     *
     * @param sourcePrivilegedRoleSummary the source object with updates
     * @return the updated PrivilegedRoleSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrivilegedRoleSummary patch(final PrivilegedRoleSummary sourcePrivilegedRoleSummary) throws ClientException;

    /**
     * Posts a PrivilegedRoleSummary with a new object
     *
     * @param newPrivilegedRoleSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PrivilegedRoleSummary newPrivilegedRoleSummary, final ICallback<PrivilegedRoleSummary> callback);

    /**
     * Posts a PrivilegedRoleSummary with a new object
     *
     * @param newPrivilegedRoleSummary the new object to create
     * @return the created PrivilegedRoleSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrivilegedRoleSummary post(final PrivilegedRoleSummary newPrivilegedRoleSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrivilegedRoleSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrivilegedRoleSummaryRequest expand(final String value);

}
