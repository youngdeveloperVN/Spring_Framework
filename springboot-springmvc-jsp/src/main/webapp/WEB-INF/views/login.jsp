<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- CALL CSS STATIC START -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/lib.css"/>

<!-- CALL CSS STATIC END -->

<!-- CALL CSS START -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/resource/css/main.css"/>
<!-- CALL CSS END -->


<title>Login Page</title>
</head>
<body>

	Login Page
	<form action="action_page.php" method="post">
		<div class="imgcontainer">
			<img src="img_avatar2.png" alt="Avatar" class="avatar">
		</div>

		<div class="container">
			<label for="uname" class="text-red"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="uname" required> <label
				for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="psw" required>

			<button type="submit">Login</button>
			<label> <input type="checkbox" checked="checked"
				name="remember"> Remember me
			</label>
		</div>

		<div class="container" style="background-color: #f1f1f1">
			<button type="button" class="cancelbtn">Cancel</button>
			<span class="psw">Forgot <a href="#">password?</a></span>
		</div>
	</form>

</body>
</html>