package org.example.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import java.util.Calendar;
import org.hippoecm.hst.content.beans.standard.HippoHtml;

@HippoEssentialsGenerated(internalName = "test1:BoschBannerComponent")
@Node(jcrType = "test1:BoschBannerComponent")
public class BoschBanner extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "test1:title")
    public String getTitle() {
        return getSingleProperty("test1:title");
    }

    @HippoEssentialsGenerated(internalName = "test1:date")
    public Calendar getDate() {
        return getSingleProperty("test1:date");
    }

    @HippoEssentialsGenerated(internalName = "test1:staticdropdown")
    public String getStaticdropdown() {
        return getSingleProperty("test1:staticdropdown");
    }

    @HippoEssentialsGenerated(internalName = "test1:content")
    public HippoHtml getContent() {
        return getHippoHtml("test1:content");
    }
}
