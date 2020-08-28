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
 * The interface for the Windows Autopilot Deployment Profile Reference Request.
 */
public interface IWindowsAutopilotDeploymentProfileReferenceRequest extends IHttpRequest {

    void delete(final ICallback<WindowsAutopilotDeploymentProfile> callback);

    WindowsAutopilotDeploymentProfile delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindowsAutopilotDeploymentProfileReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindowsAutopilotDeploymentProfileReferenceRequest expand(final String value);

    /**
     * Puts the WindowsAutopilotDeploymentProfile
     *
     * @param srcWindowsAutopilotDeploymentProfile the WindowsAutopilotDeploymentProfile to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(WindowsAutopilotDeploymentProfile srcWindowsAutopilotDeploymentProfile, final ICallback<WindowsAutopilotDeploymentProfile> callback);

    /**
     * Puts the WindowsAutopilotDeploymentProfile
     *
     * @param srcWindowsAutopilotDeploymentProfile the WindowsAutopilotDeploymentProfile to PUT
     * @return the WindowsAutopilotDeploymentProfile
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    WindowsAutopilotDeploymentProfile put(WindowsAutopilotDeploymentProfile srcWindowsAutopilotDeploymentProfile) throws ClientException;
}
