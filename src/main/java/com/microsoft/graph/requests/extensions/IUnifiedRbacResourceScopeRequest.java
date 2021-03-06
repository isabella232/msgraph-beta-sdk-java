// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UnifiedRbacResourceScope;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Rbac Resource Scope Request.
 */
public interface IUnifiedRbacResourceScopeRequest extends IHttpRequest {

    /**
     * Gets the UnifiedRbacResourceScope from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UnifiedRbacResourceScope> callback);

    /**
     * Gets the UnifiedRbacResourceScope from the service
     *
     * @return the UnifiedRbacResourceScope from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRbacResourceScope get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UnifiedRbacResourceScope> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UnifiedRbacResourceScope with a source
     *
     * @param sourceUnifiedRbacResourceScope the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UnifiedRbacResourceScope sourceUnifiedRbacResourceScope, final ICallback<? super UnifiedRbacResourceScope> callback);

    /**
     * Patches this UnifiedRbacResourceScope with a source
     *
     * @param sourceUnifiedRbacResourceScope the source object with updates
     * @return the updated UnifiedRbacResourceScope
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRbacResourceScope patch(final UnifiedRbacResourceScope sourceUnifiedRbacResourceScope) throws ClientException;

    /**
     * Posts a UnifiedRbacResourceScope with a new object
     *
     * @param newUnifiedRbacResourceScope the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UnifiedRbacResourceScope newUnifiedRbacResourceScope, final ICallback<? super UnifiedRbacResourceScope> callback);

    /**
     * Posts a UnifiedRbacResourceScope with a new object
     *
     * @param newUnifiedRbacResourceScope the new object to create
     * @return the created UnifiedRbacResourceScope
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRbacResourceScope post(final UnifiedRbacResourceScope newUnifiedRbacResourceScope) throws ClientException;

    /**
     * Posts a UnifiedRbacResourceScope with a new object
     *
     * @param newUnifiedRbacResourceScope the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UnifiedRbacResourceScope newUnifiedRbacResourceScope, final ICallback<? super UnifiedRbacResourceScope> callback);

    /**
     * Posts a UnifiedRbacResourceScope with a new object
     *
     * @param newUnifiedRbacResourceScope the object to create/update
     * @return the created UnifiedRbacResourceScope
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UnifiedRbacResourceScope put(final UnifiedRbacResourceScope newUnifiedRbacResourceScope) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUnifiedRbacResourceScopeRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUnifiedRbacResourceScopeRequest expand(final String value);

}

