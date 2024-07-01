<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Admin Success Page</title>
    <link rel="stylesheet" href="bootstrap.min.css" />
    <style>
        body {
            background-color: #abcdef;
            display: flex;
            flex-direction: column;
            align-items: center;
            <!-- justify-content: center; -->
            height: 100vh;
            font-family: Arial, sans-serif;
        }

        h1 {
            color: #ffffff;
            background-color: #55aaff;
            padding: 10px;
            border-radius: 5px;
            animation: fadeIn 1s ease-in-out;
        }
        h2 {
            color: #333333;
            font-size: 24px;
            margin-top: 20px;
            animation: slideInLeft 1s ease-in-out;
        }
		 h5 {
            color: #orange;
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
					<li><a href="update_librarian.jsp">Update Librarian</a></li>
					<li><a href="about.jsp">About</a></li>
					<li><a href="contact.jsp">Contact</a></li>
				</ul>

			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
    <h1>Admin Login Success Page</h1>
    <h2>Login Successful!</h2>
    <table>
    	<tr class="button-container">
    		<td colspan="2">
    			<br>
    			<h5><a href="Get_Librarians" >View All Librarians</a></h5>
    			<br>
				<h5><a href="permit_librarian.html" >Give Permissions to Librarian</a></h5>
    			<br>
    			<h5><a href="Get_Permit" >View Permit Librarians</a></h5>
    			<br>
    			<h5><a href="add_book.html" >Add Book</a></h5>
    			<!-- <h5><a href="add_book.html" target="iframe_c">Add Book</a></h5> -->
    			<br>
				<h5><a href="Get" >View Book</a></h5>
    			<br>
				<h5><a href="issue_book.html" >Issue Book</a></h5>
    			<br>
				<h5><a href="Get_View_issued_Book" >View Issued Book</a></h5>
    			<br>
    			<h5><a href="Get_Librarians_ReturnBooks" >View Student Return Books</a></h5>
    			<br>
				<h5><a href="admin_return_book.html" >Admin Return Book</a></h5>
    			<br>
    			<h5><a href="Get_admin_return_book" >View Return Book</a></h5>
    			<br>
				<h5><a href="index.html" >Logout</a></h5>
    			<br>
    			
    			<br>
    			
    		
    		</td>
    	</tr>
    </table>  
</body>
</html>
