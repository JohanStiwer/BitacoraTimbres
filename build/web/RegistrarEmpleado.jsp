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
        <!--Icono -->
        <link rel="shortcut icon" href="IMG/logoClinica.svg" />
        <title>Registrar Empleado</title>
    </head>
    <body>

        <form method="post" action="Empleados" id="formulario" class="container custm-container">
            <section class="card my-4">
                <div class="card-head">
                </div>
                <div class="card-body">
                    <h5 class="card-title">Registro empleado</h5>
                    <!-- 2 column grid layout with text inputs for the first and last names -->
                    <div class="row mb-4">
                        <div class="col">
                            <div class="form-outline">
                                <input type="text" id="form6Example1" class="form-control" name="txtNombre"/>
                                <label class="form-label" for="form6Example1" >Nombres</label>
                            </div>
                        </div>
                        <div class="col">
                            <div class="form-outline">
                                <input type="text" id="form6Example2" class="form-control" name="txtApellidos"/>
                                <label class="form-label" for="form6Example2" >Apellidos</label>
                            </div>
                        </div>
                    </div>

                    <!-- Text input -->
                    <div class="form-outline mb-4">
                        <input type="text" id="form6Example3" class="form-control" name="txtNumeroDocumento"/>
                        <label class="form-label" for="form6Example3" >Número de Documento</label>
                    </div>

                    <!-- Email input -->
                    <div class="form-outline mb-4">
                        <input type="email" id="form6Example5" class="form-control"name="txtEmail" />
                        <label class="form-label" for="form6Example5" >Correo Electrónico</label>
                    </div>

                    <!-- Text input -->
                    <div class="form-outline mb-4">
                        <input type="password" id="form6Example3" class="form-control" name="txtClave" />
                        <label class="form-label" for="form6Example3">Contraseña</label>
                    </div>
                    <!-- Text input -->
                    <div class="form-outline mb-4">
                        <input type="password" id="form6Example3" class="form-control" name="claveConfirmacion"/>
                        <label class="form-label" for="form6Example3">Confirme su contraseña</label>
                    </div>
                    <!-- Estado Input -->
                    <input type="hidden" value="Activo" name="txtEstado" >

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
                    <!-- Submit button -->
                    <button type="submit" class="btn btn-primary btn-block mb-4">Registrar</button>
                    <input type="hidden" value="1" name="opcion">


                </div>
            </section>
        </form>


        <%@include file="VistasParciales/footer.jsp"%>  
    </body>
</html>
