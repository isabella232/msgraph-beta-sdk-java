// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TimeCard;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Time Card Request.
 */
public interface ITimeCardRequest extends IHttpRequest {

    /**
     * Gets the TimeCard from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<TimeCard> callback);

    /**
     * Gets the TimeCard from the service
     *
     * @return the TimeCard from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TimeCard get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<TimeCard> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TimeCard with a source
     *
     * @param sourceTimeCard the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TimeCard sourceTimeCard, final ICallback<TimeCard> callback);

    /**
     * Patches this TimeCard with a source
     *
     * @param sourceTimeCard the source object with updates
     * @return the updated TimeCard
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TimeCard patch(final TimeCard sourceTimeCard) throws ClientException;

    /**
     * Posts a TimeCard with a new object
     *
     * @param newTimeCard the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TimeCard newTimeCard, final ICallback<TimeCard> callback);

    /**
     * Posts a TimeCard with a new object
     *
     * @param newTimeCard the new object to create
     * @return the created TimeCard
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TimeCard post(final TimeCard newTimeCard) throws ClientException;

    /**
     * Posts a TimeCard with a new object
     *
     * @param newTimeCard the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TimeCard newTimeCard, final ICallback<TimeCard> callback);

    /**
     * Posts a TimeCard with a new object
     *
     * @param newTimeCard the object to create/update
     * @return the created TimeCard
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TimeCard put(final TimeCard newTimeCard) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITimeCardRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITimeCardRequest expand(final String value);

}

