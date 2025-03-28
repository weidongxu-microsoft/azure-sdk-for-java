// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.models.events;

/**
 * The base event interface with ReasonCode added.
 */
public abstract class CallAutomationEventBaseWithReasonCode extends CallAutomationEventBase {

    CallAutomationEventBaseWithReasonCode() {
    }

    /**
     * Returns the reason code of the event
     * @return a ReasonCode object.
     * */
    public ReasonCode getReasonCode() {
        return getResultInformation() != null ? ReasonCode.fromReasonCode(getResultInformation().getSubCode()) : null;
    }
}
