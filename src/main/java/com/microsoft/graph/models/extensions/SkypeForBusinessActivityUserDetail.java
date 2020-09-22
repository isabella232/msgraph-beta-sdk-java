// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skype For Business Activity User Detail.
 */
public class SkypeForBusinessActivityUserDetail extends Entity implements IJsonBackedObject {


    /**
     * The Assigned Products.
     * 
     */
    @SerializedName("assignedProducts")
    @Expose
    public java.util.List<String> assignedProducts;

    /**
     * The Deleted Date.
     * 
     */
    @SerializedName("deletedDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly deletedDate;

    /**
     * The Is Deleted.
     * 
     */
    @SerializedName("isDeleted")
    @Expose
    public Boolean isDeleted;

    /**
     * The Last Activity Date.
     * 
     */
    @SerializedName("lastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly lastActivityDate;

    /**
     * The Organized Conference App Sharing Count.
     * 
     */
    @SerializedName("organizedConferenceAppSharingCount")
    @Expose
    public Long organizedConferenceAppSharingCount;

    /**
     * The Organized Conference Audio Video Count.
     * 
     */
    @SerializedName("organizedConferenceAudioVideoCount")
    @Expose
    public Long organizedConferenceAudioVideoCount;

    /**
     * The Organized Conference Audio Video Minutes.
     * 
     */
    @SerializedName("organizedConferenceAudioVideoMinutes")
    @Expose
    public Long organizedConferenceAudioVideoMinutes;

    /**
     * The Organized Conference Cloud Dial In Microsoft Minutes.
     * 
     */
    @SerializedName("organizedConferenceCloudDialInMicrosoftMinutes")
    @Expose
    public Long organizedConferenceCloudDialInMicrosoftMinutes;

    /**
     * The Organized Conference Cloud Dial In Out Microsoft Count.
     * 
     */
    @SerializedName("organizedConferenceCloudDialInOutMicrosoftCount")
    @Expose
    public Long organizedConferenceCloudDialInOutMicrosoftCount;

    /**
     * The Organized Conference Cloud Dial Out Microsoft Minutes.
     * 
     */
    @SerializedName("organizedConferenceCloudDialOutMicrosoftMinutes")
    @Expose
    public Long organizedConferenceCloudDialOutMicrosoftMinutes;

    /**
     * The Organized Conference Dial In Out3rd Party Count.
     * 
     */
    @SerializedName("organizedConferenceDialInOut3rdPartyCount")
    @Expose
    public Long organizedConferenceDialInOut3rdPartyCount;

    /**
     * The Organized Conference IMCount.
     * 
     */
    @SerializedName("organizedConferenceIMCount")
    @Expose
    public Long organizedConferenceIMCount;

    /**
     * The Organized Conference Last Activity Date.
     * 
     */
    @SerializedName("organizedConferenceLastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly organizedConferenceLastActivityDate;

    /**
     * The Organized Conference Web Count.
     * 
     */
    @SerializedName("organizedConferenceWebCount")
    @Expose
    public Long organizedConferenceWebCount;

    /**
     * The Participated Conference App Sharing Count.
     * 
     */
    @SerializedName("participatedConferenceAppSharingCount")
    @Expose
    public Long participatedConferenceAppSharingCount;

    /**
     * The Participated Conference Audio Video Count.
     * 
     */
    @SerializedName("participatedConferenceAudioVideoCount")
    @Expose
    public Long participatedConferenceAudioVideoCount;

    /**
     * The Participated Conference Audio Video Minutes.
     * 
     */
    @SerializedName("participatedConferenceAudioVideoMinutes")
    @Expose
    public Long participatedConferenceAudioVideoMinutes;

    /**
     * The Participated Conference Dial In Out3rd Party Count.
     * 
     */
    @SerializedName("participatedConferenceDialInOut3rdPartyCount")
    @Expose
    public Long participatedConferenceDialInOut3rdPartyCount;

    /**
     * The Participated Conference IMCount.
     * 
     */
    @SerializedName("participatedConferenceIMCount")
    @Expose
    public Long participatedConferenceIMCount;

    /**
     * The Participated Conference Last Activity Date.
     * 
     */
    @SerializedName("participatedConferenceLastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly participatedConferenceLastActivityDate;

    /**
     * The Participated Conference Web Count.
     * 
     */
    @SerializedName("participatedConferenceWebCount")
    @Expose
    public Long participatedConferenceWebCount;

    /**
     * The Peer To Peer App Sharing Count.
     * 
     */
    @SerializedName("peerToPeerAppSharingCount")
    @Expose
    public Long peerToPeerAppSharingCount;

    /**
     * The Peer To Peer Audio Count.
     * 
     */
    @SerializedName("peerToPeerAudioCount")
    @Expose
    public Long peerToPeerAudioCount;

    /**
     * The Peer To Peer Audio Minutes.
     * 
     */
    @SerializedName("peerToPeerAudioMinutes")
    @Expose
    public Long peerToPeerAudioMinutes;

    /**
     * The Peer To Peer File Transfer Count.
     * 
     */
    @SerializedName("peerToPeerFileTransferCount")
    @Expose
    public Long peerToPeerFileTransferCount;

    /**
     * The Peer To Peer IMCount.
     * 
     */
    @SerializedName("peerToPeerIMCount")
    @Expose
    public Long peerToPeerIMCount;

    /**
     * The Peer To Peer Last Activity Date.
     * 
     */
    @SerializedName("peerToPeerLastActivityDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly peerToPeerLastActivityDate;

    /**
     * The Peer To Peer Video Count.
     * 
     */
    @SerializedName("peerToPeerVideoCount")
    @Expose
    public Long peerToPeerVideoCount;

    /**
     * The Peer To Peer Video Minutes.
     * 
     */
    @SerializedName("peerToPeerVideoMinutes")
    @Expose
    public Long peerToPeerVideoMinutes;

    /**
     * The Report Period.
     * 
     */
    @SerializedName("reportPeriod")
    @Expose
    public String reportPeriod;

    /**
     * The Report Refresh Date.
     * 
     */
    @SerializedName("reportRefreshDate")
    @Expose
    public com.microsoft.graph.models.extensions.DateOnly reportRefreshDate;

    /**
     * The Total Organized Conference Count.
     * 
     */
    @SerializedName("totalOrganizedConferenceCount")
    @Expose
    public Long totalOrganizedConferenceCount;

    /**
     * The Total Participated Conference Count.
     * 
     */
    @SerializedName("totalParticipatedConferenceCount")
    @Expose
    public Long totalParticipatedConferenceCount;

    /**
     * The Total Peer To Peer Session Count.
     * 
     */
    @SerializedName("totalPeerToPeerSessionCount")
    @Expose
    public Long totalPeerToPeerSessionCount;

    /**
     * The User Principal Name.
     * 
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
