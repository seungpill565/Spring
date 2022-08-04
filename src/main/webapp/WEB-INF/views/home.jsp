<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1> Hello world!  </h1>

<P>  The time on the server is ${serverTime}. </P>

<p>toString : ${coffee }</p>

<p>
 	COFFEE NAME  : ${coffee.name }<br>
 	COFFEE PRICE : ${coffee.price }<br>
 	HOT : ${coffee.hot }<br> 
 </p>
 
 <p>
 	coffee info :${name } , ${price }, ${hot }
 </p>
</body>
</html>
