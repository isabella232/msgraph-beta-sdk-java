// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OrganizationalBranding;
import com.microsoft.graph.requests.extensions.IOrganizationalBrandingCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.OrganizationalBrandingCollectionPage;
import com.microsoft.graph.requests.extensions.OrganizationalBrandingCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Organizational Branding Collection Page.
 */
public class OrganizationalBrandingCollectionPage extends BaseCollectionPage<OrganizationalBranding, IOrganizationalBrandingCollectionRequestBuilder> implements IOrganizationalBrandingCollectionPage {

    /**
     * A collection page for OrganizationalBranding
     *
     * @param response the serialized OrganizationalBrandingCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OrganizationalBrandingCollectionPage(final OrganizationalBrandingCollectionResponse response, final IOrganizationalBrandingCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
