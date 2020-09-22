// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingShareForSchoolDataSyncServiceRequest;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingShareForSchoolDataSyncServiceRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep Onboarding Setting Share For School Data Sync Service Request Builder.
 */
public class DepOnboardingSettingShareForSchoolDataSyncServiceRequestBuilder extends BaseActionRequestBuilder implements IDepOnboardingSettingShareForSchoolDataSyncServiceRequestBuilder {

    /**
     * The request builder for this DepOnboardingSettingShareForSchoolDataSyncService
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DepOnboardingSettingShareForSchoolDataSyncServiceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IDepOnboardingSettingShareForSchoolDataSyncServiceRequest
     *
     * @param requestOptions the options for the request
     * @return the IDepOnboardingSettingShareForSchoolDataSyncServiceRequest instance
     */
    public IDepOnboardingSettingShareForSchoolDataSyncServiceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IDepOnboardingSettingShareForSchoolDataSyncServiceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDepOnboardingSettingShareForSchoolDataSyncServiceRequest instance
     */
    public IDepOnboardingSettingShareForSchoolDataSyncServiceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DepOnboardingSettingShareForSchoolDataSyncServiceRequest request = new DepOnboardingSettingShareForSchoolDataSyncServiceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
