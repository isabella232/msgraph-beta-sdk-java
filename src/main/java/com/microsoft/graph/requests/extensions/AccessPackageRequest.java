// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackage;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageResourceRoleScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageResourceRoleScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageCatalogRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageCatalogRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Request.
 */
public class AccessPackageRequest extends BaseRequest implements IAccessPackageRequest {
	
    /**
     * The request for the AccessPackage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessPackage.class);
    }

    /**
     * Gets the AccessPackage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AccessPackage> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AccessPackage from the service
     *
     * @return the AccessPackage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackage get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AccessPackage> callback) {
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
     * Patches this AccessPackage with a source
     *
     * @param sourceAccessPackage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AccessPackage sourceAccessPackage, final ICallback<? super AccessPackage> callback) {
        send(HttpMethod.PATCH, callback, sourceAccessPackage);
    }

    /**
     * Patches this AccessPackage with a source
     *
     * @param sourceAccessPackage the source object with updates
     * @return the updated AccessPackage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackage patch(final AccessPackage sourceAccessPackage) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessPackage);
    }

    /**
     * Creates a AccessPackage with a new object
     *
     * @param newAccessPackage the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AccessPackage newAccessPackage, final ICallback<? super AccessPackage> callback) {
        send(HttpMethod.POST, callback, newAccessPackage);
    }

    /**
     * Creates a AccessPackage with a new object
     *
     * @param newAccessPackage the new object to create
     * @return the created AccessPackage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackage post(final AccessPackage newAccessPackage) throws ClientException {
        return send(HttpMethod.POST, newAccessPackage);
    }

    /**
     * Creates a AccessPackage with a new object
     *
     * @param newAccessPackage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AccessPackage newAccessPackage, final ICallback<? super AccessPackage> callback) {
        send(HttpMethod.PUT, callback, newAccessPackage);
    }

    /**
     * Creates a AccessPackage with a new object
     *
     * @param newAccessPackage the object to create/update
     * @return the created AccessPackage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessPackage put(final AccessPackage newAccessPackage) throws ClientException {
        return send(HttpMethod.PUT, newAccessPackage);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAccessPackageRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AccessPackageRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAccessPackageRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AccessPackageRequest)this;
     }

}

