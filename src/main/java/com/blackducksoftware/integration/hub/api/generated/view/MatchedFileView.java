package com.blackducksoftware.integration.hub.api.generated.view;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.generated.enumeration.MatchedFileUsagesType;
import com.blackducksoftware.integration.hub.api.generated.model.CompositePathWithArchiveContext;
import com.blackducksoftware.integration.hub.api.generated.view.CodeLocationView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class MatchedFileView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String CODELOCATIONS_LINK = "codelocations";

    static {
            links.put(CODELOCATIONS_LINK, CodeLocationView.class);
    }

    public CompositePathWithArchiveContext filePath;
    public java.util.List<MatchedFileUsagesType> usages;

}
