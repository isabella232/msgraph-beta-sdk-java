// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthDeviceModelPerformance;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics App Health Device Model Performance Request.
 */
public interface IUserExperienceAnalyticsAppHealthDeviceModelPerformanceRequest extends IHttpRequest {

    /**
     * Gets the UserExperienceAnalyticsAppHealthDeviceModelPerformance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserExperienceAnalyticsAppHealthDeviceModelPerformance> callback);

    /**
     * Gets the UserExperienceAnalyticsAppHealthDeviceModelPerformance from the service
     *
     * @return the UserExperienceAnalyticsAppHealthDeviceModelPerformance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthDeviceModelPerformance get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserExperienceAnalyticsAppHealthDeviceModelPerformance> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserExperienceAnalyticsAppHealthDeviceModelPerformance with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthDeviceModelPerformance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserExperienceAnalyticsAppHealthDeviceModelPerformance sourceUserExperienceAnalyticsAppHealthDeviceModelPerformance, final ICallback<? super UserExperienceAnalyticsAppHealthDeviceModelPerformance> callback);

    /**
     * Patches this UserExperienceAnalyticsAppHealthDeviceModelPerformance with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthDeviceModelPerformance the source object with updates
     * @return the updated UserExperienceAnalyticsAppHealthDeviceModelPerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthDeviceModelPerformance patch(final UserExperienceAnalyticsAppHealthDeviceModelPerformance sourceUserExperienceAnalyticsAppHealthDeviceModelPerformance) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsAppHealthDeviceModelPerformance with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDeviceModelPerformance the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserExperienceAnalyticsAppHealthDeviceModelPerformance newUserExperienceAnalyticsAppHealthDeviceModelPerformance, final ICallback<? super UserExperienceAnalyticsAppHealthDeviceModelPerformance> callback);

    /**
     * Posts a UserExperienceAnalyticsAppHealthDeviceModelPerformance with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDeviceModelPerformance the new object to create
     * @return the created UserExperienceAnalyticsAppHealthDeviceModelPerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthDeviceModelPerformance post(final UserExperienceAnalyticsAppHealthDeviceModelPerformance newUserExperienceAnalyticsAppHealthDeviceModelPerformance) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsAppHealthDeviceModelPerformance with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDeviceModelPerformance the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserExperienceAnalyticsAppHealthDeviceModelPerformance newUserExperienceAnalyticsAppHealthDeviceModelPerformance, final ICallback<? super UserExperienceAnalyticsAppHealthDeviceModelPerformance> callback);

    /**
     * Posts a UserExperienceAnalyticsAppHealthDeviceModelPerformance with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDeviceModelPerformance the object to create/update
     * @return the created UserExperienceAnalyticsAppHealthDeviceModelPerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthDeviceModelPerformance put(final UserExperienceAnalyticsAppHealthDeviceModelPerformance newUserExperienceAnalyticsAppHealthDeviceModelPerformance) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthDeviceModelPerformanceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthDeviceModelPerformanceRequest expand(final String value);

}

