<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <style>
   #top {
     width:1000px;
     height:100px;
     background:red;
     margin:auto;
   }
   #bottom {
     width:1000px;
     height:100px;
     background:blue;
     margin:auto;
   }
 </style>
</head>
 <decorator:head/>
<body>
  <div id="top">
  	<menu>
  		<li>농산물</li>
  		<li>수산물</li>
  		<li>축산물</li>
  		<li>기타</li>
  		<li>이벤트</li>
  	</menu>
  	<div>
  		<span id="join"><a href="../member/join">회원가입</a></span>
  	</div>
  </div>
  
  <decorator:body/>
  
  <!-- 문서의 내용이 출력 -->
  
  <div id="bottom">bottom입니다.</div>
</body>
</html>