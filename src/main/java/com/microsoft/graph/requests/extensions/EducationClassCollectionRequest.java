// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationRoot;
import com.microsoft.graph.models.extensions.EducationClass;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionPage;
import com.microsoft.graph.requests.extensions.EducationClassCollectionResponse;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationClassCollectionRequest;
import com.microsoft.graph.requests.extensions.EducationClassCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Class Collection Request.
 */
public class EducationClassCollectionRequest extends BaseCollectionRequest<EducationClassCollectionResponse, IEducationClassCollectionPage> implements IEducationClassCollectionRequest {

    /**
     * The request builder for this collection of EducationClass
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationClassCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationClassCollectionResponse.class, IEducationClassCollectionPage.class);
    }

    public void get(final ICallback<IEducationClassCollectionPage> callback) {
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

    public IEducationClassCollectionPage get() throws ClientException {
        final EducationClassCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final EducationClass newEducationClass, final ICallback<EducationClass> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new EducationClassRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEducationClass, callback);
    }

    public EducationClass post(final EducationClass newEducationClass) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new EducationClassRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEducationClass);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEducationClassCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EducationClassCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IEducationClassCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (EducationClassCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEducationClassCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EducationClassCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IEducationClassCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (EducationClassCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IEducationClassCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (EducationClassCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IEducationClassCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IEducationClassCollectionRequest)this;
    }
    public IEducationClassCollectionPage buildFromResponse(final EducationClassCollectionResponse response) {
        final IEducationClassCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EducationClassCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EducationClassCollectionPage page = new EducationClassCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
