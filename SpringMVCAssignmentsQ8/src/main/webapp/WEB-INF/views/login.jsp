<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="login.title" /></title>
</head>
<body>

	<a href="?lang=en">Login(English)</a> |
	<a href="?lang=fr">Login(French)</a> |
	<a href="?lang=vi">Login(Vietnamese)</a>
	<hr>
	<form action="login" method="post">

		<table>
			<tr>
				<td><spring:message code="login.username" /></td>
				<td>:</td>
				<td><input type="text" name="username" /></td>
			</tr>

			<tr>
				<td><spring:message code="login.password" /></td>
				<td>:</td>
				<td><input type="password" name="password" /></td>
			</tr>


		</table>
		<br> <input type="submit" value="<spring:message code="login.submit"/>"/>
	</form>

</body>
</html>