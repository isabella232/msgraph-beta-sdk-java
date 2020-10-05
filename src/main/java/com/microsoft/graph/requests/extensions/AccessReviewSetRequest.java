// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessReviewSet;
import com.microsoft.graph.requests.extensions.IAccessReviewScheduleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewScheduleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewScheduleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewScheduleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Set Request.
 */
public class AccessReviewSetRequest extends BaseRequest implements IAccessReviewSetRequest {
	
    /**
     * The request for the AccessReviewSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewSetRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessReviewSet.class);
    }

    /**
     * Gets the AccessReviewSet from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AccessReviewSet> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AccessReviewSet from the service
     *
     * @return the AccessReviewSet from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReviewSet get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AccessReviewSet> callback) {
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
     * Patches this AccessReviewSet with a source
     *
     * @param sourceAccessReviewSet the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AccessReviewSet sourceAccessReviewSet, final ICallback<? super AccessReviewSet> callback) {
        send(HttpMethod.PATCH, callback, sourceAccessReviewSet);
    }

    /**
     * Patches this AccessReviewSet with a source
     *
     * @param sourceAccessReviewSet the source object with updates
     * @return the updated AccessReviewSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReviewSet patch(final AccessReviewSet sourceAccessReviewSet) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessReviewSet);
    }

    /**
     * Creates a AccessReviewSet with a new object
     *
     * @param newAccessReviewSet the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AccessReviewSet newAccessReviewSet, final ICallback<? super AccessReviewSet> callback) {
        send(HttpMethod.POST, callback, newAccessReviewSet);
    }

    /**
     * Creates a AccessReviewSet with a new object
     *
     * @param newAccessReviewSet the new object to create
     * @return the created AccessReviewSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReviewSet post(final AccessReviewSet newAccessReviewSet) throws ClientException {
        return send(HttpMethod.POST, newAccessReviewSet);
    }

    /**
     * Creates a AccessReviewSet with a new object
     *
     * @param newAccessReviewSet the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AccessReviewSet newAccessReviewSet, final ICallback<? super AccessReviewSet> callback) {
        send(HttpMethod.PUT, callback, newAccessReviewSet);
    }

    /**
     * Creates a AccessReviewSet with a new object
     *
     * @param newAccessReviewSet the object to create/update
     * @return the created AccessReviewSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReviewSet put(final AccessReviewSet newAccessReviewSet) throws ClientException {
        return send(HttpMethod.PUT, newAccessReviewSet);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAccessReviewSetRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AccessReviewSetRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAccessReviewSetRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AccessReviewSetRequest)this;
     }

}

