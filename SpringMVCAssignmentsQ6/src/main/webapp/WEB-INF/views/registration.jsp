<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<style>
.error {
	color: red
}
</style>

<body>
	<form action="r2" method="post">
		<fieldset style="width: 1000px">
			<legend>Register Here:</legend>
			<p>
				Please Enter Your Name : <input type="text" name="username" />
				<form:errors path="R.username" cssClass="error" />
				<br> <br>
			</p>
			<p>
				Please Enter Your Password : <input type="password" name="password" />
				<form:errors path="R.password" cssClass="error" />
				<br> <br>
			</p>
			<p>
				Please Enter Your Email : <input type="email" name="email" />
				<form:errors path="R.email" cssClass="error" />
				<br> <br>
			</p>
			<p>
				Please Enter Your Contact No. : <input type="text" name="contact" />
				<form:errors path="R.contact" cssClass="error" />
				<br> <br>
			</p>
			<p>
				Please Enter Your City : <select name="city">
					<option value="select">--select--</option>
					<option value="Bhopal">Bhopal</option>
					<option value="Indore">Indore</option>
					<option value="Ujjain">Ujjain</option>
					<option value="Shahdol">Shahdol</option>
				</select>
				<form:errors path="R.city" cssClass="error" />
				<br> <br>
			</p>
			<p>
				Please Enter Your Pin : <input type="text" name="pin" />
				<form:errors path="R.pin" cssClass="error" />
				<br> <br>
			</p>

			<h1></h1>
			<button type="submit">REGISTER</button>
		</fieldset>
	</form>

</body>
</html>