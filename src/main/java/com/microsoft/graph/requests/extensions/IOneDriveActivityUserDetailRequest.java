// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OneDriveActivityUserDetail;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the One Drive Activity User Detail Request.
 */
public interface IOneDriveActivityUserDetailRequest extends IHttpRequest {

    /**
     * Gets the OneDriveActivityUserDetail from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<OneDriveActivityUserDetail> callback);

    /**
     * Gets the OneDriveActivityUserDetail from the service
     *
     * @return the OneDriveActivityUserDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OneDriveActivityUserDetail get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<OneDriveActivityUserDetail> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this OneDriveActivityUserDetail with a source
     *
     * @param sourceOneDriveActivityUserDetail the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final OneDriveActivityUserDetail sourceOneDriveActivityUserDetail, final ICallback<OneDriveActivityUserDetail> callback);

    /**
     * Patches this OneDriveActivityUserDetail with a source
     *
     * @param sourceOneDriveActivityUserDetail the source object with updates
     * @return the updated OneDriveActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OneDriveActivityUserDetail patch(final OneDriveActivityUserDetail sourceOneDriveActivityUserDetail) throws ClientException;

    /**
     * Posts a OneDriveActivityUserDetail with a new object
     *
     * @param newOneDriveActivityUserDetail the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final OneDriveActivityUserDetail newOneDriveActivityUserDetail, final ICallback<OneDriveActivityUserDetail> callback);

    /**
     * Posts a OneDriveActivityUserDetail with a new object
     *
     * @param newOneDriveActivityUserDetail the new object to create
     * @return the created OneDriveActivityUserDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    OneDriveActivityUserDetail post(final OneDriveActivityUserDetail newOneDriveActivityUserDetail) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IOneDriveActivityUserDetailRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IOneDriveActivityUserDetailRequest expand(final String value);

}

