// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Assignment Request Request.
 */
public interface IAccessPackageAssignmentRequestRequest extends IHttpRequest {

    /**
     * Gets the AccessPackageAssignmentRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AccessPackageAssignmentRequest> callback);

    /**
     * Gets the AccessPackageAssignmentRequest from the service
     *
     * @return the AccessPackageAssignmentRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageAssignmentRequest get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AccessPackageAssignmentRequest> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AccessPackageAssignmentRequest with a source
     *
     * @param sourceAccessPackageAssignmentRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AccessPackageAssignmentRequest sourceAccessPackageAssignmentRequest, final ICallback<? super AccessPackageAssignmentRequest> callback);

    /**
     * Patches this AccessPackageAssignmentRequest with a source
     *
     * @param sourceAccessPackageAssignmentRequest the source object with updates
     * @return the updated AccessPackageAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageAssignmentRequest patch(final AccessPackageAssignmentRequest sourceAccessPackageAssignmentRequest) throws ClientException;

    /**
     * Posts a AccessPackageAssignmentRequest with a new object
     *
     * @param newAccessPackageAssignmentRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AccessPackageAssignmentRequest newAccessPackageAssignmentRequest, final ICallback<? super AccessPackageAssignmentRequest> callback);

    /**
     * Posts a AccessPackageAssignmentRequest with a new object
     *
     * @param newAccessPackageAssignmentRequest the new object to create
     * @return the created AccessPackageAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageAssignmentRequest post(final AccessPackageAssignmentRequest newAccessPackageAssignmentRequest) throws ClientException;

    /**
     * Posts a AccessPackageAssignmentRequest with a new object
     *
     * @param newAccessPackageAssignmentRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AccessPackageAssignmentRequest newAccessPackageAssignmentRequest, final ICallback<? super AccessPackageAssignmentRequest> callback);

    /**
     * Posts a AccessPackageAssignmentRequest with a new object
     *
     * @param newAccessPackageAssignmentRequest the object to create/update
     * @return the created AccessPackageAssignmentRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageAssignmentRequest put(final AccessPackageAssignmentRequest newAccessPackageAssignmentRequest) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessPackageAssignmentRequestRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessPackageAssignmentRequestRequest expand(final String value);

}

