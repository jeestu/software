<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <title>添加订单</title>
    <script src="${pageContext.request.contextPath}/WEB-INF/resources/js/jquery-1.8.3.js"></script>
    <script type="text/javascript"></script>
</head>
<body>
<form action="${pageContext.request.contextPath}/order/addorder" method="post"><%--//添加或修改完之后返回的页面--%>
    订单号:<input id="id" type="text" value="${order.id}" name="orderID"><br>
    订单名:<input id="order_Name" type="text" value="${order.order_Name}" name="orderName"><br>
   
    <input type="submit"value="确认添加">
</form>
</body>
</html>
