// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsApp;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITeamsAppDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TeamsAppDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Request.
 */
public class TeamsAppRequest extends BaseRequest implements ITeamsAppRequest {
	
    /**
     * The request for the TeamsApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsApp.class);
    }

    /**
     * Gets the TeamsApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<TeamsApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TeamsApp from the service
     *
     * @return the TeamsApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<TeamsApp> callback) {
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
     * Patches this TeamsApp with a source
     *
     * @param sourceTeamsApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TeamsApp sourceTeamsApp, final ICallback<TeamsApp> callback) {
        send(HttpMethod.PATCH, callback, sourceTeamsApp);
    }

    /**
     * Patches this TeamsApp with a source
     *
     * @param sourceTeamsApp the source object with updates
     * @return the updated TeamsApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsApp patch(final TeamsApp sourceTeamsApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsApp);
    }

    /**
     * Creates a TeamsApp with a new object
     *
     * @param newTeamsApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TeamsApp newTeamsApp, final ICallback<TeamsApp> callback) {
        send(HttpMethod.POST, callback, newTeamsApp);
    }

    /**
     * Creates a TeamsApp with a new object
     *
     * @param newTeamsApp the new object to create
     * @return the created TeamsApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TeamsApp post(final TeamsApp newTeamsApp) throws ClientException {
        return send(HttpMethod.POST, newTeamsApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITeamsAppRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TeamsAppRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITeamsAppRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TeamsAppRequest)this;
     }

}

