// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DocumentComment;
import com.microsoft.graph.models.extensions.DocumentCommentReply;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDocumentCommentReplyCollectionPage;
import com.microsoft.graph.requests.extensions.DocumentCommentReplyCollectionResponse;
import com.microsoft.graph.requests.extensions.IDocumentCommentReplyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDocumentCommentReplyCollectionRequest;
import com.microsoft.graph.requests.extensions.DocumentCommentReplyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Document Comment Reply Collection Request.
 */
public class DocumentCommentReplyCollectionRequest extends BaseCollectionRequest<DocumentCommentReplyCollectionResponse, IDocumentCommentReplyCollectionPage> implements IDocumentCommentReplyCollectionRequest {

    /**
     * The request builder for this collection of DocumentCommentReply
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DocumentCommentReplyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DocumentCommentReplyCollectionResponse.class, IDocumentCommentReplyCollectionPage.class);
    }

    public void get(final ICallback<? super IDocumentCommentReplyCollectionPage> callback) {
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

    public IDocumentCommentReplyCollectionPage get() throws ClientException {
        final DocumentCommentReplyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DocumentCommentReply newDocumentCommentReply, final ICallback<? super DocumentCommentReply> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DocumentCommentReplyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDocumentCommentReply, callback);
    }

    public DocumentCommentReply post(final DocumentCommentReply newDocumentCommentReply) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DocumentCommentReplyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDocumentCommentReply);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDocumentCommentReplyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DocumentCommentReplyCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDocumentCommentReplyCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DocumentCommentReplyCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDocumentCommentReplyCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DocumentCommentReplyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDocumentCommentReplyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DocumentCommentReplyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDocumentCommentReplyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DocumentCommentReplyCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDocumentCommentReplyCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DocumentCommentReplyCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDocumentCommentReplyCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDocumentCommentReplyCollectionRequest)this;
    }
    public IDocumentCommentReplyCollectionPage buildFromResponse(final DocumentCommentReplyCollectionResponse response) {
        final IDocumentCommentReplyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DocumentCommentReplyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DocumentCommentReplyCollectionPage page = new DocumentCommentReplyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
