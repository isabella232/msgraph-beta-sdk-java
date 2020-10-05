// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SynchronizationSchema;
import com.microsoft.graph.models.extensions.ExpressionInputObject;
import com.microsoft.graph.models.extensions.AttributeDefinition;
import com.microsoft.graph.models.extensions.ParseExpressionResponse;
import com.microsoft.graph.models.extensions.FilterOperatorSchema;
import com.microsoft.graph.models.extensions.AttributeMappingFunctionSchema;
import com.microsoft.graph.requests.extensions.IDirectoryDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Schema Request.
 */
public class SynchronizationSchemaRequest extends BaseRequest implements ISynchronizationSchemaRequest {
	
    /**
     * The request for the SynchronizationSchema
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationSchemaRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SynchronizationSchema.class);
    }

    /**
     * Gets the SynchronizationSchema from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super SynchronizationSchema> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SynchronizationSchema from the service
     *
     * @return the SynchronizationSchema from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SynchronizationSchema get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super SynchronizationSchema> callback) {
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
     * Patches this SynchronizationSchema with a source
     *
     * @param sourceSynchronizationSchema the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SynchronizationSchema sourceSynchronizationSchema, final ICallback<? super SynchronizationSchema> callback) {
        send(HttpMethod.PATCH, callback, sourceSynchronizationSchema);
    }

    /**
     * Patches this SynchronizationSchema with a source
     *
     * @param sourceSynchronizationSchema the source object with updates
     * @return the updated SynchronizationSchema
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SynchronizationSchema patch(final SynchronizationSchema sourceSynchronizationSchema) throws ClientException {
        return send(HttpMethod.PATCH, sourceSynchronizationSchema);
    }

    /**
     * Creates a SynchronizationSchema with a new object
     *
     * @param newSynchronizationSchema the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SynchronizationSchema newSynchronizationSchema, final ICallback<? super SynchronizationSchema> callback) {
        send(HttpMethod.POST, callback, newSynchronizationSchema);
    }

    /**
     * Creates a SynchronizationSchema with a new object
     *
     * @param newSynchronizationSchema the new object to create
     * @return the created SynchronizationSchema
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SynchronizationSchema post(final SynchronizationSchema newSynchronizationSchema) throws ClientException {
        return send(HttpMethod.POST, newSynchronizationSchema);
    }

    /**
     * Creates a SynchronizationSchema with a new object
     *
     * @param newSynchronizationSchema the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SynchronizationSchema newSynchronizationSchema, final ICallback<? super SynchronizationSchema> callback) {
        send(HttpMethod.PUT, callback, newSynchronizationSchema);
    }

    /**
     * Creates a SynchronizationSchema with a new object
     *
     * @param newSynchronizationSchema the object to create/update
     * @return the created SynchronizationSchema
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SynchronizationSchema put(final SynchronizationSchema newSynchronizationSchema) throws ClientException {
        return send(HttpMethod.PUT, newSynchronizationSchema);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISynchronizationSchemaRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SynchronizationSchemaRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISynchronizationSchemaRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SynchronizationSchemaRequest)this;
     }

}

