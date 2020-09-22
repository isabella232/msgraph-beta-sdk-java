// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Fido2AuthenticationMethod;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Fido2Authentication Method Request.
 */
public class Fido2AuthenticationMethodRequest extends BaseRequest implements IFido2AuthenticationMethodRequest {
	
    /**
     * The request for the Fido2AuthenticationMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Fido2AuthenticationMethodRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Fido2AuthenticationMethod.class);
    }

    /**
     * Gets the Fido2AuthenticationMethod from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Fido2AuthenticationMethod> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Fido2AuthenticationMethod from the service
     *
     * @return the Fido2AuthenticationMethod from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Fido2AuthenticationMethod get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Fido2AuthenticationMethod> callback) {
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
     * Patches this Fido2AuthenticationMethod with a source
     *
     * @param sourceFido2AuthenticationMethod the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Fido2AuthenticationMethod sourceFido2AuthenticationMethod, final ICallback<Fido2AuthenticationMethod> callback) {
        send(HttpMethod.PATCH, callback, sourceFido2AuthenticationMethod);
    }

    /**
     * Patches this Fido2AuthenticationMethod with a source
     *
     * @param sourceFido2AuthenticationMethod the source object with updates
     * @return the updated Fido2AuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Fido2AuthenticationMethod patch(final Fido2AuthenticationMethod sourceFido2AuthenticationMethod) throws ClientException {
        return send(HttpMethod.PATCH, sourceFido2AuthenticationMethod);
    }

    /**
     * Creates a Fido2AuthenticationMethod with a new object
     *
     * @param newFido2AuthenticationMethod the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Fido2AuthenticationMethod newFido2AuthenticationMethod, final ICallback<Fido2AuthenticationMethod> callback) {
        send(HttpMethod.POST, callback, newFido2AuthenticationMethod);
    }

    /**
     * Creates a Fido2AuthenticationMethod with a new object
     *
     * @param newFido2AuthenticationMethod the new object to create
     * @return the created Fido2AuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Fido2AuthenticationMethod post(final Fido2AuthenticationMethod newFido2AuthenticationMethod) throws ClientException {
        return send(HttpMethod.POST, newFido2AuthenticationMethod);
    }

    /**
     * Creates a Fido2AuthenticationMethod with a new object
     *
     * @param newFido2AuthenticationMethod the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Fido2AuthenticationMethod newFido2AuthenticationMethod, final ICallback<Fido2AuthenticationMethod> callback) {
        send(HttpMethod.PUT, callback, newFido2AuthenticationMethod);
    }

    /**
     * Creates a Fido2AuthenticationMethod with a new object
     *
     * @param newFido2AuthenticationMethod the object to create/update
     * @return the created Fido2AuthenticationMethod
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Fido2AuthenticationMethod put(final Fido2AuthenticationMethod newFido2AuthenticationMethod) throws ClientException {
        return send(HttpMethod.PUT, newFido2AuthenticationMethod);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IFido2AuthenticationMethodRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Fido2AuthenticationMethodRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IFido2AuthenticationMethodRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Fido2AuthenticationMethodRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IFido2AuthenticationMethodRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (Fido2AuthenticationMethodRequest)this;
     }

}

