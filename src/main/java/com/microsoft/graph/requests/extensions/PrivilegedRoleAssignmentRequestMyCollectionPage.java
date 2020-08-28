// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPrivilegedRoleAssignmentRequestMyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestMyCollectionPage;
import com.microsoft.graph.requests.extensions.PrivilegedRoleAssignmentRequestMyCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Role Assignment Request My Collection Page.
 */
public class PrivilegedRoleAssignmentRequestMyCollectionPage extends BaseCollectionPage<PrivilegedRoleAssignmentRequest, IPrivilegedRoleAssignmentRequestMyCollectionRequestBuilder> implements IPrivilegedRoleAssignmentRequestMyCollectionPage {

    /**
     * A collection page for PrivilegedRoleAssignmentRequest.
     *
     * @param response The serialized PrivilegedRoleAssignmentRequestMyCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public PrivilegedRoleAssignmentRequestMyCollectionPage(final PrivilegedRoleAssignmentRequestMyCollectionResponse response, final IPrivilegedRoleAssignmentRequestMyCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}
