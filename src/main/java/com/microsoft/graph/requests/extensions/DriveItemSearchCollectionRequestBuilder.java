// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDriveItemSearchCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDriveItemSearchCollectionRequest;
import com.microsoft.graph.requests.extensions.DriveItemSearchCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Search Collection Request Builder.
 */
public class DriveItemSearchCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IDriveItemSearchCollectionRequestBuilder {

    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param q the q
     */
    public DriveItemSearchCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String q) {
        super(requestUrl, client, requestOptions);
     	 if(q!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("q", q));
		}
      }

    public IDriveItemSearchCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDriveItemSearchCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DriveItemSearchCollectionRequest request = new DriveItemSearchCollectionRequest(
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
