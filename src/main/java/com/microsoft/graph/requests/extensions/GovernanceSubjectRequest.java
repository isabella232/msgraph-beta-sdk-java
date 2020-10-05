// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceSubject;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Subject Request.
 */
public class GovernanceSubjectRequest extends BaseRequest implements IGovernanceSubjectRequest {
	
    /**
     * The request for the GovernanceSubject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceSubjectRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GovernanceSubject.class);
    }

    /**
     * Gets the GovernanceSubject from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super GovernanceSubject> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GovernanceSubject from the service
     *
     * @return the GovernanceSubject from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceSubject get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super GovernanceSubject> callback) {
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
     * Patches this GovernanceSubject with a source
     *
     * @param sourceGovernanceSubject the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GovernanceSubject sourceGovernanceSubject, final ICallback<? super GovernanceSubject> callback) {
        send(HttpMethod.PATCH, callback, sourceGovernanceSubject);
    }

    /**
     * Patches this GovernanceSubject with a source
     *
     * @param sourceGovernanceSubject the source object with updates
     * @return the updated GovernanceSubject
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceSubject patch(final GovernanceSubject sourceGovernanceSubject) throws ClientException {
        return send(HttpMethod.PATCH, sourceGovernanceSubject);
    }

    /**
     * Creates a GovernanceSubject with a new object
     *
     * @param newGovernanceSubject the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GovernanceSubject newGovernanceSubject, final ICallback<? super GovernanceSubject> callback) {
        send(HttpMethod.POST, callback, newGovernanceSubject);
    }

    /**
     * Creates a GovernanceSubject with a new object
     *
     * @param newGovernanceSubject the new object to create
     * @return the created GovernanceSubject
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceSubject post(final GovernanceSubject newGovernanceSubject) throws ClientException {
        return send(HttpMethod.POST, newGovernanceSubject);
    }

    /**
     * Creates a GovernanceSubject with a new object
     *
     * @param newGovernanceSubject the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final GovernanceSubject newGovernanceSubject, final ICallback<? super GovernanceSubject> callback) {
        send(HttpMethod.PUT, callback, newGovernanceSubject);
    }

    /**
     * Creates a GovernanceSubject with a new object
     *
     * @param newGovernanceSubject the object to create/update
     * @return the created GovernanceSubject
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceSubject put(final GovernanceSubject newGovernanceSubject) throws ClientException {
        return send(HttpMethod.PUT, newGovernanceSubject);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGovernanceSubjectRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GovernanceSubjectRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGovernanceSubjectRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GovernanceSubjectRequest)this;
     }

}

