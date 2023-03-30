<%@ page import="com.inexture.studentService.model.StudentDemo" %>
<%@ page import="java.util.List" %>
<%@ include file="init.jsp"%>
<portlet:defineObjects />

<%  List<StudentDemo> studentList = (List<StudentDemo>)request.getAttribute("studentList"); %>
<portlet:renderURL var="addStudentRenderURL">
	<portlet:param name="mvcPath" value="/add-student.jsp"/>
</portlet:renderURL>

<div class="mb-5">
	<a href="<%= addStudentRenderURL %>" class="btn  btn-primary btn-default">
		<i class="glyphicon glyphicon-plus"></i> Add Student
	</a>
</div>
<table class="table table-striped">
	<tr >
		<th>Enrollment No</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Contact No</th>
		<th>City</th>
		<th colspan="2" style="width: 100px">Action</th>
	</tr>
	<c:forEach items="${studentList}" var="student">

		<portlet:renderURL var="updateStudentRenderURL">
			<portlet:param name="mvcPath" value="/update-student.jsp"/>
			<portlet:param name="enrollmentNo" value="${student.enrollmentNo}"/>
			<portlet:param name="firstName" value="${student.firstName}"/>
			<portlet:param name="lastName" value="${student.lastName}"/>
			<portlet:param name="contactNo" value="${student.contactNo}"/>
			<portlet:param name="city" value="${student.city}"/>
			<portlet:param name="studentId" value="${student.studentId}"/>
		</portlet:renderURL>

		<portlet:actionURL name="deleteStudent" var="deleteStudentActionURL">
			<portlet:param name="studentId" value="${student.getStudentId()}"/>
		</portlet:actionURL>

		<tr>
			<td>${student.getEnrollmentNo()}</td>
			<td>${student.getFirstName()}</td>
			<td>${student.getLastName()}</td>
			<td>${student.getContactNo()}</td>
			<td>${student.getCity()}</td>
			<td class="text-center" style="width: 50px">
				<a href="<%=updateStudentRenderURL%>" class="btn  btn-primary btn-default btn-sm px-2 py-1" >
					update
					<i class ="glyphicon glyphicon-edit"></i>
				</a>
			</td>
			<td class="text-center" style="width:50px">
				<a href="<%=deleteStudentActionURL%>"
				   class="btn  btn-primary btn-default btn-sm px-2 py-1"
				   onclick="return confirm('Are you sure you want to delete this item?');">
					Delete
					<i class ="glyphicon glyphicon-remove"></i>
				</a>
			</td>
		</tr>
	</c:forEach>
</table>
