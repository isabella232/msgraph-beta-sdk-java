// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ItemCategory;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Category Request.
 */
public class ItemCategoryRequest extends BaseRequest implements IItemCategoryRequest {
	
    /**
     * The request for the ItemCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemCategoryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemCategory.class);
    }

    /**
     * Gets the ItemCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ItemCategory> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ItemCategory from the service
     *
     * @return the ItemCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ItemCategory> callback) {
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
     * Patches this ItemCategory with a source
     *
     * @param sourceItemCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ItemCategory sourceItemCategory, final ICallback<ItemCategory> callback) {
        send(HttpMethod.PATCH, callback, sourceItemCategory);
    }

    /**
     * Patches this ItemCategory with a source
     *
     * @param sourceItemCategory the source object with updates
     * @return the updated ItemCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemCategory patch(final ItemCategory sourceItemCategory) throws ClientException {
        return send(HttpMethod.PATCH, sourceItemCategory);
    }

    /**
     * Creates a ItemCategory with a new object
     *
     * @param newItemCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ItemCategory newItemCategory, final ICallback<ItemCategory> callback) {
        send(HttpMethod.POST, callback, newItemCategory);
    }

    /**
     * Creates a ItemCategory with a new object
     *
     * @param newItemCategory the new object to create
     * @return the created ItemCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemCategory post(final ItemCategory newItemCategory) throws ClientException {
        return send(HttpMethod.POST, newItemCategory);
    }

    /**
     * Creates a ItemCategory with a new object
     *
     * @param newItemCategory the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ItemCategory newItemCategory, final ICallback<ItemCategory> callback) {
        send(HttpMethod.PUT, callback, newItemCategory);
    }

    /**
     * Creates a ItemCategory with a new object
     *
     * @param newItemCategory the object to create/update
     * @return the created ItemCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ItemCategory put(final ItemCategory newItemCategory) throws ClientException {
        return send(HttpMethod.PUT, newItemCategory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IItemCategoryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ItemCategoryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IItemCategoryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ItemCategoryRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IItemCategoryRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (ItemCategoryRequest)this;
     }

}

