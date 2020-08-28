// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionWipeAction;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionWipeActionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionWipeActionCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionWipeActionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Wipe Action Collection Page.
 */
public class WindowsInformationProtectionWipeActionCollectionPage extends BaseCollectionPage<WindowsInformationProtectionWipeAction, IWindowsInformationProtectionWipeActionCollectionRequestBuilder> implements IWindowsInformationProtectionWipeActionCollectionPage {

    /**
     * A collection page for WindowsInformationProtectionWipeAction
     *
     * @param response the serialized WindowsInformationProtectionWipeActionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsInformationProtectionWipeActionCollectionPage(final WindowsInformationProtectionWipeActionCollectionResponse response, final IWindowsInformationProtectionWipeActionCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
