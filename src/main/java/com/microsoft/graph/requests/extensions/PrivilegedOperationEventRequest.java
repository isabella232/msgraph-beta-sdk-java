// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedOperationEvent;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Operation Event Request.
 */
public class PrivilegedOperationEventRequest extends BaseRequest implements IPrivilegedOperationEventRequest {
	
    /**
     * The request for the PrivilegedOperationEvent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedOperationEventRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedOperationEvent.class);
    }

    /**
     * Gets the PrivilegedOperationEvent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PrivilegedOperationEvent> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrivilegedOperationEvent from the service
     *
     * @return the PrivilegedOperationEvent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedOperationEvent get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PrivilegedOperationEvent> callback) {
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
     * Patches this PrivilegedOperationEvent with a source
     *
     * @param sourcePrivilegedOperationEvent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PrivilegedOperationEvent sourcePrivilegedOperationEvent, final ICallback<PrivilegedOperationEvent> callback) {
        send(HttpMethod.PATCH, callback, sourcePrivilegedOperationEvent);
    }

    /**
     * Patches this PrivilegedOperationEvent with a source
     *
     * @param sourcePrivilegedOperationEvent the source object with updates
     * @return the updated PrivilegedOperationEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedOperationEvent patch(final PrivilegedOperationEvent sourcePrivilegedOperationEvent) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrivilegedOperationEvent);
    }

    /**
     * Creates a PrivilegedOperationEvent with a new object
     *
     * @param newPrivilegedOperationEvent the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PrivilegedOperationEvent newPrivilegedOperationEvent, final ICallback<PrivilegedOperationEvent> callback) {
        send(HttpMethod.POST, callback, newPrivilegedOperationEvent);
    }

    /**
     * Creates a PrivilegedOperationEvent with a new object
     *
     * @param newPrivilegedOperationEvent the new object to create
     * @return the created PrivilegedOperationEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedOperationEvent post(final PrivilegedOperationEvent newPrivilegedOperationEvent) throws ClientException {
        return send(HttpMethod.POST, newPrivilegedOperationEvent);
    }

    /**
     * Creates a PrivilegedOperationEvent with a new object
     *
     * @param newPrivilegedOperationEvent the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PrivilegedOperationEvent newPrivilegedOperationEvent, final ICallback<PrivilegedOperationEvent> callback) {
        send(HttpMethod.PUT, callback, newPrivilegedOperationEvent);
    }

    /**
     * Creates a PrivilegedOperationEvent with a new object
     *
     * @param newPrivilegedOperationEvent the object to create/update
     * @return the created PrivilegedOperationEvent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrivilegedOperationEvent put(final PrivilegedOperationEvent newPrivilegedOperationEvent) throws ClientException {
        return send(HttpMethod.PUT, newPrivilegedOperationEvent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPrivilegedOperationEventRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PrivilegedOperationEventRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPrivilegedOperationEventRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PrivilegedOperationEventRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IPrivilegedOperationEventRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (PrivilegedOperationEventRequest)this;
     }

}

