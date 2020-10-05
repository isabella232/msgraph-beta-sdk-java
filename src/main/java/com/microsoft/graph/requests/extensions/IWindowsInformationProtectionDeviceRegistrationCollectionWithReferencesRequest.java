// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionDeviceRegistration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Information Protection Device Registration Collection With References Request.
 */
public interface IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequest extends IHttpRequest {

    void get(final ICallback<? super IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesPage> callback);

    IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesPage get() throws ClientException;

    IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequest expand(final String value);
    
    IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequest select(final String value);

    IWindowsInformationProtectionDeviceRegistrationCollectionWithReferencesRequest top(final int value);

}
