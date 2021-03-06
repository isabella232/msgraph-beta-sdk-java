// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidScepCertificateProfile;
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
 * The class for the Android Scep Certificate Profile Request.
 */
public class AndroidScepCertificateProfileRequest extends BaseRequest implements IAndroidScepCertificateProfileRequest {
	
    /**
     * The request for the AndroidScepCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidScepCertificateProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidScepCertificateProfile.class);
    }

    /**
     * Gets the AndroidScepCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AndroidScepCertificateProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidScepCertificateProfile from the service
     *
     * @return the AndroidScepCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidScepCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AndroidScepCertificateProfile> callback) {
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
     * Patches this AndroidScepCertificateProfile with a source
     *
     * @param sourceAndroidScepCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidScepCertificateProfile sourceAndroidScepCertificateProfile, final ICallback<? super AndroidScepCertificateProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidScepCertificateProfile);
    }

    /**
     * Patches this AndroidScepCertificateProfile with a source
     *
     * @param sourceAndroidScepCertificateProfile the source object with updates
     * @return the updated AndroidScepCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidScepCertificateProfile patch(final AndroidScepCertificateProfile sourceAndroidScepCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidScepCertificateProfile);
    }

    /**
     * Creates a AndroidScepCertificateProfile with a new object
     *
     * @param newAndroidScepCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidScepCertificateProfile newAndroidScepCertificateProfile, final ICallback<? super AndroidScepCertificateProfile> callback) {
        send(HttpMethod.POST, callback, newAndroidScepCertificateProfile);
    }

    /**
     * Creates a AndroidScepCertificateProfile with a new object
     *
     * @param newAndroidScepCertificateProfile the new object to create
     * @return the created AndroidScepCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidScepCertificateProfile post(final AndroidScepCertificateProfile newAndroidScepCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newAndroidScepCertificateProfile);
    }

    /**
     * Creates a AndroidScepCertificateProfile with a new object
     *
     * @param newAndroidScepCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidScepCertificateProfile newAndroidScepCertificateProfile, final ICallback<? super AndroidScepCertificateProfile> callback) {
        send(HttpMethod.PUT, callback, newAndroidScepCertificateProfile);
    }

    /**
     * Creates a AndroidScepCertificateProfile with a new object
     *
     * @param newAndroidScepCertificateProfile the object to create/update
     * @return the created AndroidScepCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidScepCertificateProfile put(final AndroidScepCertificateProfile newAndroidScepCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newAndroidScepCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidScepCertificateProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidScepCertificateProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidScepCertificateProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidScepCertificateProfileRequest)this;
     }

}

