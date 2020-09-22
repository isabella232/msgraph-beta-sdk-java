// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceRoleAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentExportCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Assignment Collection Request Builder.
 */
public class GovernanceRoleAssignmentCollectionRequestBuilder extends BaseRequestBuilder implements IGovernanceRoleAssignmentCollectionRequestBuilder {

    /**
     * The request builder for this collection of GovernanceRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceRoleAssignmentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IGovernanceRoleAssignmentCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IGovernanceRoleAssignmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new GovernanceRoleAssignmentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IGovernanceRoleAssignmentRequestBuilder byId(final String id) {
        return new GovernanceRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IGovernanceRoleAssignmentExportCollectionRequestBuilder export() {
        return new GovernanceRoleAssignmentExportCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.export"), getClient(), null);
    }
}
