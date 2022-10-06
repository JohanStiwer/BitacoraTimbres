<%-- 
    Document   : RegistrarReparacion
    Created on : Oct 4, 2022, 8:08:02 PM
    Author     : Damian
--%>

<%@page import="ModeloVO.EmpleadoVO"%>
<%@page import="ModeloDAO.EmpleadoDAO"%>
<%@page import="ModeloDAO.TimbreDAO"%>
<%@page import="ModeloVO.TimbreVO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Reparacion</title>
    </head>
    <body>
        <h1>Formulario de registro</h1>
        <form action="Reparacion" method="post" enctype="multipart/form-data">
            <div>
                <label>Numero de timbre</label>
                <select name="txtidTimbre">      
                    <option selected disabled>Seleccione un horario</option>
                    <%
                    TimbreDAO timbreDAO = new TimbreDAO();
                    for(TimbreVO timbreVO : timbreDAO.Listar()){                                        
                    %>
                    <option value="<%= timbreVO.getIdTimbre() %>"><%= timbreVO.getHabitacion()%></option>
                     <%}%>
                </select>
            </div>
            <div>
                <label>Empleado</label>
                   <select name="txtidEmpleado">      
                    <option selected disabled>Seleccione un horario</option>
                    <%
                    EmpleadoDAO empleadoDAO = new EmpleadoDAO();
                    for(EmpleadoVO empleadoVO : empleadoDAO.Listar()){                                        
                    %>
                    <option value="<%= empleadoVO.getIdEmpleado() %>"><%=empleadoVO.getNombre()%> <%=empleadoVO.getApellidos()%></option>
                     <%}%>
                </select>
                
            </div>
            <div>
                <label>Numero de solicitud</label>
                <input name="txtnumeroSolicitud">
            </div>
            <div>
                <label>Motivo arreglo</label>
                <input name="txtmotivoArreglo">
            </div>
            <div>
                <label>Fecha reparacion</label>
                <input name="txtfechaReparacion" type="date">
            </div>
            <div>
                <label>Fecha reporte</label>
                <input name="txtfechaReporte" type="date">
            </div>
            <div>
                <label>Evidencia de daño</label>
                <input name="txtfotoReparacion" type="file">
            </div>
            <div>
                <label>Estado de solicitud</label>
                <select name="txtestadoSolicitud">
                    <option value="Pendiente">Pendiente</option>
                    <option value="Completa">Completada</option>
                </select>
            </div>

            <input type="hidden" value="1" name="opcion">
            <button> Registrar </button>
        </form>
    </body>
</html>
