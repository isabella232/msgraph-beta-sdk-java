// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.generated.AdministratorConfiguredDeviceComplianceState;
import com.microsoft.graph.models.extensions.DeviceLogCollectionRequest;
import com.microsoft.graph.models.extensions.DeviceLogCollectionResponse;
import com.microsoft.graph.models.extensions.ConfigurationManagerAction;
import com.microsoft.graph.models.extensions.UpdateWindowsDeviceAccountActionParameter;
import com.microsoft.graph.models.generated.ManagedDeviceRemoteAction;
import com.microsoft.graph.models.extensions.BulkManagedDeviceActionResult;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicySettingState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.ManagedDevice;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Collection Reference Request.
 */
public interface IManagedDeviceCollectionReferenceRequest {

    void post(final ManagedDevice newManagedDevice, final ICallback<? super ManagedDevice> callback);

    ManagedDevice post(final ManagedDevice newManagedDevice) throws ClientException;

    IManagedDeviceCollectionReferenceRequest select(final String value);

    IManagedDeviceCollectionReferenceRequest top(final int value);

}
