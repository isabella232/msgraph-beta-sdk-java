// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.models.extensions.TermsAndConditionsGroupAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITermsAndConditionsGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsGroupAssignmentCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Terms And Conditions Group Assignment Collection Request Builder.
 */
public interface ITermsAndConditionsGroupAssignmentCollectionRequestBuilder extends IRequestBuilder {

    ITermsAndConditionsGroupAssignmentCollectionRequest buildRequest();

    ITermsAndConditionsGroupAssignmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    ITermsAndConditionsGroupAssignmentRequestBuilder byId(final String id);

}
