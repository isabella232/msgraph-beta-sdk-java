// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DirectorySetting;
import com.microsoft.graph.requests.extensions.IDirectorySettingCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DirectorySettingCollectionPage;
import com.microsoft.graph.requests.extensions.DirectorySettingCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Setting Collection Page.
 */
public class DirectorySettingCollectionPage extends BaseCollectionPage<DirectorySetting, IDirectorySettingCollectionRequestBuilder> implements IDirectorySettingCollectionPage {

    /**
     * A collection page for DirectorySetting
     *
     * @param response the serialized DirectorySettingCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DirectorySettingCollectionPage(final DirectorySettingCollectionResponse response, final IDirectorySettingCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
