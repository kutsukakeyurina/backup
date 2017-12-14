<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>Home画面</title>
<!--ここから：ダウンロードしたファイル-->
<link rel="stylesheet" type="text/css" href="css/sm-core-css.css">
<link rel="stylesheet" type="text/css" href="css/sm-blue.css">
<!-- ここまで：ダウンロードしたファイル -->
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

body {
	margin: 0;
	padding: 0;
	line-height: 1.6;
	letter-spacing: 1px;
	font-family: Comic Sans MS;
	font-size: 12px;
	color: #333;
	background: #fff;
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

/* ========TEMPLATE LAYOUT======== */
#top {
	width: 480px;
	margin-left:10px;


}

#header {
	width: 100%;
	height: 80px;
	background-color: #b7b7ff;
}
/*----------box1-----------*/
.box1 {
background-color:#8484ff ;

}




.menu ul {float:right;
	margin: 0;
	padding: 0;
	list-style: none;

}
.menu li {
float:left;
list-style:none;
padding-right:20px;
color:white;
font-size:18px;

}



/*--------------------------------------------------*/

#main {clear:both;
	width: 100%;
	height: 500px;
	text-align: center;
}

#footer {
	margin-bottom: 0;
	width: 100%;
	height: 80px;
	background-color: #b7b7ff;
	clear: both;
	position: fixed;
	bottom: 0;
	width: 100%;
	height: 100px;
}

.button_size {
	width: 20%;
	margin: 0 auto;
}
</style>
</head>
<body>
	<div id="header">
		<div id="top">
		<h2>WEB GOLF SHOP</h2>
		</div>
		<div id="pr"></div>

		<!-- Sample menu definition -->
  <ul id="main-menu" class="sm sm-blue">
    <li><a href="http://www.smartmenus.org/">Home</a></li>

    <li><a href="http://www.smartmenus.org/download/">Style</a></li>
    <li><a href="BuyItemAction">Shopping</a>

    </li>
    <!---------------- マイページ(ログインページ)へ -------------------------->
    <!--<s:form action="HomeAction">-->
    <li><a href="HomeAction"> MyPage</a></li>
   <!-- </s:form> -->
    <!---------------------- end------------------------ -->


    <!-- ---------------予約-------------------------- -->
    <li><a href="HomeAction">Reserve</a></li>
      <!-- -----------------end------------------------ -->

  </ul>

	<!--挿入部end -------------------------------------------------- -->

		</div>
<!-- 	<div id="main">
		<div>
			<s:form action="HomeAction">-->
				<!-- ログインボタン -->
		<!-- 		<input type="submit" class="float button_size" value="商品購入">

			</s:form>
		</div>
	</div>-->
	<div id="footer">
		<div id="pr"></div>
	</div>


	<!--googleのCDN（ネットワーク経由でコンテンツを提供するサービス）よりjqueryをロード-->
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
<!--ダウンロードしたファイル-->
<script type="text/javascript" src="js/jquery.smartmenus.js"></script>
<!--javascript追記-->
<script type="text/javascript">
 $(function() {
  $('#main-menu').smartmenus({
   subMenusSubOffsetX: 1,
   subMenusSubOffsetY: -8
  });
 });


</script>
</body>
</html>