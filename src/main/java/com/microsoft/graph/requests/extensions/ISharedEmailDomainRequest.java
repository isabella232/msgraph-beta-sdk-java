// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SharedEmailDomain;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Shared Email Domain Request.
 */
public interface ISharedEmailDomainRequest extends IHttpRequest {

    /**
     * Gets the SharedEmailDomain from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SharedEmailDomain> callback);

    /**
     * Gets the SharedEmailDomain from the service
     *
     * @return the SharedEmailDomain from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharedEmailDomain get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SharedEmailDomain> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SharedEmailDomain with a source
     *
     * @param sourceSharedEmailDomain the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SharedEmailDomain sourceSharedEmailDomain, final ICallback<? super SharedEmailDomain> callback);

    /**
     * Patches this SharedEmailDomain with a source
     *
     * @param sourceSharedEmailDomain the source object with updates
     * @return the updated SharedEmailDomain
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharedEmailDomain patch(final SharedEmailDomain sourceSharedEmailDomain) throws ClientException;

    /**
     * Posts a SharedEmailDomain with a new object
     *
     * @param newSharedEmailDomain the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SharedEmailDomain newSharedEmailDomain, final ICallback<? super SharedEmailDomain> callback);

    /**
     * Posts a SharedEmailDomain with a new object
     *
     * @param newSharedEmailDomain the new object to create
     * @return the created SharedEmailDomain
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharedEmailDomain post(final SharedEmailDomain newSharedEmailDomain) throws ClientException;

    /**
     * Posts a SharedEmailDomain with a new object
     *
     * @param newSharedEmailDomain the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SharedEmailDomain newSharedEmailDomain, final ICallback<? super SharedEmailDomain> callback);

    /**
     * Posts a SharedEmailDomain with a new object
     *
     * @param newSharedEmailDomain the object to create/update
     * @return the created SharedEmailDomain
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharedEmailDomain put(final SharedEmailDomain newSharedEmailDomain) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISharedEmailDomainRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISharedEmailDomainRequest expand(final String value);

}

