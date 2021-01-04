<!doctype html>
<html lang="en">
<head>
    <meta http-equiv=”Content-Type” content=”text/html; charset=ISO-8859-1″ />
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login app springBoot demo</title>
</head>
<body>
    <span style="color: red">${mensaje}</span>
    <h1>Para poder ser parte de nuestra comunidad inica sesión</h1>
    <p>Hola <!--${nombre} --> para iniciar sesión llena los siguientes campos</p>
     <div class="formulario">
         <form action="" method="post">
             <label>Nombre: </label>
             <input type="text" name="nombre">
             <label>Contraseña</label>
             <input type="password" name="contrasena">
             <input type="submit" value="enviar">
         </form>
     </div>
</body>
</html>