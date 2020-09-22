// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAcceptanceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAcceptanceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAcceptanceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsGroupAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions With Reference Request Builder.
 */
public class TermsAndConditionsWithReferenceRequestBuilder extends BaseRequestBuilder implements ITermsAndConditionsWithReferenceRequestBuilder {

    /**
     * The request builder for the TermsAndConditions
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TermsAndConditionsWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ITermsAndConditionsWithReferenceRequest instance
     */
    public ITermsAndConditionsWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the ITermsAndConditionsWithReferenceRequest instance
     */
    public ITermsAndConditionsWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TermsAndConditionsWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITermsAndConditionsReferenceRequestBuilder reference(){
        return new TermsAndConditionsReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
