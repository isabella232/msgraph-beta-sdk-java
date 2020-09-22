// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleSelfDeactivateRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Self Deactivate Request Builder.
 */
public interface IPrivilegedRoleSelfDeactivateRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IPrivilegedRoleSelfDeactivateRequest
     *
     * @param requestOptions the options for the request
     * @return the IPrivilegedRoleSelfDeactivateRequest instance
     */
    IPrivilegedRoleSelfDeactivateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IPrivilegedRoleSelfDeactivateRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IPrivilegedRoleSelfDeactivateRequest instance
     */
    IPrivilegedRoleSelfDeactivateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
