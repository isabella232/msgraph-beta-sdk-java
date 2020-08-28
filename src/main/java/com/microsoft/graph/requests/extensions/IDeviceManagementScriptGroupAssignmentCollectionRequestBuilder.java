// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceShellScript;
import com.microsoft.graph.models.extensions.DeviceManagementScriptGroupAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementScriptGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptGroupAssignmentCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Script Group Assignment Collection Request Builder.
 */
public interface IDeviceManagementScriptGroupAssignmentCollectionRequestBuilder extends IRequestBuilder {

    IDeviceManagementScriptGroupAssignmentCollectionRequest buildRequest();

    IDeviceManagementScriptGroupAssignmentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IDeviceManagementScriptGroupAssignmentRequestBuilder byId(final String id);

}
