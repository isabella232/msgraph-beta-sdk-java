// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceRoleAssignmentRequest;
import com.microsoft.graph.models.extensions.GovernanceSchedule;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceSubjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Assignment Request Request Builder.
 */
public class GovernanceRoleAssignmentRequestRequestBuilder extends BaseRequestBuilder implements IGovernanceRoleAssignmentRequestRequestBuilder {

    /**
     * The request builder for the GovernanceRoleAssignmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceRoleAssignmentRequestRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IGovernanceRoleAssignmentRequestRequest instance
     */
    public IGovernanceRoleAssignmentRequestRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IGovernanceRoleAssignmentRequestRequest instance
     */
    public IGovernanceRoleAssignmentRequestRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for GovernanceResource
     *
     * @return the IGovernanceResourceRequestBuilder instance
     */
    public IGovernanceResourceRequestBuilder resource() {
        return new GovernanceResourceRequestBuilder(getRequestUrlWithAdditionalSegment("resource"), getClient(), null);
    }

    /**
     * Gets the request builder for GovernanceRoleDefinition
     *
     * @return the IGovernanceRoleDefinitionRequestBuilder instance
     */
    public IGovernanceRoleDefinitionRequestBuilder roleDefinition() {
        return new GovernanceRoleDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinition"), getClient(), null);
    }

    /**
     * Gets the request builder for GovernanceSubject
     *
     * @return the IGovernanceSubjectRequestBuilder instance
     */
    public IGovernanceSubjectRequestBuilder subject() {
        return new GovernanceSubjectRequestBuilder(getRequestUrlWithAdditionalSegment("subject"), getClient(), null);
    }

    public IGovernanceRoleAssignmentRequestCancelRequestBuilder cancel() {
        return new GovernanceRoleAssignmentRequestCancelRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.cancel"), getClient(), null);
    }

    public IGovernanceRoleAssignmentRequestUpdateRequestRequestBuilder updateRequest(final String decision, final String assignmentState, final GovernanceSchedule schedule, final String reason) {
        return new GovernanceRoleAssignmentRequestUpdateRequestRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateRequest"), getClient(), null, decision, assignmentState, schedule, reason);
    }
}
