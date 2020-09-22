// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DocumentComment;
import com.microsoft.graph.requests.extensions.IDocumentCommentReplyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDocumentCommentReplyRequestBuilder;
import com.microsoft.graph.requests.extensions.DocumentCommentReplyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DocumentCommentReplyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Document Comment Request.
 */
public class DocumentCommentRequest extends BaseRequest implements IDocumentCommentRequest {
	
    /**
     * The request for the DocumentComment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DocumentCommentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DocumentComment.class);
    }

    /**
     * Gets the DocumentComment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DocumentComment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DocumentComment from the service
     *
     * @return the DocumentComment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DocumentComment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DocumentComment> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DocumentComment with a source
     *
     * @param sourceDocumentComment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DocumentComment sourceDocumentComment, final ICallback<DocumentComment> callback) {
        send(HttpMethod.PATCH, callback, sourceDocumentComment);
    }

    /**
     * Patches this DocumentComment with a source
     *
     * @param sourceDocumentComment the source object with updates
     * @return the updated DocumentComment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DocumentComment patch(final DocumentComment sourceDocumentComment) throws ClientException {
        return send(HttpMethod.PATCH, sourceDocumentComment);
    }

    /**
     * Creates a DocumentComment with a new object
     *
     * @param newDocumentComment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DocumentComment newDocumentComment, final ICallback<DocumentComment> callback) {
        send(HttpMethod.POST, callback, newDocumentComment);
    }

    /**
     * Creates a DocumentComment with a new object
     *
     * @param newDocumentComment the new object to create
     * @return the created DocumentComment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DocumentComment post(final DocumentComment newDocumentComment) throws ClientException {
        return send(HttpMethod.POST, newDocumentComment);
    }

    /**
     * Creates a DocumentComment with a new object
     *
     * @param newDocumentComment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DocumentComment newDocumentComment, final ICallback<DocumentComment> callback) {
        send(HttpMethod.PUT, callback, newDocumentComment);
    }

    /**
     * Creates a DocumentComment with a new object
     *
     * @param newDocumentComment the object to create/update
     * @return the created DocumentComment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DocumentComment put(final DocumentComment newDocumentComment) throws ClientException {
        return send(HttpMethod.PUT, newDocumentComment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDocumentCommentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DocumentCommentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDocumentCommentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DocumentCommentRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IDocumentCommentRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (DocumentCommentRequest)this;
     }

}

