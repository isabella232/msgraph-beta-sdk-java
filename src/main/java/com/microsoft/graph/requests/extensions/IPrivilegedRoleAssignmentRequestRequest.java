// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Assignment Request Request.
 */
public interface IPrivilegedRoleAssignmentRequestRequest extends IHttpRequest {

    /**
     * Gets the PrivilegedRoleAssignmentRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super PrivilegedRoleAssignmentRequest> callback);

    /**
     * Gets the PrivilegedRoleAssignmentRequest from the service
     *
     * @return the PrivilegedRoleAssignmentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrivilegedRoleAssignmentRequest get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super PrivilegedRoleAssignmentRequest> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this PrivilegedRoleAssignmentRequest with a source
     *
     * @param sourcePrivilegedRoleAssignmentRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final PrivilegedRoleAssignmentRequest sourcePrivilegedRoleAssignmentRequest, final ICallback<? super PrivilegedRoleAssignmentRequest> callback);

    /**
     * Patches this PrivilegedRoleAssignmentRequest with a source
     *
     * @param sourcePrivilegedRoleAssignmentRequest the source object with updates
     * @return the updated PrivilegedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrivilegedRoleAssignmentRequest patch(final PrivilegedRoleAssignmentRequest sourcePrivilegedRoleAssignmentRequest) throws ClientException;

    /**
     * Posts a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest, final ICallback<? super PrivilegedRoleAssignmentRequest> callback);

    /**
     * Posts a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the new object to create
     * @return the created PrivilegedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrivilegedRoleAssignmentRequest post(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest) throws ClientException;

    /**
     * Posts a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest, final ICallback<? super PrivilegedRoleAssignmentRequest> callback);

    /**
     * Posts a PrivilegedRoleAssignmentRequest with a new object
     *
     * @param newPrivilegedRoleAssignmentRequest the object to create/update
     * @return the created PrivilegedRoleAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    PrivilegedRoleAssignmentRequest put(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrivilegedRoleAssignmentRequestRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrivilegedRoleAssignmentRequestRequest expand(final String value);

}

