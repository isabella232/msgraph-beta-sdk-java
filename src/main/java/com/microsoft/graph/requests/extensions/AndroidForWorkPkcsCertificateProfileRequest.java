// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkPkcsCertificateProfile;
import com.microsoft.graph.requests.extensions.IManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCertificateStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Pkcs Certificate Profile Request.
 */
public class AndroidForWorkPkcsCertificateProfileRequest extends BaseRequest implements IAndroidForWorkPkcsCertificateProfileRequest {
	
    /**
     * The request for the AndroidForWorkPkcsCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkPkcsCertificateProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkPkcsCertificateProfile.class);
    }

    /**
     * Gets the AndroidForWorkPkcsCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AndroidForWorkPkcsCertificateProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidForWorkPkcsCertificateProfile from the service
     *
     * @return the AndroidForWorkPkcsCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkPkcsCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AndroidForWorkPkcsCertificateProfile> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidForWorkPkcsCertificateProfile with a source
     *
     * @param sourceAndroidForWorkPkcsCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidForWorkPkcsCertificateProfile sourceAndroidForWorkPkcsCertificateProfile, final ICallback<AndroidForWorkPkcsCertificateProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidForWorkPkcsCertificateProfile);
    }

    /**
     * Patches this AndroidForWorkPkcsCertificateProfile with a source
     *
     * @param sourceAndroidForWorkPkcsCertificateProfile the source object with updates
     * @return the updated AndroidForWorkPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkPkcsCertificateProfile patch(final AndroidForWorkPkcsCertificateProfile sourceAndroidForWorkPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkPkcsCertificateProfile);
    }

    /**
     * Creates a AndroidForWorkPkcsCertificateProfile with a new object
     *
     * @param newAndroidForWorkPkcsCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidForWorkPkcsCertificateProfile newAndroidForWorkPkcsCertificateProfile, final ICallback<AndroidForWorkPkcsCertificateProfile> callback) {
        send(HttpMethod.POST, callback, newAndroidForWorkPkcsCertificateProfile);
    }

    /**
     * Creates a AndroidForWorkPkcsCertificateProfile with a new object
     *
     * @param newAndroidForWorkPkcsCertificateProfile the new object to create
     * @return the created AndroidForWorkPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkPkcsCertificateProfile post(final AndroidForWorkPkcsCertificateProfile newAndroidForWorkPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkPkcsCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidForWorkPkcsCertificateProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidForWorkPkcsCertificateProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidForWorkPkcsCertificateProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidForWorkPkcsCertificateProfileRequest)this;
     }

}

