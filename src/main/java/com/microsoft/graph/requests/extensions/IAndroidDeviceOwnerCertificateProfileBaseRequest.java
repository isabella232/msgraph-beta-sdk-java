// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerCertificateProfileBase;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Device Owner Certificate Profile Base Request.
 */
public interface IAndroidDeviceOwnerCertificateProfileBaseRequest extends IHttpRequest {

    /**
     * Gets the AndroidDeviceOwnerCertificateProfileBase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidDeviceOwnerCertificateProfileBase> callback);

    /**
     * Gets the AndroidDeviceOwnerCertificateProfileBase from the service
     *
     * @return the AndroidDeviceOwnerCertificateProfileBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceOwnerCertificateProfileBase get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidDeviceOwnerCertificateProfileBase> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidDeviceOwnerCertificateProfileBase with a source
     *
     * @param sourceAndroidDeviceOwnerCertificateProfileBase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidDeviceOwnerCertificateProfileBase sourceAndroidDeviceOwnerCertificateProfileBase, final ICallback<AndroidDeviceOwnerCertificateProfileBase> callback);

    /**
     * Patches this AndroidDeviceOwnerCertificateProfileBase with a source
     *
     * @param sourceAndroidDeviceOwnerCertificateProfileBase the source object with updates
     * @return the updated AndroidDeviceOwnerCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceOwnerCertificateProfileBase patch(final AndroidDeviceOwnerCertificateProfileBase sourceAndroidDeviceOwnerCertificateProfileBase) throws ClientException;

    /**
     * Posts a AndroidDeviceOwnerCertificateProfileBase with a new object
     *
     * @param newAndroidDeviceOwnerCertificateProfileBase the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidDeviceOwnerCertificateProfileBase newAndroidDeviceOwnerCertificateProfileBase, final ICallback<AndroidDeviceOwnerCertificateProfileBase> callback);

    /**
     * Posts a AndroidDeviceOwnerCertificateProfileBase with a new object
     *
     * @param newAndroidDeviceOwnerCertificateProfileBase the new object to create
     * @return the created AndroidDeviceOwnerCertificateProfileBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceOwnerCertificateProfileBase post(final AndroidDeviceOwnerCertificateProfileBase newAndroidDeviceOwnerCertificateProfileBase) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidDeviceOwnerCertificateProfileBaseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidDeviceOwnerCertificateProfileBaseRequest expand(final String value);

}
