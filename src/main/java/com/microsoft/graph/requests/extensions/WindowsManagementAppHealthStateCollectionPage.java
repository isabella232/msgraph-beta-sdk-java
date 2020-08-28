// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsManagementAppHealthState;
import com.microsoft.graph.requests.extensions.IWindowsManagementAppHealthStateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsManagementAppHealthStateCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsManagementAppHealthStateCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Management App Health State Collection Page.
 */
public class WindowsManagementAppHealthStateCollectionPage extends BaseCollectionPage<WindowsManagementAppHealthState, IWindowsManagementAppHealthStateCollectionRequestBuilder> implements IWindowsManagementAppHealthStateCollectionPage {

    /**
     * A collection page for WindowsManagementAppHealthState
     *
     * @param response the serialized WindowsManagementAppHealthStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsManagementAppHealthStateCollectionPage(final WindowsManagementAppHealthStateCollectionResponse response, final IWindowsManagementAppHealthStateCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
