<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Login Failed Page</title>
    <style>
        body {
            background-color: #55aaff;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            font-family: Arial, sans-serif;
        }

        h1 {
            color: #ffffff;
            background-color: #ff4444;
            padding: 10px;
            border-radius: 5px;
            animation: shake 0.5s ease-in-out;
        }

        h2 {
            color: #ffffff;
            font-size: 24px;
            margin-top: 20px;
            text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);
        }
        h5 {
            color: #orange;
            background-color: #ffff00;
            padding: 10px;
            border-radius: 5px;
            animation: fadeIn 1s ease-in-out;
        }

        /* Keyframe animation */
        @keyframes shake {
            0% {
                transform: translateX(-5px);
            }
            25% {
                transform: translateX(5px);
            }
            50% {
                transform: translateX(-5px);
            }
            75% {
                transform: translateX(5px);
            }
            100% {
                transform: translateX(0);
            }
        }
    </style>
</head>
<body>
    <h1>Login Failed !!</h1>
    <h2>Please try again.</h2>
    <table>
    	<tr class="button-container">
    		<td colspan="2">
    			<h5><a href="admin.jsp" >Back to Admin Page</a></h5>
    			<!-- <h5><a href="add_book.html" target="iframe_c">Add Book</a></h5> -->
    		</td>
    	</tr>
    </table>
</body>
</html>
