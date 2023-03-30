package portletrecieverportlet.portlet;

import portletrecieverportlet.constants.PortletRecieverPortletKeys;

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
		"javax.portlet.display-name=PortletReciever",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PortletRecieverPortletKeys.PORTLETRECIEVER,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PortletRecieverPortlet extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		PortletSession session = renderRequest.getPortletSession();
		String message = (String) session.getAttribute("LIFERAY_SHARED_sessionMessage",PortletSession.APPLICATION_SCOPE);
		System.out.println("Value of Message"+message);
		renderRequest.setAttribute("recievedMessage",message);

		super.doView(renderRequest, renderResponse);
	}
}