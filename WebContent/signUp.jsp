<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Signup</title>

	<!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords"
		content="Invent Signup Form Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!-- //Meta tag Keywords -->
	<!--/Style-CSS -->
	<link rel="stylesheet" href="signUp_style.css" type="text/css" media="all" />
	<!--//Style-CSS -->


</head>



<body>


	<!-- /login-section -->
	<section class="w3l-login-6">
		<div class="login-hny">
			<div class="form-content">
				<div class="form-right">
					<div class="overlay">
						<div class="grid-info-form">
							<h5>Say hello</h5>
							<h3>CREATE ACCOUNT </h3>
							<p>By checking "I agree to Conditions of Use and Privacy", that means that you are agreeable
							with your personal information like your email and password to be accessed by the owner of this Webpage.
							
							</p>
							<a href="signin.jsp" class="read-more-1 btn">Back</a>
						</div>
					
					</div>
				</div>
				<div class="form-left">
					<div class="middle">
						<h4>Join Us</h4>
						<p>Create Your Account, It's Free.</p>
					</div>
					<form action="create_user" method="post" class="signin-form">
							<div class="form-input">
								<label>Name</label>
								<input type="text" name="name" placeholder="" required />
							</div>
							<div class="form-input">
								<label>Email</label>
								<input type="email" name="email" placeholder="" required />
							</div>
							<div class="form-input">
								<label>Password</label>
								<input type="password" name="password" placeholder="" required />
							</div>
							
							<label class="container">I agree to <a href="#">Conditions</a> of Use and <a href="#">Privacy</a>
								<input type="checkbox">
								<span class="checkmark"></span>
							</label>
							<button class="btn">Create account</button>
					</form>
					<div class="copy-right text-center">
						<p>© 2020 Signup. All rights reserved |
					 </div>
				</div>
				
			</div>
			
		</div>
	</section>
	<!-- //login-section -->



</body>
</html>