// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ApprovalWorkflowProvider;
import com.microsoft.graph.requests.extensions.IBusinessFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBusinessFlowRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernancePolicyTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernancePolicyTemplateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Approval Workflow Provider Request Builder.
 */
public interface IApprovalWorkflowProviderRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IApprovalWorkflowProviderRequest instance
     */
    IApprovalWorkflowProviderRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IApprovalWorkflowProviderRequest instance
     */
    IApprovalWorkflowProviderRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IBusinessFlowCollectionRequestBuilder businessFlows();

    IBusinessFlowRequestBuilder businessFlows(final String id);

    IGovernancePolicyTemplateCollectionRequestBuilder policyTemplates();

    IGovernancePolicyTemplateRequestBuilder policyTemplates(final String id);

    IBusinessFlowCollectionRequestBuilder businessFlowsWithRequestsAwaitingMyDecision();

    IBusinessFlowRequestBuilder businessFlowsWithRequestsAwaitingMyDecision(final String id);

}