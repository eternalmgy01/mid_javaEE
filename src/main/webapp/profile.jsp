<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Profile</title>
    </head>
    <body>
        <form action="/profile" method="post">
            <label for="">title: </label>
            <input type="text" name="title">
            <br>
            <label for="">details: </label>
            <input type="text" name="details">
            <br>
            <label for="">importance: </label>
            <input type="text" name="importance">
            <br>
            <input type="submit" value="add">
        </form>
        <%
            out.println(request.getAttribute(""));
        %>
    </body>
</html>
