// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AccessPackageResourceScope;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Resource Scope Request.
 */
public interface IAccessPackageResourceScopeRequest extends IHttpRequest {

    /**
     * Gets the AccessPackageResourceScope from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super AccessPackageResourceScope> callback);

    /**
     * Gets the AccessPackageResourceScope from the service
     *
     * @return the AccessPackageResourceScope from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageResourceScope get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super AccessPackageResourceScope> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AccessPackageResourceScope with a source
     *
     * @param sourceAccessPackageResourceScope the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AccessPackageResourceScope sourceAccessPackageResourceScope, final ICallback<? super AccessPackageResourceScope> callback);

    /**
     * Patches this AccessPackageResourceScope with a source
     *
     * @param sourceAccessPackageResourceScope the source object with updates
     * @return the updated AccessPackageResourceScope
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageResourceScope patch(final AccessPackageResourceScope sourceAccessPackageResourceScope) throws ClientException;

    /**
     * Posts a AccessPackageResourceScope with a new object
     *
     * @param newAccessPackageResourceScope the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AccessPackageResourceScope newAccessPackageResourceScope, final ICallback<? super AccessPackageResourceScope> callback);

    /**
     * Posts a AccessPackageResourceScope with a new object
     *
     * @param newAccessPackageResourceScope the new object to create
     * @return the created AccessPackageResourceScope
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageResourceScope post(final AccessPackageResourceScope newAccessPackageResourceScope) throws ClientException;

    /**
     * Posts a AccessPackageResourceScope with a new object
     *
     * @param newAccessPackageResourceScope the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final AccessPackageResourceScope newAccessPackageResourceScope, final ICallback<? super AccessPackageResourceScope> callback);

    /**
     * Posts a AccessPackageResourceScope with a new object
     *
     * @param newAccessPackageResourceScope the object to create/update
     * @return the created AccessPackageResourceScope
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AccessPackageResourceScope put(final AccessPackageResourceScope newAccessPackageResourceScope) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAccessPackageResourceScopeRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAccessPackageResourceScopeRequest expand(final String value);

}

