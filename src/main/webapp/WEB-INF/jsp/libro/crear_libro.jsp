<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>${titulo}</title>
</head>
<body>
    para registrar un nuevo libro por favor llene los siguientes campos
    <form method = "post">
        <label>Codigo</label>
        <input type="number" name="codigo" id=""><br>
        <label>Nombre</label>
        <input type="text" name="nombre"><br>
        <label>Fecha de publicaci&oacute;n</label>
        <input type="date" name="fecha"><br>
        <label>Idioma del libro</label>
        <select name="lenguaje" >
            <option value="EN">ingles</option>
            <option value="ES">espa&ntilde;ol</option>
        </select><br>
        <input type="submit" value="Registrar">
    </form>
</body>
</html>