// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingGetExpiringVppTokenCountRequest;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingGetExpiringVppTokenCountRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep Onboarding Setting Get Expiring Vpp Token Count Request.
 */
public class DepOnboardingSettingGetExpiringVppTokenCountRequest extends BaseRequest implements IDepOnboardingSettingGetExpiringVppTokenCountRequest {

    /**
     * The request for this DepOnboardingSettingGetExpiringVppTokenCount
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DepOnboardingSettingGetExpiringVppTokenCountRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Integer.class);
    }

    /**
     * Gets the Integer
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Integer> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Integer
     *
     * @return the Integer
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public Integer get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDepOnboardingSettingGetExpiringVppTokenCountRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DepOnboardingSettingGetExpiringVppTokenCountRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDepOnboardingSettingGetExpiringVppTokenCountRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DepOnboardingSettingGetExpiringVppTokenCountRequest)this;
    }

}
