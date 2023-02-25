<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        <%@include file="../../resources/bootstrap.min.css" %>
    </style>
    <script src="../../resources/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <div class="col-md-offset-2 col-md-7">
            <h1>${message}</h1>
            <br>

            <table class="table table-striped table-bordered">
                <th>Customer Details</th>
                <tr>
                    <td><b>First Name</b>: ${customer.firstName}</td>
                </tr>
                <tr>
                  <td><b>Last Name</b>: ${customer.lastName}</td>
                </tr>
                <tr>
                  <td><b>User Name</b>: ${customer.userName}</td>
                </tr>
                <tr>
                  <td><b>Email</b>: ${customer.email}</td>
                </tr>
            </table>
        </div>
    </div>
</body>
</html>
