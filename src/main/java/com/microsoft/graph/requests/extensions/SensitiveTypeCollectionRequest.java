// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataClassificationService;
import com.microsoft.graph.models.extensions.SensitiveType;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ISensitiveTypeCollectionPage;
import com.microsoft.graph.requests.extensions.SensitiveTypeCollectionResponse;
import com.microsoft.graph.requests.extensions.ISensitiveTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitiveTypeCollectionRequest;
import com.microsoft.graph.requests.extensions.SensitiveTypeCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sensitive Type Collection Request.
 */
public class SensitiveTypeCollectionRequest extends BaseCollectionRequest<SensitiveTypeCollectionResponse, ISensitiveTypeCollectionPage> implements ISensitiveTypeCollectionRequest {

    /**
     * The request builder for this collection of SensitiveType
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SensitiveTypeCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SensitiveTypeCollectionResponse.class, ISensitiveTypeCollectionPage.class);
    }

    public void get(final ICallback<ISensitiveTypeCollectionPage> callback) {
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

    public ISensitiveTypeCollectionPage get() throws ClientException {
        final SensitiveTypeCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SensitiveType newSensitiveType, final ICallback<SensitiveType> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SensitiveTypeRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSensitiveType, callback);
    }

    public SensitiveType post(final SensitiveType newSensitiveType) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SensitiveTypeRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSensitiveType);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISensitiveTypeCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SensitiveTypeCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ISensitiveTypeCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (SensitiveTypeCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISensitiveTypeCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SensitiveTypeCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISensitiveTypeCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (SensitiveTypeCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ISensitiveTypeCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (SensitiveTypeCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ISensitiveTypeCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ISensitiveTypeCollectionRequest)this;
    }
    public ISensitiveTypeCollectionPage buildFromResponse(final SensitiveTypeCollectionResponse response) {
        final ISensitiveTypeCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SensitiveTypeCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SensitiveTypeCollectionPage page = new SensitiveTypeCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
