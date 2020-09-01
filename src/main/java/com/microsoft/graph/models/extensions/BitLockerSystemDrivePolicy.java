// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.BitLockerEncryptionMethod;
import com.microsoft.graph.models.generated.ConfigurationUsage;
import com.microsoft.graph.models.extensions.BitLockerRecoveryOptions;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Bit Locker System Drive Policy.
 */
public class BitLockerSystemDrivePolicy implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Encryption Method.
     * Select the encryption method for operating system drives.
     */
    @SerializedName("encryptionMethod")
    @Expose
    public BitLockerEncryptionMethod encryptionMethod;

    /**
     * The Startup Authentication Required.
     * Require additional authentication at startup.
     */
    @SerializedName("startupAuthenticationRequired")
    @Expose
    public Boolean startupAuthenticationRequired;

    /**
     * The Startup Authentication Block Without Tpm Chip.
     * Indicates whether to allow BitLocker without a compatible TPM (requires a password or a startup key on a USB flash drive).
     */
    @SerializedName("startupAuthenticationBlockWithoutTpmChip")
    @Expose
    public Boolean startupAuthenticationBlockWithoutTpmChip;

    /**
     * The Startup Authentication Tpm Usage.
     * Indicates if TPM startup is allowed/required/disallowed.
     */
    @SerializedName("startupAuthenticationTpmUsage")
    @Expose
    public ConfigurationUsage startupAuthenticationTpmUsage;

    /**
     * The Startup Authentication Tpm Pin Usage.
     * Indicates if TPM startup pin is allowed/required/disallowed.
     */
    @SerializedName("startupAuthenticationTpmPinUsage")
    @Expose
    public ConfigurationUsage startupAuthenticationTpmPinUsage;

    /**
     * The Startup Authentication Tpm Key Usage.
     * Indicates if TPM startup key is allowed/required/disallowed.
     */
    @SerializedName("startupAuthenticationTpmKeyUsage")
    @Expose
    public ConfigurationUsage startupAuthenticationTpmKeyUsage;

    /**
     * The Startup Authentication Tpm Pin And Key Usage.
     * Indicates if TPM startup pin key and key are allowed/required/disallowed.
     */
    @SerializedName("startupAuthenticationTpmPinAndKeyUsage")
    @Expose
    public ConfigurationUsage startupAuthenticationTpmPinAndKeyUsage;

    /**
     * The Minimum Pin Length.
     * Indicates the minimum length of startup pin. Valid values 4 to 20
     */
    @SerializedName("minimumPinLength")
    @Expose
    public Integer minimumPinLength;

    /**
     * The Recovery Options.
     * Allows to recover BitLocker encrypted operating system drives in the absence of the required startup key information. This policy setting is applied when you turn on BitLocker.
     */
    @SerializedName("recoveryOptions")
    @Expose
    public BitLockerRecoveryOptions recoveryOptions;

    /**
     * The Preboot Recovery Enable Message And Url.
     * Enable pre-boot recovery message and Url. If requireStartupAuthentication is false, this value does not affect.
     */
    @SerializedName("prebootRecoveryEnableMessageAndUrl")
    @Expose
    public Boolean prebootRecoveryEnableMessageAndUrl;

    /**
     * The Preboot Recovery Message.
     * Defines a custom recovery message.
     */
    @SerializedName("prebootRecoveryMessage")
    @Expose
    public String prebootRecoveryMessage;

    /**
     * The Preboot Recovery Url.
     * Defines a custom recovery URL.
     */
    @SerializedName("prebootRecoveryUrl")
    @Expose
    public String prebootRecoveryUrl;


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