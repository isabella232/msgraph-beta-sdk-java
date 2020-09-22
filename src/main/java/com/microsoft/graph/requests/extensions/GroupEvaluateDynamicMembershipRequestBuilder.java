// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupEvaluateDynamicMembershipRequest;
import com.microsoft.graph.requests.extensions.GroupEvaluateDynamicMembershipRequest;
import com.microsoft.graph.models.extensions.EvaluateDynamicMembershipResult;
import com.microsoft.graph.models.extensions.EvaluateDynamicMembershipResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Evaluate Dynamic Membership Request Builder.
 */
public class GroupEvaluateDynamicMembershipRequestBuilder extends BaseActionRequestBuilder implements IGroupEvaluateDynamicMembershipRequestBuilder {

    /**
     * The request builder for this GroupEvaluateDynamicMembership
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param memberId the memberId
     */
    public GroupEvaluateDynamicMembershipRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String memberId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("memberId", memberId);
    }
    /**
     * The request builder for this GroupEvaluateDynamicMembership
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param memberId the memberId
     * @param membershipRule the membershipRule
     */
    public GroupEvaluateDynamicMembershipRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String memberId, final String membershipRule) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("memberId", memberId);
        bodyParams.put("membershipRule", membershipRule);
    }

    /**
     * Creates the IGroupEvaluateDynamicMembershipRequest
     *
     * @param requestOptions the options for the request
     * @return the IGroupEvaluateDynamicMembershipRequest instance
     */
    public IGroupEvaluateDynamicMembershipRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IGroupEvaluateDynamicMembershipRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IGroupEvaluateDynamicMembershipRequest instance
     */
    public IGroupEvaluateDynamicMembershipRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        GroupEvaluateDynamicMembershipRequest request = new GroupEvaluateDynamicMembershipRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("memberId")) {
            request.body.memberId = getParameter("memberId");
        }

        return request;
    }
}
