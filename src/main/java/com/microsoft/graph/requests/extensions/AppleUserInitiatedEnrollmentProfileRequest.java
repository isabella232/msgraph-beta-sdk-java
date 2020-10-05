// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AppleUserInitiatedEnrollmentProfile;
import com.microsoft.graph.requests.extensions.IAppleEnrollmentProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppleEnrollmentProfileAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AppleEnrollmentProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AppleEnrollmentProfileAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Apple User Initiated Enrollment Profile Request.
 */
public class AppleUserInitiatedEnrollmentProfileRequest extends BaseRequest implements IAppleUserInitiatedEnrollmentProfileRequest {
	
    /**
     * The request for the AppleUserInitiatedEnrollmentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppleUserInitiatedEnrollmentProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppleUserInitiatedEnrollmentProfile.class);
    }

    /**
     * Gets the AppleUserInitiatedEnrollmentProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AppleUserInitiatedEnrollmentProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AppleUserInitiatedEnrollmentProfile from the service
     *
     * @return the AppleUserInitiatedEnrollmentProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppleUserInitiatedEnrollmentProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AppleUserInitiatedEnrollmentProfile> callback) {
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
     * Patches this AppleUserInitiatedEnrollmentProfile with a source
     *
     * @param sourceAppleUserInitiatedEnrollmentProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AppleUserInitiatedEnrollmentProfile sourceAppleUserInitiatedEnrollmentProfile, final ICallback<? super AppleUserInitiatedEnrollmentProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceAppleUserInitiatedEnrollmentProfile);
    }

    /**
     * Patches this AppleUserInitiatedEnrollmentProfile with a source
     *
     * @param sourceAppleUserInitiatedEnrollmentProfile the source object with updates
     * @return the updated AppleUserInitiatedEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppleUserInitiatedEnrollmentProfile patch(final AppleUserInitiatedEnrollmentProfile sourceAppleUserInitiatedEnrollmentProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAppleUserInitiatedEnrollmentProfile);
    }

    /**
     * Creates a AppleUserInitiatedEnrollmentProfile with a new object
     *
     * @param newAppleUserInitiatedEnrollmentProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile, final ICallback<? super AppleUserInitiatedEnrollmentProfile> callback) {
        send(HttpMethod.POST, callback, newAppleUserInitiatedEnrollmentProfile);
    }

    /**
     * Creates a AppleUserInitiatedEnrollmentProfile with a new object
     *
     * @param newAppleUserInitiatedEnrollmentProfile the new object to create
     * @return the created AppleUserInitiatedEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppleUserInitiatedEnrollmentProfile post(final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile) throws ClientException {
        return send(HttpMethod.POST, newAppleUserInitiatedEnrollmentProfile);
    }

    /**
     * Creates a AppleUserInitiatedEnrollmentProfile with a new object
     *
     * @param newAppleUserInitiatedEnrollmentProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile, final ICallback<? super AppleUserInitiatedEnrollmentProfile> callback) {
        send(HttpMethod.PUT, callback, newAppleUserInitiatedEnrollmentProfile);
    }

    /**
     * Creates a AppleUserInitiatedEnrollmentProfile with a new object
     *
     * @param newAppleUserInitiatedEnrollmentProfile the object to create/update
     * @return the created AppleUserInitiatedEnrollmentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AppleUserInitiatedEnrollmentProfile put(final AppleUserInitiatedEnrollmentProfile newAppleUserInitiatedEnrollmentProfile) throws ClientException {
        return send(HttpMethod.PUT, newAppleUserInitiatedEnrollmentProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAppleUserInitiatedEnrollmentProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AppleUserInitiatedEnrollmentProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAppleUserInitiatedEnrollmentProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AppleUserInitiatedEnrollmentProfileRequest)this;
     }

}

