// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagedDeviceDeleteUserFromSharedAppleDeviceRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed Device Delete User From Shared Apple Device Request Builder.
 */
public interface IManagedDeviceDeleteUserFromSharedAppleDeviceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IManagedDeviceDeleteUserFromSharedAppleDeviceRequest
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceDeleteUserFromSharedAppleDeviceRequest instance
     */
    IManagedDeviceDeleteUserFromSharedAppleDeviceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IManagedDeviceDeleteUserFromSharedAppleDeviceRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IManagedDeviceDeleteUserFromSharedAppleDeviceRequest instance
     */
    IManagedDeviceDeleteUserFromSharedAppleDeviceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
