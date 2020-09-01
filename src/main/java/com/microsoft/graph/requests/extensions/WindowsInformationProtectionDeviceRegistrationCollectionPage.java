// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionDeviceRegistration;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionDeviceRegistrationCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionDeviceRegistrationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Device Registration Collection Page.
 */
public class WindowsInformationProtectionDeviceRegistrationCollectionPage extends BaseCollectionPage<WindowsInformationProtectionDeviceRegistration, IWindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder> implements IWindowsInformationProtectionDeviceRegistrationCollectionPage {

    /**
     * A collection page for WindowsInformationProtectionDeviceRegistration
     *
     * @param response the serialized WindowsInformationProtectionDeviceRegistrationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsInformationProtectionDeviceRegistrationCollectionPage(final WindowsInformationProtectionDeviceRegistrationCollectionResponse response, final IWindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}