 <%@ page import="java.util.*"
contentType="text/html; charset=euc-jp" %>
<%
GregorianCalendar calendar=new GregorianCalendar();
int nowTime=calendar.get(Calendar.HOUR_OF_DAY);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>時刻に応じた挨拶を表示する例</title>
</head>
<body>
<p>--時刻に応じた挨拶を表示する例--</p>
<p>
現在は<strong><%=nowTime %>時</strong>です。<br>
<strong>
<%if(nowTime>=4 && nowTime<7){ %>
まだ朝早いですね
<% } else if(nowTime>=7 && nowTime<12){ %>
おはようございます
<% } else if(nowTime>=12 && nowTime<15){ %>
お昼ですね
<% } else if(nowTime>=15 && nowTime<18){ %>
もう夕方になりました
<% } else if(nowTime>=18 && nowTime<22){ %>
夜になりましたね
<% } else if(nowTime>=22 || nowTime<4){ %>
深夜です
<%} %>
</strong>
</body>
</html>