// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationPointsOutcome;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Points Outcome Request.
 */
public class EducationPointsOutcomeRequest extends BaseRequest implements IEducationPointsOutcomeRequest {
	
    /**
     * The request for the EducationPointsOutcome
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationPointsOutcomeRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationPointsOutcome.class);
    }

    /**
     * Gets the EducationPointsOutcome from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EducationPointsOutcome> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EducationPointsOutcome from the service
     *
     * @return the EducationPointsOutcome from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationPointsOutcome get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<EducationPointsOutcome> callback) {
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
     * Patches this EducationPointsOutcome with a source
     *
     * @param sourceEducationPointsOutcome the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EducationPointsOutcome sourceEducationPointsOutcome, final ICallback<EducationPointsOutcome> callback) {
        send(HttpMethod.PATCH, callback, sourceEducationPointsOutcome);
    }

    /**
     * Patches this EducationPointsOutcome with a source
     *
     * @param sourceEducationPointsOutcome the source object with updates
     * @return the updated EducationPointsOutcome
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationPointsOutcome patch(final EducationPointsOutcome sourceEducationPointsOutcome) throws ClientException {
        return send(HttpMethod.PATCH, sourceEducationPointsOutcome);
    }

    /**
     * Creates a EducationPointsOutcome with a new object
     *
     * @param newEducationPointsOutcome the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EducationPointsOutcome newEducationPointsOutcome, final ICallback<EducationPointsOutcome> callback) {
        send(HttpMethod.POST, callback, newEducationPointsOutcome);
    }

    /**
     * Creates a EducationPointsOutcome with a new object
     *
     * @param newEducationPointsOutcome the new object to create
     * @return the created EducationPointsOutcome
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EducationPointsOutcome post(final EducationPointsOutcome newEducationPointsOutcome) throws ClientException {
        return send(HttpMethod.POST, newEducationPointsOutcome);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEducationPointsOutcomeRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EducationPointsOutcomeRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEducationPointsOutcomeRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EducationPointsOutcomeRequest)this;
     }

}

