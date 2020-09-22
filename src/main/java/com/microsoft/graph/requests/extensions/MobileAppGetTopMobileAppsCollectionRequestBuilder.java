// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileApp;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IMobileAppGetTopMobileAppsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppGetTopMobileAppsCollectionRequest;
import com.microsoft.graph.requests.extensions.MobileAppGetTopMobileAppsCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Get Top Mobile Apps Collection Request Builder.
 */
public class MobileAppGetTopMobileAppsCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IMobileAppGetTopMobileAppsCollectionRequestBuilder {

    /**
     * The request builder for this collection of MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param status the status
     * @param count the count
     */
    public MobileAppGetTopMobileAppsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String status, final Long count) {
        super(requestUrl, client, requestOptions);
     	 if(status!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("status", status));
		}
       	 if(count!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("count", count));
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IMobileAppGetTopMobileAppsCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IMobileAppGetTopMobileAppsCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        MobileAppGetTopMobileAppsCollectionRequest request = new MobileAppGetTopMobileAppsCollectionRequest(
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
