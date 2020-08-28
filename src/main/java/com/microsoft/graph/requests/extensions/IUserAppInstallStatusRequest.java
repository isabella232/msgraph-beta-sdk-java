// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.UserAppInstallStatus;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User App Install Status Request.
 */
public interface IUserAppInstallStatusRequest extends IHttpRequest {

    /**
     * Gets the UserAppInstallStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<UserAppInstallStatus> callback);

    /**
     * Gets the UserAppInstallStatus from the service
     *
     * @return the UserAppInstallStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserAppInstallStatus get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<UserAppInstallStatus> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this UserAppInstallStatus with a source
     *
     * @param sourceUserAppInstallStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final UserAppInstallStatus sourceUserAppInstallStatus, final ICallback<UserAppInstallStatus> callback);

    /**
     * Patches this UserAppInstallStatus with a source
     *
     * @param sourceUserAppInstallStatus the source object with updates
     * @return the updated UserAppInstallStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserAppInstallStatus patch(final UserAppInstallStatus sourceUserAppInstallStatus) throws ClientException;

    /**
     * Posts a UserAppInstallStatus with a new object
     *
     * @param newUserAppInstallStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final UserAppInstallStatus newUserAppInstallStatus, final ICallback<UserAppInstallStatus> callback);

    /**
     * Posts a UserAppInstallStatus with a new object
     *
     * @param newUserAppInstallStatus the new object to create
     * @return the created UserAppInstallStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    UserAppInstallStatus post(final UserAppInstallStatus newUserAppInstallStatus) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUserAppInstallStatusRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUserAppInstallStatusRequest expand(final String value);

}

