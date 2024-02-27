<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	ul{
	list-style:none; padding: 20px; display:flex;
	border-bottom: 3px solid gray;
	}
	
	li{  padding :20px;
	}
	a{   text-decoration:none;
	}
</style>
</head>
<body>
<ul>
<li><a href="<%=request.getContextPath()%>"><span>HOME</span></a></li>
<li><a href="${pageContext.request.contextPath }/product/searchlist">상품목록(검색)</a></li>
<li><a href="${pageContext.request.contextPath }/product/add">상품등록</a></li>
<li><a href="${pageContext.request.contextPath }/member/register">회원등록</a></li>
<li><a href="${pageContext.request.contextPath }/member/list">회원목록</a></li>


</ul>

</body>
</html>