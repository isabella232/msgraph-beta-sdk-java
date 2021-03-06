// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSPkcsCertificateProfile;
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
 * The class for the Mac OSPkcs Certificate Profile Request.
 */
public class MacOSPkcsCertificateProfileRequest extends BaseRequest implements IMacOSPkcsCertificateProfileRequest {
	
    /**
     * The request for the MacOSPkcsCertificateProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSPkcsCertificateProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSPkcsCertificateProfile.class);
    }

    /**
     * Gets the MacOSPkcsCertificateProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super MacOSPkcsCertificateProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSPkcsCertificateProfile from the service
     *
     * @return the MacOSPkcsCertificateProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSPkcsCertificateProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super MacOSPkcsCertificateProfile> callback) {
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
     * Patches this MacOSPkcsCertificateProfile with a source
     *
     * @param sourceMacOSPkcsCertificateProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MacOSPkcsCertificateProfile sourceMacOSPkcsCertificateProfile, final ICallback<? super MacOSPkcsCertificateProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSPkcsCertificateProfile);
    }

    /**
     * Patches this MacOSPkcsCertificateProfile with a source
     *
     * @param sourceMacOSPkcsCertificateProfile the source object with updates
     * @return the updated MacOSPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSPkcsCertificateProfile patch(final MacOSPkcsCertificateProfile sourceMacOSPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSPkcsCertificateProfile);
    }

    /**
     * Creates a MacOSPkcsCertificateProfile with a new object
     *
     * @param newMacOSPkcsCertificateProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MacOSPkcsCertificateProfile newMacOSPkcsCertificateProfile, final ICallback<? super MacOSPkcsCertificateProfile> callback) {
        send(HttpMethod.POST, callback, newMacOSPkcsCertificateProfile);
    }

    /**
     * Creates a MacOSPkcsCertificateProfile with a new object
     *
     * @param newMacOSPkcsCertificateProfile the new object to create
     * @return the created MacOSPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSPkcsCertificateProfile post(final MacOSPkcsCertificateProfile newMacOSPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.POST, newMacOSPkcsCertificateProfile);
    }

    /**
     * Creates a MacOSPkcsCertificateProfile with a new object
     *
     * @param newMacOSPkcsCertificateProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MacOSPkcsCertificateProfile newMacOSPkcsCertificateProfile, final ICallback<? super MacOSPkcsCertificateProfile> callback) {
        send(HttpMethod.PUT, callback, newMacOSPkcsCertificateProfile);
    }

    /**
     * Creates a MacOSPkcsCertificateProfile with a new object
     *
     * @param newMacOSPkcsCertificateProfile the object to create/update
     * @return the created MacOSPkcsCertificateProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MacOSPkcsCertificateProfile put(final MacOSPkcsCertificateProfile newMacOSPkcsCertificateProfile) throws ClientException {
        return send(HttpMethod.PUT, newMacOSPkcsCertificateProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMacOSPkcsCertificateProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MacOSPkcsCertificateProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMacOSPkcsCertificateProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MacOSPkcsCertificateProfileRequest)this;
     }

}

