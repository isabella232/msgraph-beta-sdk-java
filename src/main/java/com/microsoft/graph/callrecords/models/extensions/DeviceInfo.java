// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Info.
 */
public class DeviceInfo implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Capture Device Name.
     * Name of the capture device used by the media endpoint.
     */
    @SerializedName("captureDeviceName")
    @Expose
    public String captureDeviceName;

    /**
     * The Capture Device Driver.
     * Name of the capture device driver used by the media endpoint.
     */
    @SerializedName("captureDeviceDriver")
    @Expose
    public String captureDeviceDriver;

    /**
     * The Render Device Name.
     * Name of the render device used by the media endpoint.
     */
    @SerializedName("renderDeviceName")
    @Expose
    public String renderDeviceName;

    /**
     * The Render Device Driver.
     * Name of the render device driver used by the media endpoint.
     */
    @SerializedName("renderDeviceDriver")
    @Expose
    public String renderDeviceDriver;

    /**
     * The Sent Signal Level.
     * Average energy level of sent audio for audio classified as mono speech, or left channel of stereo speech by the media endpoint.
     */
    @SerializedName("sentSignalLevel")
    @Expose
    public Integer sentSignalLevel;

    /**
     * The Received Signal Level.
     * Average energy level of received audio for audio classified as mono speech, or left channel of stereo speech by the media endpoint.
     */
    @SerializedName("receivedSignalLevel")
    @Expose
    public Integer receivedSignalLevel;

    /**
     * The Sent Noise Level.
     * Average energy level of sent audio for audio classified as mono noise or left channel of stereo noise by the media endpoint.
     */
    @SerializedName("sentNoiseLevel")
    @Expose
    public Integer sentNoiseLevel;

    /**
     * The Received Noise Level.
     * Average energy level of received audio for audio classified as mono noise or left channel of stereo noise by the media endpoint.
     */
    @SerializedName("receivedNoiseLevel")
    @Expose
    public Integer receivedNoiseLevel;

    /**
     * The Initial Signal Level Root Mean Square.
     * The root mean square (RMS) of the incoming signal of up to the first 30 seconds of the call.
     */
    @SerializedName("initialSignalLevelRootMeanSquare")
    @Expose
    public float initialSignalLevelRootMeanSquare;

    /**
     * The Cpu Insufficent Event Ratio.
     * Fraction of the call that the media endpoint detected the CPU resources available were insufficient and caused poor quality of the audio sent and received.
     */
    @SerializedName("cpuInsufficentEventRatio")
    @Expose
    public float cpuInsufficentEventRatio;

    /**
     * The Render Not Functioning Event Ratio.
     * Fraction of the call that the media endpoint detected the render device was not working properly.
     */
    @SerializedName("renderNotFunctioningEventRatio")
    @Expose
    public float renderNotFunctioningEventRatio;

    /**
     * The Capture Not Functioning Event Ratio.
     * Fraction of the call that the media endpoint detected the capture device was not working properly.
     */
    @SerializedName("captureNotFunctioningEventRatio")
    @Expose
    public float captureNotFunctioningEventRatio;

    /**
     * The Device Glitch Event Ratio.
     * Fraction of the call that the media endpoint detected glitches or gaps in the audio played or captured that caused poor quality of the audio being sent or received.
     */
    @SerializedName("deviceGlitchEventRatio")
    @Expose
    public float deviceGlitchEventRatio;

    /**
     * The Low Speech To Noise Event Ratio.
     * Fraction of the call that the media endpoint detected low speech to noise level that caused poor quality of the audio being sent.
     */
    @SerializedName("lowSpeechToNoiseEventRatio")
    @Expose
    public float lowSpeechToNoiseEventRatio;

    /**
     * The Low Speech Level Event Ratio.
     * Fraction of the call that the media endpoint detected low speech level that caused poor quality of the audio being sent.
     */
    @SerializedName("lowSpeechLevelEventRatio")
    @Expose
    public float lowSpeechLevelEventRatio;

    /**
     * The Device Clipping Event Ratio.
     * Fraction of the call that the media endpoint detected clipping in the captured audio that caused poor quality of the audio being sent.
     */
    @SerializedName("deviceClippingEventRatio")
    @Expose
    public float deviceClippingEventRatio;

    /**
     * The Howling Event Count.
     * Number of times during the call that the media endpoint detected howling or screeching audio.
     */
    @SerializedName("howlingEventCount")
    @Expose
    public Integer howlingEventCount;

    /**
     * The Render Zero Volume Event Ratio.
     * Fraction of the call that media endpoint detected device render volume is set to 0.
     */
    @SerializedName("renderZeroVolumeEventRatio")
    @Expose
    public float renderZeroVolumeEventRatio;

    /**
     * The Render Mute Event Ratio.
     * Fraction of the call that media endpoint detected device render is muted.
     */
    @SerializedName("renderMuteEventRatio")
    @Expose
    public float renderMuteEventRatio;

    /**
     * The Mic Glitch Rate.
     * Glitches per 5 minute interval for the media endpoint's microphone.
     */
    @SerializedName("micGlitchRate")
    @Expose
    public float micGlitchRate;

    /**
     * The Speaker Glitch Rate.
     * Glitches per 5 minute internal for the media endpoint's loudspeaker.
     */
    @SerializedName("speakerGlitchRate")
    @Expose
    public float speakerGlitchRate;


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
