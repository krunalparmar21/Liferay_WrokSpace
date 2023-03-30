<%@ page import="com.liferay.portal.kernel.dao.search.DisplayTerms" %>
<%@include file="../init.jsp"%>
<%
    String keywords = ParamUtil.getString(request, "keywords");
    long guestbookId = ParamUtil.getLong(renderRequest, "guestbookId");
%>

keywords: ${keywords}
<liferay-portlet:renderURL varImpl="searchURL">
    <portlet:param name="mvcPath"
                   value="/guestbookwebportlet/view_search.jsp" />
</liferay-portlet:renderURL>

<portlet:renderURL var="viewURL">
    <portlet:param
            name="mvcPath"
            value="/guestbookwebportlet/view.jsp"
    />
</portlet:renderURL>

<aui:form action="<%= searchURL %>" name="fm">
    <liferay-portlet:renderURLParams varImpl="searchURL" />

    <liferay-ui:header
            backURL="<%= viewURL.toString() %>"
            title="search"
    />
    <div class="row">
        <div class="col-md-8">
            <aui:input inlineLabel="left" label="" name="keywords" placeholder="search-entries" size="256" />
        </div>

        <div class="col-md-4">
            <aui:button type="submit" value="search" />
        </div>
    </div>
</aui:form>


<%
    SearchContext searchContext = SearchContextFactory.getInstance(request);


    System.out.println("keywords "+keywords);

    searchContext.setKeywords(keywords);
    searchContext.setAttribute("paginationType", "more");
    searchContext.setStart(0);
    searchContext.setEnd(10);

    System.out.println("1");
    Indexer<Entry> indexer = IndexerRegistryUtil.getIndexer(Entry.class);
    System.out.println("indexwr"+indexer);
    Hits hits = indexer.search(searchContext);

    List<Entry> entries = new ArrayList<Entry>();

    for (int i = 0; i < hits.getDocs().length; i++) {
        Document doc = hits.doc(i);

        long entryId = GetterUtil
                .getLong(doc.get(Field.ENTRY_CLASS_PK));

        Entry entry = null;

        try {
            entry = EntryLocalServiceUtil.getEntry(entryId);
        } catch (PortalException pe) {
            _log.error(pe.getLocalizedMessage());
        } catch (SystemException se) {
            _log.error(se.getLocalizedMessage());
        }

        entries.add(entry);
        System.out.println("entries : "+entry.getName());
    }
    System.out.println("3");

    List<Guestbook> guestbooks = GuestbookLocalServiceUtil.getGuestbooks(scopeGroupId);

    Map<String, String> guestbookMap = new HashMap<String, String>();

    for (Guestbook guestbook : guestbooks) {
        guestbookMap.put(Long.toString(guestbook.getGuestbookId()), guestbook.getName());
    }
%>

<aui:button-row cssClass="guestbook-buttons">

    <portlet:renderURL var="addEntryURL">
        <portlet:param name="mvcPath" value="/guestbookwebportlet/edit_entry.jsp" />
        <portlet:param name="guestbookId"
                       value="<%=String.valueOf(guestbookId)%>" />
    </portlet:renderURL>

    <aui:button onClick="<%=addEntryURL.toString()%>" value="Add Entry"/>

</aui:button-row>

<liferay-ui:search-container delta="10"
                             emptyResultsMessage="no-entries-were-found"
                             total="<%= entries.size() %>">
    <liferay-ui:search-container-results
            results="<%= entries %>"
    />
    <liferay-ui:search-container-row
            className="com.liferay.docs.guestbook.model.Entry"
            keyProperty="entryId" modelVar="entry" escapedModel="<%=true%>">
        <%--        <liferay-ui:search-container-column-text name="guestbook"--%>
        <%--                                                 value="<%=guestbookMap.get(Long.toString(entry.getGuestbookId()))%>" />--%>

        <%--        <liferay-ui:search-container-column-text property="message" />--%>

        <%--        <liferay-ui:search-container-column-text property="name" />--%>

        <%--        <liferay-ui:search-container-column-jsp--%>
        <%--                path="/guestbook/entry_actions.jsp"--%>
        <%--                align="right" />--%>
        <liferay-ui:search-container-column-text property="name" />

        <liferay-ui:search-container-column-text property="email" />

        <liferay-ui:search-container-column-text property="message" />


    </liferay-ui:search-container-row>
    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<%!
    private static Log _log = LogFactoryUtil.getLog("html.guestbookwebportlet.view_search_jsp");
%>