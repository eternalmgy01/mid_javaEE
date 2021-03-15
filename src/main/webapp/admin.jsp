<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Admin</title>
    </head>
    <body>
        <h2><a href="/main">Go back</a></h2>
        <form action="/admin" method="POST">
            <label>title: </label>
            <input type="text" name="title">
            <br>
            <label>description: </label>
            <input type="text" name="description">
            <br>
            <label>price: </label>
            <input type="text" name="price">
            <br>
            <label>size: </label>
            <input type="text" name="size">
            <br>
            <input type="submit" value="add">
        </form>
    </body>
</html>
