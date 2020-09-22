// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AdvancedThreatProtectionOnboardingStateSummary;
import com.microsoft.graph.requests.extensions.IAdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdvancedThreatProtectionOnboardingDeviceSettingStateRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Advanced Threat Protection Onboarding State Summary Request Builder.
 */
public interface IAdvancedThreatProtectionOnboardingStateSummaryRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAdvancedThreatProtectionOnboardingStateSummaryRequest instance
     */
    IAdvancedThreatProtectionOnboardingStateSummaryRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IAdvancedThreatProtectionOnboardingStateSummaryRequest instance
     */
    IAdvancedThreatProtectionOnboardingStateSummaryRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IAdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequestBuilder advancedThreatProtectionOnboardingDeviceSettingStates();

    IAdvancedThreatProtectionOnboardingDeviceSettingStateRequestBuilder advancedThreatProtectionOnboardingDeviceSettingStates(final String id);

}