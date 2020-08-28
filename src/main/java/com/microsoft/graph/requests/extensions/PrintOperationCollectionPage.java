// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrintOperation;
import com.microsoft.graph.requests.extensions.IPrintOperationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PrintOperationCollectionPage;
import com.microsoft.graph.requests.extensions.PrintOperationCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Operation Collection Page.
 */
public class PrintOperationCollectionPage extends BaseCollectionPage<PrintOperation, IPrintOperationCollectionRequestBuilder> implements IPrintOperationCollectionPage {

    /**
     * A collection page for PrintOperation
     *
     * @param response the serialized PrintOperationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrintOperationCollectionPage(final PrintOperationCollectionResponse response, final IPrintOperationCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
