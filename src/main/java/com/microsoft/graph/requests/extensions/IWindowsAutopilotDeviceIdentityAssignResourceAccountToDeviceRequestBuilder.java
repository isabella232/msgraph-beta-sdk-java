// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Autopilot Device Identity Assign Resource Account To Device Request Builder.
 */
public interface IWindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequest
     *
     * @param requestOptions the options for the request
     * @return the IWindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequest instance
     */
    IWindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequest instance
     */
    IWindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
