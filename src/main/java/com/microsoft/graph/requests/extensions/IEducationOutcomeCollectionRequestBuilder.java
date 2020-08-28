// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSubmission;
import com.microsoft.graph.models.extensions.EducationOutcome;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IEducationOutcomeRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationOutcomeCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Outcome Collection Request Builder.
 */
public interface IEducationOutcomeCollectionRequestBuilder extends IRequestBuilder {

    IEducationOutcomeCollectionRequest buildRequest();

    IEducationOutcomeCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IEducationOutcomeRequestBuilder byId(final String id);

}
