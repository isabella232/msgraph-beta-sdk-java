// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics App Health App Performance By OSVersion Request.
 */
public interface IUserExperienceAnalyticsAppHealthAppPerformanceByOSVersionRequest extends IHttpRequest {

    /**
     * Gets the UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> callback);

    /**
     * Gets the UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion from the service
     *
     * @return the UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthAppPerformanceByOSVersion the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion sourceUserExperienceAnalyticsAppHealthAppPerformanceByOSVersion, final ICallback<? super UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> callback);

    /**
     * Patches this UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthAppPerformanceByOSVersion the source object with updates
     * @return the updated UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion patch(final UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion sourceUserExperienceAnalyticsAppHealthAppPerformanceByOSVersion) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByOSVersion the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion newUserExperienceAnalyticsAppHealthAppPerformanceByOSVersion, final ICallback<? super UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> callback);

    /**
     * Posts a UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByOSVersion the new object to create
     * @return the created UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion post(final UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion newUserExperienceAnalyticsAppHealthAppPerformanceByOSVersion) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByOSVersion the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion newUserExperienceAnalyticsAppHealthAppPerformanceByOSVersion, final ICallback<? super UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion> callback);

    /**
     * Posts a UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByOSVersion the object to create/update
     * @return the created UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion put(final UserExperienceAnalyticsAppHealthAppPerformanceByOSVersion newUserExperienceAnalyticsAppHealthAppPerformanceByOSVersion) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthAppPerformanceByOSVersionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsAppHealthAppPerformanceByOSVersionRequest expand(final String value);

}

