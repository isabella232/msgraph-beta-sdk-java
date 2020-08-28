// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ExternalGroup;
import com.microsoft.graph.requests.extensions.IExternalGroupMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalGroupMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.ExternalGroupMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExternalGroupMemberRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Group Request.
 */
public class ExternalGroupRequest extends BaseRequest implements IExternalGroupRequest {
	
    /**
     * The request for the ExternalGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExternalGroupRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ExternalGroup.class);
    }

    /**
     * Gets the ExternalGroup from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ExternalGroup> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ExternalGroup from the service
     *
     * @return the ExternalGroup from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExternalGroup get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ExternalGroup> callback) {
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
     * Patches this ExternalGroup with a source
     *
     * @param sourceExternalGroup the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ExternalGroup sourceExternalGroup, final ICallback<ExternalGroup> callback) {
        send(HttpMethod.PATCH, callback, sourceExternalGroup);
    }

    /**
     * Patches this ExternalGroup with a source
     *
     * @param sourceExternalGroup the source object with updates
     * @return the updated ExternalGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExternalGroup patch(final ExternalGroup sourceExternalGroup) throws ClientException {
        return send(HttpMethod.PATCH, sourceExternalGroup);
    }

    /**
     * Creates a ExternalGroup with a new object
     *
     * @param newExternalGroup the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ExternalGroup newExternalGroup, final ICallback<ExternalGroup> callback) {
        send(HttpMethod.POST, callback, newExternalGroup);
    }

    /**
     * Creates a ExternalGroup with a new object
     *
     * @param newExternalGroup the new object to create
     * @return the created ExternalGroup
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExternalGroup post(final ExternalGroup newExternalGroup) throws ClientException {
        return send(HttpMethod.POST, newExternalGroup);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IExternalGroupRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ExternalGroupRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IExternalGroupRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ExternalGroupRequest)this;
     }

}

