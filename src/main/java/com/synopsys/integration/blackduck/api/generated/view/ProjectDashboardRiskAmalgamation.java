package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectRiskProfile;
import com.synopsys.integration.blackduck.api.generated.component.RiskProfile;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectDashboardRiskAmalgamation extends BlackDuckView {
    private RiskProfile overallRiskAggregate;
    private java.util.List<ProjectRiskProfile> projectRiskProfilePageView;

    public RiskProfile getOverallRiskAggregate() {
        return overallRiskAggregate;
    }

    public void setOverallRiskAggregate(RiskProfile overallRiskAggregate) {
        this.overallRiskAggregate = overallRiskAggregate;
    }

    public java.util.List<ProjectRiskProfile> getProjectRiskProfilePageView() {
        return projectRiskProfilePageView;
    }

    public void setProjectRiskProfilePageView(java.util.List<ProjectRiskProfile> projectRiskProfilePageView) {
        this.projectRiskProfilePageView = projectRiskProfilePageView;
    }

}
