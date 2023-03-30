package formfield.form.field;

import com.liferay.dynamic.data.mapping.form.field.type.BaseDDMFormFieldType;
import com.liferay.dynamic.data.mapping.form.field.type.DDMFormFieldType;
import com.liferay.frontend.js.loader.modules.extender.npm.NPMResolver;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author root329
 */
@Component(
	immediate = true,
	property = {
		"ddm.form.field.type.description=FormField-description",
		"ddm.form.field.type.display.order:Integer=13",
		"ddm.form.field.type.group=customized",
		"ddm.form.field.type.icon=text",
		"ddm.form.field.type.label=FormField-label",
		"ddm.form.field.type.name=FormField"
	},
	service = DDMFormFieldType.class
)
public class FormFieldDDMFormFieldType extends BaseDDMFormFieldType {

	@Override
	public String getModuleName() {
		return _npmResolver.resolveModuleName(
			"dynamic-data-FormField-form-field/FormField.es");
	}

	@Override
	public String getName() {
		return "FormField";
	}

	@Override
	public boolean isCustomDDMFormFieldType() {
		return true;
	}

	@Reference
	private NPMResolver _npmResolver;

}