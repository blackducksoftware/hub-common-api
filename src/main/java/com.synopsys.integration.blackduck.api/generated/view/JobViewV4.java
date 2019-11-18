package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.generated.enumeration.JobStatusType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class JobViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.status-4+json";

    private String updatedAt;
    private String finishedAt;
    private JobStatusType status;
    private String progressData;
    private String type;
    private String startedAt;
    private String errorText;
    private String scheduledAt;

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

    public JobStatusType getStatus() {
	return status;
    }

    public void setStatus(JobStatusType status) {
	this.status = status;
    }

    public String getProgressData() {
	return progressData;
    }

    public void setProgressData(String progressData) {
	this.progressData = progressData;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public String getStartedAt() {
	return startedAt;
    }

    public void setStartedAt(String startedAt) {
	this.startedAt = startedAt;
    }

    public String getErrorText() {
	return errorText;
    }

    public void setErrorText(String errorText) {
	this.errorText = errorText;
    }

    public String getScheduledAt() {
	return scheduledAt;
    }

    public void setScheduledAt(String scheduledAt) {
	this.scheduledAt = scheduledAt;
    }


    public String getMediaType() {
	return mediaType;
    }

}
