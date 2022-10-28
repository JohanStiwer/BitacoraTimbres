<%-- 
    Document   : iniciarSesion
    Created on : Oct 27, 2022, 10:24:26 PM
    Author     : Damian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Iniciar Sesion</h1>
        <form method="post" action="Empleados">
            <label>Numero de documento</label>
            <input type="text" name="txtNumeroDocumento">
            <label> Contraseña</label>
            <input type="password" name="txtClave">


            <button type="submit">Iniciar sesion </button>
            <input type="hidden" value="5" name="opcion">
            <div style="color:red;">
                <%
                if (request.getAttribute("MensajeError") != null) {%>
                ${MensajeError}
                <% } else {%>
                ${MensajeExito}
                <%}%>
            </div>
        </form>



    </body>
</html>
