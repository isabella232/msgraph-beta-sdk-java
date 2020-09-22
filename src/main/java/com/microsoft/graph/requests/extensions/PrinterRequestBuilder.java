// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Printer;
import com.microsoft.graph.models.extensions.PrintCertificateSigningRequest;
import com.microsoft.graph.models.extensions.PrinterCapabilities;
import com.microsoft.graph.requests.extensions.IPrintIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUserIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUserIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUserIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintUserIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskTriggerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskTriggerRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskTriggerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskTriggerRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrinterShareRequestBuilder;
import com.microsoft.graph.requests.extensions.PrinterShareRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Request Builder.
 */
public class PrinterRequestBuilder extends BaseRequestBuilder implements IPrinterRequestBuilder {

    /**
     * The request builder for the Printer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrinterRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IPrinterRequest instance
     */
    public IPrinterRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IPrinterRequest instance
     */
    public IPrinterRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.PrinterRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IPrintJobCollectionRequestBuilder jobs() {
        return new PrintJobCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("jobs"), getClient(), null);
    }

    public IPrintJobRequestBuilder jobs(final String id) {
        return new PrintJobRequestBuilder(getRequestUrlWithAdditionalSegment("jobs") + "/" + id, getClient(), null);
    }
    public IPrintIdentityCollectionRequestBuilder allowedGroups() {
        return new PrintIdentityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("allowedGroups"), getClient(), null);
    }

    public IPrintIdentityRequestBuilder allowedGroups(final String id) {
        return new PrintIdentityRequestBuilder(getRequestUrlWithAdditionalSegment("allowedGroups") + "/" + id, getClient(), null);
    }
    public IPrintUserIdentityCollectionRequestBuilder allowedUsers() {
        return new PrintUserIdentityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("allowedUsers"), getClient(), null);
    }

    public IPrintUserIdentityRequestBuilder allowedUsers(final String id) {
        return new PrintUserIdentityRequestBuilder(getRequestUrlWithAdditionalSegment("allowedUsers") + "/" + id, getClient(), null);
    }
    public IPrintConnectorCollectionWithReferencesRequestBuilder connectors() {
        return new PrintConnectorCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("connectors"), getClient(), null);
    }

    public IPrintConnectorWithReferenceRequestBuilder connectors(final String id) {
        return new PrintConnectorWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("connectors") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for PrinterShare
     *
     * @return the IPrinterShareWithReferenceRequestBuilder instance
     */
    public IPrinterShareWithReferenceRequestBuilder share() {
        return new PrinterShareWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("share"), getClient(), null);
    }
    public IPrintTaskTriggerCollectionRequestBuilder taskTriggers() {
        return new PrintTaskTriggerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("taskTriggers"), getClient(), null);
    }

    public IPrintTaskTriggerRequestBuilder taskTriggers(final String id) {
        return new PrintTaskTriggerRequestBuilder(getRequestUrlWithAdditionalSegment("taskTriggers") + "/" + id, getClient(), null);
    }

    public IPrinterResetDefaultsRequestBuilder resetDefaults() {
        return new PrinterResetDefaultsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.resetDefaults"), getClient(), null);
    }

    public IPrinterGetCapabilitiesRequestBuilder getCapabilities() {
        return new PrinterGetCapabilitiesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getCapabilities"), getClient(), null);
    }
}
