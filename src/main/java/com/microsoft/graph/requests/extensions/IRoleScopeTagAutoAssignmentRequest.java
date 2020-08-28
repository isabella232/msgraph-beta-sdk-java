// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RoleScopeTagAutoAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Role Scope Tag Auto Assignment Request.
 */
public interface IRoleScopeTagAutoAssignmentRequest extends IHttpRequest {

    /**
     * Gets the RoleScopeTagAutoAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<RoleScopeTagAutoAssignment> callback);

    /**
     * Gets the RoleScopeTagAutoAssignment from the service
     *
     * @return the RoleScopeTagAutoAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RoleScopeTagAutoAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<RoleScopeTagAutoAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this RoleScopeTagAutoAssignment with a source
     *
     * @param sourceRoleScopeTagAutoAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final RoleScopeTagAutoAssignment sourceRoleScopeTagAutoAssignment, final ICallback<RoleScopeTagAutoAssignment> callback);

    /**
     * Patches this RoleScopeTagAutoAssignment with a source
     *
     * @param sourceRoleScopeTagAutoAssignment the source object with updates
     * @return the updated RoleScopeTagAutoAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RoleScopeTagAutoAssignment patch(final RoleScopeTagAutoAssignment sourceRoleScopeTagAutoAssignment) throws ClientException;

    /**
     * Posts a RoleScopeTagAutoAssignment with a new object
     *
     * @param newRoleScopeTagAutoAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final RoleScopeTagAutoAssignment newRoleScopeTagAutoAssignment, final ICallback<RoleScopeTagAutoAssignment> callback);

    /**
     * Posts a RoleScopeTagAutoAssignment with a new object
     *
     * @param newRoleScopeTagAutoAssignment the new object to create
     * @return the created RoleScopeTagAutoAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RoleScopeTagAutoAssignment post(final RoleScopeTagAutoAssignment newRoleScopeTagAutoAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IRoleScopeTagAutoAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IRoleScopeTagAutoAssignmentRequest expand(final String value);

}

