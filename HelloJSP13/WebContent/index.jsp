 <%@ page import="java.util.*"
contentType="text/html; charset=euc-jp" %>
<%
GregorianCalendar calendar=new GregorianCalendar();
int nowTime=calendar.get(Calendar.HOUR_OF_DAY);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>����˱�����������ɽ��������</title>
</head>
<body>
<p>--����˱�����������ɽ��������--</p>
<p>
���ߤ�<strong><%=nowTime %>��</strong>�Ǥ���<br>
<strong>
<%if(nowTime>=4 && nowTime<7){ %>
�ޤ�ī�ᤤ�Ǥ���
<% } else if(nowTime>=7 && nowTime<12){ %>
���Ϥ褦�������ޤ�
<% } else if(nowTime>=12 && nowTime<15){ %>
����Ǥ���
<% } else if(nowTime>=15 && nowTime<18){ %>
�⤦ͼ���ˤʤ�ޤ���
<% } else if(nowTime>=18 && nowTime<22){ %>
��ˤʤ�ޤ�����
<% } else if(nowTime>=22 || nowTime<4){ %>
����Ǥ�
<%} %>
</strong>
</body>
</html>