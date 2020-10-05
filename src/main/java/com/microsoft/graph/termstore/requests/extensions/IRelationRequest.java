// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;
import com.microsoft.graph.termstore.models.extensions.Relation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Relation Request.
 */
public interface IRelationRequest extends IHttpRequest {

    /**
     * Gets the Relation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Relation> callback);

    /**
     * Gets the Relation from the service
     *
     * @return the Relation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Relation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Relation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Relation with a source
     *
     * @param sourceRelation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Relation sourceRelation, final ICallback<? super Relation> callback);

    /**
     * Patches this Relation with a source
     *
     * @param sourceRelation the source object with updates
     * @return the updated Relation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Relation patch(final Relation sourceRelation) throws ClientException;

    /**
     * Posts a Relation with a new object
     *
     * @param newRelation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Relation newRelation, final ICallback<? super Relation> callback);

    /**
     * Posts a Relation with a new object
     *
     * @param newRelation the new object to create
     * @return the created Relation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Relation post(final Relation newRelation) throws ClientException;

    /**
     * Posts a Relation with a new object
     *
     * @param newRelation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Relation newRelation, final ICallback<? super Relation> callback);

    /**
     * Posts a Relation with a new object
     *
     * @param newRelation the object to create/update
     * @return the created Relation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Relation put(final Relation newRelation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IRelationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IRelationRequest expand(final String value);

}

