// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceLogCollectionResponse;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Log Collection Response Request.
 */
public class DeviceLogCollectionResponseRequest extends BaseRequest implements IDeviceLogCollectionResponseRequest {
	
    /**
     * The request for the DeviceLogCollectionResponse
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceLogCollectionResponseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceLogCollectionResponse.class);
    }

    /**
     * Gets the DeviceLogCollectionResponse from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceLogCollectionResponse> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceLogCollectionResponse from the service
     *
     * @return the DeviceLogCollectionResponse from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceLogCollectionResponse get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceLogCollectionResponse> callback) {
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
     * Patches this DeviceLogCollectionResponse with a source
     *
     * @param sourceDeviceLogCollectionResponse the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceLogCollectionResponse sourceDeviceLogCollectionResponse, final ICallback<DeviceLogCollectionResponse> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceLogCollectionResponse);
    }

    /**
     * Patches this DeviceLogCollectionResponse with a source
     *
     * @param sourceDeviceLogCollectionResponse the source object with updates
     * @return the updated DeviceLogCollectionResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceLogCollectionResponse patch(final DeviceLogCollectionResponse sourceDeviceLogCollectionResponse) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceLogCollectionResponse);
    }

    /**
     * Creates a DeviceLogCollectionResponse with a new object
     *
     * @param newDeviceLogCollectionResponse the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceLogCollectionResponse newDeviceLogCollectionResponse, final ICallback<DeviceLogCollectionResponse> callback) {
        send(HttpMethod.POST, callback, newDeviceLogCollectionResponse);
    }

    /**
     * Creates a DeviceLogCollectionResponse with a new object
     *
     * @param newDeviceLogCollectionResponse the new object to create
     * @return the created DeviceLogCollectionResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceLogCollectionResponse post(final DeviceLogCollectionResponse newDeviceLogCollectionResponse) throws ClientException {
        return send(HttpMethod.POST, newDeviceLogCollectionResponse);
    }

    /**
     * Creates a DeviceLogCollectionResponse with a new object
     *
     * @param newDeviceLogCollectionResponse the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceLogCollectionResponse newDeviceLogCollectionResponse, final ICallback<DeviceLogCollectionResponse> callback) {
        send(HttpMethod.PUT, callback, newDeviceLogCollectionResponse);
    }

    /**
     * Creates a DeviceLogCollectionResponse with a new object
     *
     * @param newDeviceLogCollectionResponse the object to create/update
     * @return the created DeviceLogCollectionResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceLogCollectionResponse put(final DeviceLogCollectionResponse newDeviceLogCollectionResponse) throws ClientException {
        return send(HttpMethod.PUT, newDeviceLogCollectionResponse);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceLogCollectionResponseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceLogCollectionResponseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceLogCollectionResponseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceLogCollectionResponseRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IDeviceLogCollectionResponseRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (DeviceLogCollectionResponseRequest)this;
     }

}

