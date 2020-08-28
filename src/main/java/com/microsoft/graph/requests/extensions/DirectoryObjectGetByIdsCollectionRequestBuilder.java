// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectoryObject;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDirectoryObjectGetByIdsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryObjectGetByIdsCollectionRequest;
import com.microsoft.graph.requests.extensions.DirectoryObjectGetByIdsCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Get By Ids Collection Request Builder.
 */
public class DirectoryObjectGetByIdsCollectionRequestBuilder extends BaseActionRequestBuilder implements IDirectoryObjectGetByIdsCollectionRequestBuilder {

    /**
     * The request builder for this collection of DirectoryObject
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param ids the ids
     * @param types the types
     */
    public DirectoryObjectGetByIdsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<String> ids, final java.util.List<String> types) {
        super(requestUrl, client, requestOptions);
  	 if(ids!=null){
			bodyParams.put("ids", ids);
		}
    	 if(types!=null){
			bodyParams.put("types", types);
		}
      }

    public IDirectoryObjectGetByIdsCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDirectoryObjectGetByIdsCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DirectoryObjectGetByIdsCollectionRequest request = new DirectoryObjectGetByIdsCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("ids")) {
            request.body.ids = getParameter("ids");
        }
        if (hasParameter("types")) {
            request.body.types = getParameter("types");
        }
  
        return request;
    }
}
