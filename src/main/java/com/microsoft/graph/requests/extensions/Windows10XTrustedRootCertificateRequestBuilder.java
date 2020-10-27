// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Windows10XTrustedRootCertificate;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10XTrusted Root Certificate Request Builder.
 */
public class Windows10XTrustedRootCertificateRequestBuilder extends BaseRequestBuilder implements IWindows10XTrustedRootCertificateRequestBuilder {

    /**
     * The request builder for the Windows10XTrustedRootCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10XTrustedRootCertificateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IWindows10XTrustedRootCertificateRequest instance
     */
    public IWindows10XTrustedRootCertificateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindows10XTrustedRootCertificateRequest instance
     */
    public IWindows10XTrustedRootCertificateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.Windows10XTrustedRootCertificateRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceManagementResourceAccessProfileAssignmentCollectionRequestBuilder assignments() {
        return new DeviceManagementResourceAccessProfileAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IDeviceManagementResourceAccessProfileAssignmentRequestBuilder assignments(final String id) {
        return new DeviceManagementResourceAccessProfileAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
}