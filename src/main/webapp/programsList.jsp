<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Servlet Form</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            font-family: Arial, Helvetica, sans-serif;
        }

        /* Style the header */
        header {
            background-color: #666;
            padding: 30px;
            text-align: center;
            font-size: 35px;
            color: white;
        }

        /* Create two columns/boxes that floats next to each other */
        nav {
            float: left;
            width: 30%;
            height: 300px; /* only for demonstration, should be removed */
            background: #ccc;
            padding: 20px;
        }

        /* Style the list inside the menu */
        nav ul {
            list-style-type: none;
            padding: 0;
        }

        article {
            float: left;
            padding: 20px;
            width: 70%;
            background-color: #f1f1f1;
            height: 300px; /* only for demonstration, should be removed */
        }

        /* Clear floats after the columns */
        section::after {
            content: "";
            display: table;
            clear: both;
        }

        /* Style the footer */
        footer {
            background-color: #777;
            padding: 10px;
            text-align: center;
            color: white;
        }

        /* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
        @media (max-width: 600px) {
            nav, article {
                width: 100%;
                height: auto;
            }
        }
    </style>
</head>
<body>
<%@include file="header.jsp"%>

<section>
    <nav>
        <ul>
            <li><a href="userRegister.jsp">Registration</a></li>
            <li><a href="adminLogin.jsp">Login</a></li>
            <li><a href="usersList.jsp">List of Users</a></li>
            <li><a href="programsList.jsp">List of Programs</a></li>
            <li><a href="contacts.jsp">Contacts</a></li>
        </ul>
    </nav>

    <article>
        <h1>There are list of programs in our center:</h1>
        <ol>
            <li>Space Center Ultimate</li>
            <li>Explorer Camps</li>
            <li>Overnight Experiences</li>
            <li>Educator Resources</li>
            <li>Outreach</li>
            <li>Field tips</li>
            <li>Innovation Gateway</li>
            <li>Human Performance</li>
            <li>Stars & Stem</li>
        </ol>
    </article>
</section>

<%@include file="footer.jsp"%>

</body>
</html>
