// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OfficeClientConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IOfficeClientConfigurationAssignCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Office Client Configuration Assign Collection Request Builder.
 */
public interface IOfficeClientConfigurationAssignCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IOfficeClientConfigurationAssignCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IOfficeClientConfigurationAssignCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
