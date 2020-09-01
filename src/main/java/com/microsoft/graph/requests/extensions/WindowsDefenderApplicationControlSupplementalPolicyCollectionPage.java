// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicy;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Collection Page.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyCollectionPage extends BaseCollectionPage<WindowsDefenderApplicationControlSupplementalPolicy, IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder> implements IWindowsDefenderApplicationControlSupplementalPolicyCollectionPage {

    /**
     * A collection page for WindowsDefenderApplicationControlSupplementalPolicy
     *
     * @param response the serialized WindowsDefenderApplicationControlSupplementalPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsDefenderApplicationControlSupplementalPolicyCollectionPage(final WindowsDefenderApplicationControlSupplementalPolicyCollectionResponse response, final IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}