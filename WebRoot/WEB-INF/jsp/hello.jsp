<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.11.0.min.js" charset="utf-8"></script>
<script type="text/javascript">
function test(){
	$.ajax({  
        type : "get",
        contentType : 'application/json',
        url : "<%=request.getContextPath() %>/in/json",  
        dataType:"json",  
        success : function(data) {  
            alert("Data :" + data.msg);  
        }  
    });
}
</script>
</head>
<body>
hello

<button id="btn" onclick="test();">Test</button>

</body>
</html>