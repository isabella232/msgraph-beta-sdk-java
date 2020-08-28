// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;import com.microsoft.graph.models.extensions.PrivilegedRoleAssignmentRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Assignment Request Collection Request.
 */
public interface IPrivilegedRoleAssignmentRequestCollectionRequest {

    void get(final ICallback<IPrivilegedRoleAssignmentRequestCollectionPage> callback);

    IPrivilegedRoleAssignmentRequestCollectionPage get() throws ClientException;

    void post(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest, final ICallback<PrivilegedRoleAssignmentRequest> callback);

    PrivilegedRoleAssignmentRequest post(final PrivilegedRoleAssignmentRequest newPrivilegedRoleAssignmentRequest) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrivilegedRoleAssignmentRequestCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrivilegedRoleAssignmentRequestCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IPrivilegedRoleAssignmentRequestCollectionRequest top(final int value);

}
