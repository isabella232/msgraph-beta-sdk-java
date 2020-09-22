// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RbacApplicationMultiple;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentMultiple;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentMultipleCollectionPage;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentMultipleCollectionResponse;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentMultipleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleAssignmentMultipleCollectionRequest;
import com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentMultipleCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Multiple Collection Request.
 */
public class UnifiedRoleAssignmentMultipleCollectionRequest extends BaseCollectionRequest<UnifiedRoleAssignmentMultipleCollectionResponse, IUnifiedRoleAssignmentMultipleCollectionPage> implements IUnifiedRoleAssignmentMultipleCollectionRequest {

    /**
     * The request builder for this collection of UnifiedRoleAssignmentMultiple
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentMultipleCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UnifiedRoleAssignmentMultipleCollectionResponse.class, IUnifiedRoleAssignmentMultipleCollectionPage.class);
    }

    public void get(final ICallback<IUnifiedRoleAssignmentMultipleCollectionPage> callback) {
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

    public IUnifiedRoleAssignmentMultipleCollectionPage get() throws ClientException {
        final UnifiedRoleAssignmentMultipleCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UnifiedRoleAssignmentMultiple newUnifiedRoleAssignmentMultiple, final ICallback<UnifiedRoleAssignmentMultiple> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UnifiedRoleAssignmentMultipleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRoleAssignmentMultiple, callback);
    }

    public UnifiedRoleAssignmentMultiple post(final UnifiedRoleAssignmentMultiple newUnifiedRoleAssignmentMultiple) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UnifiedRoleAssignmentMultipleRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUnifiedRoleAssignmentMultiple);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUnifiedRoleAssignmentMultipleCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UnifiedRoleAssignmentMultipleCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IUnifiedRoleAssignmentMultipleCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (UnifiedRoleAssignmentMultipleCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUnifiedRoleAssignmentMultipleCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UnifiedRoleAssignmentMultipleCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUnifiedRoleAssignmentMultipleCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UnifiedRoleAssignmentMultipleCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IUnifiedRoleAssignmentMultipleCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (UnifiedRoleAssignmentMultipleCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IUnifiedRoleAssignmentMultipleCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IUnifiedRoleAssignmentMultipleCollectionRequest)this;
    }
    public IUnifiedRoleAssignmentMultipleCollectionPage buildFromResponse(final UnifiedRoleAssignmentMultipleCollectionResponse response) {
        final IUnifiedRoleAssignmentMultipleCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UnifiedRoleAssignmentMultipleCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UnifiedRoleAssignmentMultipleCollectionPage page = new UnifiedRoleAssignmentMultipleCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
