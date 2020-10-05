// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Journal;
import com.microsoft.graph.models.extensions.JournalLine;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IJournalLineCollectionPage;
import com.microsoft.graph.requests.extensions.JournalLineCollectionResponse;
import com.microsoft.graph.requests.extensions.IJournalLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IJournalLineCollectionRequest;
import com.microsoft.graph.requests.extensions.JournalLineCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Journal Line Collection Request.
 */
public class JournalLineCollectionRequest extends BaseCollectionRequest<JournalLineCollectionResponse, IJournalLineCollectionPage> implements IJournalLineCollectionRequest {

    /**
     * The request builder for this collection of JournalLine
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public JournalLineCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, JournalLineCollectionResponse.class, IJournalLineCollectionPage.class);
    }

    public void get(final ICallback<? super IJournalLineCollectionPage> callback) {
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

    public IJournalLineCollectionPage get() throws ClientException {
        final JournalLineCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final JournalLine newJournalLine, final ICallback<? super JournalLine> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new JournalLineRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newJournalLine, callback);
    }

    public JournalLine post(final JournalLine newJournalLine) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new JournalLineRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newJournalLine);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IJournalLineCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (JournalLineCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IJournalLineCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (JournalLineCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IJournalLineCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (JournalLineCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IJournalLineCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (JournalLineCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IJournalLineCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (JournalLineCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IJournalLineCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (JournalLineCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IJournalLineCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IJournalLineCollectionRequest)this;
    }
    public IJournalLineCollectionPage buildFromResponse(final JournalLineCollectionResponse response) {
        final IJournalLineCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new JournalLineCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final JournalLineCollectionPage page = new JournalLineCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
