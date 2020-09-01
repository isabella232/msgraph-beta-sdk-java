// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPolicySetUpdateRequest;
import com.microsoft.graph.requests.extensions.PolicySetUpdateRequest;
import com.microsoft.graph.models.extensions.PolicySetItem;
import com.microsoft.graph.models.extensions.PolicySetAssignment;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Set Update Request Builder.
 */
public class PolicySetUpdateRequestBuilder extends BaseActionRequestBuilder implements IPolicySetUpdateRequestBuilder {

    /**
     * The request builder for this PolicySetUpdate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param addedPolicySetItems the addedPolicySetItems
     * @param updatedPolicySetItems the updatedPolicySetItems
     * @param deletedPolicySetItems the deletedPolicySetItems
     * @param assignments the assignments
     */
    public PolicySetUpdateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<PolicySetItem> addedPolicySetItems, final java.util.List<PolicySetItem> updatedPolicySetItems, final java.util.List<String> deletedPolicySetItems, final java.util.List<PolicySetAssignment> assignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("addedPolicySetItems", addedPolicySetItems);
        bodyParams.put("updatedPolicySetItems", updatedPolicySetItems);
        bodyParams.put("deletedPolicySetItems", deletedPolicySetItems);
        bodyParams.put("assignments", assignments);
    }

    /**
     * Creates the IPolicySetUpdateRequest
     *
     * @return the IPolicySetUpdateRequest instance
     */
    public IPolicySetUpdateRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IPolicySetUpdateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IPolicySetUpdateRequest instance
     */
    public IPolicySetUpdateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PolicySetUpdateRequest request = new PolicySetUpdateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("addedPolicySetItems")) {
            request.body.addedPolicySetItems = getParameter("addedPolicySetItems");
        }

        if (hasParameter("updatedPolicySetItems")) {
            request.body.updatedPolicySetItems = getParameter("updatedPolicySetItems");
        }

        if (hasParameter("deletedPolicySetItems")) {
            request.body.deletedPolicySetItems = getParameter("deletedPolicySetItems");
        }

        if (hasParameter("assignments")) {
            request.body.assignments = getParameter("assignments");
        }

        return request;
    }
}