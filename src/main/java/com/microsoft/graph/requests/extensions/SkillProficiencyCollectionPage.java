// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SkillProficiency;
import com.microsoft.graph.requests.extensions.ISkillProficiencyCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.SkillProficiencyCollectionPage;
import com.microsoft.graph.requests.extensions.SkillProficiencyCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skill Proficiency Collection Page.
 */
public class SkillProficiencyCollectionPage extends BaseCollectionPage<SkillProficiency, ISkillProficiencyCollectionRequestBuilder> implements ISkillProficiencyCollectionPage {

    /**
     * A collection page for SkillProficiency
     *
     * @param response the serialized SkillProficiencyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SkillProficiencyCollectionPage(final SkillProficiencyCollectionResponse response, final ISkillProficiencyCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
