// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Currency;
import com.microsoft.graph.requests.extensions.ICurrencyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.CurrencyCollectionPage;
import com.microsoft.graph.requests.extensions.CurrencyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Currency Collection Page.
 */
public class CurrencyCollectionPage extends BaseCollectionPage<Currency, ICurrencyCollectionRequestBuilder> implements ICurrencyCollectionPage {

    /**
     * A collection page for Currency
     *
     * @param response the serialized CurrencyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CurrencyCollectionPage(final CurrencyCollectionResponse response, final ICurrencyCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
