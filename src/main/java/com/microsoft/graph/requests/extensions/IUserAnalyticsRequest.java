// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserAnalytics;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Analytics Request.
 */
public interface IUserAnalyticsRequest extends IHttpRequest {

    /**
     * Gets the UserAnalytics from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super UserAnalytics> callback);

    /**
     * Gets the UserAnalytics from the service
     *
     * @return the UserAnalytics from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserAnalytics get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super UserAnalytics> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserAnalytics with a source
     *
     * @param sourceUserAnalytics the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserAnalytics sourceUserAnalytics, final ICallback<? super UserAnalytics> callback);

    /**
     * Patches this UserAnalytics with a source
     *
     * @param sourceUserAnalytics the source object with updates
     * @return the updated UserAnalytics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserAnalytics patch(final UserAnalytics sourceUserAnalytics) throws ClientException;

    /**
     * Posts a UserAnalytics with a new object
     *
     * @param newUserAnalytics the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserAnalytics newUserAnalytics, final ICallback<? super UserAnalytics> callback);

    /**
     * Posts a UserAnalytics with a new object
     *
     * @param newUserAnalytics the new object to create
     * @return the created UserAnalytics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserAnalytics post(final UserAnalytics newUserAnalytics) throws ClientException;

    /**
     * Posts a UserAnalytics with a new object
     *
     * @param newUserAnalytics the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final UserAnalytics newUserAnalytics, final ICallback<? super UserAnalytics> callback);

    /**
     * Posts a UserAnalytics with a new object
     *
     * @param newUserAnalytics the object to create/update
     * @return the created UserAnalytics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserAnalytics put(final UserAnalytics newUserAnalytics) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserAnalyticsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserAnalyticsRequest expand(final String value);

}

