// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TrustFramework;
import com.microsoft.graph.models.extensions.TrustFrameworkPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ITrustFrameworkPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.TrustFrameworkPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.ITrustFrameworkPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITrustFrameworkPolicyCollectionRequest;
import com.microsoft.graph.requests.extensions.TrustFrameworkPolicyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trust Framework Policy Collection Request.
 */
public class TrustFrameworkPolicyCollectionRequest extends BaseCollectionRequest<TrustFrameworkPolicyCollectionResponse, ITrustFrameworkPolicyCollectionPage> implements ITrustFrameworkPolicyCollectionRequest {

    /**
     * The request builder for this collection of TrustFrameworkPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TrustFrameworkPolicyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TrustFrameworkPolicyCollectionResponse.class, ITrustFrameworkPolicyCollectionPage.class);
    }

    public void get(final ICallback<ITrustFrameworkPolicyCollectionPage> callback) {
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

    public ITrustFrameworkPolicyCollectionPage get() throws ClientException {
        final TrustFrameworkPolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TrustFrameworkPolicy newTrustFrameworkPolicy, final ICallback<TrustFrameworkPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TrustFrameworkPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTrustFrameworkPolicy, callback);
    }

    public TrustFrameworkPolicy post(final TrustFrameworkPolicy newTrustFrameworkPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TrustFrameworkPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newTrustFrameworkPolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITrustFrameworkPolicyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TrustFrameworkPolicyCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ITrustFrameworkPolicyCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (TrustFrameworkPolicyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITrustFrameworkPolicyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TrustFrameworkPolicyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITrustFrameworkPolicyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (TrustFrameworkPolicyCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ITrustFrameworkPolicyCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (TrustFrameworkPolicyCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ITrustFrameworkPolicyCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ITrustFrameworkPolicyCollectionRequest)this;
    }
    public ITrustFrameworkPolicyCollectionPage buildFromResponse(final TrustFrameworkPolicyCollectionResponse response) {
        final ITrustFrameworkPolicyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TrustFrameworkPolicyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TrustFrameworkPolicyCollectionPage page = new TrustFrameworkPolicyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
