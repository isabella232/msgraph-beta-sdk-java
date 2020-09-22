// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ExactMatchUploadAgent;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Upload Agent Request.
 */
public class ExactMatchUploadAgentRequest extends BaseRequest implements IExactMatchUploadAgentRequest {
	
    /**
     * The request for the ExactMatchUploadAgent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExactMatchUploadAgentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ExactMatchUploadAgent.class);
    }

    /**
     * Gets the ExactMatchUploadAgent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ExactMatchUploadAgent> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ExactMatchUploadAgent from the service
     *
     * @return the ExactMatchUploadAgent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExactMatchUploadAgent get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ExactMatchUploadAgent> callback) {
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
     * Patches this ExactMatchUploadAgent with a source
     *
     * @param sourceExactMatchUploadAgent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ExactMatchUploadAgent sourceExactMatchUploadAgent, final ICallback<ExactMatchUploadAgent> callback) {
        send(HttpMethod.PATCH, callback, sourceExactMatchUploadAgent);
    }

    /**
     * Patches this ExactMatchUploadAgent with a source
     *
     * @param sourceExactMatchUploadAgent the source object with updates
     * @return the updated ExactMatchUploadAgent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExactMatchUploadAgent patch(final ExactMatchUploadAgent sourceExactMatchUploadAgent) throws ClientException {
        return send(HttpMethod.PATCH, sourceExactMatchUploadAgent);
    }

    /**
     * Creates a ExactMatchUploadAgent with a new object
     *
     * @param newExactMatchUploadAgent the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ExactMatchUploadAgent newExactMatchUploadAgent, final ICallback<ExactMatchUploadAgent> callback) {
        send(HttpMethod.POST, callback, newExactMatchUploadAgent);
    }

    /**
     * Creates a ExactMatchUploadAgent with a new object
     *
     * @param newExactMatchUploadAgent the new object to create
     * @return the created ExactMatchUploadAgent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExactMatchUploadAgent post(final ExactMatchUploadAgent newExactMatchUploadAgent) throws ClientException {
        return send(HttpMethod.POST, newExactMatchUploadAgent);
    }

    /**
     * Creates a ExactMatchUploadAgent with a new object
     *
     * @param newExactMatchUploadAgent the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ExactMatchUploadAgent newExactMatchUploadAgent, final ICallback<ExactMatchUploadAgent> callback) {
        send(HttpMethod.PUT, callback, newExactMatchUploadAgent);
    }

    /**
     * Creates a ExactMatchUploadAgent with a new object
     *
     * @param newExactMatchUploadAgent the object to create/update
     * @return the created ExactMatchUploadAgent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ExactMatchUploadAgent put(final ExactMatchUploadAgent newExactMatchUploadAgent) throws ClientException {
        return send(HttpMethod.PUT, newExactMatchUploadAgent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IExactMatchUploadAgentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ExactMatchUploadAgentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IExactMatchUploadAgentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ExactMatchUploadAgentRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IExactMatchUploadAgentRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (ExactMatchUploadAgentRequest)this;
     }

}

