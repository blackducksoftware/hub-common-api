package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkMultipleResponses;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.core.LinkSingleResponse;
import com.blackducksoftware.integration.hub.api.generated.enumeration.OriginSourceType;
import com.blackducksoftware.integration.hub.api.generated.response.AssignedUserGroupView;
import com.blackducksoftware.integration.hub.api.generated.view.AssignedUserView;
import com.blackducksoftware.integration.hub.api.generated.view.ProjectVersionView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String VERSIONS_LINK = "versions";
    public static final String USERGROUPS_LINK = "usergroups";
    public static final String CANONICALVERSION_LINK = "canonicalVersion";
    public static final String USERS_LINK = "users";

    public static final LinkMultipleResponses<ProjectVersionView> VERSIONS_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionView>(VERSIONS_LINK, ProjectVersionView.class);
    public static final LinkMultipleResponses<AssignedUserGroupView> USERGROUPS_LINK_RESPONSE = new LinkMultipleResponses<AssignedUserGroupView>(USERGROUPS_LINK, AssignedUserGroupView.class);
    public static final LinkSingleResponse<ProjectVersionView> CANONICALVERSION_LINK_RESPONSE = new LinkSingleResponse<ProjectVersionView>(CANONICALVERSION_LINK, ProjectVersionView.class);
    public static final LinkMultipleResponses<AssignedUserView> USERS_LINK_RESPONSE = new LinkMultipleResponses<AssignedUserView>(USERS_LINK, AssignedUserView.class);

    static {
            links.put(VERSIONS_LINK, VERSIONS_LINK_RESPONSE);
            links.put(USERGROUPS_LINK, USERGROUPS_LINK_RESPONSE);
            links.put(CANONICALVERSION_LINK, CANONICALVERSION_LINK_RESPONSE);
            links.put(USERS_LINK, USERS_LINK_RESPONSE);
    }

    public String description;
    public String name;
    public Boolean projectLevelAdjustments;
    public String projectOwner;
    public Integer projectTier;
    public OriginSourceType source;

}
