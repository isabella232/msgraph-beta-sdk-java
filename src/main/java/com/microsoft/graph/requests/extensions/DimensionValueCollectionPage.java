// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DimensionValue;
import com.microsoft.graph.requests.extensions.IDimensionValueCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DimensionValueCollectionPage;
import com.microsoft.graph.requests.extensions.DimensionValueCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dimension Value Collection Page.
 */
public class DimensionValueCollectionPage extends BaseCollectionPage<DimensionValue, IDimensionValueCollectionRequestBuilder> implements IDimensionValueCollectionPage {

    /**
     * A collection page for DimensionValue
     *
     * @param response the serialized DimensionValueCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DimensionValueCollectionPage(final DimensionValueCollectionResponse response, final IDimensionValueCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
