// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileLobApp;
import com.microsoft.graph.requests.extensions.IMobileAppContentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppContentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile Lob App Request Builder.
 */
public interface IMobileLobAppRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IMobileLobAppRequest instance
     */
    IMobileLobAppRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IMobileLobAppRequest instance
     */
    IMobileLobAppRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IMobileAppCategoryCollectionWithReferencesRequestBuilder categories();

    IMobileAppCategoryWithReferenceRequestBuilder categories(final String id);

    IMobileAppAssignmentCollectionRequestBuilder assignments();

    IMobileAppAssignmentRequestBuilder assignments(final String id);

    /**
     * Gets the request builder for MobileAppInstallSummary
     *
     * @return the IMobileAppInstallSummaryRequestBuilder instance
     */
    IMobileAppInstallSummaryRequestBuilder installSummary();

    IMobileAppInstallStatusCollectionRequestBuilder deviceStatuses();

    IMobileAppInstallStatusRequestBuilder deviceStatuses(final String id);

    IUserAppInstallStatusCollectionRequestBuilder userStatuses();

    IUserAppInstallStatusRequestBuilder userStatuses(final String id);

    IMobileAppRelationshipCollectionRequestBuilder relationships();

    IMobileAppRelationshipRequestBuilder relationships(final String id);

    IMobileAppContentCollectionRequestBuilder contentVersions();

    IMobileAppContentRequestBuilder contentVersions(final String id);

}