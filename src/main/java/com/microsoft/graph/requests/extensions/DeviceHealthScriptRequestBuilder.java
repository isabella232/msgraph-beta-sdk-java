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
import com.microsoft.graph.requests.extensions.DeviceHealthScriptAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptRunSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceHealthScriptRunSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script Request Builder.
 */
public class DeviceHealthScriptRequestBuilder extends BaseRequestBuilder implements IDeviceHealthScriptRequestBuilder {

    /**
     * The request builder for the DeviceHealthScript
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceHealthScriptRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceHealthScriptRequest instance
     */
    public IDeviceHealthScriptRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceHealthScriptRequest instance
     */
    public IDeviceHealthScriptRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceHealthScriptRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceHealthScriptAssignmentCollectionRequestBuilder assignments() {
        return new DeviceHealthScriptAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IDeviceHealthScriptAssignmentRequestBuilder assignments(final String id) {
        return new DeviceHealthScriptAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public IDeviceHealthScriptDeviceStateCollectionRequestBuilder deviceRunStates() {
        return new DeviceHealthScriptDeviceStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceRunStates"), getClient(), null);
    }

    public IDeviceHealthScriptDeviceStateRequestBuilder deviceRunStates(final String id) {
        return new DeviceHealthScriptDeviceStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceRunStates") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceHealthScriptRunSummary
     *
     * @return the IDeviceHealthScriptRunSummaryRequestBuilder instance
     */
    public IDeviceHealthScriptRunSummaryRequestBuilder runSummary() {
        return new DeviceHealthScriptRunSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("runSummary"), getClient(), null);
    }

    public IDeviceHealthScriptAssignRequestBuilder assign(final java.util.List<DeviceHealthScriptAssignment> deviceHealthScriptAssignments) {
        return new DeviceHealthScriptAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, deviceHealthScriptAssignments);
    }

    public IDeviceHealthScriptGetGlobalScriptHighestAvailableVersionRequestBuilder getGlobalScriptHighestAvailableVersion() {
        return new DeviceHealthScriptGetGlobalScriptHighestAvailableVersionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getGlobalScriptHighestAvailableVersion"), getClient(), null);
    }

    public IDeviceHealthScriptUpdateGlobalScriptRequestBuilder updateGlobalScript(final String version) {
        return new DeviceHealthScriptUpdateGlobalScriptRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateGlobalScript"), getClient(), null, version);
    }

    public IDeviceHealthScriptGetRemediationHistoryRequestBuilder getRemediationHistory() {
        return new DeviceHealthScriptGetRemediationHistoryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getRemediationHistory"), getClient(), null);
    }
}
