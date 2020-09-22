// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IntuneBrandingProfile;
import com.microsoft.graph.models.extensions.IntuneBrandingProfileAssignment;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Intune Branding Profile Request.
 */
public class IntuneBrandingProfileRequest extends BaseRequest implements IIntuneBrandingProfileRequest {
	
    /**
     * The request for the IntuneBrandingProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IntuneBrandingProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IntuneBrandingProfile.class);
    }

    /**
     * Gets the IntuneBrandingProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<IntuneBrandingProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IntuneBrandingProfile from the service
     *
     * @return the IntuneBrandingProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IntuneBrandingProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<IntuneBrandingProfile> callback) {
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
     * Patches this IntuneBrandingProfile with a source
     *
     * @param sourceIntuneBrandingProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IntuneBrandingProfile sourceIntuneBrandingProfile, final ICallback<IntuneBrandingProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceIntuneBrandingProfile);
    }

    /**
     * Patches this IntuneBrandingProfile with a source
     *
     * @param sourceIntuneBrandingProfile the source object with updates
     * @return the updated IntuneBrandingProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IntuneBrandingProfile patch(final IntuneBrandingProfile sourceIntuneBrandingProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceIntuneBrandingProfile);
    }

    /**
     * Creates a IntuneBrandingProfile with a new object
     *
     * @param newIntuneBrandingProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IntuneBrandingProfile newIntuneBrandingProfile, final ICallback<IntuneBrandingProfile> callback) {
        send(HttpMethod.POST, callback, newIntuneBrandingProfile);
    }

    /**
     * Creates a IntuneBrandingProfile with a new object
     *
     * @param newIntuneBrandingProfile the new object to create
     * @return the created IntuneBrandingProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IntuneBrandingProfile post(final IntuneBrandingProfile newIntuneBrandingProfile) throws ClientException {
        return send(HttpMethod.POST, newIntuneBrandingProfile);
    }

    /**
     * Creates a IntuneBrandingProfile with a new object
     *
     * @param newIntuneBrandingProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IntuneBrandingProfile newIntuneBrandingProfile, final ICallback<IntuneBrandingProfile> callback) {
        send(HttpMethod.PUT, callback, newIntuneBrandingProfile);
    }

    /**
     * Creates a IntuneBrandingProfile with a new object
     *
     * @param newIntuneBrandingProfile the object to create/update
     * @return the created IntuneBrandingProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IntuneBrandingProfile put(final IntuneBrandingProfile newIntuneBrandingProfile) throws ClientException {
        return send(HttpMethod.PUT, newIntuneBrandingProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIntuneBrandingProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IntuneBrandingProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIntuneBrandingProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IntuneBrandingProfileRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IIntuneBrandingProfileRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (IntuneBrandingProfileRequest)this;
     }

}

