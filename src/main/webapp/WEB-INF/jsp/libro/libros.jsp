<%@ include file="../common/header.jspf" %>
<%@include file="../common/navegacion.jspf"%>
<div class="container">
 <p>Lista de libros: </p>

 <table class="table">
     <caption>Lista de libros en la biblioteca</caption>
     <thead>
        <tr>
            <th>codigo</th>
            <th>nombre</th>
            <th>lenguaje</th>
            <th>disponible</th>
            <th>Fecha</th>
            <th>eliminar</th>
            <th>editar</th>
        </tr>
     </thead>
     <tbody>
        <c:forEach items="${libros}" var="libro">
            <tr>
                <th>${libro.getCodigo()}</th>
                <th>${libro.getNombre()}</th>
                <th>${libro.getLenguaje()}</th>
                <th>${libro.isDisponible()}</th>
                <th><fmt:formatDate value="${libro.getFechaIngreso()}" /></th>
                <th><a href="borrar-libro?codigo=${libro.getCodigo()}" class="btn btn-danger">eliminar</a></th>
                <th><a href="editar-libro?codigo=${libro.getCodigo()}" class="btn btn-info">Editar</a></th>
            </tr>
        </c:forEach>
     </tbody>
 </table>

 <a class="btn btn-primary" href="crear-libro">A&ntilde;adir nuevo libro </a>
</div>

<%@ include file="../common/footer.jspf"%>