// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppInstallStatus;
import com.microsoft.graph.requests.extensions.IMobileAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppInstallStatusCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppInstallStatusCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Install Status Collection Page.
 */
public class MobileAppInstallStatusCollectionPage extends BaseCollectionPage<MobileAppInstallStatus, IMobileAppInstallStatusCollectionRequestBuilder> implements IMobileAppInstallStatusCollectionPage {

    /**
     * A collection page for MobileAppInstallStatus
     *
     * @param response the serialized MobileAppInstallStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppInstallStatusCollectionPage(final MobileAppInstallStatusCollectionResponse response, final IMobileAppInstallStatusCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
