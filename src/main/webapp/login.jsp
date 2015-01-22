<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="UI_div.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="javascript.js" >
</script>
</head>
<body>
<div class="top">
<span>欢迎</span>
<ul>
<li>
用户版|
</li>
<li>
商家版
</li>
</ul>
</div>
<div class="center" id="center">
<div class="left">
<span> helloworld</span>
</div>
<div class="right" id="right" >
				<span>账号:</span>
				<input type="text" id="idTXT" name="userid" onfocus="if(this.value=='请输入账号!')this.value=''"> <br>
				<span>密码:</span>
				<input type="text" id="pwdTXT" name="userpassword" onfocus="if(this.value=='请输入密码!')this.value=''" onkeydown="keydown(event)">
				<input type="button" id="input" value="登陆" onclick="loginXML(idTXT.value,pwdTXT.value)" >
				<input type="button" value="testjson"  onclick="loginApp(idTXT.value,pwdTXT.value)" >
</div>
</div>
<div class="footer">
<div class="content_width">
<ul class="footer_link">
<li>
关于我们
</li>
<li>
联系我们
</li>
</ul>
</div>
</div>
</body>
</html>