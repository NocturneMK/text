<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="images/jquery.js"></script>
<script type="text/javascript">
/* 登录，用于演示Ajax向后台传数据 */
function login(){
	var name=$("#name").val();
	var pwd=$("#pwd").val();
	$.ajax({
		url:"${pageContext.request.contextPath}/login.action",
		type:"POST",
		data:{"username":name,"pwd":pwd},
		dataType:"json",
		success:function(data){
			alert(data.sName);
		}
	})
}
</script>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath }/film/list.action">
	<div>账号：<input type="text" name="name" id="name"></div>
	<div>密码：<input type="password" name="pwd" id="pwd"></div>
	<input type="submit" onclick="login();" value="登录">
</form>

</body>
</html>