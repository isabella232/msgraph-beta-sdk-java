// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleSelfActivateRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Self Activate Request Builder.
 */
public interface IPrivilegedRoleSelfActivateRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IPrivilegedRoleSelfActivateRequest
     *
     * @param requestOptions the options for the request
     * @return the IPrivilegedRoleSelfActivateRequest instance
     */
    IPrivilegedRoleSelfActivateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IPrivilegedRoleSelfActivateRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IPrivilegedRoleSelfActivateRequest instance
     */
    IPrivilegedRoleSelfActivateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
