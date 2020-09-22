// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Managed Store Account Enterprise Settings Create Google Play Web Token Request Builder.
 */
public interface IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest
     *
     * @param requestOptions the options for the request
     * @return the IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest instance
     */
    IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest instance
     */
    IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
