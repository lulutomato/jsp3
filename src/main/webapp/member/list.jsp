<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="assets/css/style.css">
</head>
<body>
<%@ include file="../header.jsp" %>
<main>
<h3>고객 전체 조회</h3>
 <hr>
 <ul>
 			<li>고객 ID</li>
			<li>이름</li>
			<li>이메일</li>
			<li>나이</li>
			<li>등록 일시</li>
	</ul>		
 <c:forEach items="${list}" var="dto" varStatus="status">
	<li>
	<ul class="row">
	<!--list 이름의 애트리뷰트를 대상으로 합니다. : 애트리뷰트 저장은 서블릿에서 합니다.  -->
		
		<li><c:out value = "${fn:toUpperCase(dto.customId)}"/></li> <!--function은 el 안에다가 쓴다  -->
		
		<li><c:out value = "${dto.name }"/></li>
		<li><c:out value = "${dto.email }"/></li>
		<li><c:out value = "${dto.age }"/></li>
		<li><fmt:formatDate value = "${dto.reg_date }" pattern="yyyy-MM-dd a hh:mm:ss"/></li><!--날짜 fmt -->
	</ul>
</li>
</c:forEach>
</main>
</body>
</html>