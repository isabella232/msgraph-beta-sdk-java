// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackageAssignmentRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestMyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccessPackageAssignmentRequestMyCollectionRequest;
import com.microsoft.graph.requests.extensions.AccessPackageAssignmentRequestMyCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Assignment Request My Collection Request Builder.
 */
public class AccessPackageAssignmentRequestMyCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IAccessPackageAssignmentRequestMyCollectionRequestBuilder {

    /**
     * The request builder for this collection of AccessPackageAssignmentRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageAssignmentRequestMyCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IAccessPackageAssignmentRequestMyCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IAccessPackageAssignmentRequestMyCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        AccessPackageAssignmentRequestMyCollectionRequest request = new AccessPackageAssignmentRequestMyCollectionRequest(
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