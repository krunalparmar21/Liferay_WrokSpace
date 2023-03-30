package com.inexture.portlet;


import com.liferay.blogs.constants.BlogsPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author root329
 */
@Component(
		immediate = true,
		property = {
				"javax.portlet.name=" + BlogsPortletKeys.BLOGS_ADMIN,
				"mvc.command.name=/blogs/edit_entry",
				"service.ranking:Integer=100"
		},
		service = MVCRenderCommand.class
)
public class CustomEditEntryMVCRenderCommandPortlet implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest,
						 RenderResponse renderResponse)
			throws PortletException {

		//Do something here
		System.out.println("render called");
		return mvcRenderCommand.render(renderRequest, renderResponse);
	}

	@Reference(target =
			"(component.name=com.liferay.blogs.web.internal.portlet.action.EditEntryMVCRenderCommand)")
	protected MVCRenderCommand mvcRenderCommand;
}