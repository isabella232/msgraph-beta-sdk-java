// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsCategory;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsCategoryCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Category Collection Request Builder.
 */
public class UserExperienceAnalyticsCategoryCollectionRequestBuilder extends BaseRequestBuilder implements IUserExperienceAnalyticsCategoryCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsCategoryCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IUserExperienceAnalyticsCategoryCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IUserExperienceAnalyticsCategoryCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new UserExperienceAnalyticsCategoryCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IUserExperienceAnalyticsCategoryRequestBuilder byId(final String id) {
        return new UserExperienceAnalyticsCategoryRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
