// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SecurityBaselineTemplate;
import com.microsoft.graph.requests.extensions.ISecurityBaselineCategoryStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineCategoryStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityBaselineStateSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Security Baseline Template Request Builder.
 */
public interface ISecurityBaselineTemplateRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISecurityBaselineTemplateRequest instance
     */
    ISecurityBaselineTemplateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISecurityBaselineTemplateRequest instance
     */
    ISecurityBaselineTemplateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDeviceManagementTemplateSettingCategoryCollectionRequestBuilder categories();

    IDeviceManagementTemplateSettingCategoryRequestBuilder categories(final String id);

    IDeviceManagementTemplateCollectionRequestBuilder migratableTo();

    IDeviceManagementTemplateRequestBuilder migratableTo(final String id);

    IDeviceManagementSettingInstanceCollectionRequestBuilder settings();

    IDeviceManagementSettingInstanceRequestBuilder settings(final String id);

    ISecurityBaselineCategoryStateSummaryCollectionRequestBuilder categoryDeviceStateSummaries();

    ISecurityBaselineCategoryStateSummaryRequestBuilder categoryDeviceStateSummaries(final String id);

    ISecurityBaselineDeviceStateCollectionRequestBuilder deviceStates();

    ISecurityBaselineDeviceStateRequestBuilder deviceStates(final String id);

    /**
     * Gets the request builder for SecurityBaselineStateSummary
     *
     * @return the ISecurityBaselineStateSummaryRequestBuilder instance
     */
    ISecurityBaselineStateSummaryRequestBuilder deviceStateSummary();

}