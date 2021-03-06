// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignment;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Assignment Collection Page.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage extends BaseCollectionPage<WindowsDefenderApplicationControlSupplementalPolicyAssignment, IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder> implements IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage {

    /**
     * A collection page for WindowsDefenderApplicationControlSupplementalPolicyAssignment
     *
     * @param response the serialized WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionPage(final WindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionResponse response, final IWindowsDefenderApplicationControlSupplementalPolicyAssignmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
