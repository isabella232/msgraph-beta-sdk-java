// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemAddress;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Address Request.
 */
public class ItemAddressRequest extends BaseRequest implements IItemAddressRequest {
	
    /**
     * The request for the ItemAddress
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemAddressRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemAddress.class);
    }

    /**
     * Gets the ItemAddress from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ItemAddress> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ItemAddress from the service
     *
     * @return the ItemAddress from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemAddress get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ItemAddress> callback) {
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
     * Patches this ItemAddress with a source
     *
     * @param sourceItemAddress the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ItemAddress sourceItemAddress, final ICallback<ItemAddress> callback) {
        send(HttpMethod.PATCH, callback, sourceItemAddress);
    }

    /**
     * Patches this ItemAddress with a source
     *
     * @param sourceItemAddress the source object with updates
     * @return the updated ItemAddress
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemAddress patch(final ItemAddress sourceItemAddress) throws ClientException {
        return send(HttpMethod.PATCH, sourceItemAddress);
    }

    /**
     * Creates a ItemAddress with a new object
     *
     * @param newItemAddress the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ItemAddress newItemAddress, final ICallback<ItemAddress> callback) {
        send(HttpMethod.POST, callback, newItemAddress);
    }

    /**
     * Creates a ItemAddress with a new object
     *
     * @param newItemAddress the new object to create
     * @return the created ItemAddress
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemAddress post(final ItemAddress newItemAddress) throws ClientException {
        return send(HttpMethod.POST, newItemAddress);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IItemAddressRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ItemAddressRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IItemAddressRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ItemAddressRequest)this;
     }

}

