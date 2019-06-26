<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>修改订单</title>
    <script src="${pageContext.request.contextPath}/WEB-INF/resources/js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/order/upd" method="post">
     订单名:<input id="order_Name" type="text" value="${order.order_Name}" name="order_Name"><br>
 订单时间:<input id="orderTimer" type="text" value="${order.orderTimer}" name="orderTimer"><br>
    <input type="submit"value="确认修改">
</form>
</body>
</html>
