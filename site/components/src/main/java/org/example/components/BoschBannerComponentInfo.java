package org.example.components;

import org.hippoecm.hst.core.parameters.JcrPath;
import org.hippoecm.hst.core.parameters.Parameter;

public interface BoschBannerComponentInfo {
    @Parameter(name = "pageSize",
            defaultValue = "10",
            displayName = "Page Size")
    int getPageSize();

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
