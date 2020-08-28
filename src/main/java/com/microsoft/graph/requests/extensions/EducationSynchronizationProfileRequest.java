// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSynchronizationProfile;
import com.microsoft.graph.models.extensions.EducationFileSynchronizationVerificationMessage;
import com.microsoft.graph.requests.extensions.IEducationSynchronizationErrorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSynchronizationErrorRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSynchronizationErrorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSynchronizationErrorRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSynchronizationProfileStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSynchronizationProfileStatusRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Synchronization Profile Request.
 */
public class EducationSynchronizationProfileRequest extends BaseRequest implements IEducationSynchronizationProfileRequest {
	
    /**
     * The request for the EducationSynchronizationProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationSynchronizationProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationSynchronizationProfile.class);
    }

    /**
     * Gets the EducationSynchronizationProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EducationSynchronizationProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationSynchronizationProfile from the service
     *
     * @return the EducationSynchronizationProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationSynchronizationProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<EducationSynchronizationProfile> callback) {
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
     * Patches this EducationSynchronizationProfile with a source
     *
     * @param sourceEducationSynchronizationProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EducationSynchronizationProfile sourceEducationSynchronizationProfile, final ICallback<EducationSynchronizationProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationSynchronizationProfile);
    }

    /**
     * Patches this EducationSynchronizationProfile with a source
     *
     * @param sourceEducationSynchronizationProfile the source object with updates
     * @return the updated EducationSynchronizationProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationSynchronizationProfile patch(final EducationSynchronizationProfile sourceEducationSynchronizationProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationSynchronizationProfile);
    }

    /**
     * Creates a EducationSynchronizationProfile with a new object
     *
     * @param newEducationSynchronizationProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EducationSynchronizationProfile newEducationSynchronizationProfile, final ICallback<EducationSynchronizationProfile> callback) {
        send(HttpMethod.POST, callback, newEducationSynchronizationProfile);
    }

    /**
     * Creates a EducationSynchronizationProfile with a new object
     *
     * @param newEducationSynchronizationProfile the new object to create
     * @return the created EducationSynchronizationProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationSynchronizationProfile post(final EducationSynchronizationProfile newEducationSynchronizationProfile) throws ClientException {
        return send(HttpMethod.POST, newEducationSynchronizationProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEducationSynchronizationProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EducationSynchronizationProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEducationSynchronizationProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EducationSynchronizationProfileRequest)this;
     }

}

