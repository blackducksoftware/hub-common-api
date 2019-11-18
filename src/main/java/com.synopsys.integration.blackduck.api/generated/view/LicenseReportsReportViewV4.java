package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseReportsReportReportFormatType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseReportsReportViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.report-4+json";

    private String locale;
    private String updatedAt;
    private String finishedAt;
    private LicenseReportsReportReportFormatType reportFormat;
    private String createdByUser;
    private String fileNamePrefix;
    private String createdAt;
    private String createdBy;
    private BigDecimal fileSize;
    private String fileName;
    private String reportType;

    public String getLocale() {
	return locale;
    }

    public void setLocale(String locale) {
	this.locale = locale;
    }

    public String getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
    }

    public String getFinishedAt() {
	return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
	this.finishedAt = finishedAt;
    }

    public LicenseReportsReportReportFormatType getReportFormat() {
	return reportFormat;
    }

    public void setReportFormat(LicenseReportsReportReportFormatType reportFormat) {
	this.reportFormat = reportFormat;
    }

    public String getCreatedByUser() {
	return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
	this.createdByUser = createdByUser;
    }

    public String getFileNamePrefix() {
	return fileNamePrefix;
    }

    public void setFileNamePrefix(String fileNamePrefix) {
	this.fileNamePrefix = fileNamePrefix;
    }

    public String getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
    }

    public String getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
    }

    public BigDecimal getFileSize() {
	return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
	this.fileSize = fileSize;
    }

    public String getFileName() {
	return fileName;
    }

    public void setFileName(String fileName) {
	this.fileName = fileName;
    }

    public String getReportType() {
	return reportType;
    }

    public void setReportType(String reportType) {
	this.reportType = reportType;
    }


    public String getMediaType() {
	return mediaType;
    }

}
