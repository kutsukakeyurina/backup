<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta  charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! static int countA=0; %>
<%
int countB=0;
countA++;
countB++;
%>

<p>宣言による変数countA=<%=countA %></p>
<p>スクリプトレットによる変数countB=<%=countB %></p>
</body>
</html>