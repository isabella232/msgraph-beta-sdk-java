// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ImportedWindowsAutopilotDeviceIdentity;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityImportCollectionPage;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityImportCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Windows Autopilot Device Identity Import Collection Page.
 */
public class ImportedWindowsAutopilotDeviceIdentityImportCollectionPage extends BaseCollectionPage<ImportedWindowsAutopilotDeviceIdentity, IImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder> implements IImportedWindowsAutopilotDeviceIdentityImportCollectionPage {

    /**
     * A collection page for ImportedWindowsAutopilotDeviceIdentity.
     *
     * @param response The serialized ImportedWindowsAutopilotDeviceIdentityImportCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ImportedWindowsAutopilotDeviceIdentityImportCollectionPage(final ImportedWindowsAutopilotDeviceIdentityImportCollectionResponse response, final IImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
