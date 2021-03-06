/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsAllLicensesView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsAllVulnerabilitiesView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsComponentViolatingPoliciesView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsFailedEvaluationPoliciesView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsPolicyViolationLicensesView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsPolicyViolationVulnerabilitiesView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsViolatingPoliciesView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ScanFullResultView extends BlackDuckComponent {
    private java.util.List<ScanFullResultItemsAllLicensesView> allLicenses;
    private java.util.List<ScanFullResultItemsAllVulnerabilitiesView> allVulnerabilities;
    private String componentIdentifier;
    private String componentName;
    private java.util.List<ScanFullResultItemsComponentViolatingPoliciesView> componentViolatingPolicies;
    private String externalId;
    private java.util.List<ScanFullResultItemsFailedEvaluationPoliciesView> failedEvaluationPolicies;
    private java.util.List<String> nonEvaluatedPolicies;
    private java.util.List<String> partiallyEvaluatedPolicies;
    private java.util.List<ScanFullResultItemsPolicyViolationLicensesView> policyViolationLicenses;
    private java.util.List<ScanFullResultItemsPolicyViolationVulnerabilitiesView> policyViolationVulnerabilities;
    private String versionName;
    private java.util.List<ScanFullResultItemsViolatingPoliciesView> violatingPolicies;

    public java.util.List<ScanFullResultItemsAllLicensesView> getAllLicenses() {
        return allLicenses;
    }

    public void setAllLicenses(java.util.List<ScanFullResultItemsAllLicensesView> allLicenses) {
        this.allLicenses = allLicenses;
    }

    public java.util.List<ScanFullResultItemsAllVulnerabilitiesView> getAllVulnerabilities() {
        return allVulnerabilities;
    }

    public void setAllVulnerabilities(java.util.List<ScanFullResultItemsAllVulnerabilitiesView> allVulnerabilities) {
        this.allVulnerabilities = allVulnerabilities;
    }

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

    public java.util.List<ScanFullResultItemsComponentViolatingPoliciesView> getComponentViolatingPolicies() {
        return componentViolatingPolicies;
    }

    public void setComponentViolatingPolicies(java.util.List<ScanFullResultItemsComponentViolatingPoliciesView> componentViolatingPolicies) {
        this.componentViolatingPolicies = componentViolatingPolicies;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public java.util.List<ScanFullResultItemsFailedEvaluationPoliciesView> getFailedEvaluationPolicies() {
        return failedEvaluationPolicies;
    }

    public void setFailedEvaluationPolicies(java.util.List<ScanFullResultItemsFailedEvaluationPoliciesView> failedEvaluationPolicies) {
        this.failedEvaluationPolicies = failedEvaluationPolicies;
    }

    public java.util.List<String> getNonEvaluatedPolicies() {
        return nonEvaluatedPolicies;
    }

    public void setNonEvaluatedPolicies(java.util.List<String> nonEvaluatedPolicies) {
        this.nonEvaluatedPolicies = nonEvaluatedPolicies;
    }

    public java.util.List<String> getPartiallyEvaluatedPolicies() {
        return partiallyEvaluatedPolicies;
    }

    public void setPartiallyEvaluatedPolicies(java.util.List<String> partiallyEvaluatedPolicies) {
        this.partiallyEvaluatedPolicies = partiallyEvaluatedPolicies;
    }

    public java.util.List<ScanFullResultItemsPolicyViolationLicensesView> getPolicyViolationLicenses() {
        return policyViolationLicenses;
    }

    public void setPolicyViolationLicenses(java.util.List<ScanFullResultItemsPolicyViolationLicensesView> policyViolationLicenses) {
        this.policyViolationLicenses = policyViolationLicenses;
    }

    public java.util.List<ScanFullResultItemsPolicyViolationVulnerabilitiesView> getPolicyViolationVulnerabilities() {
        return policyViolationVulnerabilities;
    }

    public void setPolicyViolationVulnerabilities(java.util.List<ScanFullResultItemsPolicyViolationVulnerabilitiesView> policyViolationVulnerabilities) {
        this.policyViolationVulnerabilities = policyViolationVulnerabilities;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public java.util.List<ScanFullResultItemsViolatingPoliciesView> getViolatingPolicies() {
        return violatingPolicies;
    }

    public void setViolatingPolicies(java.util.List<ScanFullResultItemsViolatingPoliciesView> violatingPolicies) {
        this.violatingPolicies = violatingPolicies;
    }

}
