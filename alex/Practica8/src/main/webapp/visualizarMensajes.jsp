<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@page import="java.util.List"  %>
</head>
<body>
  <%if(session.getAttribute("habilitado")!=null){ %>
      <%@include file="autenticado.jsp"%>   
  <%}
  else{%>
      <a href="login.jsp">Iniciar sesi&oacute;n</a>
  <%}%>
    <%if(session.getAttribute("mensajes")!=null){%>
      <center><h1>Mensajes:</h1></center>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
      <c:forEach var="msjs" items="${mensajes}">
        <c:out value="${msjs.mensaje}"/>
        <c:out value="${msjs.usuario.usuario}"/>
      </c:forEach>
    <%} %>   
</body>
</html>