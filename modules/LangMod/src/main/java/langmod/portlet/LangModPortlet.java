package langmod.portlet;

import com.liferay.portal.kernel.language.UTF8Control;
import langmod.constants.LangModPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * @author root329
 */
@Component(
		immediate = true,
		property = {
				"language.id=gu_IN"
		},
		service = ResourceBundle.class
)
public class LangModPortlet extends ResourceBundle {

	private final ResourceBundle _resourceBundle = ResourceBundle.getBundle(
			"content.Language_gu", UTF8Control.INSTANCE);

	@Override
	public Enumeration<String> getKeys() {
		return _resourceBundle.getKeys();
	}
	@Override
	protected Object handleGetObject(String key) {
		return _resourceBundle.getObject(key);
	}
}