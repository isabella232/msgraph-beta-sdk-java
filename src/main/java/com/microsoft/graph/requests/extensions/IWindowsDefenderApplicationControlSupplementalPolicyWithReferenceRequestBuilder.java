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
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyDeploymentSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Defender Application Control Supplemental Policy With Reference Request Builder.
 */
public interface IWindowsDefenderApplicationControlSupplementalPolicyWithReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWindowsDefenderApplicationControlSupplementalPolicyWithReferenceRequest instance
     */
    IWindowsDefenderApplicationControlSupplementalPolicyWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWindowsDefenderApplicationControlSupplementalPolicyWithReferenceRequest instance
     */
    IWindowsDefenderApplicationControlSupplementalPolicyWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWindowsDefenderApplicationControlSupplementalPolicyReferenceRequestBuilder reference();

}
