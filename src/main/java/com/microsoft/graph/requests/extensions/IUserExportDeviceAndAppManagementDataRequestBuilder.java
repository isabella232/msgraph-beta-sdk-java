// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserExportDeviceAndAppManagementDataRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Export Device And App Management Data Request Builder.
 */
public interface IUserExportDeviceAndAppManagementDataRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IUserExportDeviceAndAppManagementDataRequest
     *
     * @return the IUserExportDeviceAndAppManagementDataRequest instance
     */
    IUserExportDeviceAndAppManagementDataRequest buildRequest();

    /**
     * Creates the IUserExportDeviceAndAppManagementDataRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IUserExportDeviceAndAppManagementDataRequest instance
     */
    IUserExportDeviceAndAppManagementDataRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
