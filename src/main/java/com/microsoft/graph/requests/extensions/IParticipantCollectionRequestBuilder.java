// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.models.extensions.Participant;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.models.extensions.InviteParticipantsOperation;
import com.microsoft.graph.models.extensions.MuteParticipantOperation;
import com.microsoft.graph.models.extensions.MuteParticipantsOperation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IParticipantRequestBuilder;
import com.microsoft.graph.requests.extensions.IParticipantCollectionRequest;
import com.microsoft.graph.requests.extensions.IParticipantInviteRequestBuilder;
import com.microsoft.graph.requests.extensions.IParticipantMuteAllRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Participant Collection Request Builder.
 */
public interface IParticipantCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IParticipantCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IParticipantCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IParticipantRequestBuilder byId(final String id);

    IParticipantInviteRequestBuilder invite(final java.util.List<InvitationParticipantInfo> participants, final String clientContext);
    IParticipantMuteAllRequestBuilder muteAll(final java.util.List<String> participants, final String clientContext);
}
