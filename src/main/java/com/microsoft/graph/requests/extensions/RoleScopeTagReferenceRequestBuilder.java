
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import com.microsoft.graph.models.extensions.RoleScopeTagAutoAssignment;
import com.microsoft.graph.requests.extensions.IRoleScopeTagAutoAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagAutoAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagAutoAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagAutoAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Scope Tag Reference Request Builder.
 */
public class RoleScopeTagReferenceRequestBuilder extends BaseRequestBuilder implements IRoleScopeTagReferenceRequestBuilder {

    /**
     * The request builder for the RoleScopeTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoleScopeTagReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return The IRoleScopeTagReferenceRequest instance
     */
    public IRoleScopeTagReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IRoleScopeTagReferenceRequest instance
     */
    public IRoleScopeTagReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new RoleScopeTagReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }
}
