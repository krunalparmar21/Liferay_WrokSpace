<%@ page import="java.util.List" %>
<%@ page import="com.liferay.portal.kernel.model.User" %>
<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="inpersonateuserdemo.caption"/></b>
</p>

<portlet:actionURL name="getBlog" var="actionPage"></portlet:actionURL>
<a href="<%=actionPage%>">Call Process Action</a>

<%  List<User> studentList = (List<User>)request.getAttribute("users"); %>
<portlet:renderURL var="addStudentRenderURL">
	<portlet:param name="mvcPath" value="/add-user.jsp"/>
</portlet:renderURL>

<div class="mb-5">
	<a href="<%= addStudentRenderURL %>" class="btn  btn-primary btn-default">
		<i class="glyphicon glyphicon-plus"></i> Add Student
	</a>
</div>
<table class="table table-striped">
	<tr>
		<th>ScreenName</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>EmailAddress</th>
		<th>Password</th>
		<th colspan="2" style="width: 100px">Action</th>
	</tr>
	<c:forEach items="${requestScope.users}" var="student">

		<portlet:renderURL var="updateStudentRenderURL">
			<portlet:param name="mvcPath" value="/update-user.jsp"/>
			<portlet:param name="screenName" value="${student.screenName}"/>
			<portlet:param name="firstName" value="${student.firstName}"/>
			<portlet:param name="lastName" value="${student.lastName}"/>
			<portlet:param name="emailAddress" value="${student.emailAddress}"/>
			<portlet:param name="userId" value="${student.userId}"/>
		</portlet:renderURL>

		<portlet:actionURL name="deleteStudent" var="deleteStudentActionURL">
			<portlet:param name="userId" value="${student.getUserId()}"/>
		</portlet:actionURL>

		<tr>
			<td>${student.getScreenName()}</td>
			<td>${student.getFirstName()}</td>
			<td>${student.getLastName()}</td>
			<td>${student.getEmailAddress()}</td>

			<td class="text-center" style="width: 50px">
				<a href="<%=updateStudentRenderURL%>" >
					<i class ="glyphicon glyphicon-edit"></i>
					Update
				</a>
			</td>
			<td class="text-center" style="width:50px">
				<a href="<%=deleteStudentActionURL%>"
				   onclick="return confirm('Are you sure you want to delete this item?');">
					Delete
					<i class ="glyphicon glyphicon-remove"></i>
				</a>
			</td>
		</tr>
	</c:forEach>
</table>
