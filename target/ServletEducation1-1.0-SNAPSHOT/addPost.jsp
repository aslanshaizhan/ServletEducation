<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Add Post</title>
</head>
<body>
<div align="center">
    <h1>Create new Post</h1>
    <form action="<%=request.getContextPath()%>/addPost" method="post">
        <table style="with: 100%">
            <tr>
                <td>Title: </td>
                <td><input type="text" name="username" /></td>
            </tr>
            <tr>
                <td>Description: </td>
                <td><textarea type="password" name="password"></textarea></td>
            </tr>

        </table>
        <input type="submit" value="Submit" />
    </form>
</div>
</body>
</html>
