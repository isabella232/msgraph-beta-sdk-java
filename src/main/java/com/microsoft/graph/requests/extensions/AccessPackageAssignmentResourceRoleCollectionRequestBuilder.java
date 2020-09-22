// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageAssignment;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentResourceRole;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleCollectionRequest;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleMyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Resource Role Collection Request Builder.
 */
public class AccessPackageAssignmentResourceRoleCollectionRequestBuilder extends BaseRequestBuilder implements IAccessPackageAssignmentResourceRoleCollectionRequestBuilder {

    /**
     * The request builder for this collection of AccessPackageAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentResourceRoleCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAccessPackageAssignmentResourceRoleCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAccessPackageAssignmentResourceRoleCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AccessPackageAssignmentResourceRoleCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAccessPackageAssignmentResourceRoleRequestBuilder byId(final String id) {
        return new AccessPackageAssignmentResourceRoleRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IAccessPackageAssignmentResourceRoleMyCollectionRequestBuilder my() {
        return new AccessPackageAssignmentResourceRoleMyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.My"), getClient(), null);
    }
}
