// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.termstore.models.extensions.Group;
import com.microsoft.graph.termstore.requests.extensions.ISetCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ISetRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.SetCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.SetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Request.
 */
public class GroupRequest extends BaseRequest implements IGroupRequest {
	
    /**
     * The request for the Group
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Group.class);
    }

    /**
     * Gets the Group from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Group> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Group from the service
     *
     * @return the Group from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Group get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Group> callback) {
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
     * Patches this Group with a source
     *
     * @param sourceGroup the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Group sourceGroup, final ICallback<? super Group> callback) {
        send(HttpMethod.PATCH, callback, sourceGroup);
    }

    /**
     * Patches this Group with a source
     *
     * @param sourceGroup the source object with updates
     * @return the updated Group
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Group patch(final Group sourceGroup) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroup);
    }

    /**
     * Creates a Group with a new object
     *
     * @param newGroup the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Group newGroup, final ICallback<? super Group> callback) {
        send(HttpMethod.POST, callback, newGroup);
    }

    /**
     * Creates a Group with a new object
     *
     * @param newGroup the new object to create
     * @return the created Group
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Group post(final Group newGroup) throws ClientException {
        return send(HttpMethod.POST, newGroup);
    }

    /**
     * Creates a Group with a new object
     *
     * @param newGroup the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Group newGroup, final ICallback<? super Group> callback) {
        send(HttpMethod.PUT, callback, newGroup);
    }

    /**
     * Creates a Group with a new object
     *
     * @param newGroup the object to create/update
     * @return the created Group
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Group put(final Group newGroup) throws ClientException {
        return send(HttpMethod.PUT, newGroup);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GroupRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GroupRequest)this;
     }

}

