// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CaseIndexOperation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.CaseIndexOperation;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Case Index Operation Reference Request.
 */
public interface ICaseIndexOperationReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super CaseIndexOperation> callback);

    CaseIndexOperation delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICaseIndexOperationReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICaseIndexOperationReferenceRequest expand(final String value);

    /**
     * Puts the CaseIndexOperation
     *
     * @param srcCaseIndexOperation the CaseIndexOperation to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(CaseIndexOperation srcCaseIndexOperation, final ICallback<? super CaseIndexOperation> callback);

    /**
     * Puts the CaseIndexOperation
     *
     * @param srcCaseIndexOperation the CaseIndexOperation to PUT
     * @return the CaseIndexOperation
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    CaseIndexOperation put(CaseIndexOperation srcCaseIndexOperation) throws ClientException;
}