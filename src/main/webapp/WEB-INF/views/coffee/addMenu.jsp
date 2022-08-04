<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">

	<title>Add Coffee Menu</title>
</head>

<body>	
	<h3>커피 메뉴 추가하기 </h3>
	<form id="form" action="" method="POST">
		name :	<input type="text" name="name" value="Americano"/><br>
		price:	<input type="text" name="price" value="17000"/><br>
		hot:	<input type="radio" name="hot" value="true"/>
				<input type="radio" name="hot" value="false"/>
		<input type="submit" value="submit!">
	</form>			
<button id="add1">add1</button>
<button id="add2">add2</button>
<button id="add3">add3</button>

<script> 

//add1을 누르면 springmvc/hello/coffee/add1로 submit
var form = document.getElementById('form');
var btn1 = document.getElementById('add1');

	btn1.addEventListener('click',()=>{
		form.action = '<c:url value="/hello/coffee/add1"/>';
		form.submit();
	})

//add2을 누르면 springmvc/heelo/coffee/add2로 submit
var btn2 = document.getElementById('add2');
	
	btn2.addEventListener('click',()=>{
		form.action = '<c:url value="/hello/coffee/add2"/>';
		form.submit();
	})
	
	var btn3 = document.getElementById('add3');
	
	btn3.addEventListener('click',()=>{
		form.action = '<c:url value="/hello/coffee/add3"/>';
		form.submit();
	})
</script>
	
</body>
</html>
