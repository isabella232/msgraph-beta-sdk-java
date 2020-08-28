// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementGetRoleScopeTagsByIdsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetRoleScopeTagsByIdsCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementGetRoleScopeTagsByIdsCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Get Role Scope Tags By Ids Collection Request Builder.
 */
public class DeviceManagementGetRoleScopeTagsByIdsCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IDeviceManagementGetRoleScopeTagsByIdsCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param ids the ids
     */
    public DeviceManagementGetRoleScopeTagsByIdsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.List<String> ids) {
        super(requestUrl, client, requestOptions);
     	 if(ids!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("ids", ids));
		}
      }

    public IDeviceManagementGetRoleScopeTagsByIdsCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceManagementGetRoleScopeTagsByIdsCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementGetRoleScopeTagsByIdsCollectionRequest request = new DeviceManagementGetRoleScopeTagsByIdsCollectionRequest(
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
