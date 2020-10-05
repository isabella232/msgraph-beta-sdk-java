// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TiIndicator;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITiIndicatorUpdateTiIndicatorsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TiIndicatorUpdateTiIndicatorsCollectionPage;
import com.microsoft.graph.requests.extensions.TiIndicatorUpdateTiIndicatorsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ti Indicator Update Ti Indicators Collection Page.
 */
public class TiIndicatorUpdateTiIndicatorsCollectionPage extends BaseCollectionPage<TiIndicator, ITiIndicatorUpdateTiIndicatorsCollectionRequestBuilder> implements ITiIndicatorUpdateTiIndicatorsCollectionPage {

    /**
     * A collection page for TiIndicator.
     *
     * @param response The serialized TiIndicatorUpdateTiIndicatorsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public TiIndicatorUpdateTiIndicatorsCollectionPage(final TiIndicatorUpdateTiIndicatorsCollectionResponse response, final ITiIndicatorUpdateTiIndicatorsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}
