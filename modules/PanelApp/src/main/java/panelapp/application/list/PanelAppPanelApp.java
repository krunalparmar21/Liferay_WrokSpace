package panelapp.application.list;

import panelapp.constants.PanelAppPanelCategoryKeys;
import panelapp.constants.PanelAppPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author root329
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + PanelAppPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class PanelAppPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return PanelAppPortletKeys.PANELAPP;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + PanelAppPortletKeys.PANELAPP + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}