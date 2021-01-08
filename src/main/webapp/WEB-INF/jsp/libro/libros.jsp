<!doctype html>
<!-- TAG para poder isar JSTL -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>${titulo}</title>
    <link rel="stylesheet" href="webjars/bootstrap/4.1.3/css/bootstrap.css">
</head>
<body>
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
                <th><a href="borrar-libro?codigo=${libro.getCodigo()}" class="btn btn-danger">eliminar</a></th>
                <th><a href="" class="btn btn-info">Editar</a></th>
            </tr>
        </c:forEach>
     </tbody>
 </table>

 <a class="btn btn-primary" href="crear-libro">A&ntilde;adir nuevo libro </a>
</div>

 <script src="webjars/jquery/3.3.1/jquery.js"></script>
 <script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>