// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethod;
import com.microsoft.graph.requests.extensions.IPasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Passwordless Microsoft Authenticator Authentication Method Collection Page.
 */
public class PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionPage extends BaseCollectionPage<PasswordlessMicrosoftAuthenticatorAuthenticationMethod, IPasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionRequestBuilder> implements IPasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionPage {

    /**
     * A collection page for PasswordlessMicrosoftAuthenticatorAuthenticationMethod
     *
     * @param response the serialized PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionPage(final PasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionResponse response, final IPasswordlessMicrosoftAuthenticatorAuthenticationMethodCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
