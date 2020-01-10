package org.example.components;

import com.google.common.base.Strings;
import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;
import org.hippoecm.hst.core.request.HstRequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ParametersInfo(type = BoschBannerComponentInfo.class)
public class BoschBannerComponent extends BaseHstComponent {

    public static final Logger log = LoggerFactory.getLogger(BoschBannerComponent.class);

    @Override
    public void doBeforeRender(final HstRequest request, final HstResponse response) throws HstComponentException {
        super.doBeforeRender(request, response);
        final HstRequestContext ctx = request.getRequestContext();

        BoschBannerComponentInfo info = getComponentParametersInfo(request);
        String documentPath = info.getDocument();
        int pageSize = info.getPageSize();

        log.debug("pageSize: " + pageSize);

        if (!Strings.isNullOrEmpty(documentPath)) {
            HippoBean root = ctx.getSiteContentBaseBean();
            request.setAttribute("document", root.getBean(documentPath));
            request.setAttribute("pageSize", pageSize);
            request.setAttribute("documentPath", documentPath);
        }
    }
}
