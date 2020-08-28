// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrintTaskTrigger;
import com.microsoft.graph.requests.extensions.IPrintTaskTriggerCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.PrintTaskTriggerCollectionPage;
import com.microsoft.graph.requests.extensions.PrintTaskTriggerCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Task Trigger Collection Page.
 */
public class PrintTaskTriggerCollectionPage extends BaseCollectionPage<PrintTaskTrigger, IPrintTaskTriggerCollectionRequestBuilder> implements IPrintTaskTriggerCollectionPage {

    /**
     * A collection page for PrintTaskTrigger
     *
     * @param response the serialized PrintTaskTriggerCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrintTaskTriggerCollectionPage(final PrintTaskTriggerCollectionResponse response, final IPrintTaskTriggerCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
