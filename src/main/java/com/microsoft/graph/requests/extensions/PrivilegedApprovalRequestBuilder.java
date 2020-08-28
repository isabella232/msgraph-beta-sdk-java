// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedApproval;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Approval Request Builder.
 */
public class PrivilegedApprovalRequestBuilder extends BaseRequestBuilder implements IPrivilegedApprovalRequestBuilder {

    /**
     * The request builder for the PrivilegedApproval
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedApprovalRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IPrivilegedApprovalRequest instance
     */
    public IPrivilegedApprovalRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPrivilegedApprovalRequest instance
     */
    public IPrivilegedApprovalRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PrivilegedApprovalRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for PrivilegedRoleAssignmentRequest
     *
     * @return the IPrivilegedRoleAssignmentRequestWithReferenceRequestBuilder instance
     */
    public IPrivilegedRoleAssignmentRequestWithReferenceRequestBuilder request() {
        return new PrivilegedRoleAssignmentRequestWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("request"), getClient(), null);
    }

    /**
     * Gets the request builder for PrivilegedRole
     *
     * @return the IPrivilegedRoleRequestBuilder instance
     */
    public IPrivilegedRoleRequestBuilder roleInfo() {
        return new PrivilegedRoleRequestBuilder(getRequestUrlWithAdditionalSegment("roleInfo"), getClient(), null);
    }
}
