/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsComponentViolatingPoliciesView;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsFailedEvaluationPoliciesView;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsPolicyViolationLicensesView;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsPolicyViolationVulnerabilitiesView;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsViolatingPoliciesView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class DeveloperScansScanView extends BlackDuckComponent {
    private String componentIdentifier;
    private String componentName;
    private java.util.List<DeveloperScansScanItemsComponentViolatingPoliciesView> componentViolatingPolicies;
    private String externalId;
    private java.util.List<DeveloperScansScanItemsFailedEvaluationPoliciesView> failedEvaluationPolicies;
    private String originId;
    private java.util.List<DeveloperScansScanItemsPolicyViolationLicensesView> policyViolationLicenses;
    private java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesView> policyViolationVulnerabilities;
    private String versionName;
    private java.util.List<DeveloperScansScanItemsViolatingPoliciesView> violatingPolicies;

    public String getComponentIdentifier() {
        return componentIdentifier;
    }

    public void setComponentIdentifier(String componentIdentifier) {
        this.componentIdentifier = componentIdentifier;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public java.util.List<DeveloperScansScanItemsComponentViolatingPoliciesView> getComponentViolatingPolicies() {
        return componentViolatingPolicies;
    }

    public void setComponentViolatingPolicies(java.util.List<DeveloperScansScanItemsComponentViolatingPoliciesView> componentViolatingPolicies) {
        this.componentViolatingPolicies = componentViolatingPolicies;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public java.util.List<DeveloperScansScanItemsFailedEvaluationPoliciesView> getFailedEvaluationPolicies() {
        return failedEvaluationPolicies;
    }

    public void setFailedEvaluationPolicies(java.util.List<DeveloperScansScanItemsFailedEvaluationPoliciesView> failedEvaluationPolicies) {
        this.failedEvaluationPolicies = failedEvaluationPolicies;
    }

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public java.util.List<DeveloperScansScanItemsPolicyViolationLicensesView> getPolicyViolationLicenses() {
        return policyViolationLicenses;
    }

    public void setPolicyViolationLicenses(java.util.List<DeveloperScansScanItemsPolicyViolationLicensesView> policyViolationLicenses) {
        this.policyViolationLicenses = policyViolationLicenses;
    }

    public java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesView> getPolicyViolationVulnerabilities() {
        return policyViolationVulnerabilities;
    }

    public void setPolicyViolationVulnerabilities(java.util.List<DeveloperScansScanItemsPolicyViolationVulnerabilitiesView> policyViolationVulnerabilities) {
        this.policyViolationVulnerabilities = policyViolationVulnerabilities;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public java.util.List<DeveloperScansScanItemsViolatingPoliciesView> getViolatingPolicies() {
        return violatingPolicies;
    }

    public void setViolatingPolicies(java.util.List<DeveloperScansScanItemsViolatingPoliciesView> violatingPolicies) {
        this.violatingPolicies = violatingPolicies;
    }

}
