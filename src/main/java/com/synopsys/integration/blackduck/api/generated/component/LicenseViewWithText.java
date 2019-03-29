/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilySummaryView;
import com.synopsys.integration.blackduck.api.generated.component.UserSummaryView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseSourceType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseViewWithText extends BlackDuckComponent {
    private java.util.Date createdAt;
    private UserSummaryView createdBy;
    private java.util.Date expirationDate;
    private LicenseFamilySummaryView licenseFamily;
    private LicenseSourceType licenseSource;
    private LicenseStatusType licenseStatus;
    private Boolean licenseTextAdjusted;
    private String name;
    private String notes;
    private LicenseOwnershipType ownership;
    private String spdxId;
    private java.util.Date statusUpdatedAt;
    private UserSummaryView statusUpdatedBy;
    private String text;
    private java.util.Date updatedAt;
    private UserSummaryView updatedBy;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public UserSummaryView getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserSummaryView createdBy) {
        this.createdBy = createdBy;
    }

    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public LicenseFamilySummaryView getLicenseFamily() {
        return licenseFamily;
    }

    public void setLicenseFamily(LicenseFamilySummaryView licenseFamily) {
        this.licenseFamily = licenseFamily;
    }

    public LicenseSourceType getLicenseSource() {
        return licenseSource;
    }

    public void setLicenseSource(LicenseSourceType licenseSource) {
        this.licenseSource = licenseSource;
    }

    public LicenseStatusType getLicenseStatus() {
        return licenseStatus;
    }

    public void setLicenseStatus(LicenseStatusType licenseStatus) {
        this.licenseStatus = licenseStatus;
    }

    public Boolean getLicenseTextAdjusted() {
        return licenseTextAdjusted;
    }

    public void setLicenseTextAdjusted(Boolean licenseTextAdjusted) {
        this.licenseTextAdjusted = licenseTextAdjusted;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public LicenseOwnershipType getOwnership() {
        return ownership;
    }

    public void setOwnership(LicenseOwnershipType ownership) {
        this.ownership = ownership;
    }

    public String getSpdxId() {
        return spdxId;
    }

    public void setSpdxId(String spdxId) {
        this.spdxId = spdxId;
    }

    public java.util.Date getStatusUpdatedAt() {
        return statusUpdatedAt;
    }

    public void setStatusUpdatedAt(java.util.Date statusUpdatedAt) {
        this.statusUpdatedAt = statusUpdatedAt;
    }

    public UserSummaryView getStatusUpdatedBy() {
        return statusUpdatedBy;
    }

    public void setStatusUpdatedBy(UserSummaryView statusUpdatedBy) {
        this.statusUpdatedBy = statusUpdatedBy;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserSummaryView getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(UserSummaryView updatedBy) {
        this.updatedBy = updatedBy;
    }

}
