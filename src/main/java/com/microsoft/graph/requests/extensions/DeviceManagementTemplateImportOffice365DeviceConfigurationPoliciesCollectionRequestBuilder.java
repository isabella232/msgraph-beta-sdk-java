// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementIntent;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseActionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Template Import Office365Device Configuration Policies Collection Request Builder.
 */
public class DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionRequestBuilder extends BaseActionRequestBuilder implements IDeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagementTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionRequest request = new DeviceManagementTemplateImportOffice365DeviceConfigurationPoliciesCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

  
        return request;
    }
}
