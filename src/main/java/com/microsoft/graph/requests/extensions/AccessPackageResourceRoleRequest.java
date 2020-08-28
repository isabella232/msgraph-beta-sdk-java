// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageResourceRole;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Role Request.
 */
public class AccessPackageResourceRoleRequest extends BaseRequest implements IAccessPackageResourceRoleRequest {
	
    /**
     * The request for the AccessPackageResourceRole
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageResourceRoleRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageResourceRole.class);
    }

    /**
     * Gets the AccessPackageResourceRole from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AccessPackageResourceRole> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AccessPackageResourceRole from the service
     *
     * @return the AccessPackageResourceRole from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageResourceRole get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AccessPackageResourceRole> callback) {
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
     * Patches this AccessPackageResourceRole with a source
     *
     * @param sourceAccessPackageResourceRole the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AccessPackageResourceRole sourceAccessPackageResourceRole, final ICallback<AccessPackageResourceRole> callback) {
        send(HttpMethod.PATCH, callback, sourceAccessPackageResourceRole);
    }

    /**
     * Patches this AccessPackageResourceRole with a source
     *
     * @param sourceAccessPackageResourceRole the source object with updates
     * @return the updated AccessPackageResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageResourceRole patch(final AccessPackageResourceRole sourceAccessPackageResourceRole) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessPackageResourceRole);
    }

    /**
     * Creates a AccessPackageResourceRole with a new object
     *
     * @param newAccessPackageResourceRole the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AccessPackageResourceRole newAccessPackageResourceRole, final ICallback<AccessPackageResourceRole> callback) {
        send(HttpMethod.POST, callback, newAccessPackageResourceRole);
    }

    /**
     * Creates a AccessPackageResourceRole with a new object
     *
     * @param newAccessPackageResourceRole the new object to create
     * @return the created AccessPackageResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageResourceRole post(final AccessPackageResourceRole newAccessPackageResourceRole) throws ClientException {
        return send(HttpMethod.POST, newAccessPackageResourceRole);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAccessPackageResourceRoleRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AccessPackageResourceRoleRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAccessPackageResourceRoleRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AccessPackageResourceRoleRequest)this;
     }

}

