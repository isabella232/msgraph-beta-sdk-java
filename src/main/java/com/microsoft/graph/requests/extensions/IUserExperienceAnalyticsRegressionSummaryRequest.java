// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsRegressionSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Regression Summary Request.
 */
public interface IUserExperienceAnalyticsRegressionSummaryRequest extends IHttpRequest {

    /**
     * Gets the UserExperienceAnalyticsRegressionSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserExperienceAnalyticsRegressionSummary> callback);

    /**
     * Gets the UserExperienceAnalyticsRegressionSummary from the service
     *
     * @return the UserExperienceAnalyticsRegressionSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsRegressionSummary get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserExperienceAnalyticsRegressionSummary> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserExperienceAnalyticsRegressionSummary with a source
     *
     * @param sourceUserExperienceAnalyticsRegressionSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserExperienceAnalyticsRegressionSummary sourceUserExperienceAnalyticsRegressionSummary, final ICallback<? super UserExperienceAnalyticsRegressionSummary> callback);

    /**
     * Patches this UserExperienceAnalyticsRegressionSummary with a source
     *
     * @param sourceUserExperienceAnalyticsRegressionSummary the source object with updates
     * @return the updated UserExperienceAnalyticsRegressionSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsRegressionSummary patch(final UserExperienceAnalyticsRegressionSummary sourceUserExperienceAnalyticsRegressionSummary) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsRegressionSummary with a new object
     *
     * @param newUserExperienceAnalyticsRegressionSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserExperienceAnalyticsRegressionSummary newUserExperienceAnalyticsRegressionSummary, final ICallback<? super UserExperienceAnalyticsRegressionSummary> callback);

    /**
     * Posts a UserExperienceAnalyticsRegressionSummary with a new object
     *
     * @param newUserExperienceAnalyticsRegressionSummary the new object to create
     * @return the created UserExperienceAnalyticsRegressionSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsRegressionSummary post(final UserExperienceAnalyticsRegressionSummary newUserExperienceAnalyticsRegressionSummary) throws ClientException;

    /**
     * Posts a UserExperienceAnalyticsRegressionSummary with a new object
     *
     * @param newUserExperienceAnalyticsRegressionSummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserExperienceAnalyticsRegressionSummary newUserExperienceAnalyticsRegressionSummary, final ICallback<? super UserExperienceAnalyticsRegressionSummary> callback);

    /**
     * Posts a UserExperienceAnalyticsRegressionSummary with a new object
     *
     * @param newUserExperienceAnalyticsRegressionSummary the object to create/update
     * @return the created UserExperienceAnalyticsRegressionSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserExperienceAnalyticsRegressionSummary put(final UserExperienceAnalyticsRegressionSummary newUserExperienceAnalyticsRegressionSummary) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserExperienceAnalyticsRegressionSummaryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserExperienceAnalyticsRegressionSummaryRequest expand(final String value);

}

