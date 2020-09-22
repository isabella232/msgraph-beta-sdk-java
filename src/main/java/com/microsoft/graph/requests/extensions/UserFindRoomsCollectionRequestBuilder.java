// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EmailAddress;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUserFindRoomsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserFindRoomsCollectionRequest;
import com.microsoft.graph.requests.extensions.UserFindRoomsCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Find Rooms Collection Request Builder.
 */
public class UserFindRoomsCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IUserFindRoomsCollectionRequestBuilder {

    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserFindRoomsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this collection of User
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param roomList the roomList
     */
    public UserFindRoomsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String roomList) {
        super(requestUrl, client, requestOptions);
     	 if(roomList!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("roomList", roomList));
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IUserFindRoomsCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IUserFindRoomsCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserFindRoomsCollectionRequest request = new UserFindRoomsCollectionRequest(
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
