// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AdminConsentRequestPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Admin Consent Request Policy Request.
 */
public class AdminConsentRequestPolicyRequest extends BaseRequest implements IAdminConsentRequestPolicyRequest {
	
    /**
     * The request for the AdminConsentRequestPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AdminConsentRequestPolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AdminConsentRequestPolicy.class);
    }

    /**
     * Gets the AdminConsentRequestPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AdminConsentRequestPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AdminConsentRequestPolicy from the service
     *
     * @return the AdminConsentRequestPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AdminConsentRequestPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AdminConsentRequestPolicy> callback) {
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
     * Patches this AdminConsentRequestPolicy with a source
     *
     * @param sourceAdminConsentRequestPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AdminConsentRequestPolicy sourceAdminConsentRequestPolicy, final ICallback<AdminConsentRequestPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceAdminConsentRequestPolicy);
    }

    /**
     * Patches this AdminConsentRequestPolicy with a source
     *
     * @param sourceAdminConsentRequestPolicy the source object with updates
     * @return the updated AdminConsentRequestPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AdminConsentRequestPolicy patch(final AdminConsentRequestPolicy sourceAdminConsentRequestPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceAdminConsentRequestPolicy);
    }

    /**
     * Creates a AdminConsentRequestPolicy with a new object
     *
     * @param newAdminConsentRequestPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AdminConsentRequestPolicy newAdminConsentRequestPolicy, final ICallback<AdminConsentRequestPolicy> callback) {
        send(HttpMethod.POST, callback, newAdminConsentRequestPolicy);
    }

    /**
     * Creates a AdminConsentRequestPolicy with a new object
     *
     * @param newAdminConsentRequestPolicy the new object to create
     * @return the created AdminConsentRequestPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AdminConsentRequestPolicy post(final AdminConsentRequestPolicy newAdminConsentRequestPolicy) throws ClientException {
        return send(HttpMethod.POST, newAdminConsentRequestPolicy);
    }

    /**
     * Creates a AdminConsentRequestPolicy with a new object
     *
     * @param newAdminConsentRequestPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AdminConsentRequestPolicy newAdminConsentRequestPolicy, final ICallback<AdminConsentRequestPolicy> callback) {
        send(HttpMethod.PUT, callback, newAdminConsentRequestPolicy);
    }

    /**
     * Creates a AdminConsentRequestPolicy with a new object
     *
     * @param newAdminConsentRequestPolicy the object to create/update
     * @return the created AdminConsentRequestPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AdminConsentRequestPolicy put(final AdminConsentRequestPolicy newAdminConsentRequestPolicy) throws ClientException {
        return send(HttpMethod.PUT, newAdminConsentRequestPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAdminConsentRequestPolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AdminConsentRequestPolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAdminConsentRequestPolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AdminConsentRequestPolicyRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IAdminConsentRequestPolicyRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (AdminConsentRequestPolicyRequest)this;
     }

}

