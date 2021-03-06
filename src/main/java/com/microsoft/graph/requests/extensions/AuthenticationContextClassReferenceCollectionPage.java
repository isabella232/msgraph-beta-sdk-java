// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AuthenticationContextClassReference;
import com.microsoft.graph.requests.extensions.IAuthenticationContextClassReferenceCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.AuthenticationContextClassReferenceCollectionPage;
import com.microsoft.graph.requests.extensions.AuthenticationContextClassReferenceCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Context Class Reference Collection Page.
 */
public class AuthenticationContextClassReferenceCollectionPage extends BaseCollectionPage<AuthenticationContextClassReference, IAuthenticationContextClassReferenceCollectionRequestBuilder> implements IAuthenticationContextClassReferenceCollectionPage {

    /**
     * A collection page for AuthenticationContextClassReference
     *
     * @param response the serialized AuthenticationContextClassReferenceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AuthenticationContextClassReferenceCollectionPage(final AuthenticationContextClassReferenceCollectionResponse response, final IAuthenticationContextClassReferenceCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
