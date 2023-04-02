<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Management Application</h1>
	<form:errors path="U.*" />

	<form action="demo2" method="post">
		<p>
			Username : <input name="username" type="text">
		</p>
		<p>
			Email : <input name="email" type="email">
		</p>
		<p>
			Password : <input name="password" type="password">
		</p>

		<p>
			<button type="submit">SUBMIT</button>
		</p>
	</form>
</body>
</html>