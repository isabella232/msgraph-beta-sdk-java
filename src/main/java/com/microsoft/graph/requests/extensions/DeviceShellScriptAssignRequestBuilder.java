// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceShellScriptAssignRequest;
import com.microsoft.graph.requests.extensions.DeviceShellScriptAssignRequest;
import com.microsoft.graph.models.extensions.DeviceManagementScriptGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementScriptAssignment;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Shell Script Assign Request Builder.
 */
public class DeviceShellScriptAssignRequestBuilder extends BaseActionRequestBuilder implements IDeviceShellScriptAssignRequestBuilder {

    /**
     * The request builder for this DeviceShellScriptAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param deviceManagementScriptGroupAssignments the deviceManagementScriptGroupAssignments
     * @param deviceManagementScriptAssignments the deviceManagementScriptAssignments
     */
    public DeviceShellScriptAssignRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<DeviceManagementScriptGroupAssignment> deviceManagementScriptGroupAssignments, final java.util.List<DeviceManagementScriptAssignment> deviceManagementScriptAssignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("deviceManagementScriptGroupAssignments", deviceManagementScriptGroupAssignments);
        bodyParams.put("deviceManagementScriptAssignments", deviceManagementScriptAssignments);
    }

    /**
     * Creates the IDeviceShellScriptAssignRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceShellScriptAssignRequest instance
     */
    public IDeviceShellScriptAssignRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IDeviceShellScriptAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDeviceShellScriptAssignRequest instance
     */
    public IDeviceShellScriptAssignRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceShellScriptAssignRequest request = new DeviceShellScriptAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("deviceManagementScriptGroupAssignments")) {
            request.body.deviceManagementScriptGroupAssignments = getParameter("deviceManagementScriptGroupAssignments");
        }

        if (hasParameter("deviceManagementScriptAssignments")) {
            request.body.deviceManagementScriptAssignments = getParameter("deviceManagementScriptAssignments");
        }

        return request;
    }
}
