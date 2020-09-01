// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import com.microsoft.graph.models.extensions.GovernanceRoleAssignmentRequest;import com.microsoft.graph.models.extensions.GovernanceRoleAssignmentRequest;
import com.microsoft.graph.models.extensions.GovernanceSchedule;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Governance Role Assignment Request Collection Request.
 */
public interface IGovernanceRoleAssignmentRequestCollectionRequest {

    void get(final ICallback<IGovernanceRoleAssignmentRequestCollectionPage> callback);

    IGovernanceRoleAssignmentRequestCollectionPage get() throws ClientException;

    void post(final GovernanceRoleAssignmentRequest newGovernanceRoleAssignmentRequest, final ICallback<GovernanceRoleAssignmentRequest> callback);

    GovernanceRoleAssignmentRequest post(final GovernanceRoleAssignmentRequest newGovernanceRoleAssignmentRequest) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGovernanceRoleAssignmentRequestCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGovernanceRoleAssignmentRequestCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IGovernanceRoleAssignmentRequestCollectionRequest top(final int value);

}