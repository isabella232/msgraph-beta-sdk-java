// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrivilegedRoleAssignment;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.PrivilegedRoleAssignment;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Privileged Role Assignment With Reference Request.
 */
public interface IPrivilegedRoleAssignmentWithReferenceRequest extends IHttpRequest {

    void post(final PrivilegedRoleAssignment newPrivilegedRoleAssignment, final IJsonBackedObject payload, final ICallback<PrivilegedRoleAssignment> callback);

    PrivilegedRoleAssignment post(final PrivilegedRoleAssignment newPrivilegedRoleAssignment, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<PrivilegedRoleAssignment> callback);

    PrivilegedRoleAssignment get() throws ClientException;

	void delete(final ICallback<PrivilegedRoleAssignment> callback);

	void delete() throws ClientException;

	void patch(final PrivilegedRoleAssignment sourcePrivilegedRoleAssignment, final ICallback<PrivilegedRoleAssignment> callback);

	PrivilegedRoleAssignment patch(final PrivilegedRoleAssignment sourcePrivilegedRoleAssignment) throws ClientException;

    IPrivilegedRoleAssignmentWithReferenceRequest select(final String value);

    IPrivilegedRoleAssignmentWithReferenceRequest expand(final String value);

}
