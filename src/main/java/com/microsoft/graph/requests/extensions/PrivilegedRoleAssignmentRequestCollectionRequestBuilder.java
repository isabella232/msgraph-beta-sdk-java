// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestCollectionRequest;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestMyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Request Collection Request Builder.
 */
public class PrivilegedRoleAssignmentRequestCollectionRequestBuilder extends BaseRequestBuilder implements IPrivilegedRoleAssignmentRequestCollectionRequestBuilder {

    /**
     * The request builder for this collection of PrivilegedRoleAssignmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleAssignmentRequestCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IPrivilegedRoleAssignmentRequestCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IPrivilegedRoleAssignmentRequestCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PrivilegedRoleAssignmentRequestCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPrivilegedRoleAssignmentRequestRequestBuilder byId(final String id) {
        return new PrivilegedRoleAssignmentRequestRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IPrivilegedRoleAssignmentRequestMyCollectionRequestBuilder my() {
        return new PrivilegedRoleAssignmentRequestMyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.my"), getClient(), null);
    }
}
