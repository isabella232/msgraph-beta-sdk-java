// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthDevicePerformanceDetails;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics App Health Device Performance Details Request.
 */
public interface IUserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequest extends IHttpRequest {

    /**
     * Gets the UserExperienceAnalyticsAppHealthDevicePerformanceDetails from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserExperienceAnalyticsAppHealthDevicePerformanceDetails> callback);

    /**
     * Gets the UserExperienceAnalyticsAppHealthDevicePerformanceDetails from the service
     *
     * @return the UserExperienceAnalyticsAppHealthDevicePerformanceDetails from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthDevicePerformanceDetails get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserExperienceAnalyticsAppHealthDevicePerformanceDetails> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserExperienceAnalyticsAppHealthDevicePerformanceDetails sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails, final ICallback<? super UserExperienceAnalyticsAppHealthDevicePerformanceDetails> callback);

    /**
     * Patches this UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails the source object with updates
     * @return the updated UserExperienceAnalyticsAppHealthDevicePerformanceDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthDevicePerformanceDetails patch(final UserExperienceAnalyticsAppHealthDevicePerformanceDetails sourceUserExperienceAnalyticsAppHealthDevicePerformanceDetails) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformanceDetails the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserExperienceAnalyticsAppHealthDevicePerformanceDetails newUserExperienceAnalyticsAppHealthDevicePerformanceDetails, final ICallback<? super UserExperienceAnalyticsAppHealthDevicePerformanceDetails> callback);

    /**
     * Posts a UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformanceDetails the new object to create
     * @return the created UserExperienceAnalyticsAppHealthDevicePerformanceDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthDevicePerformanceDetails post(final UserExperienceAnalyticsAppHealthDevicePerformanceDetails newUserExperienceAnalyticsAppHealthDevicePerformanceDetails) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformanceDetails the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserExperienceAnalyticsAppHealthDevicePerformanceDetails newUserExperienceAnalyticsAppHealthDevicePerformanceDetails, final ICallback<? super UserExperienceAnalyticsAppHealthDevicePerformanceDetails> callback);

    /**
     * Posts a UserExperienceAnalyticsAppHealthDevicePerformanceDetails with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformanceDetails the object to create/update
     * @return the created UserExperienceAnalyticsAppHealthDevicePerformanceDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthDevicePerformanceDetails put(final UserExperienceAnalyticsAppHealthDevicePerformanceDetails newUserExperienceAnalyticsAppHealthDevicePerformanceDetails) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthDevicePerformanceDetailsRequest expand(final String value);

}

