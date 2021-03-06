// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TermsOfUseContainer;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Terms Of Use Container Request.
 */
public interface ITermsOfUseContainerRequest extends IHttpRequest {

    /**
     * Gets the TermsOfUseContainer from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TermsOfUseContainer> callback);

    /**
     * Gets the TermsOfUseContainer from the service
     *
     * @return the TermsOfUseContainer from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TermsOfUseContainer get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TermsOfUseContainer> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TermsOfUseContainer with a source
     *
     * @param sourceTermsOfUseContainer the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TermsOfUseContainer sourceTermsOfUseContainer, final ICallback<? super TermsOfUseContainer> callback);

    /**
     * Patches this TermsOfUseContainer with a source
     *
     * @param sourceTermsOfUseContainer the source object with updates
     * @return the updated TermsOfUseContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TermsOfUseContainer patch(final TermsOfUseContainer sourceTermsOfUseContainer) throws ClientException;

    /**
     * Posts a TermsOfUseContainer with a new object
     *
     * @param newTermsOfUseContainer the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TermsOfUseContainer newTermsOfUseContainer, final ICallback<? super TermsOfUseContainer> callback);

    /**
     * Posts a TermsOfUseContainer with a new object
     *
     * @param newTermsOfUseContainer the new object to create
     * @return the created TermsOfUseContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TermsOfUseContainer post(final TermsOfUseContainer newTermsOfUseContainer) throws ClientException;

    /**
     * Posts a TermsOfUseContainer with a new object
     *
     * @param newTermsOfUseContainer the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TermsOfUseContainer newTermsOfUseContainer, final ICallback<? super TermsOfUseContainer> callback);

    /**
     * Posts a TermsOfUseContainer with a new object
     *
     * @param newTermsOfUseContainer the object to create/update
     * @return the created TermsOfUseContainer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TermsOfUseContainer put(final TermsOfUseContainer newTermsOfUseContainer) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITermsOfUseContainerRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITermsOfUseContainerRequest expand(final String value);

}

