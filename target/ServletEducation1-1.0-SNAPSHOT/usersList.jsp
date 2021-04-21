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
        <h1>There are list of users:</h1>
        List<UserBean> list = UserDao.view();

        <table border="1">
            <tr><th>Id</th><th>FirstName</th><th>LastName</th><th>Email</th><th>PhoneNumber</th>
                <th>Password</th><th>Edit</th><th>Delete</th></tr>
            for(UserBean bean : list) {
            out.println("<tr><td>" + bean.getId() + "</td><td>" + bean.getFirstName() + "</td><td>" + bean.getLastName()
            + "</td><td>" + bean.getEmail() + "<tr><td>" + bean.getPhoneNumber + "</td><td>" + bean.getPassword()
            + "</td><td><a href='EditUserForm?id=" + bean.getId() + "'>Edit</a></td><td><a href='DeleteUser?id="
             + bean.getId() + "'>Delete</a></td></tr>
            }
        </table>
    </article>
</section>

<%@include file="footer.jsp"%>

</body>
</html>
