// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.requests.extensions.ICompanyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.CompanyCollectionPage;
import com.microsoft.graph.requests.extensions.CompanyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Company Collection Page.
 */
public class CompanyCollectionPage extends BaseCollectionPage<Company, ICompanyCollectionRequestBuilder> implements ICompanyCollectionPage {

    /**
     * A collection page for Company
     *
     * @param response the serialized CompanyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CompanyCollectionPage(final CompanyCollectionResponse response, final ICompanyCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}