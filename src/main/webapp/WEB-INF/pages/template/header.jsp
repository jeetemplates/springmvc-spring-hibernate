<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
<link
	href="${pageContext.request.contextPath}/resources/css/common-style.css"
	rel="stylesheet" type="text/css" />
<title>Spring MVC template</title>
</head>
<body>
	<div id="page">
		<div id="header">
			<h1><spring:message code="header"></spring:message></h1>
			<a href="?locale=en">en</a> | <a href="?locale=fr">fr</a> 
		</div>