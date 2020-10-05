// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedEBook;
import com.microsoft.graph.models.extensions.ManagedEBookCategory;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.ManagedEBookCategory;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed EBook Category Collection Reference Request.
 */
public interface IManagedEBookCategoryCollectionReferenceRequest {

    void post(final ManagedEBookCategory newManagedEBookCategory, final ICallback<? super ManagedEBookCategory> callback);

    ManagedEBookCategory post(final ManagedEBookCategory newManagedEBookCategory) throws ClientException;

    IManagedEBookCategoryCollectionReferenceRequest select(final String value);

    IManagedEBookCategoryCollectionReferenceRequest top(final int value);

}
