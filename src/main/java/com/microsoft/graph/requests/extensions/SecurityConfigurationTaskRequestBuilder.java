// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SecurityConfigurationTask;
import com.microsoft.graph.requests.extensions.IVulnerableManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IVulnerableManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.VulnerableManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.VulnerableManagedDeviceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Configuration Task Request Builder.
 */
public class SecurityConfigurationTaskRequestBuilder extends BaseRequestBuilder implements ISecurityConfigurationTaskRequestBuilder {

    /**
     * The request builder for the SecurityConfigurationTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityConfigurationTaskRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ISecurityConfigurationTaskRequest instance
     */
    public ISecurityConfigurationTaskRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ISecurityConfigurationTaskRequest instance
     */
    public ISecurityConfigurationTaskRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.SecurityConfigurationTaskRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IVulnerableManagedDeviceCollectionRequestBuilder managedDevices() {
        return new VulnerableManagedDeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices"), getClient(), null);
    }

    public IVulnerableManagedDeviceRequestBuilder managedDevices(final String id) {
        return new VulnerableManagedDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices") + "/" + id, getClient(), null);
    }
}
