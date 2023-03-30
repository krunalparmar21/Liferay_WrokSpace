<%@ include file="/init.jsp" %>

<p>
	<b><liferay-ui:message key="namespacedemo.caption"/></b>
</p>

<portlet:renderURL var="addStudentRenderURL">
	<portlet:param name="mvcPath" value="/add-student.jsp"/>
</portlet:renderURL>

<div class="mb-5">
	<a href="<%= addStudentRenderURL %>" class="btn  btn-primary btn-default">
		<i class="glyphicon glyphicon-plus"></i> Add Student
	</a>
</div>