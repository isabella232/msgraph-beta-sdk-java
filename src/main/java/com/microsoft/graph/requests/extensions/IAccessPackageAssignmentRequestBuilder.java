// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageAssignment;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentResourceRoleRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageSubjectRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Access Package Assignment Request Builder.
 */
public interface IAccessPackageAssignmentRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IAccessPackageAssignmentRequest instance
     */
    IAccessPackageAssignmentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IAccessPackageAssignmentRequest instance
     */
    IAccessPackageAssignmentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for AccessPackage
     *
     * @return the IAccessPackageRequestBuilder instance
     */
    IAccessPackageRequestBuilder accessPackage();

    /**
     * Gets the request builder for AccessPackageAssignmentPolicy
     *
     * @return the IAccessPackageAssignmentPolicyRequestBuilder instance
     */
    IAccessPackageAssignmentPolicyRequestBuilder accessPackageAssignmentPolicy();

    IAccessPackageAssignmentRequestCollectionRequestBuilder accessPackageAssignmentRequests();

    IAccessPackageAssignmentRequestRequestBuilder accessPackageAssignmentRequests(final String id);

    IAccessPackageAssignmentResourceRoleCollectionRequestBuilder accessPackageAssignmentResourceRoles();

    IAccessPackageAssignmentResourceRoleRequestBuilder accessPackageAssignmentResourceRoles(final String id);

    /**
     * Gets the request builder for AccessPackageSubject
     *
     * @return the IAccessPackageSubjectRequestBuilder instance
     */
    IAccessPackageSubjectRequestBuilder target();

}