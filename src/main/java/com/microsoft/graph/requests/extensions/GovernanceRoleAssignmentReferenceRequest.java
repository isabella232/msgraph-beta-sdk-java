// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceRoleAssignment;
import com.microsoft.graph.requests.extensions.IGovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceSubjectRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.GovernanceRoleAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Assignment Reference Request.
 */
public class GovernanceRoleAssignmentReferenceRequest extends BaseRequest implements IGovernanceRoleAssignmentReferenceRequest {

    /**
     * The request for the GovernanceRoleAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceRoleAssignmentReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GovernanceRoleAssignment.class);
    }

    public void delete(final ICallback<GovernanceRoleAssignment> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public GovernanceRoleAssignment delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGovernanceRoleAssignmentReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GovernanceRoleAssignmentReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGovernanceRoleAssignmentReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GovernanceRoleAssignmentReferenceRequest)this;
    }
    /**
     * Puts the GovernanceRoleAssignment
     *
     * @param srcGovernanceRoleAssignment the GovernanceRoleAssignment reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(GovernanceRoleAssignment srcGovernanceRoleAssignment, final ICallback<GovernanceRoleAssignment> callback) {
        send(HttpMethod.PUT, callback, srcGovernanceRoleAssignment);
    }

    /**
     * Puts the GovernanceRoleAssignment
     *
     * @param srcGovernanceRoleAssignment the GovernanceRoleAssignment reference to PUT
     * @return the GovernanceRoleAssignment
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public GovernanceRoleAssignment put(GovernanceRoleAssignment srcGovernanceRoleAssignment) throws ClientException {
        return send(HttpMethod.PUT, srcGovernanceRoleAssignment);
    }
}