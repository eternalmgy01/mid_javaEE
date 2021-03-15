<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Нужен ли сервлет для этой страницы???--%>
<html>
    <head>
        <title>Registration</title>
    </head>
    <body>
        <h1>Registration to site</h1>
        <form action="/registration" method="POST">
            <p>
                <label>Username: <input type="text" name="name"></label><br>
                <label>Password:  <input type="text" name="password"></label><br>
                <label><input type="submit"></label><br>
                <label>Have an account?<a href="/login"> Click here</a></label>
            </p>
        </form>
    </body>
</html>
