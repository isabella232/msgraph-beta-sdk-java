// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionFile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileCollectionPage;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileCollectionResponse;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileCollectionRequest;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition File Collection Request.
 */
public class GroupPolicyDefinitionFileCollectionRequest extends BaseCollectionRequest<GroupPolicyDefinitionFileCollectionResponse, IGroupPolicyDefinitionFileCollectionPage> implements IGroupPolicyDefinitionFileCollectionRequest {

    /**
     * The request builder for this collection of GroupPolicyDefinitionFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyDefinitionFileCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyDefinitionFileCollectionResponse.class, IGroupPolicyDefinitionFileCollectionPage.class);
    }

    public void get(final ICallback<IGroupPolicyDefinitionFileCollectionPage> callback) {
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

    public IGroupPolicyDefinitionFileCollectionPage get() throws ClientException {
        final GroupPolicyDefinitionFileCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final GroupPolicyDefinitionFile newGroupPolicyDefinitionFile, final ICallback<GroupPolicyDefinitionFile> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new GroupPolicyDefinitionFileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newGroupPolicyDefinitionFile, callback);
    }

    public GroupPolicyDefinitionFile post(final GroupPolicyDefinitionFile newGroupPolicyDefinitionFile) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new GroupPolicyDefinitionFileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newGroupPolicyDefinitionFile);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionFileCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GroupPolicyDefinitionFileCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionFileCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (GroupPolicyDefinitionFileCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionFileCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GroupPolicyDefinitionFileCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IGroupPolicyDefinitionFileCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (GroupPolicyDefinitionFileCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IGroupPolicyDefinitionFileCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (GroupPolicyDefinitionFileCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IGroupPolicyDefinitionFileCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IGroupPolicyDefinitionFileCollectionRequest)this;
    }
    public IGroupPolicyDefinitionFileCollectionPage buildFromResponse(final GroupPolicyDefinitionFileCollectionResponse response) {
        final IGroupPolicyDefinitionFileCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new GroupPolicyDefinitionFileCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final GroupPolicyDefinitionFileCollectionPage page = new GroupPolicyDefinitionFileCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
