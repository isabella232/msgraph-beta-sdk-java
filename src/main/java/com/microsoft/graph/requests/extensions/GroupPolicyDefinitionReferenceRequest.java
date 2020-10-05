// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyDefinition;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyPresentationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyPresentationRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition Reference Request.
 */
public class GroupPolicyDefinitionReferenceRequest extends BaseRequest implements IGroupPolicyDefinitionReferenceRequest {

    /**
     * The request for the GroupPolicyDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyDefinitionReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyDefinition.class);
    }

    public void delete(final ICallback<? super GroupPolicyDefinition> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public GroupPolicyDefinition delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GroupPolicyDefinitionReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GroupPolicyDefinitionReferenceRequest)this;
    }
    /**
     * Puts the GroupPolicyDefinition
     *
     * @param srcGroupPolicyDefinition the GroupPolicyDefinition reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(GroupPolicyDefinition srcGroupPolicyDefinition, final ICallback<? super GroupPolicyDefinition> callback) {
        send(HttpMethod.PUT, callback, srcGroupPolicyDefinition);
    }

    /**
     * Puts the GroupPolicyDefinition
     *
     * @param srcGroupPolicyDefinition the GroupPolicyDefinition reference to PUT
     * @return the GroupPolicyDefinition
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public GroupPolicyDefinition put(GroupPolicyDefinition srcGroupPolicyDefinition) throws ClientException {
        return send(HttpMethod.PUT, srcGroupPolicyDefinition);
    }
}
