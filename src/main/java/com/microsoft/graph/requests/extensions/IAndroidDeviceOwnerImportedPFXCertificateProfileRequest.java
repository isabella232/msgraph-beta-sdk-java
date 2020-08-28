// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidDeviceOwnerImportedPFXCertificateProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Device Owner Imported PFXCertificate Profile Request.
 */
public interface IAndroidDeviceOwnerImportedPFXCertificateProfileRequest extends IHttpRequest {

    /**
     * Gets the AndroidDeviceOwnerImportedPFXCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidDeviceOwnerImportedPFXCertificateProfile> callback);

    /**
     * Gets the AndroidDeviceOwnerImportedPFXCertificateProfile from the service
     *
     * @return the AndroidDeviceOwnerImportedPFXCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceOwnerImportedPFXCertificateProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidDeviceOwnerImportedPFXCertificateProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidDeviceOwnerImportedPFXCertificateProfile with a source
     *
     * @param sourceAndroidDeviceOwnerImportedPFXCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidDeviceOwnerImportedPFXCertificateProfile sourceAndroidDeviceOwnerImportedPFXCertificateProfile, final ICallback<AndroidDeviceOwnerImportedPFXCertificateProfile> callback);

    /**
     * Patches this AndroidDeviceOwnerImportedPFXCertificateProfile with a source
     *
     * @param sourceAndroidDeviceOwnerImportedPFXCertificateProfile the source object with updates
     * @return the updated AndroidDeviceOwnerImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceOwnerImportedPFXCertificateProfile patch(final AndroidDeviceOwnerImportedPFXCertificateProfile sourceAndroidDeviceOwnerImportedPFXCertificateProfile) throws ClientException;

    /**
     * Posts a AndroidDeviceOwnerImportedPFXCertificateProfile with a new object
     *
     * @param newAndroidDeviceOwnerImportedPFXCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidDeviceOwnerImportedPFXCertificateProfile newAndroidDeviceOwnerImportedPFXCertificateProfile, final ICallback<AndroidDeviceOwnerImportedPFXCertificateProfile> callback);

    /**
     * Posts a AndroidDeviceOwnerImportedPFXCertificateProfile with a new object
     *
     * @param newAndroidDeviceOwnerImportedPFXCertificateProfile the new object to create
     * @return the created AndroidDeviceOwnerImportedPFXCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidDeviceOwnerImportedPFXCertificateProfile post(final AndroidDeviceOwnerImportedPFXCertificateProfile newAndroidDeviceOwnerImportedPFXCertificateProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidDeviceOwnerImportedPFXCertificateProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidDeviceOwnerImportedPFXCertificateProfileRequest expand(final String value);

}

