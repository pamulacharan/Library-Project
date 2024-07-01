<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Success Page</title>
    <style>
        body {
            background-color: #abcdef;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
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
    </style>
</head>
<body>
    <h1>Librarian Successful! Added</h1>
    <h2>Giving Permission to Librarian Successful!</h2>
</body>
</html>
