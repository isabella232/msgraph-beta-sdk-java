// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;
import com.microsoft.graph.termstore.models.extensions.Set;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Set Request.
 */
public interface ISetRequest extends IHttpRequest {

    /**
     * Gets the Set from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<Set> callback);

    /**
     * Gets the Set from the service
     *
     * @return the Set from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Set get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<Set> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Set with a source
     *
     * @param sourceSet the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Set sourceSet, final ICallback<Set> callback);

    /**
     * Patches this Set with a source
     *
     * @param sourceSet the source object with updates
     * @return the updated Set
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Set patch(final Set sourceSet) throws ClientException;

    /**
     * Posts a Set with a new object
     *
     * @param newSet the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Set newSet, final ICallback<Set> callback);

    /**
     * Posts a Set with a new object
     *
     * @param newSet the new object to create
     * @return the created Set
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Set post(final Set newSet) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISetRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISetRequest expand(final String value);

}

