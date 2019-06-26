<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <title>添加货品</title>
    <script src="${pageContext.request.contextPath}/WEB-INF/resources/js/jquery-1.8.3.js"></script>
    <script type="text/javascript"></script>
</head>
<body>
<form action="${pageContext.request.contextPath}/warehouse/addwaregoods" method="post"><%--//添加或修改完之后返回的页面--%>
   
    货品名称<input id="commoditName" type="text" value="${waregoods.commoditName}" name="commoditName"><br>
   数量<input id="amount" type="text" value="${waregoods.amount}" name="amount"><br>
    <input type="submit"value="确认添加">
</form>
</body>
</html>
