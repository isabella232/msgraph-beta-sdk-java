// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Synchronization;
import com.microsoft.graph.models.extensions.SynchronizationTemplate;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ISynchronizationTemplateCollectionPage;
import com.microsoft.graph.requests.extensions.SynchronizationTemplateCollectionResponse;
import com.microsoft.graph.requests.extensions.ISynchronizationTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISynchronizationTemplateCollectionRequest;
import com.microsoft.graph.requests.extensions.SynchronizationTemplateCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Template Collection Request.
 */
public class SynchronizationTemplateCollectionRequest extends BaseCollectionRequest<SynchronizationTemplateCollectionResponse, ISynchronizationTemplateCollectionPage> implements ISynchronizationTemplateCollectionRequest {

    /**
     * The request builder for this collection of SynchronizationTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationTemplateCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SynchronizationTemplateCollectionResponse.class, ISynchronizationTemplateCollectionPage.class);
    }

    public void get(final ICallback<? super ISynchronizationTemplateCollectionPage> callback) {
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

    public ISynchronizationTemplateCollectionPage get() throws ClientException {
        final SynchronizationTemplateCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SynchronizationTemplate newSynchronizationTemplate, final ICallback<? super SynchronizationTemplate> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SynchronizationTemplateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSynchronizationTemplate, callback);
    }

    public SynchronizationTemplate post(final SynchronizationTemplate newSynchronizationTemplate) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SynchronizationTemplateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSynchronizationTemplate);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISynchronizationTemplateCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SynchronizationTemplateCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ISynchronizationTemplateCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (SynchronizationTemplateCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ISynchronizationTemplateCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (SynchronizationTemplateCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISynchronizationTemplateCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SynchronizationTemplateCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISynchronizationTemplateCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (SynchronizationTemplateCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ISynchronizationTemplateCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (SynchronizationTemplateCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ISynchronizationTemplateCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ISynchronizationTemplateCollectionRequest)this;
    }
    public ISynchronizationTemplateCollectionPage buildFromResponse(final SynchronizationTemplateCollectionResponse response) {
        final ISynchronizationTemplateCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SynchronizationTemplateCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SynchronizationTemplateCollectionPage page = new SynchronizationTemplateCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
