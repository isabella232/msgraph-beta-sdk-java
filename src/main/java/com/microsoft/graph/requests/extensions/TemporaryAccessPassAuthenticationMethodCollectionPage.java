// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TemporaryAccessPassAuthenticationMethod;
import com.microsoft.graph.requests.extensions.ITemporaryAccessPassAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.TemporaryAccessPassAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.TemporaryAccessPassAuthenticationMethodCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Temporary Access Pass Authentication Method Collection Page.
 */
public class TemporaryAccessPassAuthenticationMethodCollectionPage extends BaseCollectionPage<TemporaryAccessPassAuthenticationMethod, ITemporaryAccessPassAuthenticationMethodCollectionRequestBuilder> implements ITemporaryAccessPassAuthenticationMethodCollectionPage {

    /**
     * A collection page for TemporaryAccessPassAuthenticationMethod
     *
     * @param response the serialized TemporaryAccessPassAuthenticationMethodCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TemporaryAccessPassAuthenticationMethodCollectionPage(final TemporaryAccessPassAuthenticationMethodCollectionResponse response, final ITemporaryAccessPassAuthenticationMethodCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
