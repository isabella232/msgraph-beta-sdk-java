// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessReviewInstance;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceDecisionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewInstanceDecisionItemRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceDecisionItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewInstanceDecisionItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessReviewScheduleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessReviewScheduleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance Request.
 */
public class AccessReviewInstanceRequest extends BaseRequest implements IAccessReviewInstanceRequest {
	
    /**
     * The request for the AccessReviewInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessReviewInstanceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AccessReviewInstance.class);
    }

    /**
     * Gets the AccessReviewInstance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AccessReviewInstance> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AccessReviewInstance from the service
     *
     * @return the AccessReviewInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReviewInstance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AccessReviewInstance> callback) {
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
     * Patches this AccessReviewInstance with a source
     *
     * @param sourceAccessReviewInstance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AccessReviewInstance sourceAccessReviewInstance, final ICallback<AccessReviewInstance> callback) {
        send(HttpMethod.PATCH, callback, sourceAccessReviewInstance);
    }

    /**
     * Patches this AccessReviewInstance with a source
     *
     * @param sourceAccessReviewInstance the source object with updates
     * @return the updated AccessReviewInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReviewInstance patch(final AccessReviewInstance sourceAccessReviewInstance) throws ClientException {
        return send(HttpMethod.PATCH, sourceAccessReviewInstance);
    }

    /**
     * Creates a AccessReviewInstance with a new object
     *
     * @param newAccessReviewInstance the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AccessReviewInstance newAccessReviewInstance, final ICallback<AccessReviewInstance> callback) {
        send(HttpMethod.POST, callback, newAccessReviewInstance);
    }

    /**
     * Creates a AccessReviewInstance with a new object
     *
     * @param newAccessReviewInstance the new object to create
     * @return the created AccessReviewInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AccessReviewInstance post(final AccessReviewInstance newAccessReviewInstance) throws ClientException {
        return send(HttpMethod.POST, newAccessReviewInstance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAccessReviewInstanceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AccessReviewInstanceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAccessReviewInstanceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AccessReviewInstanceRequest)this;
     }

}
