// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ImportedAppleDeviceIdentity;
import com.microsoft.graph.requests.extensions.IImportedAppleDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ImportedAppleDeviceIdentityCollectionPage;
import com.microsoft.graph.requests.extensions.ImportedAppleDeviceIdentityCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Apple Device Identity Collection Page.
 */
public class ImportedAppleDeviceIdentityCollectionPage extends BaseCollectionPage<ImportedAppleDeviceIdentity, IImportedAppleDeviceIdentityCollectionRequestBuilder> implements IImportedAppleDeviceIdentityCollectionPage {

    /**
     * A collection page for ImportedAppleDeviceIdentity
     *
     * @param response the serialized ImportedAppleDeviceIdentityCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ImportedAppleDeviceIdentityCollectionPage(final ImportedAppleDeviceIdentityCollectionResponse response, final IImportedAppleDeviceIdentityCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}