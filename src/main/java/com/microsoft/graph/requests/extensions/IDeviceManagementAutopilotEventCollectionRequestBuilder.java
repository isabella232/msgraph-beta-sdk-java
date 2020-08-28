// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceManagementAutopilotEvent;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementAutopilotEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementAutopilotEventCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Autopilot Event Collection Request Builder.
 */
public interface IDeviceManagementAutopilotEventCollectionRequestBuilder extends IRequestBuilder {

    IDeviceManagementAutopilotEventCollectionRequest buildRequest();

    IDeviceManagementAutopilotEventCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IDeviceManagementAutopilotEventRequestBuilder byId(final String id);

}
