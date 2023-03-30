package com.guestdemo.portlet;

import com.guestdemo.constants.GuestdemoPortletKeys;

import com.guestdemo.model.Entry;
import com.liferay.blogs.model.BlogsEntry;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author root329
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Guestdemo",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + GuestdemoPortletKeys.GUESTDEMO,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class GuestdemoPortlet extends MVCPortlet {


	private Log log = LogFactoryUtil.getLog(this.getClass().getName());

	@Reference
	CounterLocalService counterLocalService;


	@Reference
	UserLocalService userService;



	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		List<User>  users = UserLocalServiceUtil.getUsers(QueryUtil.ALL_POS,QueryUtil.ALL_POS);
		renderRequest.setAttribute("users",users);
		System.out.println("UserData:"+users);
		super.doView(renderRequest, renderResponse);
	}
	@ProcessAction(name = "addUser")
	public void addStudent(ActionRequest actionRequest, ActionResponse actionResponse) {
		long studentId = counterLocalService.increment(User.class.getName());
		long userId = ParamUtil.getLong(actionRequest, "userId");

		String screenName = ParamUtil.getString(actionRequest, "screenName");
		String firstName = ParamUtil.getString(actionRequest, "firstName");
		String lastName = ParamUtil.getString(actionRequest, "lastName");
		String emailAddress = ParamUtil.getString(actionRequest, "emailAddress");
		//String contactId = ParamUtil.getString(actionRequest, "contactId");

//		String password= ParamUtil.getString(actionRequest, "password");
//		String greeting= ParamUtil.getString(actionRequest, "greeting");
		String languageId= ParamUtil.getString(actionRequest, "languageId");
//		String jobTitle= ParamUtil.getString(actionRequest, "jobTitle");


		User userData = userService.createUser(studentId);
		//student.set(studentId);
		//student.setEnrollmentNo(enrollmentNo);
		userData.setUserId(userId);
		userData.setScreenName(screenName);
		userData.setFirstName(firstName);
		userData.setLastName(lastName);
		userData.setEmailAddress(emailAddress);
		userData.setContactId(userId+1);

//		userData.setGreeting(greeting);
	userData.setLanguageId(languageId);
//		userData.setJobTitle(jobTitle);
//		//student.setContactNo(contactNo);
		//student.setCity(city);

		UserLocalServiceUtil.addUser(userData);
	}


	@ProcessAction(name = "updateUser")
	public void updateStudent(ActionRequest actionRequest,  ActionResponse actionResponse) {
		long userId = ParamUtil.getLong(actionRequest,"userId", GetterUtil.DEFAULT_LONG);
		String screenName = ParamUtil.getString(actionRequest, "screenName", GetterUtil.DEFAULT_STRING);
		String firstName = ParamUtil.getString(actionRequest, "firstName", GetterUtil.DEFAULT_STRING);
		String lastName = ParamUtil.getString(actionRequest, "lastName", GetterUtil.DEFAULT_STRING);
		String emailAddress = ParamUtil.getString(actionRequest, "emailAddress", GetterUtil.DEFAULT_STRING);


		User user = null;
		try {
			user = userService.getUser(userId);
		} catch (Exception e) {
			log.error(e.getCause(), e);
		}

		if(Validator.isNotNull(user)) {
			//user.setUserId(userId);
			user.setScreenName(screenName);
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setEmailAddress(emailAddress);
			userService.updateUser(user);
		}
	}

	@ProcessAction(name = "deleteStudent")
	public void deleteStudent(ActionRequest actionRequest, ActionResponse actionResponse){
		long userId = ParamUtil.getLong(actionRequest, "userId", GetterUtil.DEFAULT_LONG);
		try {
			userService.deleteUser(userId);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

}