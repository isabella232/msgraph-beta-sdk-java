// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.termstore.models.extensions.Term;
import com.microsoft.graph.termstore.requests.extensions.ITermCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ITermRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.TermCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.TermRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IRelationCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IRelationRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.RelationCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.RelationRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ISetRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.SetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Term Request Builder.
 */
public class TermRequestBuilder extends BaseRequestBuilder implements ITermRequestBuilder {

    /**
     * The request builder for the Term
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TermRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ITermRequest instance
     */
    public ITermRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITermRequest instance
     */
    public ITermRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.termstore.requests.extensions.TermRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ITermCollectionRequestBuilder children() {
        return new TermCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("children"), getClient(), null);
    }

    public ITermRequestBuilder children(final String id) {
        return new TermRequestBuilder(getRequestUrlWithAdditionalSegment("children") + "/" + id, getClient(), null);
    }
    public IRelationCollectionRequestBuilder relations() {
        return new RelationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("relations"), getClient(), null);
    }

    public IRelationRequestBuilder relations(final String id) {
        return new RelationRequestBuilder(getRequestUrlWithAdditionalSegment("relations") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for Set
     *
     * @return the ISetWithReferenceRequestBuilder instance
     */
    public ISetWithReferenceRequestBuilder set() {
        return new SetWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("set"), getClient(), null);
    }
}
