<%-- 
    Document   : RegistrarEmpleado
    Created on : Sep 1, 2022, 9:27:33 AM
    Author     : Damian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sesiones.jsp"%>
<%@include file="VistasParciales/nav.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="Empleados" id="formulario">

            <div class="formulario__grupo" id="grupo__nombre">
                <label for="nombre" class="formulario__label">Nombres</label>
                <div class="formulario__grupo-input">
                    <input required="" type="text" class="formulario__input" name="txtNombre" id="nombre" placeholder="Ingrese Nombres">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>

            </div>


            <div class="formulario__grupo" id="grupo__apellido">
                <label for="apellido" class="formulario__label">Apellidos</label>
                <div class="formulario__grupo-input">
                    <input required="" type="text" class="formulario__input" name="txtApellidos" id="apellido" placeholder="Ingrese Apellidos">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>

            </div>




            <div class="formulario__grupo" id="grupo__numeroDocumento">
                <label for="numeroDocumento" class="formulario__label">Número de Documento</label>
                <div class="formulario__grupo-input">
                    <input required="" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                                event.returnValue = false;" maxlength="14" type="text" class="formulario__input" name="txtNumeroDocumento" id="numeroDocumento" placeholder="Ingrese Documento">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>

            </div>


            <div class="formulario__grupo" id="grupo__email">
                <label for="email" class="formulario__label">Correo Electrónico</label>
                <div class="formulario__grupo-input">
                    <input required=""  type="email" class="formulario__input" name="txtEmail" id="email" placeholder="correo@correo.com">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>

                <div class="formulario__grupo" id="grupo__password">
                    <label for="password" class="formulario__label">Contraseña </label>
                    <div class="formulario__grupo-input">
                        <input required=""  type="password" class="formulario__input" name="txtClave" id="clave" placeholder="digite su contraseña">
                        <i class="formulario__validacion-estado fas fa-times-circle"></i>
                    </div>

                    <div class="formulario__grupo" id="grupo__password">
                        <label for="password" class="formulario__label">Confirme su contraseña</label>
                        <div class="formulario__grupo-input">
                            <input required=""  type="password" class="formulario__input" name="claveConfirmacion" id="clave" placeholder="confirme su contraseña">
                            <i class="formulario__validacion-estado fas fa-times-circle"></i>
                        </div>
                        <div style="color:red;">
                            <%
                                if (request.getAttribute("claveIncorrecta") != null) {%>
                            ${claveIncorrecta}
                            <% } else {%> 
                            ${claveCorrecta} 
                            <%}%>
                        </div>

                        <div style="color:red;">
                            <%
                                if (request.getAttribute("MensajeError") != null) {%>
                            ${mensajeError}
                            <% } else {%>
                            ${MensajeExito}
                            <%}%>
                        </div>

                    </div>
                    <input type="hidden" value="Activo" name="txtEstado" >

                    <button type="submit">Registrar Empleado</button>
                    <input type="hidden" value="1" name="opcion">
                    </form>

                    </body>
                    </html>
