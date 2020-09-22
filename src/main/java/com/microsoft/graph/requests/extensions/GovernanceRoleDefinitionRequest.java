// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceRoleDefinition;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Definition Request.
 */
public class GovernanceRoleDefinitionRequest extends BaseRequest implements IGovernanceRoleDefinitionRequest {
	
    /**
     * The request for the GovernanceRoleDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceRoleDefinitionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GovernanceRoleDefinition.class);
    }

    /**
     * Gets the GovernanceRoleDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GovernanceRoleDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GovernanceRoleDefinition from the service
     *
     * @return the GovernanceRoleDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceRoleDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GovernanceRoleDefinition> callback) {
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
     * Patches this GovernanceRoleDefinition with a source
     *
     * @param sourceGovernanceRoleDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GovernanceRoleDefinition sourceGovernanceRoleDefinition, final ICallback<GovernanceRoleDefinition> callback) {
        send(HttpMethod.PATCH, callback, sourceGovernanceRoleDefinition);
    }

    /**
     * Patches this GovernanceRoleDefinition with a source
     *
     * @param sourceGovernanceRoleDefinition the source object with updates
     * @return the updated GovernanceRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceRoleDefinition patch(final GovernanceRoleDefinition sourceGovernanceRoleDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceGovernanceRoleDefinition);
    }

    /**
     * Creates a GovernanceRoleDefinition with a new object
     *
     * @param newGovernanceRoleDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GovernanceRoleDefinition newGovernanceRoleDefinition, final ICallback<GovernanceRoleDefinition> callback) {
        send(HttpMethod.POST, callback, newGovernanceRoleDefinition);
    }

    /**
     * Creates a GovernanceRoleDefinition with a new object
     *
     * @param newGovernanceRoleDefinition the new object to create
     * @return the created GovernanceRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceRoleDefinition post(final GovernanceRoleDefinition newGovernanceRoleDefinition) throws ClientException {
        return send(HttpMethod.POST, newGovernanceRoleDefinition);
    }

    /**
     * Creates a GovernanceRoleDefinition with a new object
     *
     * @param newGovernanceRoleDefinition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final GovernanceRoleDefinition newGovernanceRoleDefinition, final ICallback<GovernanceRoleDefinition> callback) {
        send(HttpMethod.PUT, callback, newGovernanceRoleDefinition);
    }

    /**
     * Creates a GovernanceRoleDefinition with a new object
     *
     * @param newGovernanceRoleDefinition the object to create/update
     * @return the created GovernanceRoleDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GovernanceRoleDefinition put(final GovernanceRoleDefinition newGovernanceRoleDefinition) throws ClientException {
        return send(HttpMethod.PUT, newGovernanceRoleDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGovernanceRoleDefinitionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GovernanceRoleDefinitionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGovernanceRoleDefinitionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GovernanceRoleDefinitionRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IGovernanceRoleDefinitionRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (GovernanceRoleDefinitionRequest)this;
     }

}

