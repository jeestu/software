<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
 <base href="<%=basePath%>">
<meta charset="UTF-8" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=basePath%>css/style.css"  />
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
  $(".click").click(function(){
  $(".tip").fadeIn(200);
  });
  
  $(".tiptop a").click(function(){
  $(".tip").fadeOut(200);
});

  $(".sure").click(function(){
  $(".tip").fadeOut(100);
});

  $(".cancel").click(function(){
  $(".tip").fadeOut(100);
});
});
 </script>
</head>
<body>
<div class="place">
    <span>位置：</span>
    <ul class="placeul">
    <li><a href="#">首页</a></li>
    <li><a href="#">基本内容</a></li>
    </ul>
    </div>
    <div class="rightinfo">
    <table class="tablelist">
    	<thead>
    	<tr>
        <th><input name="" type="checkbox" value="" checked="checked"/></th>
        <th>ID<i class="sort"><img src="<%=basePath%>images/px.gif" /></i></th>
         <th>商品名称</th>
        <th>商品信息</th>
         <th><a href="${pageContext.request.contextPath}/goods/toadd">添加</a></th>
         </tr>
        </thead>
        <tbody>
       <c:forEach items="${goodList}" var="goods">

       <tr>
        <td><input name="" type="checkbox" value="" /></td>
       
        <td>${goods.goodsName}</td>
        <td>${goods.goodsPrice }</td>
        <td>${goods.coupon}</td>
        <td><a href="${pageContext.request.contextPath}/goods/delete.do?id=${goods.id}" class="tablelink">删除</a>
        </td>
        </tr>
       </c:forEach>
       </tbody>
     </table>
     </div>
</body>
</html>
