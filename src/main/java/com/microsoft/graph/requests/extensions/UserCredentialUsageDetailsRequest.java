// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserCredentialUsageDetails;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Credential Usage Details Request.
 */
public class UserCredentialUsageDetailsRequest extends BaseRequest implements IUserCredentialUsageDetailsRequest {
	
    /**
     * The request for the UserCredentialUsageDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserCredentialUsageDetailsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserCredentialUsageDetails.class);
    }

    /**
     * Gets the UserCredentialUsageDetails from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<UserCredentialUsageDetails> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserCredentialUsageDetails from the service
     *
     * @return the UserCredentialUsageDetails from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserCredentialUsageDetails get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<UserCredentialUsageDetails> callback) {
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
     * Patches this UserCredentialUsageDetails with a source
     *
     * @param sourceUserCredentialUsageDetails the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserCredentialUsageDetails sourceUserCredentialUsageDetails, final ICallback<UserCredentialUsageDetails> callback) {
        send(HttpMethod.PATCH, callback, sourceUserCredentialUsageDetails);
    }

    /**
     * Patches this UserCredentialUsageDetails with a source
     *
     * @param sourceUserCredentialUsageDetails the source object with updates
     * @return the updated UserCredentialUsageDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserCredentialUsageDetails patch(final UserCredentialUsageDetails sourceUserCredentialUsageDetails) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserCredentialUsageDetails);
    }

    /**
     * Creates a UserCredentialUsageDetails with a new object
     *
     * @param newUserCredentialUsageDetails the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserCredentialUsageDetails newUserCredentialUsageDetails, final ICallback<UserCredentialUsageDetails> callback) {
        send(HttpMethod.POST, callback, newUserCredentialUsageDetails);
    }

    /**
     * Creates a UserCredentialUsageDetails with a new object
     *
     * @param newUserCredentialUsageDetails the new object to create
     * @return the created UserCredentialUsageDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserCredentialUsageDetails post(final UserCredentialUsageDetails newUserCredentialUsageDetails) throws ClientException {
        return send(HttpMethod.POST, newUserCredentialUsageDetails);
    }

    /**
     * Creates a UserCredentialUsageDetails with a new object
     *
     * @param newUserCredentialUsageDetails the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserCredentialUsageDetails newUserCredentialUsageDetails, final ICallback<UserCredentialUsageDetails> callback) {
        send(HttpMethod.PUT, callback, newUserCredentialUsageDetails);
    }

    /**
     * Creates a UserCredentialUsageDetails with a new object
     *
     * @param newUserCredentialUsageDetails the object to create/update
     * @return the created UserCredentialUsageDetails
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserCredentialUsageDetails put(final UserCredentialUsageDetails newUserCredentialUsageDetails) throws ClientException {
        return send(HttpMethod.PUT, newUserCredentialUsageDetails);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserCredentialUsageDetailsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserCredentialUsageDetailsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserCredentialUsageDetailsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserCredentialUsageDetailsRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IUserCredentialUsageDetailsRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (UserCredentialUsageDetailsRequest)this;
     }

}

