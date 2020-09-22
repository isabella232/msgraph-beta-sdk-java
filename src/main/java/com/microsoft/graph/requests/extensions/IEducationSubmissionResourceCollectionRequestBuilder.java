// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationSubmission;
import com.microsoft.graph.models.extensions.EducationSubmissionResource;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IEducationSubmissionResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationSubmissionResourceCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Submission Resource Collection Request Builder.
 */
public interface IEducationSubmissionResourceCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IEducationSubmissionResourceCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IEducationSubmissionResourceCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IEducationSubmissionResourceRequestBuilder byId(final String id);

}
