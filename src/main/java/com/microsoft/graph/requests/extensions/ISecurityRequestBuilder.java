// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.requests.extensions.IAlertCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAlertRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudAppSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudAppSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDomainSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IHostSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IHostSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IIpSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIpSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IProviderTenantSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IProviderTenantSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreControlProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreControlProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecureScoreRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITiIndicatorRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityActionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISecurityActionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Security Request Builder.
 */
public interface ISecurityRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ISecurityRequest instance
     */
    ISecurityRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISecurityRequest instance
     */
    ISecurityRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IAlertCollectionRequestBuilder alerts();

    IAlertRequestBuilder alerts(final String id);

    ICloudAppSecurityProfileCollectionRequestBuilder cloudAppSecurityProfiles();

    ICloudAppSecurityProfileRequestBuilder cloudAppSecurityProfiles(final String id);

    IDomainSecurityProfileCollectionRequestBuilder domainSecurityProfiles();

    IDomainSecurityProfileRequestBuilder domainSecurityProfiles(final String id);

    IFileSecurityProfileCollectionRequestBuilder fileSecurityProfiles();

    IFileSecurityProfileRequestBuilder fileSecurityProfiles(final String id);

    IHostSecurityProfileCollectionRequestBuilder hostSecurityProfiles();

    IHostSecurityProfileRequestBuilder hostSecurityProfiles(final String id);

    IIpSecurityProfileCollectionRequestBuilder ipSecurityProfiles();

    IIpSecurityProfileRequestBuilder ipSecurityProfiles(final String id);

    IProviderTenantSettingCollectionRequestBuilder providerTenantSettings();

    IProviderTenantSettingRequestBuilder providerTenantSettings(final String id);

    ISecureScoreControlProfileCollectionRequestBuilder secureScoreControlProfiles();

    ISecureScoreControlProfileRequestBuilder secureScoreControlProfiles(final String id);

    ISecureScoreCollectionRequestBuilder secureScores();

    ISecureScoreRequestBuilder secureScores(final String id);

    ITiIndicatorCollectionRequestBuilder tiIndicators();

    ITiIndicatorRequestBuilder tiIndicators(final String id);

    IUserSecurityProfileCollectionRequestBuilder userSecurityProfiles();

    IUserSecurityProfileRequestBuilder userSecurityProfiles(final String id);

    ISecurityActionCollectionRequestBuilder securityActions();

    ISecurityActionRequestBuilder securityActions(final String id);

}