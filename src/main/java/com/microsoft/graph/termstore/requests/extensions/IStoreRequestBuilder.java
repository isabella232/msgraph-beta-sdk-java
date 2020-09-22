// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.termstore.models.extensions.Store;
import com.microsoft.graph.termstore.requests.extensions.IGroupCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IGroupRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ISetCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ISetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Store Request Builder.
 */
public interface IStoreRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IStoreRequest instance
     */
    IStoreRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IStoreRequest instance
     */
    IStoreRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IGroupCollectionRequestBuilder groups();

    IGroupRequestBuilder groups(final String id);

    ISetCollectionRequestBuilder sets();

    ISetRequestBuilder sets(final String id);

}