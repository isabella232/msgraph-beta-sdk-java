// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ExternalItem;
import com.microsoft.graph.requests.extensions.IExternalItemCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.ExternalItemCollectionPage;
import com.microsoft.graph.requests.extensions.ExternalItemCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Item Collection Page.
 */
public class ExternalItemCollectionPage extends BaseCollectionPage<ExternalItem, IExternalItemCollectionRequestBuilder> implements IExternalItemCollectionPage {

    /**
     * A collection page for ExternalItem
     *
     * @param response the serialized ExternalItemCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ExternalItemCollectionPage(final ExternalItemCollectionResponse response, final IExternalItemCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}