// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUserGetManagedDevicesWithAppFailuresCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserGetManagedDevicesWithAppFailuresCollectionRequest;
import com.microsoft.graph.requests.extensions.UserGetManagedDevicesWithAppFailuresCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Managed Devices With App Failures Collection Request Builder.
 */
public class UserGetManagedDevicesWithAppFailuresCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IUserGetManagedDevicesWithAppFailuresCollectionRequestBuilder {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserGetManagedDevicesWithAppFailuresCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IUserGetManagedDevicesWithAppFailuresCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IUserGetManagedDevicesWithAppFailuresCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserGetManagedDevicesWithAppFailuresCollectionRequest request = new UserGetManagedDevicesWithAppFailuresCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}