// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DepIOSEnrollmentProfile;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep IOSEnrollment Profile Request.
 */
public class DepIOSEnrollmentProfileRequest extends BaseRequest implements IDepIOSEnrollmentProfileRequest {
	
    /**
     * The request for the DepIOSEnrollmentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DepIOSEnrollmentProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DepIOSEnrollmentProfile.class);
    }

    /**
     * Gets the DepIOSEnrollmentProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DepIOSEnrollmentProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DepIOSEnrollmentProfile from the service
     *
     * @return the DepIOSEnrollmentProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DepIOSEnrollmentProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DepIOSEnrollmentProfile> callback) {
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
     * Patches this DepIOSEnrollmentProfile with a source
     *
     * @param sourceDepIOSEnrollmentProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DepIOSEnrollmentProfile sourceDepIOSEnrollmentProfile, final ICallback<DepIOSEnrollmentProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceDepIOSEnrollmentProfile);
    }

    /**
     * Patches this DepIOSEnrollmentProfile with a source
     *
     * @param sourceDepIOSEnrollmentProfile the source object with updates
     * @return the updated DepIOSEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DepIOSEnrollmentProfile patch(final DepIOSEnrollmentProfile sourceDepIOSEnrollmentProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceDepIOSEnrollmentProfile);
    }

    /**
     * Creates a DepIOSEnrollmentProfile with a new object
     *
     * @param newDepIOSEnrollmentProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DepIOSEnrollmentProfile newDepIOSEnrollmentProfile, final ICallback<DepIOSEnrollmentProfile> callback) {
        send(HttpMethod.POST, callback, newDepIOSEnrollmentProfile);
    }

    /**
     * Creates a DepIOSEnrollmentProfile with a new object
     *
     * @param newDepIOSEnrollmentProfile the new object to create
     * @return the created DepIOSEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DepIOSEnrollmentProfile post(final DepIOSEnrollmentProfile newDepIOSEnrollmentProfile) throws ClientException {
        return send(HttpMethod.POST, newDepIOSEnrollmentProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDepIOSEnrollmentProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DepIOSEnrollmentProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDepIOSEnrollmentProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DepIOSEnrollmentProfileRequest)this;
     }

}

