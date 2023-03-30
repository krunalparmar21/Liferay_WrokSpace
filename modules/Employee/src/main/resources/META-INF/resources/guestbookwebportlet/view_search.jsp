<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>
<%@include file="../init.jsp"%>

<%
    String keywords = ParamUtil.getString(request, "keywords");
    long guestbookId = ParamUtil.getLong(request, "empId");
%>