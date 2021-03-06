// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationSynchronizationProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Synchronization Profile Request.
 */
public interface IEducationSynchronizationProfileRequest extends IHttpRequest {

    /**
     * Gets the EducationSynchronizationProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EducationSynchronizationProfile> callback);

    /**
     * Gets the EducationSynchronizationProfile from the service
     *
     * @return the EducationSynchronizationProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSynchronizationProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EducationSynchronizationProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EducationSynchronizationProfile with a source
     *
     * @param sourceEducationSynchronizationProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EducationSynchronizationProfile sourceEducationSynchronizationProfile, final ICallback<? super EducationSynchronizationProfile> callback);

    /**
     * Patches this EducationSynchronizationProfile with a source
     *
     * @param sourceEducationSynchronizationProfile the source object with updates
     * @return the updated EducationSynchronizationProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSynchronizationProfile patch(final EducationSynchronizationProfile sourceEducationSynchronizationProfile) throws ClientException;

    /**
     * Posts a EducationSynchronizationProfile with a new object
     *
     * @param newEducationSynchronizationProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EducationSynchronizationProfile newEducationSynchronizationProfile, final ICallback<? super EducationSynchronizationProfile> callback);

    /**
     * Posts a EducationSynchronizationProfile with a new object
     *
     * @param newEducationSynchronizationProfile the new object to create
     * @return the created EducationSynchronizationProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSynchronizationProfile post(final EducationSynchronizationProfile newEducationSynchronizationProfile) throws ClientException;

    /**
     * Posts a EducationSynchronizationProfile with a new object
     *
     * @param newEducationSynchronizationProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EducationSynchronizationProfile newEducationSynchronizationProfile, final ICallback<? super EducationSynchronizationProfile> callback);

    /**
     * Posts a EducationSynchronizationProfile with a new object
     *
     * @param newEducationSynchronizationProfile the object to create/update
     * @return the created EducationSynchronizationProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSynchronizationProfile put(final EducationSynchronizationProfile newEducationSynchronizationProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEducationSynchronizationProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEducationSynchronizationProfileRequest expand(final String value);

}

