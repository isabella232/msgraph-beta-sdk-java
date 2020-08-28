// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Profile;
import com.microsoft.graph.models.extensions.WebAccount;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWebAccountCollectionPage;
import com.microsoft.graph.requests.extensions.WebAccountCollectionResponse;
import com.microsoft.graph.requests.extensions.IWebAccountCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWebAccountCollectionRequest;
import com.microsoft.graph.requests.extensions.WebAccountCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Web Account Collection Request.
 */
public class WebAccountCollectionRequest extends BaseCollectionRequest<WebAccountCollectionResponse, IWebAccountCollectionPage> implements IWebAccountCollectionRequest {

    /**
     * The request builder for this collection of WebAccount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WebAccountCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WebAccountCollectionResponse.class, IWebAccountCollectionPage.class);
    }

    public void get(final ICallback<IWebAccountCollectionPage> callback) {
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

    public IWebAccountCollectionPage get() throws ClientException {
        final WebAccountCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WebAccount newWebAccount, final ICallback<WebAccount> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WebAccountRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWebAccount, callback);
    }

    public WebAccount post(final WebAccount newWebAccount) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WebAccountRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWebAccount);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWebAccountCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WebAccountCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWebAccountCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WebAccountCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWebAccountCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WebAccountCollectionRequest)this;
    }

    public IWebAccountCollectionPage buildFromResponse(final WebAccountCollectionResponse response) {
        final IWebAccountCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WebAccountCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WebAccountCollectionPage page = new WebAccountCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
