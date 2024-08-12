<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE+=edge">
<mate name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login</title>
<link rel="stylesheet" href="css/style1.css">
<link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css'
	rel='stylesheet'>
</head>
<body>
	<div class="wrapper">
		<form action="DangNhapServlet" method="post">
			<h1>Login</h1>
			<div class="input-box">
				<input type="text" name="email" placeholder="Username" required><br>
				<i class='bx bxs-user'></i>
			</div>
			<div class="input-box">
				<input type="password" name="password" placeholder="Password"
					required><br> <i class='bx bxs-lock-alt'></i>
			</div>
			<div class="remember-forgot">
				<label><input type="checkbox"> Remember me</label> <a
					href="#"> Forgot password</a>
			</div>
			<button type="submit" class="btnDangNhap">Login</button>
			<div class="register-link">
				<p>
					Don't have an account? <a href="#">Register</a>
				</p>
			</div>
		</form>
	</div>
</body>
</html>