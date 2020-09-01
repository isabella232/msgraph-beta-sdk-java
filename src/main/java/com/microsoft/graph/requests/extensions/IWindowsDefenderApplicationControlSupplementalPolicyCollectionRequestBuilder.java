// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicy;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Defender Application Control Supplemental Policy Collection Request Builder.
 */
public interface IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder extends IRequestBuilder {

    IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequest buildRequest();

    IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWindowsDefenderApplicationControlSupplementalPolicyRequestBuilder byId(final String id);

}