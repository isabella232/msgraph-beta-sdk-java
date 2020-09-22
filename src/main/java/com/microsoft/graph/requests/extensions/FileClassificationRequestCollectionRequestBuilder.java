// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataClassificationService;
import com.microsoft.graph.models.extensions.FileClassificationRequest;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IFileClassificationRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileClassificationRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileClassificationRequestCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Classification Request Collection Request Builder.
 */
public class FileClassificationRequestCollectionRequestBuilder extends BaseRequestBuilder implements IFileClassificationRequestCollectionRequestBuilder {

    /**
     * The request builder for this collection of DataClassificationService
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public FileClassificationRequestCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IFileClassificationRequestCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IFileClassificationRequestCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new FileClassificationRequestCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IFileClassificationRequestRequestBuilder byId(final String id) {
        return new FileClassificationRequestRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
