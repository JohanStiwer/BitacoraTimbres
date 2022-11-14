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
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="CSS/estilosLogin.css">
        <title>Iniciar Sesion</title>
    </head>
    <body>


        <div class="wrapper fadeInDown">
            <div id="formContent">
                <!-- Tabs Titles -->

                <!-- Icon -->
                <div class="fadeIn first">
                    <img src="IMG/LOGO-LOGIN-CNEL.webp" id="icon" alt="User Icon" height="50" />
                </div>

                <!-- Login Form -->
                <form method="post" action="Empleados">
                    <input type="text" id="login" class="fadeIn second" name="txtNumeroDocumento" placeholder="numero de documento">
                    <input type="password" id="password" class="fadeIn third" name="txtClave" placeholder="contraseña">
                    <input type="hidden" value="5" name="opcion">
                    <input type="submit" class="fadeIn fourth" value="Inisiar sesion">
                </form>

                <!-- Remind Passowrd -->
                <div id="formFooter">

                    <div style="color:red;">
                        <%
                    if (request.getAttribute("MensajeError") != null) {%>
                        ${MensajeError}
                        <% } else {%>
                        ${MensajeExito}
                        <%}%>
                    </div>
                </div>

            </div>
        </div>


    </body>
</html>
