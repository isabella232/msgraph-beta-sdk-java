// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsUpdateForBusinessConfiguration;
import com.microsoft.graph.models.extensions.WindowsUpdateState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWindowsUpdateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsUpdateStateCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Update State Collection Request Builder.
 */
public interface IWindowsUpdateStateCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IWindowsUpdateStateCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IWindowsUpdateStateCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWindowsUpdateStateRequestBuilder byId(final String id);

}
