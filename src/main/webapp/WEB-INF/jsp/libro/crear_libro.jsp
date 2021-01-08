<!doctype html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form"  prefix="form"%>
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
    para registrar un nuevo libro por favor llene los siguientes campos
    <%--@elvariable id="libro" type="com.discarok.biblioteca"--%>
    <form:form method = "post" modelAttribute="libro">
        <div class="form-group">
            <form:label path="codigo">Codigo</form:label>
            <form:input type="number" path="codigo"  class="form-control" required="required"></form:input>
            <form:errors path="codigo" cssClass="text-warning"></form:errors>
        </div>
        <div class="form-group">
            <form:label path="nombre">Nombre</form:label>
            <form:input type="text" path="nombre" class="form-control" required="required"></form:input>
        </div>
        <div class="form-group">
            <form:label path="fechaIngreso">Fecha de publicaci&oacute;n</form:label>
            <form:input type="date" path="fechaIngreso" class="form-control" required="required"></form:input>
        </div>
        <div class="form-group">
            <form:label path="lenguaje">Idioma del libro</form:label>
            <form:select path="lenguaje" class="form-control" required="required"  >
                <form:option value="EN">ingles</form:option>
                <form:option value="ES">espa&ntilde;ol</form:option>
            </form:select>
        </div>
        <input type="submit" value="Registrar" class="btn btn-info">
    </form:form>
</div>
        <script src="webjars/jquery/3.3.1/jquery.js"></script>
        <script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>
</html>