// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Operation Request.
 */
public class GroupPolicyOperationRequest extends BaseRequest implements IGroupPolicyOperationRequest {
	
    /**
     * The request for the GroupPolicyOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyOperationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyOperation.class);
    }

    /**
     * Gets the GroupPolicyOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GroupPolicyOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupPolicyOperation from the service
     *
     * @return the GroupPolicyOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GroupPolicyOperation> callback) {
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
     * Patches this GroupPolicyOperation with a source
     *
     * @param sourceGroupPolicyOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GroupPolicyOperation sourceGroupPolicyOperation, final ICallback<GroupPolicyOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupPolicyOperation);
    }

    /**
     * Patches this GroupPolicyOperation with a source
     *
     * @param sourceGroupPolicyOperation the source object with updates
     * @return the updated GroupPolicyOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyOperation patch(final GroupPolicyOperation sourceGroupPolicyOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyOperation);
    }

    /**
     * Creates a GroupPolicyOperation with a new object
     *
     * @param newGroupPolicyOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GroupPolicyOperation newGroupPolicyOperation, final ICallback<GroupPolicyOperation> callback) {
        send(HttpMethod.POST, callback, newGroupPolicyOperation);
    }

    /**
     * Creates a GroupPolicyOperation with a new object
     *
     * @param newGroupPolicyOperation the new object to create
     * @return the created GroupPolicyOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyOperation post(final GroupPolicyOperation newGroupPolicyOperation) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupPolicyOperationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GroupPolicyOperationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupPolicyOperationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GroupPolicyOperationRequest)this;
     }

}

