// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RestrictedSignIn;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Restricted Sign In Request.
 */
public class RestrictedSignInRequest extends BaseRequest implements IRestrictedSignInRequest {
	
    /**
     * The request for the RestrictedSignIn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RestrictedSignInRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RestrictedSignIn.class);
    }

    /**
     * Gets the RestrictedSignIn from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<RestrictedSignIn> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the RestrictedSignIn from the service
     *
     * @return the RestrictedSignIn from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RestrictedSignIn get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<RestrictedSignIn> callback) {
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
     * Patches this RestrictedSignIn with a source
     *
     * @param sourceRestrictedSignIn the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final RestrictedSignIn sourceRestrictedSignIn, final ICallback<RestrictedSignIn> callback) {
        send(HttpMethod.PATCH, callback, sourceRestrictedSignIn);
    }

    /**
     * Patches this RestrictedSignIn with a source
     *
     * @param sourceRestrictedSignIn the source object with updates
     * @return the updated RestrictedSignIn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RestrictedSignIn patch(final RestrictedSignIn sourceRestrictedSignIn) throws ClientException {
        return send(HttpMethod.PATCH, sourceRestrictedSignIn);
    }

    /**
     * Creates a RestrictedSignIn with a new object
     *
     * @param newRestrictedSignIn the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final RestrictedSignIn newRestrictedSignIn, final ICallback<RestrictedSignIn> callback) {
        send(HttpMethod.POST, callback, newRestrictedSignIn);
    }

    /**
     * Creates a RestrictedSignIn with a new object
     *
     * @param newRestrictedSignIn the new object to create
     * @return the created RestrictedSignIn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RestrictedSignIn post(final RestrictedSignIn newRestrictedSignIn) throws ClientException {
        return send(HttpMethod.POST, newRestrictedSignIn);
    }

    /**
     * Creates a RestrictedSignIn with a new object
     *
     * @param newRestrictedSignIn the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final RestrictedSignIn newRestrictedSignIn, final ICallback<RestrictedSignIn> callback) {
        send(HttpMethod.PUT, callback, newRestrictedSignIn);
    }

    /**
     * Creates a RestrictedSignIn with a new object
     *
     * @param newRestrictedSignIn the object to create/update
     * @return the created RestrictedSignIn
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public RestrictedSignIn put(final RestrictedSignIn newRestrictedSignIn) throws ClientException {
        return send(HttpMethod.PUT, newRestrictedSignIn);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IRestrictedSignInRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (RestrictedSignInRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IRestrictedSignInRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (RestrictedSignInRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IRestrictedSignInRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (RestrictedSignInRequest)this;
     }

}

