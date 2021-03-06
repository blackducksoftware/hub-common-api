/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsPolicyViolationVulnerabilitiesViolatingPoliciesView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class DeveloperScansScanItemsPolicyViolationVulnerabilitiesView extends BlackDuckComponent {
    private String description;
    private String name;
    private BigDecimal overallScore;
    private java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesViolatingPoliciesView> violatingPolicies;
    private String vulnSeverity;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getOverallScore() {
        return overallScore;
    }

    public void setOverallScore(BigDecimal overallScore) {
        this.overallScore = overallScore;
    }

    public java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesViolatingPoliciesView> getViolatingPolicies() {
        return violatingPolicies;
    }

    public void setViolatingPolicies(java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesViolatingPoliciesView> violatingPolicies) {
        this.violatingPolicies = violatingPolicies;
    }

    public String getVulnSeverity() {
        return vulnSeverity;
    }

    public void setVulnSeverity(String vulnSeverity) {
        this.vulnSeverity = vulnSeverity;
    }

}
