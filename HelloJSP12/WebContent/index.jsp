<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ page import="java.util.*"
contentType="text/html; charset=euc-jp" %>
<%
GregorianCalendar calendar=new GregorianCalendar();
int nowHour=calendar.get(Calendar.HOUR_OF_DAY);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>時刻に応じた挨拶を表示する例</title>
</head>
<body>
<p>--時刻に応じた挨拶を表示する例--</p>
<p>
現在は<strong><%=nowHour %>時</strong>です。<br>
<strong>
<%if(nowHour>=4 && nowHour<7){ %>
まだ朝早いですね
<% } else if(nowHour>=7 && nowHour<12){ %>
おはようございます
<% } else if(nowHour>=12 && nowHour<15){ %>
お昼ですね
<% } else if(nowHour>=15 && nowHour<18){ %>
もう夕方になりました
<% }else if(nowHour>=18 && nowHour<22){ %>
夜になりましたね
<%}else if(nowHour>=22 || nowHour<4){ %>
深夜です
<%} %>
</strong>
</body>
</html>