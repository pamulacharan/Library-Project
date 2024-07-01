<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Page</title>
<link rel="stylesheet" href="bootstrap.min.css" />
</head>
<style>
body {
	background-color: #faf2e4;
	margin: 0 15%;
	font-family: sans-serif;
}
		.button {
	display: inline-block;
	padding: 10px 20px;
	border-radius: 20px;
	background-color: #57b1dc;
	color: #fff;
	text-decoration: none;
}
 		.card {
        width: 110px;
        height: 110px;
        background: #fff;
        border-radius: 50%;
        transition: 0.5s;
        position: relative;
      }
      .card:hover {
        width: 250px;
        height: 250px;
        border-radius: 10px;
      }
      .image-box {
        width: 100px;
        height: 100px;

        border-radius: 50%;
        overflow: hidden;
        transition: 0.5s;
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
      }
      .image-box img {
        width: 100%;
        height: 100%;
      }
      .card:hover .ib1 {
        top: 0%;
        box-shadow: 10px 10px 10px rgba(0, 0, 0, 0.5);
      }
      .card:hover .ib2 {
        left: 100%;
        box-shadow: -10px 10px 10px rgba(0, 0, 0, 0.5);
      }
      .card:hover .ib3 {
        top: 100%;
        box-shadow: 10px -10px 10px rgba(0, 0, 0, 0.5);
      }
      .card:hover .ib4 {
        left: 0%;
        box-shadow: 10px 10px 10px rgba(0, 0, 0, 0.5);
      }
      .card:hover .image-box {
        width: 100px;
        height: 100px;
        border-radius: 10px;
      }
      .button:hover {
	background-color: #267aa8;
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
		<h1>Contact Page</h1>
		<p>
		This is Library Management system Project
		</p>
		<marquee dir="ltr">
			<font style="color: navy;">This Library Project is Developed
				By Pamula Charan                     
				Phone number : 7993923596                         
				gmail Id : pamulacharan7@gmail.com                     
				Web Site : 3coadersalgo.com........</font>
		</marquee>
		<h1>This Library Project is Developed By Pamula Charan</h1>
	
	<h4>
		Phone number : <a href="#phone">7993923596</a>
	</h4>
	<h4>
		gmail Id     : <a href="#pamulacharan7@gmail.com">pamulacharan7@gmail.com</a>
	</h4>
	<h4>
		Web Site     : <a href="#google.com">3coadersalgo.com</a>
	</h4>
	<hr>
	
	<div class="card">
      <div class="image-box ib1">
        <img src="images/image1.png" />
      </div>

      <div class="image-box ib2">
        <img src="images/image2.png" />
      </div>

      <div class="image-box ib3">
        <img src="images/image3.png" />
      </div>

      <div class="image-box ib4">
        <img src="images/image.png" />
      </div>
    </div>
    
    <div class="social-icons">
		<a href="https://www.instagram.com">
		<img src="images/instagram_logo.jpg" alt="Instagram">
		</a> 
		<a href="https://www.facebook.com"><img src="images/facebook_logo.jpg" alt="Facebook">
		</a> 
		<a href="https://www.whatsapp.com">
		<img src="images/whatsapp_logo.jpg" alt="WhatsApp"></a>
	</div>
	<div id="current-time"></div>
	<h4>
		
			<p>
				&copy; 2023 3coadersalgo Projects, Inc. &middot; developed by <a
					href="#https://facebook.com">Pamula Charan </a><a
					href="#http://3coadersalgo.in">Privacy</a> &middot; <a
					href="#http://3coadersalgo.in">Terms</a>
			</p>
		</footer>
	</h4>
	
		<script src="jquery.min.js"></script>
		<script src="bootstrap.min.js"></script>
	</center>
</body>
</html>