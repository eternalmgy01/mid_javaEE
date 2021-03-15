<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <h1>Login to site</h1>
        <form action="/login" method="POST">
            <p>
                <label>Username: <input type="text" name="name"></label><br>
                <label>Password:  <input type="text" name="password"></label><br>
                <label><input type="submit"></label><br>
                <label>Don't have an account?<a href="/registration"> Click here</a></label>
            </p>
        </form>
    </body>
</html>
