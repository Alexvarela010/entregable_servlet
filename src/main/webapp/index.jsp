
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

      <form action="${pageContext.request.contextPath}/Bienvenida" method="get">
        <!-- Email input -->
        <div class="form-outline mb-4">
          <input type="text" id="nombre" class="form-control" name="nombre"/>
          <label class="form-label" for="nombre">Ingrese su nombre</label>
        </div>
        <!-- Submit button -->
        <button type="submit" class="btn btn-primary btn-block mb-4">Aceptar</button>
      </form>
    </div>
  </div>
</div>
<!-- MDB -->
<script type="text/javascript"
        src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/6.4.0/mdb.min.js"></script>
</body>
</html>