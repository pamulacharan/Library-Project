<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book Form</title>
<link rel="stylesheet" href="bootstrap.min.css" />
</head>
<style>
        body {
            background-color: #abcdef;
            display: flex;
            flex-direction: column;
            align-items: center;
            inherit-content: center;
            height: 123vh;
            margin: 0 25%;
            font-family: Arial, sans-serif;
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
			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
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
	<table>
	<form action="UpdateBook" method="post" style="width: 300px">
	<div class="form-group">
	<tr>
	<h2>This is Only for Admin add book Page</h2>
		<td>Book Number</td>
			<td><input type="text" name="Book_Number"></td>
			<tr>
			<tr>
				<td>Book Name</td>
				<td><input type="text" name="Book_Name"></td>
			<tr>
			<tr>
				<td>Author</td>
				<td><input type="text" name="Author"></td>
			<tr>
			<tr>
				<td>Publisher</td>
				<td><input type="text" name="Publisher"></td>
			<tr>
			<tr>
			<tr>
				<td>Quantity</td>
				<td><input type="text" name="Quantity"></td>
			
		<tr class="button-container">
			<td colspan="2">
			<input type="submit" value="Save Book"> 
			<input type="reset" value="Reset">
			</td>
		</tr>
	</form>
	<table>
    	<tr class="button-container">
    		<td colspan="2">
    			<br>
				<h5><a href="AdminSucess.jsp" >Back</a></h5>
    			<br>
    		</td>
    	</tr>
    </table> 
</table>
	</table>
</body>
</html>
<!-- 
<td><label for="callno1">Book Number</label></td>
		<td><input type="text" class="form-control" name="callno" id="callno1" placeholder="Callno" /></td>
		</tr>
		</div>
		<br>
		<br>
		<div class="form-group">
		<tr>
			<td><label for="name1">Name</label> </td>
			<td><input type="text" class="form-control" name="name" id="name1" placeholder="Name" /></td>
		</tr>
		</div>
		<br>
		<br>
		<div class="form-group">
		<tr>
			<td><label for="author1">Author</label> </td>
			<td><input type="text" class="form-control" name="author" id="author1" placeholder="Author" /></td>
		</tr>
		</div>
		<br>
		<br>
		<div class="form-group">
		<tr>
			<td><label for="publisher1">Publisher</label> </td>
			<td><input type="text" class="form-control" name="publisher" id="publisher1" placeholder="Publisher" /></td>
		</tr>
		</div>
		<br>
		<br>
		<div class="form-group">
		<tr>
			<td><label for="quantity1">Quantity</label> </td>
			<td><input type="number" class="form-control" name="quantity" id="quantity1" placeholder="Quantity" /></td>
		</tr>
		</div>
 -->