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
       <label for="contraseņa">Contrase&ntilde;a</label><input type="password" name="contraseņa" id="contrseņa" required><br>
       <input type="submit" value="Login">
     </form>
</body>
</html>