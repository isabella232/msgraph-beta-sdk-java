// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.requests.extensions.IEducationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationRubricCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationRubricRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationRubricCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationRubricRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationClassRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EducationSchoolRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserRequestBuilder;
import com.microsoft.graph.requests.extensions.UserRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education User Request.
 */
public class EducationUserRequest extends BaseRequest implements IEducationUserRequest {
	
    /**
     * The request for the EducationUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationUserRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationUser.class);
    }

    /**
     * Gets the EducationUser from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EducationUser> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationUser from the service
     *
     * @return the EducationUser from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationUser get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<EducationUser> callback) {
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
     * Patches this EducationUser with a source
     *
     * @param sourceEducationUser the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EducationUser sourceEducationUser, final ICallback<EducationUser> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationUser);
    }

    /**
     * Patches this EducationUser with a source
     *
     * @param sourceEducationUser the source object with updates
     * @return the updated EducationUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationUser patch(final EducationUser sourceEducationUser) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationUser);
    }

    /**
     * Creates a EducationUser with a new object
     *
     * @param newEducationUser the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EducationUser newEducationUser, final ICallback<EducationUser> callback) {
        send(HttpMethod.POST, callback, newEducationUser);
    }

    /**
     * Creates a EducationUser with a new object
     *
     * @param newEducationUser the new object to create
     * @return the created EducationUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationUser post(final EducationUser newEducationUser) throws ClientException {
        return send(HttpMethod.POST, newEducationUser);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEducationUserRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EducationUserRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEducationUserRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EducationUserRequest)this;
     }

}

