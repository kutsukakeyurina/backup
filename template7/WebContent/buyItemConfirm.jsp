<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>BuyItemConfirm画面</title>
<style type="text/css">
/* ========TAG LAYOUT======== */
body {
	margin: 0;
	padding: 0;
	line-height: 1.6;
	letter-spacing: 1px;
	font-family: Verdana, Helvetica, sans-serif;
	font-size: 12px;
	color: #333;
	background: #fff;
}

table {
	text-align: center;
	margin: 0 auto;
}

/* ========ID LAYOUT======== */
#top {
	width: 780px;
	margin: 30px auto;
	border: 1px solid #333;
}

#header {
	width: 100%;
	height: 80px;
	background-color: black;
}

#main {
	width: 100%;
	height: 500px;
	text-align: center;
}

#footer {
	width: 100%;
	height: 80px;
	background-color: black;
	clear: both;
}
</style>
</head>
<body>
	<div id="header">
		<div id="pr"></div>
		<div id="main">
			<div id="top">
				<p>BuyItemconfirm</p>
			</div>
			<div>
				<s:form>
					<tr>
						<td>商品名</td>
						<td><s:property value="session.buyItem_name" /></td>
					</tr>
					<tr>
						<td>値段</td>
						<td><s:property value="session.total_price" /><span>円</span></td>
					</tr>
					<tr>
						<td>支払い方法</td>
						<td><s:property value="session.count" /><span>個</span></td>
					</tr>
					<tr>
						<td><br></td>
					</tr>
					<tr>
						<td><input type="button" value="戻る"
							onclick="submitAction('HomeAction')" /></td>
						<td><input type="button" value="完了"
							onclick="submitAction('BuyItemConfirmAction')" /></td>
					</tr>
				</s:form>
			</div>
		</div>
		<div id="footer">
			<div id="pr"></div>
		</div>
	</div>
</body>
</html>