<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<meta charset="utf-8">
<title>Login画面</title>
<style type="text/css">
@import "bourbon";

@import
	url(https://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,700)
	;

@import
	url(https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css)
	;

@import
	url(https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css)
	;

/* ========TAG LAYOUT======== */
body {
	margin: 0;
	padding: 0;
	line-height: 1.6;
	letter-spacing: 1px;
	font-family:Comic Sans MS;
	font-size: 12px;
	color: #333;
	background: #fff;
	background-color: #cab8d9;
}

table {
	text-align: center;
	margin: 0 auto;
}

h2 {
	font-size: 3em;
	font-weight: 400;

	display: inline-block;
	padding-bottom: 5px;
}

form { .input-group { border-bottom:1pxsolidrgba(255, 255, 255, 0.1);
	border-top: 1px solid rgba(255, 255, 255, 0.1);
	&:
	last-of-type
	{
	border-top
	:
	none;

}

.input-group {
    position: relative;
    display: table;
    border-collapse: separate;
    width: 40%;
    margin: auto;
}

span {
	background: transparent;
	min-width: 53px;
	border: none; i { font-size : 1.5em;
	color: rgba(255, 255, 255, 0.2);
}

}
}
input.form-control { @include normalize-input;
	padding: 10px;
	font-size: 1.6em;
	width: 100%;
	background: transparent;
	color: $input-color;
	&:
	focus
	{
	border
	:
	none;
}

}


}
}
}

/* ========ID LAYOUT======== */
#top {
	width: 780px;
	margin: 30px auto;
}

#header {
	width: 100%;
	height: 80px;
	background-color: #4d4398;
}

#main {
	width: 100%;
	height: 500px;
	text-align: center;
}

#footer {
    margin-bottom: 0;
    /* width: 100%; */
    /* height: 80px; */
    background-color: #4d4398;
    clear: both;
    position: fixed;
    bottom: 0;
    width: 100%;
    height: 100px;
}

.input_size {
	width: 40%;
    margin: 0 auto;
}

.button_size {
	width:20%;
    margin: 0 auto;
}

</style>
</head>
<body>
	<div id="header">
		<div id="pr"></div>
	</div>
	<div id="main">
		<div id="top">
			<h2>Sign in</h2>
		</div>
		<div>



			<form action="LoginAction">

				<!-- アドレス入力 -->
				<div class="input-group input-group-lg input_size">
					<span class="input-group-addon"><i class="fa fa-user"></i></span>
					<input type="text" name="loginUserId" value="internous" class="form-control" placeholder="Username or email" />
				</div>


				<!-- パスワード入力 -->
				<div class="input-group input-group-lg input_size">
					<span class="input-group-addon"><i class="fa fa-lock"></i></span>
					<input type="password" class="form-control" placeholder="Password" value="internous01" name="loginPassword" />
				</div>


				<!-- ログインボタン -->
				<input type="submit" class="float button_size" value="Login">

			</form>


			<br />
			<div>
				<span>新規ユーザー登録は<a href='<s:url action="UserCreateAction"/>'>こちら</a></span>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr"></div>
	</div>
</body>
</html>