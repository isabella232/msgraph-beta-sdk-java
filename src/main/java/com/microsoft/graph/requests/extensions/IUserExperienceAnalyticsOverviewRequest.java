// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsOverview;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Overview Request.
 */
public interface IUserExperienceAnalyticsOverviewRequest extends IHttpRequest {

    /**
     * Gets the UserExperienceAnalyticsOverview from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<UserExperienceAnalyticsOverview> callback);

    /**
     * Gets the UserExperienceAnalyticsOverview from the service
     *
     * @return the UserExperienceAnalyticsOverview from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsOverview get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<UserExperienceAnalyticsOverview> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserExperienceAnalyticsOverview with a source
     *
     * @param sourceUserExperienceAnalyticsOverview the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserExperienceAnalyticsOverview sourceUserExperienceAnalyticsOverview, final ICallback<UserExperienceAnalyticsOverview> callback);

    /**
     * Patches this UserExperienceAnalyticsOverview with a source
     *
     * @param sourceUserExperienceAnalyticsOverview the source object with updates
     * @return the updated UserExperienceAnalyticsOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsOverview patch(final UserExperienceAnalyticsOverview sourceUserExperienceAnalyticsOverview) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsOverview with a new object
     *
     * @param newUserExperienceAnalyticsOverview the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserExperienceAnalyticsOverview newUserExperienceAnalyticsOverview, final ICallback<UserExperienceAnalyticsOverview> callback);

    /**
     * Posts a UserExperienceAnalyticsOverview with a new object
     *
     * @param newUserExperienceAnalyticsOverview the new object to create
     * @return the created UserExperienceAnalyticsOverview
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsOverview post(final UserExperienceAnalyticsOverview newUserExperienceAnalyticsOverview) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsOverviewRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsOverviewRequest expand(final String value);

}

