<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
		 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<%--	<link rel="stylesheet" href="${path}/resources/css/style.css">--%>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Form</title>
</head>
<body>

<h1>수정하는 페이지</h1>
<%--@elvariable id="boardVO" type="java"--%>
<form:form modelAttribute="u"  method="post" action="../editok">
<form:hidden path="animalId"/>
<table id="list">
	<tr><th>Name</th><td><form:input path="animalName" /></td></tr>
	<tr><th>Age</th><td><form:input path="age" /></td></tr>
	<tr><th>Information</th><td><form:textarea cols="50" rows="5" path="information" /></td></tr>
	<tr><th>Gender</th><td><form:input path="gender" /></td></tr>
</table>
	<input type="submit" value="수정하기" />
	<input type="button" value="취소하기" onclick="history.back()" />
</form:form>

</body>
</html>