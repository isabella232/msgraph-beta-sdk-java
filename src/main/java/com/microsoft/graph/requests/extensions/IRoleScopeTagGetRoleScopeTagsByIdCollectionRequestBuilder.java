// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoleScopeTag;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IRoleScopeTagGetRoleScopeTagsByIdCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Role Scope Tag Get Role Scope Tags By Id Collection Request Builder.
 */
public interface IRoleScopeTagGetRoleScopeTagsByIdCollectionRequestBuilder extends IRequestBuilder {

    IRoleScopeTagGetRoleScopeTagsByIdCollectionRequest buildRequest();

    IRoleScopeTagGetRoleScopeTagsByIdCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
