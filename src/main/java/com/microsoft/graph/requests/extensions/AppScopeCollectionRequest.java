// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentMultiple;
import com.microsoft.graph.models.extensions.AppScope;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAppScopeCollectionPage;
import com.microsoft.graph.requests.extensions.AppScopeCollectionResponse;
import com.microsoft.graph.requests.extensions.IAppScopeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppScopeCollectionRequest;
import com.microsoft.graph.requests.extensions.AppScopeCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the App Scope Collection Request.
 */
public class AppScopeCollectionRequest extends BaseCollectionRequest<AppScopeCollectionResponse, IAppScopeCollectionPage> implements IAppScopeCollectionRequest {

    /**
     * The request builder for this collection of AppScope
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppScopeCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppScopeCollectionResponse.class, IAppScopeCollectionPage.class);
    }

    public void get(final ICallback<IAppScopeCollectionPage> callback) {
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

    public IAppScopeCollectionPage get() throws ClientException {
        final AppScopeCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AppScope newAppScope, final ICallback<AppScope> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AppScopeRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAppScope, callback);
    }

    public AppScope post(final AppScope newAppScope) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AppScopeRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAppScope);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAppScopeCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AppScopeCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAppScopeCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AppScopeCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAppScopeCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AppScopeCollectionRequest)this;
    }

    public IAppScopeCollectionPage buildFromResponse(final AppScopeCollectionResponse response) {
        final IAppScopeCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AppScopeCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AppScopeCollectionPage page = new AppScopeCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
