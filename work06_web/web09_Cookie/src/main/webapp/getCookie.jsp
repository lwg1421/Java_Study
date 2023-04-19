<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>브라우저에 저장된 모든 쿠키를 받아옵니다.</h2>
<!-- Scriptlet Element 안에는 자바 코드만 들어갈 수 있다. HTML 코드는 아예 못들어간다. -->
<%
	Cookie[] sc = request.getCookies();
	for(Cookie c : sc){
%>
	<li>Name <%= c.getName() %> </li>
	<li>Value <%= c.getValue() %> </li>
<%		
	
	}

%>
</body>
</html>