<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="${path}/resources/css/style.css">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Add New Post</h1>
<form action="addok" method="post">
<table id="list">
<tr><td>Name:</td><td><input type="text" name="animalName"/></td></tr>
<tr><td>Age:</td><td><input type="text" name="age"/></td></tr>
<tr><td>Gender:</td><td><input type="text" name="gender"/></td></tr>
<tr><td>Information:</td><td><textarea cols="50" rows="5" name="information"></textarea></td></tr>
<tr><td>Phonenumber:</td><td><input type="text" name="phonenumber"/></td></tr>
<tr><td>Address:</td><td><input type="text" name="address"/></td></tr>
</table>
<button type="button" onclick="location.href='list'">게시판으로 이동</button>
<button type="submit"> 등록하기 </button>

</form>

</body>
</html>