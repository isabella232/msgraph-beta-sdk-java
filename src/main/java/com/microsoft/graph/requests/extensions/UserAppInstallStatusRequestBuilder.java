// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserAppInstallStatus;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User App Install Status Request Builder.
 */
public class UserAppInstallStatusRequestBuilder extends BaseRequestBuilder implements IUserAppInstallStatusRequestBuilder {

    /**
     * The request builder for the UserAppInstallStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserAppInstallStatusRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserAppInstallStatusRequest instance
     */
    public IUserAppInstallStatusRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IUserAppInstallStatusRequest instance
     */
    public IUserAppInstallStatusRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.UserAppInstallStatusRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for MobileApp
     *
     * @return the IMobileAppWithReferenceRequestBuilder instance
     */
    public IMobileAppWithReferenceRequestBuilder app() {
        return new MobileAppWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("app"), getClient(), null);
    }
    public IMobileAppInstallStatusCollectionRequestBuilder deviceStatuses() {
        return new MobileAppInstallStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    public IMobileAppInstallStatusRequestBuilder deviceStatuses(final String id) {
        return new MobileAppInstallStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }
}
