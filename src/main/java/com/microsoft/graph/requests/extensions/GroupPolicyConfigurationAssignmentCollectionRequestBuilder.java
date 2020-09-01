// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyConfiguration;
import com.microsoft.graph.models.extensions.GroupPolicyConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationAssignmentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Configuration Assignment Collection Request Builder.
 */
public class GroupPolicyConfigurationAssignmentCollectionRequestBuilder extends BaseRequestBuilder implements IGroupPolicyConfigurationAssignmentCollectionRequestBuilder {

    /**
     * The request builder for this collection of GroupPolicyConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyConfigurationAssignmentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IGroupPolicyConfigurationAssignmentCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IGroupPolicyConfigurationAssignmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new GroupPolicyConfigurationAssignmentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IGroupPolicyConfigurationAssignmentRequestBuilder byId(final String id) {
        return new GroupPolicyConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}