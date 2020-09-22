// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignment;
import com.microsoft.graph.requests.extensions.IAppScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.AppScopeRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.DirectoryObjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IUnifiedRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.UnifiedRoleDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Unified Role Assignment Request Builder.
 */
public class UnifiedRoleAssignmentRequestBuilder extends BaseRequestBuilder implements IUnifiedRoleAssignmentRequestBuilder {

    /**
     * The request builder for the UnifiedRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UnifiedRoleAssignmentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUnifiedRoleAssignmentRequest instance
     */
    public IUnifiedRoleAssignmentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IUnifiedRoleAssignmentRequest instance
     */
    public IUnifiedRoleAssignmentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.UnifiedRoleAssignmentRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for AppScope
     *
     * @return the IAppScopeRequestBuilder instance
     */
    public IAppScopeRequestBuilder appScope() {
        return new AppScopeRequestBuilder(getRequestUrlWithAdditionalSegment("appScope"), getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the IDirectoryObjectWithReferenceRequestBuilder instance
     */
    public IDirectoryObjectWithReferenceRequestBuilder directoryScope() {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("directoryScope"), getClient(), null);
    }

    /**
     * Gets the request builder for DirectoryObject
     *
     * @return the IDirectoryObjectWithReferenceRequestBuilder instance
     */
    public IDirectoryObjectWithReferenceRequestBuilder principal() {
        return new DirectoryObjectWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("principal"), getClient(), null);
    }

    /**
     * Gets the request builder for UnifiedRoleDefinition
     *
     * @return the IUnifiedRoleDefinitionWithReferenceRequestBuilder instance
     */
    public IUnifiedRoleDefinitionWithReferenceRequestBuilder roleDefinition() {
        return new UnifiedRoleDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinition"), getClient(), null);
    }
}
