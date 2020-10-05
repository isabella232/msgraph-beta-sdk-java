// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Vendor;
import com.microsoft.graph.requests.extensions.IVendorCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.VendorCollectionPage;
import com.microsoft.graph.requests.extensions.VendorCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Vendor Collection Page.
 */
public class VendorCollectionPage extends BaseCollectionPage<Vendor, IVendorCollectionRequestBuilder> implements IVendorCollectionPage {

    /**
     * A collection page for Vendor
     *
     * @param response the serialized VendorCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public VendorCollectionPage(final VendorCollectionResponse response, final IVendorCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}
