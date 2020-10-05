// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Dimension;
import com.microsoft.graph.requests.extensions.IDimensionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DimensionCollectionPage;
import com.microsoft.graph.requests.extensions.DimensionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dimension Collection Page.
 */
public class DimensionCollectionPage extends BaseCollectionPage<Dimension, IDimensionCollectionRequestBuilder> implements IDimensionCollectionPage {

    /**
     * A collection page for Dimension
     *
     * @param response the serialized DimensionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DimensionCollectionPage(final DimensionCollectionResponse response, final IDimensionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
