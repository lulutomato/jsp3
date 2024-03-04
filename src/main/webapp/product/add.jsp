<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"    href="assets/css/register.css" >
</head>
<body>
<%@ include file="../header.jsp" %>
<div class="contents-wrap">
  <h3 style="text-align:center;">상품 등록</h3>
  <hr>
          <form action="" method="post">
            <ul class="join-wrap" >
              <li>상품코드</li>
              <li>
                <input name="pcode" type="text"
                  placeholder="상품코드를 입력해 주세요." />
              </li>
             
              <li>카테고리</li>
              <li><input name="category" type="text" placeholder="카테고리" /></li>
              <li>상품명</li>
              <li><input name="pname" type="text" placeholder="상품명을 입력해 주세요." /></li>
              <li>가격</li>
              <li><input name="price" type="number" placeholder="가격" /></li>
            </ul>
            <button class="join-btn">상품등록</button>
          </form>
        </div>
</body>
</html>