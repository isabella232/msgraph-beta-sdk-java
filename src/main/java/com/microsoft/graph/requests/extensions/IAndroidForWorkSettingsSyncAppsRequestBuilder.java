// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidForWorkSettingsSyncAppsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android For Work Settings Sync Apps Request Builder.
 */
public interface IAndroidForWorkSettingsSyncAppsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IAndroidForWorkSettingsSyncAppsRequest
     *
     * @param requestOptions the options for the request
     * @return the IAndroidForWorkSettingsSyncAppsRequest instance
     */
    IAndroidForWorkSettingsSyncAppsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IAndroidForWorkSettingsSyncAppsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IAndroidForWorkSettingsSyncAppsRequest instance
     */
    IAndroidForWorkSettingsSyncAppsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
