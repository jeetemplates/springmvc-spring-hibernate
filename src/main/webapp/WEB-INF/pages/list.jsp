<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<jsp:include page="/WEB-INF/pages/template/header.jsp"></jsp:include>

<div id="content">
	<h3>
		<spring:message code="welcome.content.title" />
	</h3>
	<table>
		<tbody>
			<c:forEach items="${list}" var="hello">
				<tr>
					<td><c:out value="${hello.firstName}" /></td>
					<td><c:out value="${hello.lastName}" /></td>
					<td><c:out value="${hello.email}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<br /> <a href="<spring:url value="/pages/home" />"> <spring:message
			code="welcome.content.link_home" />
	</a>

</div>

<jsp:include page="/WEB-INF/pages/template/footer.jsp"></jsp:include>
