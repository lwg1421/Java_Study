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
<h2>jstl if...���</h2>
<c:if test="${param.NUM=='100'}">
	<b>������ 100������ �ԱݵǾ����ϴ�.</b><br>
</c:if>
<c:if test="${param.NUM=='200'}">
	<b>������ 200������ �ԱݵǾ����ϴ�.</b><br>
</c:if>
</body>
</html>