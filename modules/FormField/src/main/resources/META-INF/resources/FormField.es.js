import 'dynamic-data-mapping-form-field-type/FieldBase/FieldBase.es';
import './FormFieldRegister.soy.js';
import templates from './FormField.soy.js';
import {Config} from 'metal-state';


/**
 * FormField Component
 */
class FormField extends Component {

	dispatchEvent(event, name, value) {
		this.emit(name, {
			fieldInstance: this,
			originalEvent: event,
			value
		});
	}

	_handleFieldChanged(event) {
		const {value} = event.target;

		this.setState(
			{
				value
			},
			() => this.dispatchEvent(event, 'fieldEdited', value)
		);
	}
}

FormField.STATE = {

	name: Config.string().required(),

	predefinedValue: Config.oneOfType([Config.number(), Config.string()]),

	required: Config.bool().value(false),

	showLabel: Config.bool().value(true),

	spritemap: Config.string(),

	value: Config.string().value('')
}

// Register component
Soy.register(FormField, templates);

