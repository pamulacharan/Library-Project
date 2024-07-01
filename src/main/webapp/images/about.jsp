<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Page</title>
<style>
p {
	color: red;
}

p {
	color: blue;
}

p {
	color: green;
}
</style>
<style>
body {
	background-color: #faf2e4;
	margin: 0 15%;
	font-family: sans-serif;
}

h1 {
	text-align: center;
	font-family: serif;
	font-weight: normal;
	text-transform: uppercase;
	border-bottom: 1px solid #57b1dc;
	margin-top: 30px;
}

h2 {
	color: #d1633c;
	font-size: 1em;
}

.social-icons {
	display: flex;
	justify-content: center;
	margin-top: 20px;
}

.social-icons img {
	width: 30px;
	height: 30px;
	margin: 0 10px;
}

#current-time {
	font-size: 1.5em;
	text-align: center;
	margin-top: 20px;
}
</style>
<script>
	function updateTime() {
		var now = new Date();
		var hours = now.getHours();
		var minutes = now.getMinutes();
		var seconds = now.getSeconds();

		hours = hours < 10 ? "0" + hours : hours;
		minutes = minutes < 10 ? "0" + minutes : minutes;
		seconds = seconds < 10 ? "0" + seconds : seconds;

		document.getElementById("current-time").textContent = hours + ":"
				+ minutes + ":" + seconds;
	}

	setInterval(updateTime, 1000);
</script>
</head>
<body>
	<div id="section1" align="pull-right">
		<a href="#section2">Click Me to go down</a>
	</div>
	<h1>About Project</h1>
	<br>
	<br>
	<p>Arithmetic operators are used in mathematical expressions in the
		same way that they are used in algebra. The following table lists the
		arithmetic operators:</p>
	<ul>
		<li><a href="">Addition</a></li>
		<li><a href="">Subtraction (also unary minus)</a></li>
		<li><a href="">Multiplication</a></li>
		<li><a href="">Division</a></li>
		<li><a href="">Modulus</a></li>
		<li><a href="">Increment</a></li>
		<li><a href="">Addition assignment</a></li>
		<li><a href="">Subtraction assignment</a></li>
		<li><a href="">Multiplication assignment</a></li>
		<li><a href="">Division assignment</a></li>
		<li><a href="">Modulus assignment</a></li>
		<li><a href="">Decrement</a></li>
	</ul>
	<article>
		<p>All behave as you would expect for all numeric types. The minus
			operator also has a unary form that negates its single operand.
			Remember that when the division operator is applied to an integer
			type, there will be no fractional component attached to the result.
			The modulus operator, %, returns the remainder of a division
			operation. It can be applied to floating point types as well as
			integer types.</p>
		<p>The following example program demonstrates the %:</p>
		<p>Java provides special operators that can be used to combine an
			arithmetic operation with an assignment. As you probably know,
			statements like the following are quite common in programming:</p>
		<p>a = a + 4;</p>
		<p>In Java, you can rewrite this statement as shown here: a += 4;
			This version uses the += compound assignment operator. Both
			statements perform the same action: they increase the value of a by
			4. Here is another example, a = a % 2; which can be expressed as a %=
			2; In this case, the %= obtains the remainder of a/2 and puts that
			result back into a. There are compound assignment operators for all
			of the arithmetic, binary operators. Thus, any statement of the form
			var = var op expression; can be rewritten as var op= expression; The
			compound assignment operators provide two benefits. First, they save
			you a bit of typing, because they are shorthand for their equivalent
			long forms. Second, they are implemented more efficiently by the Java
			run time system than are their equivalent long forms.</p>
	</article>
	<h5>Hear you learn about Arithmetic Operators</h5>
	<h2>
		<li class="active"><a href="Home.jsp">Home</a></li> <br> <br>
		<li class="active"><a href="index.html">Welcome Page</a></li> <br>
		<br>
	</h2>
	<div class="social-icons">
		<a href="https://www.instagram.com"><img src="instagram_logo.jpg"
			alt="Instagram"></a> <a href="https://www.facebook.com"><img
			src="facebook_logo.jpg" alt="Facebook"></a> <a
			href="https://www.whatsapp.com"><img src="whatsapp_logo.jpg"
			alt="WhatsApp"></a>
	</div>

	<div id="current-time"></div>
	<h4>
		<!-- FOOTER -->
		<footer style="background:; height:;">
			<!-- <p class="pull-right">
				<a href="#">Back to top</a>
			</p> -->
			<div id="section2" align="pull-right">
				<a href="#section1">Click Me to go up</a>
			</div>
			<p>
				&copy; 2023 3coadersalgo Projects, Inc. &middot; developed by <a
					href="#https://facebook.com">Pamula Charan </a><a
					href="#http://3coadersalgo.in">Privacy</a> &middot; <a
					href="#http://3coadersalgo.in">Terms</a>
			</p>
		</footer>
	</h4>
</body>
</html>
