<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="../layout/header.jsp"/>
<jsp:include page="../layout/content.jsp"/>

<!-- Contenido de la página -->
<div class="container" style="margin-top: 15px">
    <a class="btn btn-primary btn-block mb-4" style="width: 100px;" href="${pageContext.request.contextPath}/jsp/users/NewUser.jsp">Nuevo</a>
    <table class="table table-striped">
        <thead>
        <tr>
            <th></th>
            <th scope="col">Código</th>
            <th scope="col">Nombre</th>
            <th scope="col">Correo</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${users}" var="usuario" varStatus="loop">
            <tr>
                <td>
                    <a href="${pageContext.request.contextPath}/jsp/users/EditUser.jsp?id=${usuario.id}" class="btn btn-primary"
                       style="padding: 5px 10px 5px 10px;" >
                        <i class="fas fa-pencil-alt me-2" style="margin-right: 0px !important;"></i>
                    </a>
                    <a href="${pageContext.request.contextPath}/DeleteUser?id=${usuario.id}" class="btn btn-danger"
                       style="padding: 5px 10px 5px 10px;" >
                        <i class="fas fa-trash-alt me-2" style="margin-right: 0px !important;"></i>
                    </a>
                </td>
                <td>${usuario.id}</td>
                <td>${usuario.name}</td>
                <td>${usuario.username}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

<jsp:include page="../layout/footer.jsp"/>