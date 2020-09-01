// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MicrosoftStoreForBusinessApp;
import com.microsoft.graph.models.extensions.MobileContainedApp;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile Contained App Collection Request.
 */
public interface IMobileContainedAppCollectionRequest {

    void get(final ICallback<IMobileContainedAppCollectionPage> callback);

    IMobileContainedAppCollectionPage get() throws ClientException;

    void post(final MobileContainedApp newMobileContainedApp, final ICallback<MobileContainedApp> callback);

    MobileContainedApp post(final MobileContainedApp newMobileContainedApp) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMobileContainedAppCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMobileContainedAppCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IMobileContainedAppCollectionRequest top(final int value);

}