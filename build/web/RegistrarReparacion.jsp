<%@page import="ModeloVO.EmpleadoVO"%>
<%@page import="ModeloDAO.EmpleadoDAO"%>
<%@page import="ModeloDAO.TimbreDAO"%>
<%@page import="ModeloVO.TimbreVO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="sesiones.jsp"%>
<%@include file="VistasParciales/nav.jsp"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Icono -->
        <link rel="shortcut icon" href="IMG/logoClinica.svg" /> 
        <title>Registrar Reparacion</title>
    </head>
    <body>
        <section class="card my-4">
            <div class="card-head">
                <h5 class="card-title">Registro reparacion</h5>
            </div>
            <div class="card-body">
                <form action="Reparacion" method="post" enctype="multipart/form-data">
                    <div class="row mb-4">
                        <div class="col">
                            <label class="form-label">Fecha reporte</label>
                            <input name="txtfechaReporte" type="date" class="form-control">
                        </div>
                    </div>
                    <div class="row mb-4">
                        <div class="col">
                            <label class="form-label">Numero de timbre</label>
                            <select class="form-select" name="txtidTimbre">      
                                <option selected disabled>Seleccione numero de timbre</option>
                                <%                        TimbreDAO timbreDAO = new TimbreDAO();
                                    for (TimbreVO timbreVO : timbreDAO.Listar()) {
                                %>
                                <option value="<%= timbreVO.getIdTimbre()%>"><%= timbreVO.getPiso()%> º habitacion <%= timbreVO.getHabitacion()%> </option>
                                <%}%>
                            </select>
                        </div>
                    </div>
                    <div class="row mb-4">
                        <div class="col">
                            <label class="form-label">Numero de solicitud</label>
                            <input name="txtnumeroSolicitud" class="form-control">
                        </div>
                    </div>
                    <div class="row mb-4">
                        <div class="col">
                            <label class="form-label">Motivo arreglo</label>
                            <input class="form-control" name="txtmotivoArreglo">
                        </div>
                    </div>
                    <div class="row mb-4">
                        <div class="col">
                            <label class="form-label">Evidencia de daño</label>
                            <input class="form-control" name="fileReparacion" type="file">
                        </div>
                    </div>
                    <div class="row mb-4">
                        <div class="col">
                            <label class="form-label">Empleado</label>
                            <select  class="form-select" name="txtidEmpleado">      
                                <option selected disabled  class="form-control">Seleccione un empleado</option>
                                <%
                                    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
                                    for (EmpleadoVO empleadoVO : empleadoDAO.Listar()) {
                                %>
                                <option  class="form-control" value="<%= empleadoVO.getIdEmpleado()%>"><%=empleadoVO.getNombre()%> <%=empleadoVO.getApellidos()%></option>
                                <%}%>
                            </select>
                        </div>
                    </div>
                    <div class="row mb-4">
                        <div class="col">
                            <label class="form-label">Fecha reparacion</label>
                            <input class="form-control" name="txtfechaReparacion" type="date">
                        </div>
                    </div>
                    <div class="row mb-4">
                        <div class="col">
                            <label class="form-label">Estado de solicitud</label>
                            <select  class="form-select" name="txtestadoSolicitud" >
                                <option value="Pendiente" >Pendiente</option>
                                <option value="Completa" >Completada</option>
                            </select>
                        </div>
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

                    <input type="hidden" value="1" name="opcion">
                    <button class="btn btn-primary btn-block mb-4"> Registrar </button>

                </form>
            </div>
        </section>
    </body>
</html>