<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main</title>
<!-- 引入样式 -->
<link rel="stylesheet"
	href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">

</head>
<body>

	测试页面

	<div id="app">
		<el-button @click="visible = true">Button</el-button>
		<el-dialog :visible.sync="visible" title="Hello world">
		<p>Try Element</p>
		</el-dialog>
	</div>
	

	
 <form action="${pageContext.request.contextPath}/snacks/findsnacks" method="post">
     零食
    <input type="submit" value="零食" >
 </form>
 <form action="${pageContext.request.contextPath}/dailyuse/finddailyuse" method="post">
       日常用品
     <input type="submit" value="日常用品" >
 </form>
 <form action="${pageContext.request.contextPath}/clothes/findclothes" method="post">
     衣服
    <input type="submit" value="衣服" > 
</form>
<form action="${pageContext.request.contextPath}/home/findhome" method="post">
        家居
     <input type="submit" value="家居" >
 </form>
<form action="${pageContext.request.contextPath}/baby/findbaby" method="post">
       母婴
     <input type="submit" value="母婴" >
 </form>
    
    <form action="${pageContext.request.contextPath}/figure/findfigure" method="post">
       数码
     <input type="submit" value="数码" >
 </form>
</body>
<!-- import Vue before Element -->
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- import JavaScript -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>
	new Vue({
		el : '#app',
		data : function() {
			return {
				visible : false
			}
		}
	})
</script>
</html>