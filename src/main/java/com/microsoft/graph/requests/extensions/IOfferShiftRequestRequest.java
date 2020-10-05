// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OfferShiftRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Offer Shift Request Request.
 */
public interface IOfferShiftRequestRequest extends IHttpRequest {

    /**
     * Gets the OfferShiftRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super OfferShiftRequest> callback);

    /**
     * Gets the OfferShiftRequest from the service
     *
     * @return the OfferShiftRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfferShiftRequest get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super OfferShiftRequest> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OfferShiftRequest with a source
     *
     * @param sourceOfferShiftRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OfferShiftRequest sourceOfferShiftRequest, final ICallback<? super OfferShiftRequest> callback);

    /**
     * Patches this OfferShiftRequest with a source
     *
     * @param sourceOfferShiftRequest the source object with updates
     * @return the updated OfferShiftRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfferShiftRequest patch(final OfferShiftRequest sourceOfferShiftRequest) throws ClientException;

    /**
     * Posts a OfferShiftRequest with a new object
     *
     * @param newOfferShiftRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OfferShiftRequest newOfferShiftRequest, final ICallback<? super OfferShiftRequest> callback);

    /**
     * Posts a OfferShiftRequest with a new object
     *
     * @param newOfferShiftRequest the new object to create
     * @return the created OfferShiftRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfferShiftRequest post(final OfferShiftRequest newOfferShiftRequest) throws ClientException;

    /**
     * Posts a OfferShiftRequest with a new object
     *
     * @param newOfferShiftRequest the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final OfferShiftRequest newOfferShiftRequest, final ICallback<? super OfferShiftRequest> callback);

    /**
     * Posts a OfferShiftRequest with a new object
     *
     * @param newOfferShiftRequest the object to create/update
     * @return the created OfferShiftRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OfferShiftRequest put(final OfferShiftRequest newOfferShiftRequest) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOfferShiftRequestRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOfferShiftRequestRequest expand(final String value);

}

