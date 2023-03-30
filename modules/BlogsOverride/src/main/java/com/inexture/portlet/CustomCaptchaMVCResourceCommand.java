package com.inexture.portlet;

import com.liferay.login.web.constants.LoginPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCResourceCommand;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
@Component(
        property = {
                "javax.portlet.name=" + LoginPortletKeys.LOGIN,
                "mvc.command.name=/login/captcha"
        },
        service = MVCResourceCommand.class
)
public class CustomCaptchaMVCResourceCommand implements MVCResourceCommand{


    @Override
    public boolean serveResource
            (ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws PortletException {

        System.out.println("Serving login captcha image");

        return mvcResourceCommand.serveResource(resourceRequest, resourceResponse);
    }

    @Reference(target =
            "(component.name=com.liferay.login.web.internal.portlet.action.CaptchaMVCResourceCommand)")
    protected MVCResourceCommand mvcResourceCommand;
}
