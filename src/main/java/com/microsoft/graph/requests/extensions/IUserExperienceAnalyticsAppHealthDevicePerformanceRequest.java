// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthDevicePerformance;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics App Health Device Performance Request.
 */
public interface IUserExperienceAnalyticsAppHealthDevicePerformanceRequest extends IHttpRequest {

    /**
     * Gets the UserExperienceAnalyticsAppHealthDevicePerformance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<UserExperienceAnalyticsAppHealthDevicePerformance> callback);

    /**
     * Gets the UserExperienceAnalyticsAppHealthDevicePerformance from the service
     *
     * @return the UserExperienceAnalyticsAppHealthDevicePerformance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthDevicePerformance get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<UserExperienceAnalyticsAppHealthDevicePerformance> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserExperienceAnalyticsAppHealthDevicePerformance with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthDevicePerformance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserExperienceAnalyticsAppHealthDevicePerformance sourceUserExperienceAnalyticsAppHealthDevicePerformance, final ICallback<UserExperienceAnalyticsAppHealthDevicePerformance> callback);

    /**
     * Patches this UserExperienceAnalyticsAppHealthDevicePerformance with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthDevicePerformance the source object with updates
     * @return the updated UserExperienceAnalyticsAppHealthDevicePerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthDevicePerformance patch(final UserExperienceAnalyticsAppHealthDevicePerformance sourceUserExperienceAnalyticsAppHealthDevicePerformance) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsAppHealthDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformance the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserExperienceAnalyticsAppHealthDevicePerformance newUserExperienceAnalyticsAppHealthDevicePerformance, final ICallback<UserExperienceAnalyticsAppHealthDevicePerformance> callback);

    /**
     * Posts a UserExperienceAnalyticsAppHealthDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformance the new object to create
     * @return the created UserExperienceAnalyticsAppHealthDevicePerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthDevicePerformance post(final UserExperienceAnalyticsAppHealthDevicePerformance newUserExperienceAnalyticsAppHealthDevicePerformance) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsAppHealthDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformance the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserExperienceAnalyticsAppHealthDevicePerformance newUserExperienceAnalyticsAppHealthDevicePerformance, final ICallback<UserExperienceAnalyticsAppHealthDevicePerformance> callback);

    /**
     * Posts a UserExperienceAnalyticsAppHealthDevicePerformance with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDevicePerformance the object to create/update
     * @return the created UserExperienceAnalyticsAppHealthDevicePerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthDevicePerformance put(final UserExperienceAnalyticsAppHealthDevicePerformance newUserExperienceAnalyticsAppHealthDevicePerformance) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthDevicePerformanceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthDevicePerformanceRequest expand(final String value);

}

