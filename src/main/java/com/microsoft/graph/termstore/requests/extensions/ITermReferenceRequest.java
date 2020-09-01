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
import com.microsoft.graph.termstore.requests.extensions.IRelationCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IRelationRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ISetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.termstore.models.extensions.Term;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Term Reference Request.
 */
public interface ITermReferenceRequest extends IHttpRequest {

    void delete(final ICallback<Term> callback);

    Term delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITermReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITermReferenceRequest expand(final String value);

    /**
     * Puts the Term
     *
     * @param srcTerm the Term to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(Term srcTerm, final ICallback<Term> callback);

    /**
     * Puts the Term
     *
     * @param srcTerm the Term to PUT
     * @return the Term
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    Term put(Term srcTerm) throws ClientException;
}