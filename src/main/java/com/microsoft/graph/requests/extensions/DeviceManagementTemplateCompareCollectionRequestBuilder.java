// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementSettingComparison;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateCompareCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateCompareCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateCompareCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Template Compare Collection Request Builder.
 */
public class DeviceManagementTemplateCompareCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IDeviceManagementTemplateCompareCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagementTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param templateId the templateId
     */
    public DeviceManagementTemplateCompareCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String templateId) {
        super(requestUrl, client, requestOptions);
     	 if(templateId!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("templateId", templateId));
		}
      }

    public IDeviceManagementTemplateCompareCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IDeviceManagementTemplateCompareCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementTemplateCompareCollectionRequest request = new DeviceManagementTemplateCompareCollectionRequest(
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
