// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDataSharingConsentConsentToDataSharingRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Data Sharing Consent Consent To Data Sharing Request Builder.
 */
public interface IDataSharingConsentConsentToDataSharingRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDataSharingConsentConsentToDataSharingRequest
     *
     * @return the IDataSharingConsentConsentToDataSharingRequest instance
     */
    IDataSharingConsentConsentToDataSharingRequest buildRequest();

    /**
     * Creates the IDataSharingConsentConsentToDataSharingRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDataSharingConsentConsentToDataSharingRequest instance
     */
    IDataSharingConsentConsentToDataSharingRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
