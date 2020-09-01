// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Assignment Collection Request Builder.
 */
public class DeviceCompliancePolicyAssignmentCollectionRequestBuilder extends BaseRequestBuilder implements IDeviceCompliancePolicyAssignmentCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyAssignmentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IDeviceCompliancePolicyAssignmentCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceCompliancePolicyAssignmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DeviceCompliancePolicyAssignmentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDeviceCompliancePolicyAssignmentRequestBuilder byId(final String id) {
        return new DeviceCompliancePolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}