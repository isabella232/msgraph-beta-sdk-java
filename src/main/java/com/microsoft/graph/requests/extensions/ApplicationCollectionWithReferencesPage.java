// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConnectorGroup;
import com.microsoft.graph.models.extensions.Application;
import com.microsoft.graph.models.extensions.KeyCredential;
import com.microsoft.graph.models.extensions.PasswordCredential;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IApplicationCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplicationCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.ApplicationCollectionResponse;
import com.microsoft.graph.models.extensions.Application;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Collection With References Page.
 */
public class ApplicationCollectionWithReferencesPage extends BaseCollectionPage<Application, IApplicationCollectionWithReferencesRequestBuilder> implements IApplicationCollectionWithReferencesPage {

    /**
     * A collection page for Application
     *
     * @param response the serialized ApplicationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ApplicationCollectionWithReferencesPage(final ApplicationCollectionResponse response, final IApplicationCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder);
    }
}
