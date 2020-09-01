// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.models.extensions.TermsAndConditionsAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Terms And Conditions Assignment Collection Request.
 */
public interface ITermsAndConditionsAssignmentCollectionRequest {

    void get(final ICallback<ITermsAndConditionsAssignmentCollectionPage> callback);

    ITermsAndConditionsAssignmentCollectionPage get() throws ClientException;

    void post(final TermsAndConditionsAssignment newTermsAndConditionsAssignment, final ICallback<TermsAndConditionsAssignment> callback);

    TermsAndConditionsAssignment post(final TermsAndConditionsAssignment newTermsAndConditionsAssignment) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITermsAndConditionsAssignmentCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITermsAndConditionsAssignmentCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    ITermsAndConditionsAssignmentCollectionRequest top(final int value);

}