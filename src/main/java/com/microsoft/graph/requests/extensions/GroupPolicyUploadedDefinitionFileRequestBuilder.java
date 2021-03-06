// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyUploadedDefinitionFile;
import com.microsoft.graph.models.extensions.GroupPolicyUploadedLanguageFile;
import com.microsoft.graph.requests.extensions.IGroupPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyOperationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Uploaded Definition File Request Builder.
 */
public class GroupPolicyUploadedDefinitionFileRequestBuilder extends BaseRequestBuilder implements IGroupPolicyUploadedDefinitionFileRequestBuilder {

    /**
     * The request builder for the GroupPolicyUploadedDefinitionFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyUploadedDefinitionFileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyUploadedDefinitionFileRequest instance
     */
    public IGroupPolicyUploadedDefinitionFileRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyUploadedDefinitionFileRequest instance
     */
    public IGroupPolicyUploadedDefinitionFileRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.GroupPolicyUploadedDefinitionFileRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IGroupPolicyDefinitionCollectionWithReferencesRequestBuilder definitions() {
        return new GroupPolicyDefinitionCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("definitions"), getClient(), null);
    }

    public IGroupPolicyDefinitionWithReferenceRequestBuilder definitions(final String id) {
        return new GroupPolicyDefinitionWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("definitions") + "/" + id, getClient(), null);
    }
    public IGroupPolicyOperationCollectionRequestBuilder groupPolicyOperations() {
        return new GroupPolicyOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyOperations"), getClient(), null);
    }

    public IGroupPolicyOperationRequestBuilder groupPolicyOperations(final String id) {
        return new GroupPolicyOperationRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyOperations") + "/" + id, getClient(), null);
    }

    public IGroupPolicyUploadedDefinitionFileRemoveRequestBuilder remove() {
        return new GroupPolicyUploadedDefinitionFileRemoveRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.remove"), getClient(), null);
    }

    public IGroupPolicyUploadedDefinitionFileAddLanguageFilesRequestBuilder addLanguageFiles(final java.util.List<GroupPolicyUploadedLanguageFile> groupPolicyUploadedLanguageFiles) {
        return new GroupPolicyUploadedDefinitionFileAddLanguageFilesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.addLanguageFiles"), getClient(), null, groupPolicyUploadedLanguageFiles);
    }

    public IGroupPolicyUploadedDefinitionFileRemoveLanguageFilesRequestBuilder removeLanguageFiles(final java.util.List<GroupPolicyUploadedLanguageFile> groupPolicyUploadedLanguageFiles) {
        return new GroupPolicyUploadedDefinitionFileRemoveLanguageFilesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.removeLanguageFiles"), getClient(), null, groupPolicyUploadedLanguageFiles);
    }

    public IGroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequestBuilder updateLanguageFiles(final java.util.List<GroupPolicyUploadedLanguageFile> groupPolicyUploadedLanguageFiles) {
        return new GroupPolicyUploadedDefinitionFileUpdateLanguageFilesRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateLanguageFiles"), getClient(), null, groupPolicyUploadedLanguageFiles);
    }

    public IGroupPolicyUploadedDefinitionFileUploadNewVersionRequestBuilder uploadNewVersion(final byte[] content, final java.util.List<GroupPolicyUploadedLanguageFile> groupPolicyUploadedLanguageFiles) {
        return new GroupPolicyUploadedDefinitionFileUploadNewVersionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.uploadNewVersion"), getClient(), null, content, groupPolicyUploadedLanguageFiles);
    }
}
