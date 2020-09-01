// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConnectorGroup;
import com.microsoft.graph.models.extensions.Connector;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IConnectorCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.IConnectorCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.ConnectorCollectionResponse;
import com.microsoft.graph.models.extensions.Connector;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Connector Collection With References Page.
 */
public class ConnectorCollectionWithReferencesPage extends BaseCollectionPage<Connector, IConnectorCollectionWithReferencesRequestBuilder> implements IConnectorCollectionWithReferencesPage {

    /**
     * A collection page for Connector
     *
     * @param response the serialized ConnectorCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ConnectorCollectionWithReferencesPage(final ConnectorCollectionResponse response, final IConnectorCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder);
    }
}