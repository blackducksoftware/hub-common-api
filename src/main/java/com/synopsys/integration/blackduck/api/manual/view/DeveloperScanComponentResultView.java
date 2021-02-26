/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.view;

import java.util.Set;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;

public class DeveloperScanComponentResultView extends BlackDuckView {
    private String componentName;
    private String versionName;
    private String componentIdentifier;
    private Set<String> violatingPolicyNames;
    private Set<PolicyViolationVulnerabilityView> policyViolationVulnerabilities;
    private Set<PolicyViolationLicenseView> policyViolationLicenses;

    public String getComponentName() {
        return componentName;
    }

    public String getVersionName() {
        return versionName;
    }

    public String getComponentIdentifier() {
        return componentIdentifier;
    }

    public Set<String> getViolatingPolicyNames() {
        return violatingPolicyNames;
    }

    public Set<PolicyViolationVulnerabilityView> getPolicyViolationVulnerabilities() {
        return policyViolationVulnerabilities;
    }

    public Set<PolicyViolationLicenseView> getPolicyViolationLicenses() {
        return policyViolationLicenses;
    }
}
