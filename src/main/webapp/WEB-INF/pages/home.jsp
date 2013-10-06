<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<jsp:include page="/WEB-INF/pages/template/header.jsp"></jsp:include>

<div id="content">
	<h3>
		<spring:message code="home.content.title" />
	</h3>
	<!-- ##################################################### -->
	<!-- #################### Simple form #################### -->
	<!-- ##################################################### -->
	<em><spring:message code="home.content.simple_form" /></em>
	<br/>
	<br/>
	<spring:url value="/pages/addHello" var="addHelloUrl"/>
	<form:form id="simple_form" commandName="newHello" method="POST" action="${addHelloUrl}">
		<form:label path="firstName">
			<spring:message code="home.content.form.first_name"/> :
		</form:label>
		<form:input id="first_name" path="firstName" />
		<form:errors path="firstName"></form:errors>
		<br />
		<form:label path="lastName">
			<spring:message code="home.content.form.last_name"/> :
		</form:label>
		<form:input id="last_name" path="lastName"/>
		<form:errors path="lastName"></form:errors>
		<br />
		<form:label path="email">
			<spring:message code="home.content.form.email"/> :
		</form:label>
		<form:input id="email" path="email"/>
		<form:errors path="email"></form:errors>
		<br />
		<br />
		<form:button>
			<spring:message code="home.content.form.add"/> 
		</form:button>
	</form:form>
	<br />
	<!-- ########################################################## -->
	<!-- #################### Handle exception #################### -->
	<!-- ########################################################## -->
	<em><spring:message code="home.content.handle_exception" /></em>
	<br/>
	<br/>
	<spring:url value="/pages/exception" var="exceptionUrl" />
	<a href="${exceptionUrl}"><spring:message code="home.content.form.throw_exception" /></a>
	<br/>
</div>

<jsp:include page="/WEB-INF/pages/template/footer.jsp"></jsp:include>
