// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppInstallStatus;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile App Install Status Request.
 */
public interface IMobileAppInstallStatusRequest extends IHttpRequest {

    /**
     * Gets the MobileAppInstallStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MobileAppInstallStatus> callback);

    /**
     * Gets the MobileAppInstallStatus from the service
     *
     * @return the MobileAppInstallStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppInstallStatus get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MobileAppInstallStatus> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MobileAppInstallStatus with a source
     *
     * @param sourceMobileAppInstallStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MobileAppInstallStatus sourceMobileAppInstallStatus, final ICallback<MobileAppInstallStatus> callback);

    /**
     * Patches this MobileAppInstallStatus with a source
     *
     * @param sourceMobileAppInstallStatus the source object with updates
     * @return the updated MobileAppInstallStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppInstallStatus patch(final MobileAppInstallStatus sourceMobileAppInstallStatus) throws ClientException;

    /**
     * Posts a MobileAppInstallStatus with a new object
     *
     * @param newMobileAppInstallStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MobileAppInstallStatus newMobileAppInstallStatus, final ICallback<MobileAppInstallStatus> callback);

    /**
     * Posts a MobileAppInstallStatus with a new object
     *
     * @param newMobileAppInstallStatus the new object to create
     * @return the created MobileAppInstallStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppInstallStatus post(final MobileAppInstallStatus newMobileAppInstallStatus) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMobileAppInstallStatusRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMobileAppInstallStatusRequest expand(final String value);

}

