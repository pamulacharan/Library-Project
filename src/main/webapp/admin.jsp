<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin page</title>
<link rel="stylesheet" href="bootstrap.min.css" />
</head>
<style>
body {
	background-color: #faf2e4;
	margin: 0 15%;
	font-family: sans-serif;
}
h5 {
            color: #ffff00;
            background-color: #ffff00;
            padding: 10px;
            border-radius: 5px;
            animation: fadeIn 1s ease-in-out;
        }
table {
	border-collapse: collapse;
	width: 300px;
	background-color: #ffffff;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	border-radius: 6px;
}

table td {
	padding: 20px;
	text-align: center;
	border-bottom: 1px solid #dddddd;
}

table td:first-child {
	font-weight: bold;
}

table tr:last-child td {
	border-bottom: none;
}

.button-container {
	text-align: center;
	margin-top: 25px;
}

.button-container input {
	margin-right: 20px;
}
</style>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="index.html" class="active">Home</a></li>
					<li><a href="admin.jsp">Admin</a></li>
					<li><a href="librarian_login.jsp">Librarian</a></li>
					<li><a href="add_librarian.jsp">Add Librarian</a></li>
		<!-- 		<li><a href="update_librarian.jsp">Update Librarian</a></li>      -->	
					<li><a href="about.jsp">About</a></li>
					<li><a href="contact.jsp">Contact</a></li>
				</ul>

			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

	<div class="container-fluid">
		<h1>ELibrary</h1>
		<p>This is Library Management system Project</p>
		<marquee dir="ltr">
			<font style="color: navy;">This Library Project is Developed
				By Pamula Charan                     
				Phone number : 7993923596                         
				gmail Id : pamulacharan7@gmail.com                     
				Web Site : 3coadersalgo.com........</font>
		</marquee>
	</div>
	<center>
	<table>
		<form action="AdminLogin">
			<h2>Admin Login</h2>
			<form action="AdminLogin" method="post">
				<table>
					<tr>
						<td>Email :</td>
						<td><input type="email" name="uname@gmail.com">
					</td></tr>
					<tr>
						<td>Password:</td>
						<td><input type="password" name=pass></td>
					</tr>
					<tr class="button-container">
						<td colspan="2"><input type="submit" value="Login"> <input
							type="reset" value="Reset"></td>
					</tr>
				
    		<tr class="button-container">
    		<td colspan="2">
    			<br>
				<h5><a href="index.html" >Back</a></h5>
    			<br>
    		</td>
    	</tr>
    
				</table>
			</form>
		</form>
		
    </center>

</body>
</html>