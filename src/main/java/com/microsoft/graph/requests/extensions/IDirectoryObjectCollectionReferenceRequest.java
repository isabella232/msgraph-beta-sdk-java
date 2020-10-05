// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UnifiedRoleAssignmentMultiple;
import com.microsoft.graph.models.extensions.DirectoryObject;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.models.extensions.DirectoryObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Directory Object Collection Reference Request.
 */
public interface IDirectoryObjectCollectionReferenceRequest {

    void post(final DirectoryObject newDirectoryObject, final ICallback<? super DirectoryObject> callback);

    DirectoryObject post(final DirectoryObject newDirectoryObject) throws ClientException;

    IDirectoryObjectCollectionReferenceRequest select(final String value);

    IDirectoryObjectCollectionReferenceRequest top(final int value);

}
