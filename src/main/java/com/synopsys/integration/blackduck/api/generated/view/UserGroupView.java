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
package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.UserGroupCreatedFromType;
import com.synopsys.integration.blackduck.api.generated.response.AssignedProjectView;
import com.synopsys.integration.blackduck.api.generated.view.RoleAssignmentView;
import com.synopsys.integration.blackduck.api.generated.view.UserView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class UserGroupView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String PROJECTS_LINK = "projects";
    public static final String ROLES_LINK = "roles";
    public static final String USERS_LINK = "users";

    public static final LinkMultipleResponses<AssignedProjectView> PROJECTS_LINK_RESPONSE = new LinkMultipleResponses<AssignedProjectView>(PROJECTS_LINK, AssignedProjectView.class);
    public static final LinkMultipleResponses<RoleAssignmentView> ROLES_LINK_RESPONSE = new LinkMultipleResponses<RoleAssignmentView>(ROLES_LINK, RoleAssignmentView.class);
    public static final LinkMultipleResponses<UserView> USERS_LINK_RESPONSE = new LinkMultipleResponses<UserView>(USERS_LINK, UserView.class);

    static {
        links.put(PROJECTS_LINK, PROJECTS_LINK_RESPONSE);
        links.put(ROLES_LINK, ROLES_LINK_RESPONSE);
        links.put(USERS_LINK, USERS_LINK_RESPONSE);
    }

    private Boolean active;
    private UserGroupCreatedFromType createdFrom;
    private String externalName;
    private String name;
    private String userGroup;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public UserGroupCreatedFromType getCreatedFrom() {
        return createdFrom;
    }

    public void setCreatedFrom(UserGroupCreatedFromType createdFrom) {
        this.createdFrom = createdFrom;
    }

    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

}
