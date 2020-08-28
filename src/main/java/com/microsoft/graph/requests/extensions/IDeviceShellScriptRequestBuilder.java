// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceShellScript;
import com.microsoft.graph.models.extensions.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementScriptAssignment;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptUserStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptUserStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptRunSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Shell Script Request Builder.
 */
public interface IDeviceShellScriptRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDeviceShellScriptRequest instance
     */
    IDeviceShellScriptRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceShellScriptRequest instance
     */
    IDeviceShellScriptRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDeviceManagementScriptGroupAssignmentCollectionRequestBuilder groupAssignments();

    IDeviceManagementScriptGroupAssignmentRequestBuilder groupAssignments(final String id);

    IDeviceManagementScriptAssignmentCollectionRequestBuilder assignments();

    IDeviceManagementScriptAssignmentRequestBuilder assignments(final String id);

    /**
     * Gets the request builder for DeviceManagementScriptRunSummary
     *
     * @return the IDeviceManagementScriptRunSummaryWithReferenceRequestBuilder instance
     */
    IDeviceManagementScriptRunSummaryWithReferenceRequestBuilder runSummary();

    IDeviceManagementScriptDeviceStateCollectionRequestBuilder deviceRunStates();

    IDeviceManagementScriptDeviceStateRequestBuilder deviceRunStates(final String id);

    IDeviceManagementScriptUserStateCollectionRequestBuilder userRunStates();

    IDeviceManagementScriptUserStateRequestBuilder userRunStates(final String id);
    IDeviceShellScriptAssignRequestBuilder assign(final java.util.List<DeviceManagementScriptGroupAssignment> deviceManagementScriptGroupAssignments, final java.util.List<DeviceManagementScriptAssignment> deviceManagementScriptAssignments);

}