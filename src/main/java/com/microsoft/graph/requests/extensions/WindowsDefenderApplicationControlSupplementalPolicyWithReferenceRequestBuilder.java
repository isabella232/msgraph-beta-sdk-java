// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicy;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignment;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyDeploymentSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy With Reference Request Builder.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyWithReferenceRequestBuilder extends BaseRequestBuilder implements IWindowsDefenderApplicationControlSupplementalPolicyWithReferenceRequestBuilder {

    /**
     * The request builder for the WindowsDefenderApplicationControlSupplementalPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsDefenderApplicationControlSupplementalPolicyWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWindowsDefenderApplicationControlSupplementalPolicyWithReferenceRequest instance
     */
    public IWindowsDefenderApplicationControlSupplementalPolicyWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IWindowsDefenderApplicationControlSupplementalPolicyWithReferenceRequest instance
     */
    public IWindowsDefenderApplicationControlSupplementalPolicyWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WindowsDefenderApplicationControlSupplementalPolicyWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWindowsDefenderApplicationControlSupplementalPolicyReferenceRequestBuilder reference(){
        return new WindowsDefenderApplicationControlSupplementalPolicyReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
