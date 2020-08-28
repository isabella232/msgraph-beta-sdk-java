// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceHealthScript;
import com.microsoft.graph.models.extensions.DeviceHealthScriptAssignment;
import com.microsoft.graph.models.extensions.DeviceHealthScriptRemediationHistory;
import com.microsoft.graph.models.generated.GlobalDeviceHealthScriptState;
import com.microsoft.graph.models.extensions.DeviceHealthScriptRemediationSummary;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptRunSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Health Script Request Builder.
 */
public interface IDeviceHealthScriptRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDeviceHealthScriptRequest instance
     */
    IDeviceHealthScriptRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceHealthScriptRequest instance
     */
    IDeviceHealthScriptRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDeviceHealthScriptAssignmentCollectionRequestBuilder assignments();

    IDeviceHealthScriptAssignmentRequestBuilder assignments(final String id);

    /**
     * Gets the request builder for DeviceHealthScriptRunSummary
     *
     * @return the IDeviceHealthScriptRunSummaryRequestBuilder instance
     */
    IDeviceHealthScriptRunSummaryRequestBuilder runSummary();

    IDeviceHealthScriptDeviceStateCollectionRequestBuilder deviceRunStates();

    IDeviceHealthScriptDeviceStateRequestBuilder deviceRunStates(final String id);
    IDeviceHealthScriptAssignRequestBuilder assign(final java.util.List<DeviceHealthScriptAssignment> deviceHealthScriptAssignments);
    IDeviceHealthScriptUpdateGlobalScriptRequestBuilder updateGlobalScript(final String version);
    IDeviceHealthScriptGetGlobalScriptHighestAvailableVersionRequestBuilder getGlobalScriptHighestAvailableVersion();
    IDeviceHealthScriptGetRemediationHistoryRequestBuilder getRemediationHistory();

}