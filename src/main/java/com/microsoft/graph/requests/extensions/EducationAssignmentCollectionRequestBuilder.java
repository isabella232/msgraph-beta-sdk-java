// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationUser;
import com.microsoft.graph.models.extensions.EducationAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IEducationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationAssignmentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Assignment Collection Request Builder.
 */
public class EducationAssignmentCollectionRequestBuilder extends BaseRequestBuilder implements IEducationAssignmentCollectionRequestBuilder {

    /**
     * The request builder for this collection of EducationUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationAssignmentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IEducationAssignmentCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IEducationAssignmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new EducationAssignmentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IEducationAssignmentRequestBuilder byId(final String id) {
        return new EducationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
