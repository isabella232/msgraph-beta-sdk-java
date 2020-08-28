// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.termstore.models.extensions.Store;
import com.microsoft.graph.termstore.models.extensions.Group;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.termstore.requests.extensions.IGroupCollectionPage;
import com.microsoft.graph.termstore.requests.extensions.GroupCollectionResponse;
import com.microsoft.graph.termstore.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IGroupCollectionRequest;
import com.microsoft.graph.termstore.requests.extensions.GroupCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Collection Request.
 */
public class GroupCollectionRequest extends BaseCollectionRequest<GroupCollectionResponse, IGroupCollectionPage> implements IGroupCollectionRequest {

    /**
     * The request builder for this collection of Group
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupCollectionResponse.class, IGroupCollectionPage.class);
    }

    public void get(final ICallback<IGroupCollectionPage> callback) {
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

    public IGroupCollectionPage get() throws ClientException {
        final GroupCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final Group newGroup, final ICallback<Group> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new GroupRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newGroup, callback);
    }

    public Group post(final Group newGroup) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new GroupRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newGroup);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GroupCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GroupCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IGroupCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (GroupCollectionRequest)this;
    }

    public IGroupCollectionPage buildFromResponse(final GroupCollectionResponse response) {
        final IGroupCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new GroupCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final GroupCollectionPage page = new GroupCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
