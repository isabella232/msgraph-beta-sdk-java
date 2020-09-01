// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsAutopilotDeploymentProfile;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.WindowsAutopilotDeploymentProfile;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Autopilot Deployment Profile With Reference Request.
 */
public interface IWindowsAutopilotDeploymentProfileWithReferenceRequest extends IHttpRequest {

    void post(final WindowsAutopilotDeploymentProfile newWindowsAutopilotDeploymentProfile, final IJsonBackedObject payload, final ICallback<WindowsAutopilotDeploymentProfile> callback);

    WindowsAutopilotDeploymentProfile post(final WindowsAutopilotDeploymentProfile newWindowsAutopilotDeploymentProfile, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<WindowsAutopilotDeploymentProfile> callback);

    WindowsAutopilotDeploymentProfile get() throws ClientException;

	void delete(final ICallback<WindowsAutopilotDeploymentProfile> callback);

	void delete() throws ClientException;

	void patch(final WindowsAutopilotDeploymentProfile sourceWindowsAutopilotDeploymentProfile, final ICallback<WindowsAutopilotDeploymentProfile> callback);

	WindowsAutopilotDeploymentProfile patch(final WindowsAutopilotDeploymentProfile sourceWindowsAutopilotDeploymentProfile) throws ClientException;

    IWindowsAutopilotDeploymentProfileWithReferenceRequest select(final String value);

    IWindowsAutopilotDeploymentProfileWithReferenceRequest expand(final String value);

}