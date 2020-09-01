// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Financials;
import com.microsoft.graph.models.extensions.Company;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ICompanyRequestBuilder;
import com.microsoft.graph.requests.extensions.ICompanyCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Company Collection Request Builder.
 */
public interface ICompanyCollectionRequestBuilder extends IRequestBuilder {

    ICompanyCollectionRequest buildRequest();

    ICompanyCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    ICompanyRequestBuilder byId(final String id);

}