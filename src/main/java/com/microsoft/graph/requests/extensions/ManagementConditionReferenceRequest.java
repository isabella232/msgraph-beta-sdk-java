// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagementCondition;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Reference Request.
 */
public class ManagementConditionReferenceRequest extends BaseRequest implements IManagementConditionReferenceRequest {

    /**
     * The request for the ManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagementCondition.class);
    }

    public void delete(final ICallback<ManagementCondition> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ManagementCondition delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagementConditionReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagementConditionReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagementConditionReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagementConditionReferenceRequest)this;
    }
    /**
     * Puts the ManagementCondition
     *
     * @param srcManagementCondition the ManagementCondition reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ManagementCondition srcManagementCondition, final ICallback<ManagementCondition> callback) {
        send(HttpMethod.PUT, callback, srcManagementCondition);
    }

    /**
     * Puts the ManagementCondition
     *
     * @param srcManagementCondition the ManagementCondition reference to PUT
     * @return the ManagementCondition
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ManagementCondition put(ManagementCondition srcManagementCondition) throws ClientException {
        return send(HttpMethod.PUT, srcManagementCondition);
    }
}
