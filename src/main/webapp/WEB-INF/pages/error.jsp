<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<jsp:include page="/WEB-INF/pages/template/header.jsp"></jsp:include>

<div id="content">
	<h3>
		<spring:message code="error.content.title" />
	</h3>
	<spring:message code="error.content.error" />
	<spring:url value="/pages/home" var="homeUrl"></spring:url>
	<a href="${homeUrl}"><spring:message code="error.content.link_home" /></a>
	<br />
	<br />
	<spring:message code="error.content.error_code" /> : <c:out value="${errorCode}" />
	<br />
	<br />
	<spring:message code="error.content.error_message" /> : <c:out value="${errorMessage}" />
</div>

<jsp:include page="/WEB-INF/pages/template/footer.jsp"></jsp:include>
