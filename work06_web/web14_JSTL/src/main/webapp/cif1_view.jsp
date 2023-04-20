<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>jstl if...사용</h2>
<c:if test="${param.NUM=='100'}">
	<b>오늘은 100만원이 입금되었습니다.</b><br>
</c:if>
<c:if test="${param.NUM=='200'}">
	<b>오늘은 200만원이 입금되었습니다.</b><br>
</c:if>
</body>
</html>