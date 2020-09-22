// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AuthenticationMethod;
import com.microsoft.graph.models.extensions.PasswordResetResponse;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Method Request.
 */
public class AuthenticationMethodRequest extends BaseRequest implements IAuthenticationMethodRequest {
	
    /**
     * The request for the AuthenticationMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AuthenticationMethodRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends AuthenticationMethod> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AuthenticationMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationMethodRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuthenticationMethod.class);
    }

    /**
     * Gets the AuthenticationMethod from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AuthenticationMethod> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AuthenticationMethod from the service
     *
     * @return the AuthenticationMethod from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuthenticationMethod get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AuthenticationMethod> callback) {
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
     * Patches this AuthenticationMethod with a source
     *
     * @param sourceAuthenticationMethod the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AuthenticationMethod sourceAuthenticationMethod, final ICallback<AuthenticationMethod> callback) {
        send(HttpMethod.PATCH, callback, sourceAuthenticationMethod);
    }

    /**
     * Patches this AuthenticationMethod with a source
     *
     * @param sourceAuthenticationMethod the source object with updates
     * @return the updated AuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuthenticationMethod patch(final AuthenticationMethod sourceAuthenticationMethod) throws ClientException {
        return send(HttpMethod.PATCH, sourceAuthenticationMethod);
    }

    /**
     * Creates a AuthenticationMethod with a new object
     *
     * @param newAuthenticationMethod the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AuthenticationMethod newAuthenticationMethod, final ICallback<AuthenticationMethod> callback) {
        send(HttpMethod.POST, callback, newAuthenticationMethod);
    }

    /**
     * Creates a AuthenticationMethod with a new object
     *
     * @param newAuthenticationMethod the new object to create
     * @return the created AuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuthenticationMethod post(final AuthenticationMethod newAuthenticationMethod) throws ClientException {
        return send(HttpMethod.POST, newAuthenticationMethod);
    }

    /**
     * Creates a AuthenticationMethod with a new object
     *
     * @param newAuthenticationMethod the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AuthenticationMethod newAuthenticationMethod, final ICallback<AuthenticationMethod> callback) {
        send(HttpMethod.PUT, callback, newAuthenticationMethod);
    }

    /**
     * Creates a AuthenticationMethod with a new object
     *
     * @param newAuthenticationMethod the object to create/update
     * @return the created AuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AuthenticationMethod put(final AuthenticationMethod newAuthenticationMethod) throws ClientException {
        return send(HttpMethod.PUT, newAuthenticationMethod);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAuthenticationMethodRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AuthenticationMethodRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAuthenticationMethodRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AuthenticationMethodRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IAuthenticationMethodRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (AuthenticationMethodRequest)this;
     }

}

