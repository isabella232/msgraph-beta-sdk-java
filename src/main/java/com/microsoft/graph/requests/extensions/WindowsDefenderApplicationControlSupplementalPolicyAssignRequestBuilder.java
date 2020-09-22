// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyAssignRequest;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignRequest;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignment;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Assign Request Builder.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyAssignRequestBuilder extends BaseActionRequestBuilder implements IWindowsDefenderApplicationControlSupplementalPolicyAssignRequestBuilder {

    /**
     * The request builder for this WindowsDefenderApplicationControlSupplementalPolicyAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param wdacPolicyAssignments the wdacPolicyAssignments
     */
    public WindowsDefenderApplicationControlSupplementalPolicyAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<WindowsDefenderApplicationControlSupplementalPolicyAssignment> wdacPolicyAssignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("wdacPolicyAssignments", wdacPolicyAssignments);
    }

    /**
     * Creates the IWindowsDefenderApplicationControlSupplementalPolicyAssignRequest
     *
     * @param requestOptions the options for the request
     * @return the IWindowsDefenderApplicationControlSupplementalPolicyAssignRequest instance
     */
    public IWindowsDefenderApplicationControlSupplementalPolicyAssignRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IWindowsDefenderApplicationControlSupplementalPolicyAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWindowsDefenderApplicationControlSupplementalPolicyAssignRequest instance
     */
    public IWindowsDefenderApplicationControlSupplementalPolicyAssignRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WindowsDefenderApplicationControlSupplementalPolicyAssignRequest request = new WindowsDefenderApplicationControlSupplementalPolicyAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("wdacPolicyAssignments")) {
            request.body.wdacPolicyAssignments = getParameter("wdacPolicyAssignments");
        }

        return request;
    }
}
