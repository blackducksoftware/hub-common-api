package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.RegistrationFeatureView;
import com.synopsys.integration.blackduck.api.generated.component.RegistrationMessageView;
import com.synopsys.integration.blackduck.api.generated.enumeration.RegistrationStateType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RegistrationSummaryInternalView extends BlackDuckView {
    private java.util.Date expirationDate;
    private java.util.Date expirationWarningDate;
    private java.util.List<RegistrationFeatureView> features;
    private java.util.List<RegistrationMessageView> messages;
    private RegistrationStateType state;

    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public java.util.Date getExpirationWarningDate() {
        return expirationWarningDate;
    }

    public void setExpirationWarningDate(java.util.Date expirationWarningDate) {
        this.expirationWarningDate = expirationWarningDate;
    }

    public java.util.List<RegistrationFeatureView> getFeatures() {
        return features;
    }

    public void setFeatures(java.util.List<RegistrationFeatureView> features) {
        this.features = features;
    }

    public java.util.List<RegistrationMessageView> getMessages() {
        return messages;
    }

    public void setMessages(java.util.List<RegistrationMessageView> messages) {
        this.messages = messages;
    }

    public RegistrationStateType getState() {
        return state;
    }

    public void setState(RegistrationStateType state) {
        this.state = state;
    }

}
