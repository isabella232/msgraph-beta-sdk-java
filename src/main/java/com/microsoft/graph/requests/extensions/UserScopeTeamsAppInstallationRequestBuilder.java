// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserScopeTeamsAppInstallation;
import com.microsoft.graph.requests.extensions.IChatRequestBuilder;
import com.microsoft.graph.requests.extensions.ChatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Scope Teams App Installation Request Builder.
 */
public class UserScopeTeamsAppInstallationRequestBuilder extends BaseRequestBuilder implements IUserScopeTeamsAppInstallationRequestBuilder {

    /**
     * The request builder for the UserScopeTeamsAppInstallation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserScopeTeamsAppInstallationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserScopeTeamsAppInstallationRequest instance
     */
    public IUserScopeTeamsAppInstallationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IUserScopeTeamsAppInstallationRequest instance
     */
    public IUserScopeTeamsAppInstallationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.UserScopeTeamsAppInstallationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for TeamsApp
     *
     * @return the ITeamsAppWithReferenceRequestBuilder instance
     */
    public ITeamsAppWithReferenceRequestBuilder teamsApp() {
        return new TeamsAppWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("teamsApp"), getClient(), null);
    }

    /**
     * Gets the request builder for TeamsAppDefinition
     *
     * @return the ITeamsAppDefinitionWithReferenceRequestBuilder instance
     */
    public ITeamsAppDefinitionWithReferenceRequestBuilder teamsAppDefinition() {
        return new TeamsAppDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("teamsAppDefinition"), getClient(), null);
    }

    /**
     * Gets the request builder for Chat
     *
     * @return the IChatWithReferenceRequestBuilder instance
     */
    public IChatWithReferenceRequestBuilder chat() {
        return new ChatWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("chat"), getClient(), null);
    }
}
