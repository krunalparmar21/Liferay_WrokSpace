package student.portlet;

import com.inexture.model.StudentDemo;
import com.inexture.model.StudentDemoModel;
import com.inexture.service.StudentDemoLocalService;
import com.inexture.service.StudentDemoLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalService;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.liferay.portal.kernel.util.ParamUtil;

import org.osgi.service.component.annotations.Reference;
import student.constants.StudentPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import org.osgi.service.component.annotations.Component;


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
		"javax.portlet.display-name=Student",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + StudentPortletKeys.STUDENT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class StudentPortlet extends MVCPortlet {


		private Log log = LogFactoryUtil.getLog(this.getClass().getName());

		@Reference
		CounterLocalService counterLocalService;

		StudentDemoLocalService studentLocalService;


		@ProcessAction(name = "addStudent")
		public void addStudent(ActionRequest actionRequest, ActionResponse actionResponse) {

			System.out.println("Helllo world");

			long studentId = counterLocalService.increment(StudentDemoLocalServiceUtil.class.getName());
			String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
			String firstName = ParamUtil.getString(actionRequest, "firstName");
			String lastName = ParamUtil.getString(actionRequest, "lastName");
			String contactNo = ParamUtil.getString(actionRequest, "contactNo");
			String city = ParamUtil.getString(actionRequest, "city");

			StudentDemoModel student = studentLocalService.createStudentDemo(studentId);
			student.setStudentId(studentId);
			student.setEnrollmentNo(enrollmentNo);
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setContactNo(contactNo);
			student.setCity(city);

			studentLocalService.addStudentDemo((StudentDemo) student);
		}
		/*
		@Override
		public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
			List<Student> studentList = studentLocalService.getStudents(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
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
		}*/
		/*
		@ProcessAction(name = "updateStudent")
		public void updateStudent(ActionRequest actionRequest,  ActionResponse actionResponse) {
			long studentId = ParamUtil.getLong(actionRequest,"studentId", GetterUtil.DEFAULT_LONG);
			String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo", GetterUtil.DEFAULT_STRING);
			String firstName = ParamUtil.getString(actionRequest, "firstName", GetterUtil.DEFAULT_STRING);
			String lastName = ParamUtil.getString(actionRequest, "lastName", GetterUtil.DEFAULT_STRING);
			String contactNo = ParamUtil.getString(actionRequest, "contactNo", GetterUtil.DEFAULT_STRING);
			String city = ParamUtil.getString(actionRequest, "city", GetterUtil.DEFAULT_STRING);

			Student student = null;
			try {
				student = StudentLocalServiceUtil.getStudent(studentId);
			} catch (Exception e) {
				log.error(e.getCause(), e);
			}

			if(Validator.isNotNull(student)) {
				student.setEnrollmentNo(enrollmentNo);
				student.setFirstName(firstName);
				student.setLastName(lastName);
				student.setContactNo(contactNo);
				student.setCity(city);
				StudentLocalServiceUtil.updateStudent(student);
			}
		}

		@ProcessAction(name = "deleteStudent")
		public void deleteStudent(ActionRequest actionRequest, ActionResponse actionResponse){
			long studentId = ParamUtil.getLong(actionRequest, "studentId", GetterUtil.DEFAULT_LONG);
			try {
				StudentLocalServiceUtil.deleteStudent(studentId);
			} catch (Exception e) {
				log.error(e.getMessage(), e);
			}
		}*/
}