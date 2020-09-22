// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryRoleAccessReviewPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Role Access Review Policy Request.
 */
public class DirectoryRoleAccessReviewPolicyRequest extends BaseRequest implements IDirectoryRoleAccessReviewPolicyRequest {
	
    /**
     * The request for the DirectoryRoleAccessReviewPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectoryRoleAccessReviewPolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectoryRoleAccessReviewPolicy.class);
    }

    /**
     * Gets the DirectoryRoleAccessReviewPolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DirectoryRoleAccessReviewPolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DirectoryRoleAccessReviewPolicy from the service
     *
     * @return the DirectoryRoleAccessReviewPolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRoleAccessReviewPolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DirectoryRoleAccessReviewPolicy> callback) {
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
     * Patches this DirectoryRoleAccessReviewPolicy with a source
     *
     * @param sourceDirectoryRoleAccessReviewPolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DirectoryRoleAccessReviewPolicy sourceDirectoryRoleAccessReviewPolicy, final ICallback<DirectoryRoleAccessReviewPolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceDirectoryRoleAccessReviewPolicy);
    }

    /**
     * Patches this DirectoryRoleAccessReviewPolicy with a source
     *
     * @param sourceDirectoryRoleAccessReviewPolicy the source object with updates
     * @return the updated DirectoryRoleAccessReviewPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRoleAccessReviewPolicy patch(final DirectoryRoleAccessReviewPolicy sourceDirectoryRoleAccessReviewPolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceDirectoryRoleAccessReviewPolicy);
    }

    /**
     * Creates a DirectoryRoleAccessReviewPolicy with a new object
     *
     * @param newDirectoryRoleAccessReviewPolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DirectoryRoleAccessReviewPolicy newDirectoryRoleAccessReviewPolicy, final ICallback<DirectoryRoleAccessReviewPolicy> callback) {
        send(HttpMethod.POST, callback, newDirectoryRoleAccessReviewPolicy);
    }

    /**
     * Creates a DirectoryRoleAccessReviewPolicy with a new object
     *
     * @param newDirectoryRoleAccessReviewPolicy the new object to create
     * @return the created DirectoryRoleAccessReviewPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRoleAccessReviewPolicy post(final DirectoryRoleAccessReviewPolicy newDirectoryRoleAccessReviewPolicy) throws ClientException {
        return send(HttpMethod.POST, newDirectoryRoleAccessReviewPolicy);
    }

    /**
     * Creates a DirectoryRoleAccessReviewPolicy with a new object
     *
     * @param newDirectoryRoleAccessReviewPolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DirectoryRoleAccessReviewPolicy newDirectoryRoleAccessReviewPolicy, final ICallback<DirectoryRoleAccessReviewPolicy> callback) {
        send(HttpMethod.PUT, callback, newDirectoryRoleAccessReviewPolicy);
    }

    /**
     * Creates a DirectoryRoleAccessReviewPolicy with a new object
     *
     * @param newDirectoryRoleAccessReviewPolicy the object to create/update
     * @return the created DirectoryRoleAccessReviewPolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectoryRoleAccessReviewPolicy put(final DirectoryRoleAccessReviewPolicy newDirectoryRoleAccessReviewPolicy) throws ClientException {
        return send(HttpMethod.PUT, newDirectoryRoleAccessReviewPolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDirectoryRoleAccessReviewPolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DirectoryRoleAccessReviewPolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDirectoryRoleAccessReviewPolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DirectoryRoleAccessReviewPolicyRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IDirectoryRoleAccessReviewPolicyRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (DirectoryRoleAccessReviewPolicyRequest)this;
     }

}

