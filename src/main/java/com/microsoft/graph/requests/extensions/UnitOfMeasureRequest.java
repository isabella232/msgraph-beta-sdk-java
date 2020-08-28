// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnitOfMeasure;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unit Of Measure Request.
 */
public class UnitOfMeasureRequest extends BaseRequest implements IUnitOfMeasureRequest {
	
    /**
     * The request for the UnitOfMeasure
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnitOfMeasureRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnitOfMeasure.class);
    }

    /**
     * Gets the UnitOfMeasure from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<UnitOfMeasure> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UnitOfMeasure from the service
     *
     * @return the UnitOfMeasure from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnitOfMeasure get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<UnitOfMeasure> callback) {
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
     * Patches this UnitOfMeasure with a source
     *
     * @param sourceUnitOfMeasure the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UnitOfMeasure sourceUnitOfMeasure, final ICallback<UnitOfMeasure> callback) {
        send(HttpMethod.PATCH, callback, sourceUnitOfMeasure);
    }

    /**
     * Patches this UnitOfMeasure with a source
     *
     * @param sourceUnitOfMeasure the source object with updates
     * @return the updated UnitOfMeasure
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnitOfMeasure patch(final UnitOfMeasure sourceUnitOfMeasure) throws ClientException {
        return send(HttpMethod.PATCH, sourceUnitOfMeasure);
    }

    /**
     * Creates a UnitOfMeasure with a new object
     *
     * @param newUnitOfMeasure the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UnitOfMeasure newUnitOfMeasure, final ICallback<UnitOfMeasure> callback) {
        send(HttpMethod.POST, callback, newUnitOfMeasure);
    }

    /**
     * Creates a UnitOfMeasure with a new object
     *
     * @param newUnitOfMeasure the new object to create
     * @return the created UnitOfMeasure
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UnitOfMeasure post(final UnitOfMeasure newUnitOfMeasure) throws ClientException {
        return send(HttpMethod.POST, newUnitOfMeasure);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUnitOfMeasureRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UnitOfMeasureRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUnitOfMeasureRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UnitOfMeasureRequest)this;
     }

}

