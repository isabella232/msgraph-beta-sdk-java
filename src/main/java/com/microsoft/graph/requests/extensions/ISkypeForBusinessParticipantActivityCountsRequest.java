// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SkypeForBusinessParticipantActivityCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Skype For Business Participant Activity Counts Request.
 */
public interface ISkypeForBusinessParticipantActivityCountsRequest extends IHttpRequest {

    /**
     * Gets the SkypeForBusinessParticipantActivityCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SkypeForBusinessParticipantActivityCounts> callback);

    /**
     * Gets the SkypeForBusinessParticipantActivityCounts from the service
     *
     * @return the SkypeForBusinessParticipantActivityCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessParticipantActivityCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SkypeForBusinessParticipantActivityCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SkypeForBusinessParticipantActivityCounts with a source
     *
     * @param sourceSkypeForBusinessParticipantActivityCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SkypeForBusinessParticipantActivityCounts sourceSkypeForBusinessParticipantActivityCounts, final ICallback<? super SkypeForBusinessParticipantActivityCounts> callback);

    /**
     * Patches this SkypeForBusinessParticipantActivityCounts with a source
     *
     * @param sourceSkypeForBusinessParticipantActivityCounts the source object with updates
     * @return the updated SkypeForBusinessParticipantActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessParticipantActivityCounts patch(final SkypeForBusinessParticipantActivityCounts sourceSkypeForBusinessParticipantActivityCounts) throws ClientException;

    /**
     * Posts a SkypeForBusinessParticipantActivityCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SkypeForBusinessParticipantActivityCounts newSkypeForBusinessParticipantActivityCounts, final ICallback<? super SkypeForBusinessParticipantActivityCounts> callback);

    /**
     * Posts a SkypeForBusinessParticipantActivityCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityCounts the new object to create
     * @return the created SkypeForBusinessParticipantActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessParticipantActivityCounts post(final SkypeForBusinessParticipantActivityCounts newSkypeForBusinessParticipantActivityCounts) throws ClientException;

    /**
     * Posts a SkypeForBusinessParticipantActivityCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SkypeForBusinessParticipantActivityCounts newSkypeForBusinessParticipantActivityCounts, final ICallback<? super SkypeForBusinessParticipantActivityCounts> callback);

    /**
     * Posts a SkypeForBusinessParticipantActivityCounts with a new object
     *
     * @param newSkypeForBusinessParticipantActivityCounts the object to create/update
     * @return the created SkypeForBusinessParticipantActivityCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessParticipantActivityCounts put(final SkypeForBusinessParticipantActivityCounts newSkypeForBusinessParticipantActivityCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISkypeForBusinessParticipantActivityCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISkypeForBusinessParticipantActivityCountsRequest expand(final String value);

}

