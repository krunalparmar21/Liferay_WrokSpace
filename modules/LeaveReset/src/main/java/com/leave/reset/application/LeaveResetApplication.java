package com.leave.reset.application;

import com.Employee.model.emp;
import com.Employee.model.empModel;
import com.Employee.service.empLocalService;
import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.util.Validator;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.jaxrs.whiteboard.JaxrsWhiteboardConstants;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * @author root329
 */

@Component(
	property = {
		JaxrsWhiteboardConstants.JAX_RS_APPLICATION_BASE + "=/greetings",
		JaxrsWhiteboardConstants.JAX_RS_NAME + "=Greetings.Rest"
	},
	service = Application.class
)
public class LeaveResetApplication extends Application {

	@Reference
	public empLocalService emplocalService;

	@Reference
	public CounterLocalService counterLocalService;


	public Set<Object> getSingletons() {
		return Collections.<Object>singleton(this);
	}


	@GET
	@Produces("text/plain")
	public String working() {
		return "It works!";
	}

	//http://localhost:8080/o/greetings/morning
	@GET
	@Path("/morning")
	@Produces("text/plain")
	public String hello() {
		return "Good morning!";
	}

	@GET
	@Path("/all")
	@Produces("application/json")
	public List<emp> getAllStudent()
	{
		return emplocalService.getemps(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	}

	@POST
	@Path("/add-student")
	@Produces("application/json")
	public emp addStudent(@RequestBody empModel studentEntity)
	{
		long studentId = counterLocalService.increment(emp.class.getName());
		emp student = emplocalService.createemp(studentId);

		student.setEmpId(studentId);
		student.setEnrollmentNo(studentEntity.getEnrollmentNo());
		student.setFirstName(studentEntity.getFirstName());
		student.setLastName(studentEntity.getLastName());
		student.setContactNo(studentEntity.getContactNo());
		student.setCity(studentEntity.getCity());

		return emplocalService.addemp(student);
	}

	@PUT
	@Path("/update-student")
	@Consumes("application/json")
	@Produces("application/json")
	public emp updateStudent(@RequestBody empModel studentEntity) throws PortalException {

		emp student = emplocalService.getemp(studentEntity.getEmpId());
		if (Validator.isNotNull(student)) {
			student.setEnrollmentNo(studentEntity.getEnrollmentNo());
			student.setFirstName(studentEntity.getFirstName());
			student.setLastName(studentEntity.getLastName());
			student.setContactNo(studentEntity.getContactNo());
			student.setCity(studentEntity.getCity());

			return emplocalService.updateemp(student);
		}
		return null;
	}

	@DELETE
	@Path("/delete/{studentId}")
	public String deleteStudentById(@PathParam("studentId") String studentId) throws PortalException {
		emplocalService.deleteemp(Long.parseLong(studentId));
		return "delete successfully.";
	}


//
//	@Path("/{empId}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public String getLeave(@PathParam("empId") long empId){
//
//		emp employee = null;
//
//		String jsonString = null;
//		try {
//			employee = (emp) empService.getemp(empId);
//			jsonString = JSONFactoryUtil.serialize(employee);
//		} catch (Exception e) {
//
//			e.printStackTrace();
//
//		}
//		return jsonString;
//
//	}


}