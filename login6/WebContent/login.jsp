<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
<link rel="stylesheet" href="./css/struts.css">
</head>
<body>
	<fieldset>
		<h1>Sign In</h1>
		<div class="form_box">
		<form action="LoginAction">
		<div>
			<img alt="test" src="./img/user_image.png" width="20" height="20" />
			<input type="text" name="name"	class="form-control" placeholder="名前を入力して下さい" />
		</div>
		<div>
			<img alt="test" src="./img/pass_image.png" width="20" height="20"/>
			<input type="password" name="password" class="form-control" placeholder="パスワードを入力して下さい" />
		</div>

		<div class="btn">
			<input type="submit" value="Enter" class="enterbtn"/>
		</div>

		</form>
		</div>
	</fieldset>
</body>
</html>