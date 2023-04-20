<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%-- 원래는 서블릿으로 --%>
<!-- 원래는 서블릿으로 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<b>1. JSP 기본 Element로 받아오기</b><br>
<%= request.getAttribute("RESULT1") %><br>
<%= session.getAttribute("RESULT2") %><br>

<hr>
<b>2. JSP EL로 받아오기</b><br>
1. ${requestScope.RESULT1}<br>
2. ${sessionScope.RESULT2}<br>
1. ${RESULT1+100}<br>
2. ${RESULT2}<br>
</body>
</html>