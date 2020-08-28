// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.termstore.models.extensions.Relation;
import com.microsoft.graph.termstore.requests.extensions.ITermRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.TermRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ISetRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.SetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Relation Request Builder.
 */
public class RelationRequestBuilder extends BaseRequestBuilder implements IRelationRequestBuilder {

    /**
     * The request builder for the Relation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RelationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IRelationRequest instance
     */
    public IRelationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IRelationRequest instance
     */
    public IRelationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.termstore.requests.extensions.RelationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Term
     *
     * @return the ITermWithReferenceRequestBuilder instance
     */
    public ITermWithReferenceRequestBuilder fromTerm() {
        return new TermWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("fromTerm"), getClient(), null);
    }

    /**
     * Gets the request builder for Term
     *
     * @return the ITermWithReferenceRequestBuilder instance
     */
    public ITermWithReferenceRequestBuilder toTerm() {
        return new TermWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("toTerm"), getClient(), null);
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
