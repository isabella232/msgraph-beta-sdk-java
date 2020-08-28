// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidForWorkScepCertificateProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android For Work Scep Certificate Profile Request.
 */
public interface IAndroidForWorkScepCertificateProfileRequest extends IHttpRequest {

    /**
     * Gets the AndroidForWorkScepCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidForWorkScepCertificateProfile> callback);

    /**
     * Gets the AndroidForWorkScepCertificateProfile from the service
     *
     * @return the AndroidForWorkScepCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkScepCertificateProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidForWorkScepCertificateProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidForWorkScepCertificateProfile with a source
     *
     * @param sourceAndroidForWorkScepCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidForWorkScepCertificateProfile sourceAndroidForWorkScepCertificateProfile, final ICallback<AndroidForWorkScepCertificateProfile> callback);

    /**
     * Patches this AndroidForWorkScepCertificateProfile with a source
     *
     * @param sourceAndroidForWorkScepCertificateProfile the source object with updates
     * @return the updated AndroidForWorkScepCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkScepCertificateProfile patch(final AndroidForWorkScepCertificateProfile sourceAndroidForWorkScepCertificateProfile) throws ClientException;

    /**
     * Posts a AndroidForWorkScepCertificateProfile with a new object
     *
     * @param newAndroidForWorkScepCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidForWorkScepCertificateProfile newAndroidForWorkScepCertificateProfile, final ICallback<AndroidForWorkScepCertificateProfile> callback);

    /**
     * Posts a AndroidForWorkScepCertificateProfile with a new object
     *
     * @param newAndroidForWorkScepCertificateProfile the new object to create
     * @return the created AndroidForWorkScepCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkScepCertificateProfile post(final AndroidForWorkScepCertificateProfile newAndroidForWorkScepCertificateProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidForWorkScepCertificateProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidForWorkScepCertificateProfileRequest expand(final String value);

}

