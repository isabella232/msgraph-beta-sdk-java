// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicySet;
import com.microsoft.graph.models.extensions.PolicySetItem;
import com.microsoft.graph.models.extensions.PolicySetAssignment;
import com.microsoft.graph.requests.extensions.IPolicySetAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicySetAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.PolicySetAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PolicySetAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicySetItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicySetItemRequestBuilder;
import com.microsoft.graph.requests.extensions.PolicySetItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PolicySetItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Policy Set Request Builder.
 */
public class PolicySetRequestBuilder extends BaseRequestBuilder implements IPolicySetRequestBuilder {

    /**
     * The request builder for the PolicySet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PolicySetRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPolicySetRequest instance
     */
    public IPolicySetRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPolicySetRequest instance
     */
    public IPolicySetRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PolicySetRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IPolicySetAssignmentCollectionRequestBuilder assignments() {
        return new PolicySetAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IPolicySetAssignmentRequestBuilder assignments(final String id) {
        return new PolicySetAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public IPolicySetItemCollectionRequestBuilder items() {
        return new PolicySetItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    public IPolicySetItemRequestBuilder items(final String id) {
        return new PolicySetItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }

    public IPolicySetUpdateRequestBuilder update(final java.util.List<PolicySetItem> addedPolicySetItems, final java.util.List<PolicySetItem> updatedPolicySetItems, final java.util.List<String> deletedPolicySetItems, final java.util.List<PolicySetAssignment> assignments) {
        return new PolicySetUpdateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.update"), getClient(), null, addedPolicySetItems, updatedPolicySetItems, deletedPolicySetItems, assignments);
    }
}
