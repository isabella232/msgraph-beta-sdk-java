// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidForWorkAppConfigurationSchema;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work App Configuration Schema Request.
 */
public class AndroidForWorkAppConfigurationSchemaRequest extends BaseRequest implements IAndroidForWorkAppConfigurationSchemaRequest {
	
    /**
     * The request for the AndroidForWorkAppConfigurationSchema
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkAppConfigurationSchemaRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkAppConfigurationSchema.class);
    }

    /**
     * Gets the AndroidForWorkAppConfigurationSchema from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AndroidForWorkAppConfigurationSchema> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidForWorkAppConfigurationSchema from the service
     *
     * @return the AndroidForWorkAppConfigurationSchema from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkAppConfigurationSchema get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AndroidForWorkAppConfigurationSchema> callback) {
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
     * Patches this AndroidForWorkAppConfigurationSchema with a source
     *
     * @param sourceAndroidForWorkAppConfigurationSchema the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidForWorkAppConfigurationSchema sourceAndroidForWorkAppConfigurationSchema, final ICallback<? super AndroidForWorkAppConfigurationSchema> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidForWorkAppConfigurationSchema);
    }

    /**
     * Patches this AndroidForWorkAppConfigurationSchema with a source
     *
     * @param sourceAndroidForWorkAppConfigurationSchema the source object with updates
     * @return the updated AndroidForWorkAppConfigurationSchema
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkAppConfigurationSchema patch(final AndroidForWorkAppConfigurationSchema sourceAndroidForWorkAppConfigurationSchema) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkAppConfigurationSchema);
    }

    /**
     * Creates a AndroidForWorkAppConfigurationSchema with a new object
     *
     * @param newAndroidForWorkAppConfigurationSchema the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidForWorkAppConfigurationSchema newAndroidForWorkAppConfigurationSchema, final ICallback<? super AndroidForWorkAppConfigurationSchema> callback) {
        send(HttpMethod.POST, callback, newAndroidForWorkAppConfigurationSchema);
    }

    /**
     * Creates a AndroidForWorkAppConfigurationSchema with a new object
     *
     * @param newAndroidForWorkAppConfigurationSchema the new object to create
     * @return the created AndroidForWorkAppConfigurationSchema
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkAppConfigurationSchema post(final AndroidForWorkAppConfigurationSchema newAndroidForWorkAppConfigurationSchema) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkAppConfigurationSchema);
    }

    /**
     * Creates a AndroidForWorkAppConfigurationSchema with a new object
     *
     * @param newAndroidForWorkAppConfigurationSchema the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AndroidForWorkAppConfigurationSchema newAndroidForWorkAppConfigurationSchema, final ICallback<? super AndroidForWorkAppConfigurationSchema> callback) {
        send(HttpMethod.PUT, callback, newAndroidForWorkAppConfigurationSchema);
    }

    /**
     * Creates a AndroidForWorkAppConfigurationSchema with a new object
     *
     * @param newAndroidForWorkAppConfigurationSchema the object to create/update
     * @return the created AndroidForWorkAppConfigurationSchema
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkAppConfigurationSchema put(final AndroidForWorkAppConfigurationSchema newAndroidForWorkAppConfigurationSchema) throws ClientException {
        return send(HttpMethod.PUT, newAndroidForWorkAppConfigurationSchema);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidForWorkAppConfigurationSchemaRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AndroidForWorkAppConfigurationSchemaRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidForWorkAppConfigurationSchemaRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AndroidForWorkAppConfigurationSchemaRequest)this;
     }

}

