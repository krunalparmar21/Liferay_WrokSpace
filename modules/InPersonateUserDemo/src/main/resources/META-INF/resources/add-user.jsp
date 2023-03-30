<%@ include file="init.jsp"%>
<portlet:defineObjects />

<portlet:actionURL name="addUser" var="addStudentActionURL"/>


<h2>Add Student Form here !</h2>

<aui:form action="<%=addStudentActionURL %>" name="studentForm" method="POST">
	<aui:input name="screenName" >
		<aui:validator name="required"/>
		<aui:validator name="alphanum"/>
	</aui:input>

	<aui:input name="firstName" >
		<aui:validator name="required"/>
		<aui:validator name="alpha"/>
	</aui:input>

	<aui:input name="lastName" >
		<aui:validator name="required"/>
		<aui:validator name="alpha"/>
	</aui:input>

	<aui:input name="contactId" >
		<aui:validator name="required"/>
		<aui:validator name="string"/>
	</aui:input>

	<aui:input name="emailAddress" >
		<aui:validator name="required"/>
		<aui:validator name="string"/>
	</aui:input>


	<aui:button type="submit" name="" value="Submit"></aui:button>
</aui:form>
