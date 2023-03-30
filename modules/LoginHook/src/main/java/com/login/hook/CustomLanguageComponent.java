package com.login.hook;

import org.osgi.service.component.annotations.Component;

import java.util.ResourceBundle;

@Component(
        property = { "language.id=en_US" },
        service = ResourceBundle.class
)
public class CustomLanguageComponent {

}
