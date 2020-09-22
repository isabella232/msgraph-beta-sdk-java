// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SensitivityLabelEvaluateBody;
import com.microsoft.graph.models.extensions.EvaluateLabelJobResponse;
import com.microsoft.graph.requests.extensions.ISensitivityLabelEvaluateRequest;
import com.microsoft.graph.requests.extensions.SensitivityLabelEvaluateRequest;

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
 * The class for the Sensitivity Label Evaluate Request.
 */
public class SensitivityLabelEvaluateRequest extends BaseRequest implements ISensitivityLabelEvaluateRequest {
    protected final SensitivityLabelEvaluateBody body;

    /**
     * The request for this SensitivityLabelEvaluate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SensitivityLabelEvaluateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EvaluateLabelJobResponse.class);
        body = new SensitivityLabelEvaluateBody();
    }

    public void post(final ICallback<EvaluateLabelJobResponse> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public EvaluateLabelJobResponse post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISensitivityLabelEvaluateRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SensitivityLabelEvaluateRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISensitivityLabelEvaluateRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (SensitivityLabelEvaluateRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISensitivityLabelEvaluateRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SensitivityLabelEvaluateRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ISensitivityLabelEvaluateRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (SensitivityLabelEvaluateRequest)this;
    }

}
