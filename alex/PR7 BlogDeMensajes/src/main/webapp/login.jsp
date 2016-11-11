<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
     <form action="Validar" method="post" >
       <label for="usuario">Usuario :</label><input type="text" name="usuario" id="usuario" required><br>
       <label for="contraseña">Contrase&ntilde;a</label><input type="password" name="contrasenia" id="contrasenia" required><br>
       <input type="submit" value="Login">
     </form>
</body>
</html>