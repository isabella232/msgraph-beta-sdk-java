// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrintDocument;
import com.microsoft.graph.requests.extensions.IPrintDocumentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PrintDocumentCollectionPage;
import com.microsoft.graph.requests.extensions.PrintDocumentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Document Collection Page.
 */
public class PrintDocumentCollectionPage extends BaseCollectionPage<PrintDocument, IPrintDocumentCollectionRequestBuilder> implements IPrintDocumentCollectionPage {

    /**
     * A collection page for PrintDocument
     *
     * @param response the serialized PrintDocumentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrintDocumentCollectionPage(final PrintDocumentCollectionResponse response, final IPrintDocumentCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
