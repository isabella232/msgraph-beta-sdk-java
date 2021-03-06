// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsUpdateState;
import com.microsoft.graph.requests.extensions.IWindowsUpdateStateCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsUpdateStateCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsUpdateStateCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Update State Collection Page.
 */
public class WindowsUpdateStateCollectionPage extends BaseCollectionPage<WindowsUpdateState, IWindowsUpdateStateCollectionRequestBuilder> implements IWindowsUpdateStateCollectionPage {

    /**
     * A collection page for WindowsUpdateState
     *
     * @param response the serialized WindowsUpdateStateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsUpdateStateCollectionPage(final WindowsUpdateStateCollectionResponse response, final IWindowsUpdateStateCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
