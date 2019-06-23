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
<form action="${pageContext.request.contextPath}/goods/addgoods" method="post"><%--//添加或修改完之后返回的页面--%>
    商品名:<input id="goodsName" type="text" value="${goods.goodsName}" name="goodsName"><br>
    商品价格:<input id="goodsPrice" type="text" value="${goods.goodsPrice}" name="goodsPrice"><br>
    
    <input type="submit"value="确认添加">
 </form>
</body>
</html>
