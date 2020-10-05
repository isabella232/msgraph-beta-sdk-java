// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ItemFacet;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Item Facet Request.
 */
public interface IItemFacetRequest extends IHttpRequest {

    /**
     * Gets the ItemFacet from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super ItemFacet> callback);

    /**
     * Gets the ItemFacet from the service
     *
     * @return the ItemFacet from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemFacet get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super ItemFacet> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ItemFacet with a source
     *
     * @param sourceItemFacet the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ItemFacet sourceItemFacet, final ICallback<? super ItemFacet> callback);

    /**
     * Patches this ItemFacet with a source
     *
     * @param sourceItemFacet the source object with updates
     * @return the updated ItemFacet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemFacet patch(final ItemFacet sourceItemFacet) throws ClientException;

    /**
     * Posts a ItemFacet with a new object
     *
     * @param newItemFacet the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ItemFacet newItemFacet, final ICallback<? super ItemFacet> callback);

    /**
     * Posts a ItemFacet with a new object
     *
     * @param newItemFacet the new object to create
     * @return the created ItemFacet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemFacet post(final ItemFacet newItemFacet) throws ClientException;

    /**
     * Posts a ItemFacet with a new object
     *
     * @param newItemFacet the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final ItemFacet newItemFacet, final ICallback<? super ItemFacet> callback);

    /**
     * Posts a ItemFacet with a new object
     *
     * @param newItemFacet the object to create/update
     * @return the created ItemFacet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ItemFacet put(final ItemFacet newItemFacet) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IItemFacetRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IItemFacetRequest expand(final String value);

}

