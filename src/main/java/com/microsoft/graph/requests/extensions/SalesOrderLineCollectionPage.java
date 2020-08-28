// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SalesOrderLine;
import com.microsoft.graph.requests.extensions.ISalesOrderLineCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SalesOrderLineCollectionPage;
import com.microsoft.graph.requests.extensions.SalesOrderLineCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Sales Order Line Collection Page.
 */
public class SalesOrderLineCollectionPage extends BaseCollectionPage<SalesOrderLine, ISalesOrderLineCollectionRequestBuilder> implements ISalesOrderLineCollectionPage {

    /**
     * A collection page for SalesOrderLine
     *
     * @param response the serialized SalesOrderLineCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SalesOrderLineCollectionPage(final SalesOrderLineCollectionResponse response, final ISalesOrderLineCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
