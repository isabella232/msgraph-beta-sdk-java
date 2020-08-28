// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentResourceRole;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageSubjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Resource Role Request.
 */
public class AccessPackageAssignmentResourceRoleRequest extends BaseRequest implements IAccessPackageAssignmentResourceRoleRequest {
	
    /**
     * The request for the AccessPackageAssignmentResourceRole
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentResourceRoleRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackageAssignmentResourceRole.class);
    }

    /**
     * Gets the AccessPackageAssignmentResourceRole from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AccessPackageAssignmentResourceRole> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AccessPackageAssignmentResourceRole from the service
     *
     * @return the AccessPackageAssignmentResourceRole from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageAssignmentResourceRole get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AccessPackageAssignmentResourceRole> callback) {
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
     * Patches this AccessPackageAssignmentResourceRole with a source
     *
     * @param sourceAccessPackageAssignmentResourceRole the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AccessPackageAssignmentResourceRole sourceAccessPackageAssignmentResourceRole, final ICallback<AccessPackageAssignmentResourceRole> callback) {
        send(HttpMethod.PATCH, callback, sourceAccessPackageAssignmentResourceRole);
    }

    /**
     * Patches this AccessPackageAssignmentResourceRole with a source
     *
     * @param sourceAccessPackageAssignmentResourceRole the source object with updates
     * @return the updated AccessPackageAssignmentResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageAssignmentResourceRole patch(final AccessPackageAssignmentResourceRole sourceAccessPackageAssignmentResourceRole) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessPackageAssignmentResourceRole);
    }

    /**
     * Creates a AccessPackageAssignmentResourceRole with a new object
     *
     * @param newAccessPackageAssignmentResourceRole the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AccessPackageAssignmentResourceRole newAccessPackageAssignmentResourceRole, final ICallback<AccessPackageAssignmentResourceRole> callback) {
        send(HttpMethod.POST, callback, newAccessPackageAssignmentResourceRole);
    }

    /**
     * Creates a AccessPackageAssignmentResourceRole with a new object
     *
     * @param newAccessPackageAssignmentResourceRole the new object to create
     * @return the created AccessPackageAssignmentResourceRole
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackageAssignmentResourceRole post(final AccessPackageAssignmentResourceRole newAccessPackageAssignmentResourceRole) throws ClientException {
        return send(HttpMethod.POST, newAccessPackageAssignmentResourceRole);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAccessPackageAssignmentResourceRoleRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AccessPackageAssignmentResourceRoleRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAccessPackageAssignmentResourceRoleRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AccessPackageAssignmentResourceRoleRequest)this;
     }

}

