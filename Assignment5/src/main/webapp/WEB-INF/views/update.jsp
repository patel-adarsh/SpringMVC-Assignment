<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Management System</h1>
	<form action="up2" method="post">
		<p>
			Employee Id : <input name="id" ,type="text">
		</p>

		<p>
			Employee Name : <input name="name" ,type="text">
		</p>
		<p>
			Employee Department : <input name="dept" ,type="text">
		</p>
		<p>
			Employee Designation : <input name="designation" ,type="text">
		</p>
		<p>
			Employee Salary : <input name="salary" ,type="text">
		</p>
		<button type="submit">Update</button>
	</form>
</body>
</html>