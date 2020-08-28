// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidDeviceComplianceLocalActionBase;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Device Compliance Local Action Base Request.
 */
public interface IAndroidDeviceComplianceLocalActionBaseRequest extends IHttpRequest {

    /**
     * Gets the AndroidDeviceComplianceLocalActionBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidDeviceComplianceLocalActionBase> callback);

    /**
     * Gets the AndroidDeviceComplianceLocalActionBase from the service
     *
     * @return the AndroidDeviceComplianceLocalActionBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceComplianceLocalActionBase get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidDeviceComplianceLocalActionBase> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidDeviceComplianceLocalActionBase with a source
     *
     * @param sourceAndroidDeviceComplianceLocalActionBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidDeviceComplianceLocalActionBase sourceAndroidDeviceComplianceLocalActionBase, final ICallback<AndroidDeviceComplianceLocalActionBase> callback);

    /**
     * Patches this AndroidDeviceComplianceLocalActionBase with a source
     *
     * @param sourceAndroidDeviceComplianceLocalActionBase the source object with updates
     * @return the updated AndroidDeviceComplianceLocalActionBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceComplianceLocalActionBase patch(final AndroidDeviceComplianceLocalActionBase sourceAndroidDeviceComplianceLocalActionBase) throws ClientException;

    /**
     * Posts a AndroidDeviceComplianceLocalActionBase with a new object
     *
     * @param newAndroidDeviceComplianceLocalActionBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidDeviceComplianceLocalActionBase newAndroidDeviceComplianceLocalActionBase, final ICallback<AndroidDeviceComplianceLocalActionBase> callback);

    /**
     * Posts a AndroidDeviceComplianceLocalActionBase with a new object
     *
     * @param newAndroidDeviceComplianceLocalActionBase the new object to create
     * @return the created AndroidDeviceComplianceLocalActionBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceComplianceLocalActionBase post(final AndroidDeviceComplianceLocalActionBase newAndroidDeviceComplianceLocalActionBase) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidDeviceComplianceLocalActionBaseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidDeviceComplianceLocalActionBaseRequest expand(final String value);

}

