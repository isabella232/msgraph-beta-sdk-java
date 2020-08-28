// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.GroupPolicyUploadedDefinitionFile;
import com.microsoft.graph.models.extensions.GroupPolicyUploadedLanguageFile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Uploaded Definition File Collection Request.
 */
public interface IGroupPolicyUploadedDefinitionFileCollectionRequest {

    void get(final ICallback<IGroupPolicyUploadedDefinitionFileCollectionPage> callback);

    IGroupPolicyUploadedDefinitionFileCollectionPage get() throws ClientException;

    void post(final GroupPolicyUploadedDefinitionFile newGroupPolicyUploadedDefinitionFile, final ICallback<GroupPolicyUploadedDefinitionFile> callback);

    GroupPolicyUploadedDefinitionFile post(final GroupPolicyUploadedDefinitionFile newGroupPolicyUploadedDefinitionFile) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyUploadedDefinitionFileCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyUploadedDefinitionFileCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IGroupPolicyUploadedDefinitionFileCollectionRequest top(final int value);

}
