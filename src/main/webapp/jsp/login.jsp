<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- Font Awesome -->
  <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet"/>
  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet"/>
  <!-- MDB -->
  <link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.0/mdb.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container mt-5">
  <div class="row justify-content-center">
    <div class="col-md-3">
      <div class="alert alert-warning alert-dismissible fade show" role="alert">
        <strong><%
          if (request.getAttribute("mensaje")!=null){%>
          <p><%=request.getAttribute("mensaje")%>  </p>
          <%
            }%></strong>
        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
      </div>




      <form action="${pageContext.request.contextPath}/login" method="post">
        <!-- Email input -->
        <div class="form-outline mb-4">
          <input type="email" id="username" class="form-control" name="username"/>
          <label class="form-label" for="username">Email address</label>
        </div>

        <!-- Password input -->
        <div class="form-outline mb-4">
          <input type="password" id="password" class="form-control" name="password"/>
          <label class="form-label" for="password">Password</label>
        </div>

        <!-- Submit button -->
        <button type="submit" class="btn btn-primary btn-block mb-4">Sign in</button>
      </form>
    </div>
  </div>
</div>
<!-- MDB -->
<script type="text/javascript"
        src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.0/mdb.min.js"></script>
</body>
</html>