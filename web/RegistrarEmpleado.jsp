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
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

        <title>Registrar Empleado</title>
    </head>
    <body>
        <form method="post" action="Empleados" id="formulario">

            <div class="mb-3">
                <label  class="form-label">Nombres</label>
                <input type="text" class="form-control" id="exampleFormControlInput1" name="txtNombre" placeholder="Inserte el nombre del empleado">
            </div>

            <div class="mb-3">
                <label class="form-label">Apellidos</label>
                <input type="text" class="form-control" id="exampleFormControlInput1" name="txtApellidos" placeholder="Inserte los apellidos del empleado">
            </div>

            <div class="mb-3">
                <label  class="form-label">Número de Documento</label>
                <input type="text" class="form-control" id="exampleFormControlInput1" name="txtNumeroDocumento" placeholder="Inserte el Número de documento">
            </div>

            <div class="mb-3">
                <label  class="form-label">Correo Electrónico</label>
                <input type="email" class="form-control" id="exampleFormControlInput1" name="txtEmail" placeholder="Inserte el correo el electronico">
            </div>
            <div class="mb-3">
                <label  class="form-label">Contraseña</label>
                <input type="password" class="form-control" id="exampleFormControlInput1" name="txtClave" placeholder="Inserte una contraseña">
            </div>
            <div class="mb-3">
                <label  class="form-label">Confirme su contraseña</label>
                <input type="password" class="form-control" id="exampleFormControlInput1" name="claveConfirmacion" placeholder="confirme la contraseña">
            </div>
            <div style="color:red;">
                <% if (request.getAttribute("claveIncorrecta") != null) {%>
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
            <input type="hidden" value="Activo" name="txtEstado" >
            <button type="submit" class="btn btn-primary">Registrar Empleado</button>           
            <input type="hidden" value="1" name="opcion">
        </form>


    </body>
</html>
