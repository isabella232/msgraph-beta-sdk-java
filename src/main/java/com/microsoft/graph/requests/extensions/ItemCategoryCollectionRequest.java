// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.models.extensions.ItemCategory;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IItemCategoryCollectionPage;
import com.microsoft.graph.requests.extensions.ItemCategoryCollectionResponse;
import com.microsoft.graph.requests.extensions.IItemCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IItemCategoryCollectionRequest;
import com.microsoft.graph.requests.extensions.ItemCategoryCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Item Category Collection Request.
 */
public class ItemCategoryCollectionRequest extends BaseCollectionRequest<ItemCategoryCollectionResponse, IItemCategoryCollectionPage> implements IItemCategoryCollectionRequest {

    /**
     * The request builder for this collection of ItemCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ItemCategoryCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ItemCategoryCollectionResponse.class, IItemCategoryCollectionPage.class);
    }

    public void get(final ICallback<IItemCategoryCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IItemCategoryCollectionPage get() throws ClientException {
        final ItemCategoryCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ItemCategory newItemCategory, final ICallback<ItemCategory> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ItemCategoryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newItemCategory, callback);
    }

    public ItemCategory post(final ItemCategory newItemCategory) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ItemCategoryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newItemCategory);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IItemCategoryCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ItemCategoryCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IItemCategoryCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ItemCategoryCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IItemCategoryCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ItemCategoryCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IItemCategoryCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (ItemCategoryCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IItemCategoryCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (ItemCategoryCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IItemCategoryCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IItemCategoryCollectionRequest)this;
    }
    public IItemCategoryCollectionPage buildFromResponse(final ItemCategoryCollectionResponse response) {
        final IItemCategoryCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ItemCategoryCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ItemCategoryCollectionPage page = new ItemCategoryCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
