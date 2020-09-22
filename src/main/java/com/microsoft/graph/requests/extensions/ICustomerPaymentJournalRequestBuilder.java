// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.CustomerPaymentJournal;
import com.microsoft.graph.requests.extensions.ICustomerPaymentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustomerPaymentRequestBuilder;
import com.microsoft.graph.requests.extensions.IAccountRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Customer Payment Journal Request Builder.
 */
public interface ICustomerPaymentJournalRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ICustomerPaymentJournalRequest instance
     */
    ICustomerPaymentJournalRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ICustomerPaymentJournalRequest instance
     */
    ICustomerPaymentJournalRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for Account
     *
     * @return the IAccountRequestBuilder instance
     */
    IAccountRequestBuilder account();

    ICustomerPaymentCollectionRequestBuilder customerPayments();

    ICustomerPaymentRequestBuilder customerPayments(final String id);

}