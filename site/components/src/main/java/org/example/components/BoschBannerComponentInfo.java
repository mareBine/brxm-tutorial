package org.example.components;

import org.hippoecm.hst.core.parameters.JcrPath;
import org.hippoecm.hst.core.parameters.Parameter;

public interface BoschBannerComponentInfo {
    @Parameter(name = "city",
            defaultValue = "Belgrade",
            displayName = "City Name")
    String getCity();

    @Parameter(
            name = "document",
            required = true
    )
    @JcrPath(
            isRelative = true,
            pickerSelectableNodeTypes = {"hippo:document"}
    )
    String getDocument();
}
