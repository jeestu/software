<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <title>添加商品</title>
    <script src="${pageContext.request.contextPath}/WEB-INF/resources/js/jquery-1.8.3.js"></script>
    <script type="text/javascript"></script>
</head>
<body>
<form action="${pageContext.request.contextPath}/commodity/addcommodity" method="post"><%--//添加或修改完之后返回的页面--%>
   
   种类:<input id="commoditySort" type="text" value="${commodity.commoditySort}" name="commoditySort"><br>
   商品名:<input id="commodityName" type="text" value="${commodity.commodityName}" name="commodityName"><br>
 价格:<input id="commodityPrice" type="text" value="${commodity.commodityPrice}" name="commodityPrice"><br>
    <input type="submit"value="确认添加">
</form>
</body>
</html>
