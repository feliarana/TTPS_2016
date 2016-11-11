<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%if (session.getAttribute("habilitado") !=null) {%>
  <form action="AgregarMsj" method="post">
   <label for="mensaje">Mensaje :</label><textarea rows="4" cols="50" name="mensaje" id="mensaje" required></textarea>
   <input type="submit" value="Agregar msj">
  </form> 
  <%}else{
	 response.sendRedirect("visualizarMensajes.jsp");
   }%>
  
</body>
</html>