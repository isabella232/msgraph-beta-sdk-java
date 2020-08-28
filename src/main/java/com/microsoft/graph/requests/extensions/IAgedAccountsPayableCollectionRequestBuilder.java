// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.models.extensions.AgedAccountsPayable;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAgedAccountsPayableRequestBuilder;
import com.microsoft.graph.requests.extensions.IAgedAccountsPayableCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Aged Accounts Payable Collection Request Builder.
 */
public interface IAgedAccountsPayableCollectionRequestBuilder extends IRequestBuilder {

    IAgedAccountsPayableCollectionRequest buildRequest();

    IAgedAccountsPayableCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IAgedAccountsPayableRequestBuilder byId(final String id);

}
