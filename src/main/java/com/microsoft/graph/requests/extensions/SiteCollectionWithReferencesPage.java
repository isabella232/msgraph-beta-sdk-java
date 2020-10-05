// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.Site;
import com.microsoft.graph.models.extensions.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ISiteCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.extensions.ISiteCollectionWithReferencesPage;
import com.microsoft.graph.requests.extensions.SiteCollectionResponse;
import com.microsoft.graph.models.extensions.Site;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Site Collection With References Page.
 */
public class SiteCollectionWithReferencesPage extends BaseCollectionPage<Site, ISiteCollectionWithReferencesRequestBuilder> implements ISiteCollectionWithReferencesPage {

    /**
     * A collection page for Site
     *
     * @param response the serialized SiteCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SiteCollectionWithReferencesPage(final SiteCollectionResponse response, final ISiteCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
