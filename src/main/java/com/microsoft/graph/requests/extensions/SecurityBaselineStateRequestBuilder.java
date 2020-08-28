// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SecurityBaselineState;
import com.microsoft.graph.requests.extensions.ISecurityBaselineSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineSettingStateRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SecurityBaselineSettingStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline State Request Builder.
 */
public class SecurityBaselineStateRequestBuilder extends BaseRequestBuilder implements ISecurityBaselineStateRequestBuilder {

    /**
     * The request builder for the SecurityBaselineState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityBaselineStateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the ISecurityBaselineStateRequest instance
     */
    public ISecurityBaselineStateRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ISecurityBaselineStateRequest instance
     */
    public ISecurityBaselineStateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.SecurityBaselineStateRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ISecurityBaselineSettingStateCollectionRequestBuilder settingStates() {
        return new SecurityBaselineSettingStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settingStates"), getClient(), null);
    }

    public ISecurityBaselineSettingStateRequestBuilder settingStates(final String id) {
        return new SecurityBaselineSettingStateRequestBuilder(getRequestUrlWithAdditionalSegment("settingStates") + "/" + id, getClient(), null);
    }
}
