package employee.portlet;

import com.Employee.model.emp;
import com.Employee.service.empLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.test.service.model.Employee;
import com.test.service.service.EmployeeLocalService;
import employee.constants.EmployeePortletKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;

/**
 * @author root329
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Employee",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + EmployeePortletKeys.EMPLOYEE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class EmployeePortlet extends MVCPortlet {

	private Log log = LogFactoryUtil.getLog(this.getClass().getName());

	@Reference
	CounterLocalService counterLocalService;
//
//	@Reference
//	EmployeeLocalService employeeLocalService;


	@ProcessAction(name = "addStudent")
	public void addStudent(ActionRequest actionRequest, ActionResponse actionResponse) {
//
//		Employee employee= employeeLocalService.createEmployee(1);
//		employee.setEid(1);
//		employee.setEname("Krunal");
//		employeeLocalService.addEmployee(employee);

		long studentId = counterLocalService.increment(emp.class.getName());
		String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo");
		String firstName = ParamUtil.getString(actionRequest, "firstName");
		String lastName = ParamUtil.getString(actionRequest, "lastName");
		String contactNo = ParamUtil.getString(actionRequest, "contactNo");
		String city = ParamUtil.getString(actionRequest, "city");

		emp student = empLocalServiceUtil.createemp(studentId);
		student.setEmpId(studentId);
		student.setEnrollmentNo(enrollmentNo);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setContactNo(contactNo);
		student.setCity(city);

		empLocalServiceUtil.addemp(student);
	}

//
//	@Override
//	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException{
//		List<emp> studentList = empLocalServiceUtil.getemps(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
//		renderRequest.setAttribute("studentList", studentList);
//		super.render(renderRequest, renderResponse);
//	}

//	@Override
//	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
//
////		log.info("START... Find Customer...");
////		List<emp> students = empLocalServiceUtil.findByCity("ccc");
////		System.out.println("List is :"+ students);
////		for(emp e: students){
////			System.out.println("City id :"+ e.getCity());
////		}
//		//List<StudentDemo> students = StudentDemoLocalServiceUtil.getStudentDemoByFirstName("pradip");
//
//		/*
//		for(emp student : students){
//			log.info("Student found : " + student.toString());
//			//log.info("Student Fount" +student.getFirstName());
//		}
//		log.info("DONE... Find Student...");*/
//		super.doView(renderRequest, renderResponse);
//	}

//
	@ProcessAction(name = "updateStudent")
	public void updateStudent(ActionRequest actionRequest,  ActionResponse actionResponse) {
		long studentId = ParamUtil.getLong(actionRequest,"empId", GetterUtil.DEFAULT_LONG);
		String enrollmentNo = ParamUtil.getString(actionRequest, "enrollmentNo", GetterUtil.DEFAULT_STRING);
		String firstName = ParamUtil.getString(actionRequest, "firstName", GetterUtil.DEFAULT_STRING);
		String lastName = ParamUtil.getString(actionRequest, "lastName", GetterUtil.DEFAULT_STRING);
		String contactNo = ParamUtil.getString(actionRequest, "contactNo", GetterUtil.DEFAULT_STRING);
		String city = ParamUtil.getString(actionRequest, "city", GetterUtil.DEFAULT_STRING);

		emp student = null;
		try {
			student = empLocalServiceUtil.getemp(studentId);
		} catch (Exception e) {
			log.error(e.getCause(), e);
		}

		if(Validator.isNotNull(student)) {
			student.setEnrollmentNo(enrollmentNo);
			student.setFirstName(firstName);
			student.setLastName(lastName);
			student.setContactNo(contactNo);
			student.setCity(city);
			empLocalServiceUtil.updateemp(student);
		}
	}

	@ProcessAction(name = "deleteStudent")
	public void deleteStudent(ActionRequest actionRequest, ActionResponse actionResponse){
		long empId = ParamUtil.getLong(actionRequest, "empId", GetterUtil.DEFAULT_LONG);
		try {
			empLocalServiceUtil.deleteemp(empId);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}
}