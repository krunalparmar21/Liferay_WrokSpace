package sessionsenderportlet.portlet;

import sessionsenderportlet.constants.SessionSenderPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import org.osgi.service.component.annotations.Component;

import java.io.IOException;

/**
 * @author root329
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=SessionSender",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + SessionSenderPortletKeys.SESSIONSENDER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
			"com.liferay.portlet.private-session-attributes=false"
	},
	service = Portlet.class
)
public class SessionSenderPortlet extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		PortletSession session = renderRequest.getPortletSession();
		session.setAttribute("LIFERAY_SHARED_sessionMessage","Hello World",PortletSession.APPLICATION_SCOPE);
		super.doView(renderRequest, renderResponse);
	}
}