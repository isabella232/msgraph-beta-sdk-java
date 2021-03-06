// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DepOnboardingSetting;
import com.microsoft.graph.models.extensions.ImportedAppleDeviceIdentity;
import com.microsoft.graph.models.extensions.ImportedAppleDeviceIdentityResult;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IImportedAppleDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedAppleDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedAppleDeviceIdentityCollectionRequest;
import com.microsoft.graph.requests.extensions.IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Apple Device Identity Collection Request Builder.
 */
public class ImportedAppleDeviceIdentityCollectionRequestBuilder extends BaseRequestBuilder implements IImportedAppleDeviceIdentityCollectionRequestBuilder {

    /**
     * The request builder for this collection of DepOnboardingSetting
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ImportedAppleDeviceIdentityCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IImportedAppleDeviceIdentityCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IImportedAppleDeviceIdentityCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ImportedAppleDeviceIdentityCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IImportedAppleDeviceIdentityRequestBuilder byId(final String id) {
        return new ImportedAppleDeviceIdentityRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder importAppleDeviceIdentityList(final java.util.List<ImportedAppleDeviceIdentity> importedAppleDeviceIdentities, final Boolean overwriteImportedDeviceIdentities) {
        return new ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.importAppleDeviceIdentityList"), getClient(), null, importedAppleDeviceIdentities, overwriteImportedDeviceIdentities);
    }
}
