// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DelegatedPermissionClassification;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Delegated Permission Classification Request.
 */
public class DelegatedPermissionClassificationRequest extends BaseRequest implements IDelegatedPermissionClassificationRequest {
	
    /**
     * The request for the DelegatedPermissionClassification
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DelegatedPermissionClassificationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DelegatedPermissionClassification.class);
    }

    /**
     * Gets the DelegatedPermissionClassification from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DelegatedPermissionClassification> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DelegatedPermissionClassification from the service
     *
     * @return the DelegatedPermissionClassification from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DelegatedPermissionClassification get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DelegatedPermissionClassification> callback) {
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
     * Patches this DelegatedPermissionClassification with a source
     *
     * @param sourceDelegatedPermissionClassification the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DelegatedPermissionClassification sourceDelegatedPermissionClassification, final ICallback<DelegatedPermissionClassification> callback) {
        send(HttpMethod.PATCH, callback, sourceDelegatedPermissionClassification);
    }

    /**
     * Patches this DelegatedPermissionClassification with a source
     *
     * @param sourceDelegatedPermissionClassification the source object with updates
     * @return the updated DelegatedPermissionClassification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DelegatedPermissionClassification patch(final DelegatedPermissionClassification sourceDelegatedPermissionClassification) throws ClientException {
        return send(HttpMethod.PATCH, sourceDelegatedPermissionClassification);
    }

    /**
     * Creates a DelegatedPermissionClassification with a new object
     *
     * @param newDelegatedPermissionClassification the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DelegatedPermissionClassification newDelegatedPermissionClassification, final ICallback<DelegatedPermissionClassification> callback) {
        send(HttpMethod.POST, callback, newDelegatedPermissionClassification);
    }

    /**
     * Creates a DelegatedPermissionClassification with a new object
     *
     * @param newDelegatedPermissionClassification the new object to create
     * @return the created DelegatedPermissionClassification
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DelegatedPermissionClassification post(final DelegatedPermissionClassification newDelegatedPermissionClassification) throws ClientException {
        return send(HttpMethod.POST, newDelegatedPermissionClassification);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDelegatedPermissionClassificationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DelegatedPermissionClassificationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDelegatedPermissionClassificationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DelegatedPermissionClassificationRequest)this;
     }

}
