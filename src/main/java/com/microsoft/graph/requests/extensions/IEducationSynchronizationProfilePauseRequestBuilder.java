// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEducationSynchronizationProfilePauseRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education Synchronization Profile Pause Request Builder.
 */
public interface IEducationSynchronizationProfilePauseRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IEducationSynchronizationProfilePauseRequest
     *
     * @return the IEducationSynchronizationProfilePauseRequest instance
     */
    IEducationSynchronizationProfilePauseRequest buildRequest();

    /**
     * Creates the IEducationSynchronizationProfilePauseRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IEducationSynchronizationProfilePauseRequest instance
     */
    IEducationSynchronizationProfilePauseRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
