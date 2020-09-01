// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CredentialUserRegistrationDetails;
import com.microsoft.graph.requests.extensions.ICredentialUserRegistrationDetailsCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.CredentialUserRegistrationDetailsCollectionPage;
import com.microsoft.graph.requests.extensions.CredentialUserRegistrationDetailsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Credential User Registration Details Collection Page.
 */
public class CredentialUserRegistrationDetailsCollectionPage extends BaseCollectionPage<CredentialUserRegistrationDetails, ICredentialUserRegistrationDetailsCollectionRequestBuilder> implements ICredentialUserRegistrationDetailsCollectionPage {

    /**
     * A collection page for CredentialUserRegistrationDetails
     *
     * @param response the serialized CredentialUserRegistrationDetailsCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CredentialUserRegistrationDetailsCollectionPage(final CredentialUserRegistrationDetailsCollectionResponse response, final ICredentialUserRegistrationDetailsCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}