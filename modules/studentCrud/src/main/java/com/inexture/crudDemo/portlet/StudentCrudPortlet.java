package com.inexture.crudDemo.portlet;

import com.inexture.crudDemo.constants.StudentCrudPortletKeys;

import com.inexture.studentService.model.StudentDemo;
import com.inexture.studentService.service.StudentDemoLocalService;
import com.inexture.studentService.service.StudentDemoLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
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
		"javax.portlet.display-name=StudentCrud",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + StudentCrudPortletKeys.STUDENTCRUD,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class StudentCrudPortlet extends MVCPortlet {

	private Log log = LogFactoryUtil.getLog(this.getClass().getName());

	@Reference
	CounterLocalService counterLocalService;

	@Reference
	//StudentDemo studentLocalService;

	@ProcessAction(name = "addStudent")
	public void addStudent(ActionRequest actionRequest, ActionResponse actionResponse) {
		long studentId = counterLocalService.increment(StudentDemo.class.getName());
		String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
		String firstName = ParamUtil.getString(actionRequest, "firstName");
		String lastName = ParamUtil.getString(actionRequest, "lastName");
		String contactNo = ParamUtil.getString(actionRequest, "contactNo");
		String city = ParamUtil.getString(actionRequest, "city");

		StudentDemo student = StudentDemoLocalServiceUtil.createStudentDemo(studentId);
		student.setStudentId(studentId);
		student.setEnrollmentNo(enrollmentNo);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setContactNo(contactNo);
		student.setCity(city);

		StudentDemoLocalServiceUtil.addStudentDemo(student);
	}
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
		List<StudentDemo> studentList = StudentDemoLocalServiceUtil.getStudentDemos(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
		renderRequest.setAttribute("studentList", studentList);
		super.render(renderRequest, renderResponse);
	}

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		log.info("START... Find Customer...");
		List<StudentDemo> students = StudentDemoLocalServiceUtil.getStudentForStandard("pradip");
		//List<StudentDemo> students = StudentDemoLocalServiceUtil.getStudentDemoByFirstName("pradip");


		for(StudentDemo student : students){
			log.info("Student found : " + student.toString());
			//log.info("Student Fount" +student.getFirstName());
		}
		log.info("DONE... Find Student...");
		super.doView(renderRequest, renderResponse);
	}

	@ProcessAction(name = "updateStudent")
	public void updateStudent(ActionRequest actionRequest,  ActionResponse actionResponse) {
		long studentId = ParamUtil.getLong(actionRequest,"studentId", GetterUtil.DEFAULT_LONG);
		String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo", GetterUtil.DEFAULT_STRING);
		String firstName = ParamUtil.getString(actionRequest, "firstName", GetterUtil.DEFAULT_STRING);
		String lastName = ParamUtil.getString(actionRequest, "lastName", GetterUtil.DEFAULT_STRING);
		String contactNo = ParamUtil.getString(actionRequest, "contactNo", GetterUtil.DEFAULT_STRING);
		String city = ParamUtil.getString(actionRequest, "city", GetterUtil.DEFAULT_STRING);

		StudentDemo student = null;
		try {
			student = StudentDemoLocalServiceUtil.getStudentDemo(studentId);
		} catch (Exception e) {
			log.error(e.getCause(), e);
		}

		if(Validator.isNotNull(student)) {
			student.setEnrollmentNo(enrollmentNo);
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setContactNo(contactNo);
			student.setCity(city);
			StudentDemoLocalServiceUtil.updateStudentDemo(student);
		}
	}

	@ProcessAction(name = "deleteStudent")
	public void deleteStudent(ActionRequest actionRequest, ActionResponse actionResponse){
		long studentId = ParamUtil.getLong(actionRequest, "studentId", GetterUtil.DEFAULT_LONG);
		try {
			StudentDemoLocalServiceUtil.deleteStudentDemo(studentId);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}
}