package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComplexLicenseType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseCodeSharingType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;
import com.synopsys.integration.blackduck.api.generated.view.ComplexLicenseView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComplexLicenseView extends BlackDuckView {
    private LicenseCodeSharingType codeSharing;
    private String license;
    private String licenseDisplay;
    private java.util.List<ComplexLicenseView> licenses;
    private String name;
    private LicenseOwnershipType ownership;
    private ComplexLicenseType type;

    public LicenseCodeSharingType getCodeSharing() {
        return codeSharing;
    }

    public void setCodeSharing(LicenseCodeSharingType codeSharing) {
        this.codeSharing = codeSharing;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseDisplay() {
        return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
        this.licenseDisplay = licenseDisplay;
    }

    public java.util.List<ComplexLicenseView> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<ComplexLicenseView> licenses) {
        this.licenses = licenses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LicenseOwnershipType getOwnership() {
        return ownership;
    }

    public void setOwnership(LicenseOwnershipType ownership) {
        this.ownership = ownership;
    }

    public ComplexLicenseType getType() {
        return type;
    }

    public void setType(ComplexLicenseType type) {
        this.type = type;
    }

}
