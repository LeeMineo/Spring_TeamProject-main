<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>Insert title here</title>
  <style>
    img,label { display:inline-block;}
    label{ width:130px}
    button{ background-color:blue; color:white; font-size:15px}
  </style>
</head>
<body>
<div style ='width:100%; text-align:center; padding-top:100px'>
  <img src='${pageContext.request.contextPath}/resources/img/dog.png' height="250">
  <br>
  <b>동물 분양 센터로 이동 </b>
  <br>
  다음 페이지(list)랑 자연스럽게 연결되도록 디자인해주세용!
  <br>
  <form method="post" action="loginOk">
    <div><label> User ID: </label>
      <input type='text' name='userid'/>
    </div>
    <div><label>Password: </label>
      <input type='password' name='password'/>
    </div>
    <button type='submit'>login</button>
  </form>
</div>
</body>
</html>
