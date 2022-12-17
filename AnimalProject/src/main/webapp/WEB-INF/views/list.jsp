<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<%--<link rel="stylesheet" href="${path}/resources/css/style.css">--%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>free board</title>
<script>
	function delete_ok(id){
		const a = confirm("정말로 삭제하겠습니까?");
		if(a) location.href='deleteok/' + id;
	}
	function logout(){
		const check = confirm("정말 로그아웃하시겠습니까?");
		if(check) location.href="../login/logout";
	}
</script>
</head>
<body>
<h1>자유게시판</h1>
입력 정보 뜨도록 해두었는데 페이지 틀 잡아서 틀에 맞게 정보 뜨도록 꾸며주세용!
<c:set var="id" value="#{login.userid}" />
<p><b>${id}</b>님, 환영합니다🎉</p>
<a href="javascript:logout()">로그아웃</a>
<table id="list" width="90%">
<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Age</th>
	<th>Gender</th>
	<th>Information</th>
	<th>Address</th>
	<th>Regdate</th>
	<th>Edit</th>
	<th>Delete</th>
</tr>

<c:forEach items="${list}" var="u">
	<tr>
		<td>${u.animalId}</td>
		<td>${u.animalName}</td>
		<td>${u.age}</td>
		<td>${u.gender}</td>
		<td>${u.information}</td>
		<td>${u.address}</td>
		<td>${u.regdate}</td>
		<td><a href="editform/${u.animalId}">수정</a></td>
		<td><a href="javascript:delete_ok('${u.animalId}')">삭제</a></td>
	</tr>
</c:forEach>
</table>
<br/><button type="button" onclick="location.href='add'">새 글 추가하기</button></a>
</body>
</html>