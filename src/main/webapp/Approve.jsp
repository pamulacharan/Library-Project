<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Librarian</title>
<link rel="stylesheet" href="bootstrap.min.css" />
</head>
<style>
body {
	background-color: #faf2e4;
	margin: 0 15%;
	font-family: sans-serif;
}
		h2 {
            color: #333333;
            font-size: 24px;
            margin-top: 20px;
            animation: slideInLeft 1s ease-in-out;
        }
         h5 {
            color: #ffff00;
            background-color: #ffff00;
            padding: 10px;
            border-radius: 5px;
            animation: fadeIn 1s ease-in-out;
        }
        /* Keyframe animations */
        @keyframes fadeIn {
            0% {
                opacity: 0;
            }
            100% {
                opacity: 1;
            }
        }

        @keyframes slideInLeft {
            0% {
                transform: translateX(-50px);
                opacity: 0;
            }
            100% {
                transform: translateX(0);
                opacity: 1;
            }
        }
        table {
			border-collapse: collapse;
			width: 400px;
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

<body>
	<center>
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
					<li><a href="about.jsp">About</a></li>
					<li><a href="contact.jsp">Contact</a></li>
				</ul>

			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

	<div class="container-fluid">
		<h2>Approve Librarian</h2>
 
  <form action="ApproveLibrarian" method="post" style="width:300px">
  <tr>
  <table>	
  			<td>Id</td>
			<td><input type="text" name="Id"></td>
			<tr>
			<tr>
			<td>Approved</td>
			<td><input type="text" name="Approved"></td>
			<tr>
			<tr>
				<td><input type="submit" name="Approve"></td>
				<td><input type="reset" name="Reset"></td>
			<tr>
</form>
<table>
    	<tr class="button-container">
    		<td colspan="2">
    			<br>
				<h5><a href="index.html" >Back</a></h5>
    			<br>
    		</td>
    	</tr>
    </table> 
</table>
		<script src="jquery.min.js"></script>
		<script src="bootstrap.min.js"></script>
		</center>
</body>
</html>
<!-- 
<div class="form-group">
    <label for="Id">ID</label>
    <input type="text" class="form-control" name="ID" id="Id" placeholder="ID"/>
  </div>
  <div class="form-group">
    <label for="Name">Name</label>
    <input type="text" class="form-control" name="Name" id="Name" placeholder="Name"/>
  </div>
  <div class="form-group">
    <label for="Password">Password</label>
    <input type="Password" class="form-control" name="Password" id="Password" placeholder="Password"/>
  </div> 
  <div class="form-group">
    <label for="Email">Email address</label>
    <input type="Email" class="form-control" name="Email" id="Email" placeholder="Email"/>
  </div>
   
  <div class="form-group">
    <label for="Mobile">Mobile Number</label>
    <input type="Number" class="form-control" name="Mobile" id="Mobile" placeholder="Mobile"/>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
 -->