<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"  import="RIMS.entities.User"   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body onload="test();">
<h1>欢迎<% User u = (User)request.getAttribute("u");
out.println(u.getUsername());
 %>!</h1>
<h2 id="test">
</h2>
</body>
</html>