// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentMakeEligibleRequest;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentMakeEligibleRequest;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignment;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Make Eligible Request Builder.
 */
public class PrivilegedRoleAssignmentMakeEligibleRequestBuilder extends BaseActionRequestBuilder implements IPrivilegedRoleAssignmentMakeEligibleRequestBuilder {

    /**
     * The request builder for this PrivilegedRoleAssignmentMakeEligible
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedRoleAssignmentMakeEligibleRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IPrivilegedRoleAssignmentMakeEligibleRequest
     *
     * @param requestOptions the options for the request
     * @return the IPrivilegedRoleAssignmentMakeEligibleRequest instance
     */
    public IPrivilegedRoleAssignmentMakeEligibleRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IPrivilegedRoleAssignmentMakeEligibleRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IPrivilegedRoleAssignmentMakeEligibleRequest instance
     */
    public IPrivilegedRoleAssignmentMakeEligibleRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PrivilegedRoleAssignmentMakeEligibleRequest request = new PrivilegedRoleAssignmentMakeEligibleRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
