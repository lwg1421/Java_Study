<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>�������� ����� ��� ��Ű�� �޾ƿɴϴ�.</h2>
<!-- Scriptlet Element �ȿ��� �ڹ� �ڵ常 �� �� �ִ�. HTML �ڵ�� �ƿ� ������. -->
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