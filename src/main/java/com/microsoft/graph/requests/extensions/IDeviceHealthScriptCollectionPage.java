// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceHealthScript;
import com.microsoft.graph.models.extensions.DeviceHealthScriptAssignment;
import com.microsoft.graph.models.extensions.DeviceHealthScriptRemediationHistory;
import com.microsoft.graph.models.generated.GlobalDeviceHealthScriptState;
import com.microsoft.graph.models.extensions.DeviceHealthScriptRemediationSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Health Script Collection Page.
 */
public interface IDeviceHealthScriptCollectionPage extends IBaseCollectionPage<DeviceHealthScript, IDeviceHealthScriptCollectionRequestBuilder> {
}