// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.BitlockerRecoveryKey;
import com.microsoft.graph.requests.extensions.IBitlockerRecoveryKeyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.BitlockerRecoveryKeyCollectionPage;
import com.microsoft.graph.requests.extensions.BitlockerRecoveryKeyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Bitlocker Recovery Key Collection Page.
 */
public class BitlockerRecoveryKeyCollectionPage extends BaseCollectionPage<BitlockerRecoveryKey, IBitlockerRecoveryKeyCollectionRequestBuilder> implements IBitlockerRecoveryKeyCollectionPage {

    /**
     * A collection page for BitlockerRecoveryKey
     *
     * @param response the serialized BitlockerRecoveryKeyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public BitlockerRecoveryKeyCollectionPage(final BitlockerRecoveryKeyCollectionResponse response, final IBitlockerRecoveryKeyCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}