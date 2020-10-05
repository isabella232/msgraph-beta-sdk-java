// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DocumentCommentReply;
import com.microsoft.graph.requests.extensions.IDocumentCommentReplyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DocumentCommentReplyCollectionPage;
import com.microsoft.graph.requests.extensions.DocumentCommentReplyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Document Comment Reply Collection Page.
 */
public class DocumentCommentReplyCollectionPage extends BaseCollectionPage<DocumentCommentReply, IDocumentCommentReplyCollectionRequestBuilder> implements IDocumentCommentReplyCollectionPage {

    /**
     * A collection page for DocumentCommentReply
     *
     * @param response the serialized DocumentCommentReplyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DocumentCommentReplyCollectionPage(final DocumentCommentReplyCollectionResponse response, final IDocumentCommentReplyCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
