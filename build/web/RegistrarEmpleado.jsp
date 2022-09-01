<%-- 
    Document   : RegistrarEmpleado
    Created on : Sep 1, 2022, 9:27:33 AM
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
        <form method="post" action="Empleado" id="formulario">

            <div class="formulario__grupo" id="grupo__nombre">
                <label for="nombre" class="formulario__label">Nombres</label>
                <div class="formulario__grupo-input">
                    <input required="" type="text" class="formulario__input" name="txtNombre" id="nombre" placeholder="Ingrese Nombres">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">Los Nombres no pueden tener caracteres epeciales.</p>
            </div>


            <div class="formulario__grupo" id="grupo__apellido">
                <label for="apellido" class="formulario__label">Apellidos</label>
                <div class="formulario__grupo-input">
                    <input required="" type="text" class="formulario__input" name="txtApellidos" id="apellido" placeholder="Ingrese Apellidos">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">Los Apellidos no pueden tener caracteres epeciales.</p>
            </div>




            <div class="formulario__grupo" id="grupo__numeroDocumento">
                <label for="numeroDocumento" class="formulario__label">Número de Documento</label>
                <div class="formulario__grupo-input">
                    <input required="" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                                event.returnValue = false;" maxlength="14" type="text" class="formulario__input" name="txtNumeroDocumento" id="numeroDocumento" placeholder="Ingrese Documento">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">Ingrese un número de documento valido.</p>
            </div>


            <div class="formulario__grupo" id="grupo__email">
                <label for="email" class="formulario__label">Correo Electrónico</label>
                <div class="formulario__grupo-input">
                    <input required=""  type="email" class="formulario__input" name="txtEmail" id="email" placeholder="correo@correo.com">
                    <i class="formulario__validacion-estado fas fa-times-circle"></i>
                </div>
                <p class="formulario__input-error">Ingrese un correo electrónico valido.</p>
            </div>



            <span>Estado</span><br>


            <input type="hidden" value="1" name="txtEstado" >

            <button type="submit">Continuar</button>
            <input type="hidden" value="1" name="opcion">
        </form>

    </body>
</html>
