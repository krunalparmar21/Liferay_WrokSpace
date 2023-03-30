<%@ taglib prefix="liferay-util" uri="http://liferay.com/tld/util" %>
<%@ page import="com.Employee.model.emp" %>
<%@ page import="java.util.List" %>
<%@ page import="com.Employee.service.empLocalServiceUtil" %>
<%@ page import="com.liferay.portal.kernel.util.PortalUtil" %>
<%@ page import="com.liferay.batch.engine.pagination.Pagination" %>
<%@ page import="com.liferay.portal.kernel.dao.search.SearchPaginationUtil" %>
<%@ include file="/init.jsp" %>

<liferay-util:dynamic-include key="employee#/view.jsp#pre" />

<liferay-util:dynamic-include key="employee#/view.jsp#post" />


<p>
	<b><liferay-ui:message key="employee.caption"/></b>
</p>
<%
	String currentURL = PortalUtil.getCurrentURL(request);
	//PortletURL portletURL = renderResponse.createRenderURL();
	List<emp> list = empLocalServiceUtil.getemps(0,empLocalServiceUtil.getempsCount());

	//long empId = Long.valueOf((Long) renderRequest.getAttribute("guestbookId"));

%>


<portlet:renderURL var="addStudentRenderURL">
	<portlet:param name="mvcPath" value="/add-student.jsp"/>
</portlet:renderURL>

<div class="mb-5">
	<a href="<%= addStudentRenderURL %>" class="btn  btn-primary btn-default">
		<i class="glyphicon glyphicon-plus"></i> Add Student
	</a>
</div>



<liferay-portlet:renderURL varImpl="searchURL">
	<portlet:param name="mvcPath"
				   value="/guestbook-web/view_search.jsp" />
</liferay-portlet:renderURL>

<portlet:renderURL var="viewURL">
	<portlet:param
			name="mvcPath"
			value="/view.jsp"
	/>
</portlet:renderURL>
<aui:form action="<%= searchURL %>" name="fm">
	<liferay-portlet:renderURLParams varImpl="searchURL" />

	<div class="row">
		<div class="col-md-8">
			<aui:input inlineLabel="left" label="" name="keywords" placeholder="search-entries" size="256" />
		</div>

		<div class="col-md-4">
			<aui:button type="submit" value="search" />
		</div>
	</div>
</aui:form>





<liferay-ui:search-container total="<%=empLocalServiceUtil.getempsCount()%>" emptyResultsMessage="Sorry,There are no record to sisplay." >
	<liferay-ui:search-container-results
			results= "<%=empLocalServiceUtil.getemps(searchContainer.getStart(),searchContainer.getEnd())%>"
	/>
	<liferay-ui:search-container-row className="com.Employee.model.emp" modelVar="aemp">


		<liferay-ui:search-container-column-text property="enrollmentNo" name="Enrollment NO" />
		<liferay-ui:search-container-column-text property="firstName" name="First Name" />
		<liferay-ui:search-container-column-text property="lastName" name="Last Name"/>
		<liferay-ui:search-container-column-text property="contactNo" name="Contact No"/>
		<liferay-ui:search-container-column-text property="city" name="City"/>


		<portlet:renderURL var="updateStudentRenderURL">
			<portlet:param name="mvcPath" value="/update-student.jsp"/>
			<portlet:param name="enrollmentNo" value="${aemp.enrollmentNo}"/>
			<portlet:param name="firstName" value="${aemp.firstName}"/>
			<portlet:param name="lastName" value="${aemp.lastName}"/>
			<portlet:param name="contactNo" value="${aemp.contactNo}"/>
			<portlet:param name="city" value="${aemp.city}"/>
			<portlet:param name="empId" value="${aemp.empId}"/>
		</portlet:renderURL>
		<liferay-ui:search-container-column-text name="Update Record" value="update"  href="${updateStudentRenderURL}"/>

		<portlet:actionURL name="deleteStudent" var="deleteStudentActionURL" >
			<portlet:param name="empId" value="${aemp.getEmpId()}"/>
		</portlet:actionURL>
		<liferay-ui:search-container-column-text name="Delete Record" value="Delete"  href="${deleteStudentActionURL}"/>

	</liferay-ui:search-container-row>
	<liferay-ui:search-iterator markupView="lexicon" />

</liferay-ui:search-container>