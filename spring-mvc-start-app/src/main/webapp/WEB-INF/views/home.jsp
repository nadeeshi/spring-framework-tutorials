<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
    <head>
        <title>Home Page</title>
    </head>

    <body>
        <h1>Hello World</h1>
        <p>Server Time is: ${serverTime}</p>

        <form action="user" method="post">
            User Name: <input type="text" name="userName"><br>
            User Age: <input type="number" name="age">

            <input type="submit" value="Login">
        </form>
    </body>
</html>
