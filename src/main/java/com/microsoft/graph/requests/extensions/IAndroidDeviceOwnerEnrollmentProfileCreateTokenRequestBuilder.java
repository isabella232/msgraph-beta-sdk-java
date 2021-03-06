// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Device Owner Enrollment Profile Create Token Request Builder.
 */
public interface IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequest
     *
     * @param requestOptions the options for the request
     * @return the IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequest instance
     */
    IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequest instance
     */
    IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
