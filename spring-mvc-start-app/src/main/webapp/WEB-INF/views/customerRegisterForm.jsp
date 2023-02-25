<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<head>
    <title>Title</title>
<%--    <link href="../../resources/bootstrap.min.css" rel="stylesheet"/>--%>
<%--    <script src="../../resources/bootstrap.min.js"></script>--%>

    <style type="text/css">
        <%@include file="../../resources/bootstrap.min.css" %>
    </style>
    <script src="../../resources/bootstrap.min.js"></script>

<%--    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"/>--%>
<%--    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>--%>
</head>
<body>
  <div class="container">
      <div class="col-md-offset-2 col-md-7">
          <h2>Customer Register Form</h2>

          <div class="panel panel-info">
              <div class="panel-heading">
                  <div class="panel-title">Register Form</div>
              </div>

              <div class="panel-body">
                  <form:form action="registerCustomerForm" cssClass="form-horizontal" method="post" modelAttribute="customer">
                      <div class="form-group">
                          <label for="firstName" class="col-md-3 control-label">First Name</label>
                          <div class="col-md-9">
                              <form:input path="firstName" cssClass="form-control"/>
                          </div>
                      </div>
                      <div class="form-group">
                        <label for="lastName" class="col-md-3 control-label">Last Name</label>
                        <div class="col-md-9">
                          <form:input path="lastName" cssClass="form-control"/>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="userName" class="col-md-3 control-label">User Name</label>
                        <div class="col-md-9">
                          <form:input path="userName" cssClass="form-control"/>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="password" class="col-md-3 control-label">Password</label>
                        <div class="col-md-9">
                          <form:input path="password" cssClass="form-control"/>
                        </div>
                      </div>
                      <div class="form-group">
                        <label for="email" class="col-md-3 control-label">Email</label>
                        <div class="col-md-9">
                          <form:input path="email" cssClass="form-control"/>
                        </div>
                      </div>

                      <div class="form-group">
                          <div class="col-md-offset-3 col-md-9">
                              <form:button cssClass="btn btn-primary">Register</form:button>
                          </div>
                      </div>
                  </form:form>
              </div>
          </div>
      </div>

  </div>

</body>
</html>
