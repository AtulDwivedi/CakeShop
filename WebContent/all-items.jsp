<%@ taglib uri="/WEB-INF/c.tld" prefix="c"%>
<c:forEach var="item" items="${requestScope.items}">
${item }
<br />
</c:forEach>