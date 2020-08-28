// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Notebook;
import com.microsoft.graph.models.extensions.OnenoteOperation;
import com.microsoft.graph.models.extensions.CopyNotebookModel;
import com.microsoft.graph.models.extensions.RecentNotebook;
import com.microsoft.graph.requests.extensions.IOnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnenoteSectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OnenoteSectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISectionGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SectionGroupRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Notebook Request Builder.
 */
public class NotebookRequestBuilder extends BaseRequestBuilder implements INotebookRequestBuilder {

    /**
     * The request builder for the Notebook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NotebookRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the INotebookRequest instance
     */
    public INotebookRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the INotebookRequest instance
     */
    public INotebookRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.NotebookRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IOnenoteSectionCollectionRequestBuilder sections() {
        return new OnenoteSectionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sections"), getClient(), null);
    }

    public IOnenoteSectionRequestBuilder sections(final String id) {
        return new OnenoteSectionRequestBuilder(getRequestUrlWithAdditionalSegment("sections") + "/" + id, getClient(), null);
    }
    public ISectionGroupCollectionRequestBuilder sectionGroups() {
        return new SectionGroupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sectionGroups"), getClient(), null);
    }

    public ISectionGroupRequestBuilder sectionGroups(final String id) {
        return new SectionGroupRequestBuilder(getRequestUrlWithAdditionalSegment("sectionGroups") + "/" + id, getClient(), null);
    }

    public INotebookCopyNotebookRequestBuilder copyNotebook(final String groupId, final String renameAs, final String notebookFolder, final String siteCollectionId, final String siteId) {
        return new NotebookCopyNotebookRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.copyNotebook"), getClient(), null, groupId, renameAs, notebookFolder, siteCollectionId, siteId);
    }
}
