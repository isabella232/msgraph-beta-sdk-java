// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.LookupResultRow;
import com.microsoft.graph.requests.extensions.ILookupResultRowCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.LookupResultRowCollectionPage;
import com.microsoft.graph.requests.extensions.LookupResultRowCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Lookup Result Row Collection Page.
 */
public class LookupResultRowCollectionPage extends BaseCollectionPage<LookupResultRow, ILookupResultRowCollectionRequestBuilder> implements ILookupResultRowCollectionPage {

    /**
     * A collection page for LookupResultRow
     *
     * @param response the serialized LookupResultRowCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public LookupResultRowCollectionPage(final LookupResultRowCollectionResponse response, final ILookupResultRowCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
