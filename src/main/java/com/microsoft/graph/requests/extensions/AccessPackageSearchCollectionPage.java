// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AccessPackage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAccessPackageSearchCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AccessPackageSearchCollectionPage;
import com.microsoft.graph.requests.extensions.AccessPackageSearchCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Search Collection Page.
 */
public class AccessPackageSearchCollectionPage extends BaseCollectionPage<AccessPackage, IAccessPackageSearchCollectionRequestBuilder> implements IAccessPackageSearchCollectionPage {

    /**
     * A collection page for AccessPackage.
     *
     * @param response The serialized AccessPackageSearchCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public AccessPackageSearchCollectionPage(final AccessPackageSearchCollectionResponse response, final IAccessPackageSearchCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
