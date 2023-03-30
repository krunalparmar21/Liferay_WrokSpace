
<%@ include file="init.jsp"%>
<portlet:defineObjects/>

<portlet:actionURL name="updateUser" var="updateStudentActionURL"/>

<aui:form action="<%=updateStudentActionURL%>" name="studentForm" method="POST"/>

<%
	String userId = renderRequest.getParameter("userId");
	String screenName = renderRequest.getParameter("screenName");
	String firstName = renderRequest.getParameter("firstName");
	String lastName = renderRequest.getParameter("lastName");
	String emailAddress = renderRequest.getParameter("emailAddress");

%>
<aui:form action="<%= updateStudentActionURL %>" method="post" >
	<aui:input name="userId" type="hidden" value="<%=Long.parseLong(userId)%>"/>
	<aui:input name="screenName" type="text" value="${student.screenName}"/>
	<aui:input name="firstName" type="text" value="${student.firstName}"/>
	<aui:input name="lastName" type="text" value="${student.lastName}" />
	<aui:input name="emailAddress" type="text" value="${student.emailAddress}" />
	<aui:input type="submit" value="Update" name="update"></aui:input>
</aui:form>
