// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupEvaluateDynamicMembershipBody;
import com.microsoft.graph.models.extensions.EvaluateDynamicMembershipResult;
import com.microsoft.graph.requests.extensions.IGroupEvaluateDynamicMembershipRequest;
import com.microsoft.graph.requests.extensions.GroupEvaluateDynamicMembershipRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Evaluate Dynamic Membership Request.
 */
public class GroupEvaluateDynamicMembershipRequest extends BaseRequest implements IGroupEvaluateDynamicMembershipRequest {
    protected final GroupEvaluateDynamicMembershipBody body;

    /**
     * The request for this GroupEvaluateDynamicMembership
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupEvaluateDynamicMembershipRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EvaluateDynamicMembershipResult.class);
        body = new GroupEvaluateDynamicMembershipBody();
    }

    public void post(final ICallback<EvaluateDynamicMembershipResult> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public EvaluateDynamicMembershipResult post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupEvaluateDynamicMembershipRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GroupEvaluateDynamicMembershipRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IGroupEvaluateDynamicMembershipRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (GroupEvaluateDynamicMembershipRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupEvaluateDynamicMembershipRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GroupEvaluateDynamicMembershipRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IGroupEvaluateDynamicMembershipRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (GroupEvaluateDynamicMembershipRequest)this;
    }

}
