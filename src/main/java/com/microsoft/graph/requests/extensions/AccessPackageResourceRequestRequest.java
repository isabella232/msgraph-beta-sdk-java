// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageResourceRequest;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageSubjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Request Request.
 */
public class AccessPackageResourceRequestRequest extends BaseRequest implements IAccessPackageResourceRequestRequest {
	
    /**
     * The request for the AccessPackageResourceRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageResourceRequestRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageResourceRequest.class);
    }

    /**
     * Gets the AccessPackageResourceRequest from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AccessPackageResourceRequest> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AccessPackageResourceRequest from the service
     *
     * @return the AccessPackageResourceRequest from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageResourceRequest get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AccessPackageResourceRequest> callback) {
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
     * Patches this AccessPackageResourceRequest with a source
     *
     * @param sourceAccessPackageResourceRequest the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AccessPackageResourceRequest sourceAccessPackageResourceRequest, final ICallback<AccessPackageResourceRequest> callback) {
        send(HttpMethod.PATCH, callback, sourceAccessPackageResourceRequest);
    }

    /**
     * Patches this AccessPackageResourceRequest with a source
     *
     * @param sourceAccessPackageResourceRequest the source object with updates
     * @return the updated AccessPackageResourceRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageResourceRequest patch(final AccessPackageResourceRequest sourceAccessPackageResourceRequest) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessPackageResourceRequest);
    }

    /**
     * Creates a AccessPackageResourceRequest with a new object
     *
     * @param newAccessPackageResourceRequest the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AccessPackageResourceRequest newAccessPackageResourceRequest, final ICallback<AccessPackageResourceRequest> callback) {
        send(HttpMethod.POST, callback, newAccessPackageResourceRequest);
    }

    /**
     * Creates a AccessPackageResourceRequest with a new object
     *
     * @param newAccessPackageResourceRequest the new object to create
     * @return the created AccessPackageResourceRequest
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageResourceRequest post(final AccessPackageResourceRequest newAccessPackageResourceRequest) throws ClientException {
        return send(HttpMethod.POST, newAccessPackageResourceRequest);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAccessPackageResourceRequestRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AccessPackageResourceRequestRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAccessPackageResourceRequestRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AccessPackageResourceRequestRequest)this;
     }

}

