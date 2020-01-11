package org.example.components;

import com.google.common.base.Strings;
import org.hippoecm.hst.component.support.bean.BaseHstComponent;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import org.hippoecm.hst.core.component.HstComponentException;
import org.hippoecm.hst.core.component.HstRequest;
import org.hippoecm.hst.core.component.HstResponse;
import org.hippoecm.hst.core.parameters.ParametersInfo;
import org.hippoecm.hst.core.request.HstRequestContext;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Response;

@ParametersInfo(type = BoschBannerComponentInfo.class)
public class BoschBannerComponent extends BaseHstComponent {

    public static final Logger log = LoggerFactory.getLogger(BoschBannerComponent.class);

    @Override
    public void doBeforeRender(final HstRequest request, final HstResponse response) throws HstComponentException {
        try {
            super.doBeforeRender(request, response);
            final HstRequestContext ctx = request.getRequestContext();

            BoschBannerComponentInfo info = getComponentParametersInfo(request);
            String documentPath = info.getDocument();

            if (!Strings.isNullOrEmpty(documentPath)) {
                HippoBean root = ctx.getSiteContentBaseBean();
                request.setAttribute("document", root.getBean(documentPath));
                request.setAttribute("info", info);
                request.setAttribute("apiData", getApiData(info.getCity()));
            }

        } catch (Exception e) {
            log.error("BoschBannerComponent" + e.toString());
        }
    }

    /**
     * get data from external API
     * @return
     */
    private String getApiData(String city) {
        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target("https://restcountries.eu/rest/v2/capital/" + city);

        Response response = target.request().get();
        String value = response.readEntity(String.class);
//        log.debug("getApiData: " + value);
        response.close();

        return value;
    }
}
