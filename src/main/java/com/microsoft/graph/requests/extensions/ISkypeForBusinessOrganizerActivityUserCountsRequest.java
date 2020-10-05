// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityUserCounts;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Skype For Business Organizer Activity User Counts Request.
 */
public interface ISkypeForBusinessOrganizerActivityUserCountsRequest extends IHttpRequest {

    /**
     * Gets the SkypeForBusinessOrganizerActivityUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SkypeForBusinessOrganizerActivityUserCounts> callback);

    /**
     * Gets the SkypeForBusinessOrganizerActivityUserCounts from the service
     *
     * @return the SkypeForBusinessOrganizerActivityUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessOrganizerActivityUserCounts get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SkypeForBusinessOrganizerActivityUserCounts> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SkypeForBusinessOrganizerActivityUserCounts with a source
     *
     * @param sourceSkypeForBusinessOrganizerActivityUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SkypeForBusinessOrganizerActivityUserCounts sourceSkypeForBusinessOrganizerActivityUserCounts, final ICallback<? super SkypeForBusinessOrganizerActivityUserCounts> callback);

    /**
     * Patches this SkypeForBusinessOrganizerActivityUserCounts with a source
     *
     * @param sourceSkypeForBusinessOrganizerActivityUserCounts the source object with updates
     * @return the updated SkypeForBusinessOrganizerActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessOrganizerActivityUserCounts patch(final SkypeForBusinessOrganizerActivityUserCounts sourceSkypeForBusinessOrganizerActivityUserCounts) throws ClientException;

    /**
     * Posts a SkypeForBusinessOrganizerActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessOrganizerActivityUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SkypeForBusinessOrganizerActivityUserCounts newSkypeForBusinessOrganizerActivityUserCounts, final ICallback<? super SkypeForBusinessOrganizerActivityUserCounts> callback);

    /**
     * Posts a SkypeForBusinessOrganizerActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessOrganizerActivityUserCounts the new object to create
     * @return the created SkypeForBusinessOrganizerActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessOrganizerActivityUserCounts post(final SkypeForBusinessOrganizerActivityUserCounts newSkypeForBusinessOrganizerActivityUserCounts) throws ClientException;

    /**
     * Posts a SkypeForBusinessOrganizerActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessOrganizerActivityUserCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SkypeForBusinessOrganizerActivityUserCounts newSkypeForBusinessOrganizerActivityUserCounts, final ICallback<? super SkypeForBusinessOrganizerActivityUserCounts> callback);

    /**
     * Posts a SkypeForBusinessOrganizerActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessOrganizerActivityUserCounts the object to create/update
     * @return the created SkypeForBusinessOrganizerActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SkypeForBusinessOrganizerActivityUserCounts put(final SkypeForBusinessOrganizerActivityUserCounts newSkypeForBusinessOrganizerActivityUserCounts) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISkypeForBusinessOrganizerActivityUserCountsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISkypeForBusinessOrganizerActivityUserCountsRequest expand(final String value);

}

