// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.models.extensions.InvitationParticipantInfo;
import com.microsoft.graph.models.generated.CallDisposition;
import com.microsoft.graph.models.extensions.MediaConfig;
import com.microsoft.graph.models.generated.Modality;
import com.microsoft.graph.models.extensions.CancelMediaProcessingOperation;
import com.microsoft.graph.models.generated.ScreenSharingRole;
import com.microsoft.graph.models.extensions.MuteParticipantOperation;
import com.microsoft.graph.models.extensions.Prompt;
import com.microsoft.graph.models.extensions.PlayPromptOperation;
import com.microsoft.graph.models.extensions.RecordOperation;
import com.microsoft.graph.models.generated.RejectReason;
import com.microsoft.graph.models.extensions.SubscribeToToneOperation;
import com.microsoft.graph.models.extensions.UnmuteParticipantOperation;
import com.microsoft.graph.models.generated.RecordingStatus;
import com.microsoft.graph.models.extensions.UpdateRecordingStatusOperation;
import com.microsoft.graph.models.extensions.TeleconferenceDeviceQuality;
import com.microsoft.graph.requests.extensions.IAudioRoutingGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAudioRoutingGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommsOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommsOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IParticipantCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IParticipantRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Call Request Builder.
 */
public interface ICallRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ICallRequest instance
     */
    ICallRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ICallRequest instance
     */
    ICallRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IAudioRoutingGroupCollectionRequestBuilder audioRoutingGroups();

    IAudioRoutingGroupRequestBuilder audioRoutingGroups(final String id);

    ICommsOperationCollectionRequestBuilder operations();

    ICommsOperationRequestBuilder operations(final String id);

    IParticipantCollectionRequestBuilder participants();

    IParticipantRequestBuilder participants(final String id);
    ICallRedirectRequestBuilder redirect(final java.util.List<InvitationParticipantInfo> targets, final CallDisposition targetDisposition, final Integer timeout, final Boolean maskCallee, final Boolean maskCaller, final String callbackUri);
    ICallAnswerRequestBuilder answer(final String callbackUri, final MediaConfig mediaConfig, final java.util.List<Modality> acceptedModalities);
    ICallCancelMediaProcessingRequestBuilder cancelMediaProcessing(final String clientContext);
    ICallChangeScreenSharingRoleRequestBuilder changeScreenSharingRole(final ScreenSharingRole role);
    ICallKeepAliveRequestBuilder keepAlive();
    ICallMuteRequestBuilder mute(final String clientContext);
    ICallPlayPromptRequestBuilder playPrompt(final java.util.List<Prompt> prompts, final Boolean loop, final String clientContext);
    ICallRecordRequestBuilder record(final java.util.List<Prompt> prompts, final Boolean bargeInAllowed, final Integer initialSilenceTimeoutInSeconds, final Integer maxSilenceTimeoutInSeconds, final Integer maxRecordDurationInSeconds, final Boolean playBeep, final Boolean streamWhileRecording, final java.util.List<String> stopTones, final String clientContext);
    ICallRecordResponseRequestBuilder recordResponse(final java.util.List<Prompt> prompts, final Boolean bargeInAllowed, final Integer initialSilenceTimeoutInSeconds, final Integer maxSilenceTimeoutInSeconds, final Integer maxRecordDurationInSeconds, final Boolean playBeep, final Boolean streamWhileRecording, final java.util.List<String> stopTones, final String clientContext);
    ICallRejectRequestBuilder reject(final RejectReason reason, final String callbackUri);
    ICallSubscribeToToneRequestBuilder subscribeToTone(final String clientContext);
    ICallTransferRequestBuilder transfer(final InvitationParticipantInfo transferTarget);
    ICallUnmuteRequestBuilder unmute(final String clientContext);
    ICallUpdateRecordingStatusRequestBuilder updateRecordingStatus(final RecordingStatus status, final String clientContext);

}