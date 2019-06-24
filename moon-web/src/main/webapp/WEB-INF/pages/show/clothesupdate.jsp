<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
    <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script type="text/javascript">
       function re() {
    	   alert("xxx");
    	   
    	   var url='${pageContext.request.contextPath}/clothes/update.do';
    	    
    	   var name=$('#name').val();	  
    	   var price=$('#price').val();	  
    	 
    	   var jsonObj={price:price,name};
    	 //  var jsonObj={name:name,info:info};
    	   var parameters=JSON.stringify(jsonObj);
    	   
    	   console.log(jsonObj);
    	   console.log(parameters);
    	   $.ajax({
    		   type:'post',
    		   url:url,
    		   contentType:'application/json;charset=UTF-8',
    		   data:parameters,
    		   success:function(respData){
    			   console.log("jsonp:"+respData);
    		   }
    	   })
		
	}
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath}/clothes/update" method="post">
  价格&nbsp;&nbsp;&nbsp;:<input id="price" type="text" value="${clothes.price}" name="price"><br>
    名称:<input id="name" type="text" value="${clothes.name}" name="price"><br>
   
    <input type="submit"value="确认">
    <!--input type="button" value="提交json格式" onclick="re();"-->
    <!--input type="submit"-->
</form>
</body>
</html>