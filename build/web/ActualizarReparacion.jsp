<%-- 
    Document   : ActualizarReparacion
    Created on : 21/11/2022, 04:32:57 PM
    Author     : STIWER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ModeloVO.ReparacionVO"%>
<%@page import="ModeloVO.EmpleadoVO" %>
<%@page import="ModeloDAO.TimbreDAO" %>
<%@page import="ModeloVO.TimbreVO" %>
<%@page import="ModeloDAO.EmpleadoDAO" %>
<%@page import="ModeloVO.EmpleadoVO" %>
<%@include file="sesiones.jsp"%>
<%@include file="VistasParciales/nav.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Icono -->
        <link rel="shortcut icon" href="IMG/logoClinica.svg" />
        <title>Actualizar solicitud</title>
    </head>
    <body>
        <%           
              
          ReparacionVO repVO = (ReparacionVO) request.getAttribute("datosReparacion");
          ReparacionVO repIds = (ReparacionVO) request.getAttribute("obtenerIds");
          if (repVO != null) {
              if (repIds != null) {

        %>
        <div class="container mt-4">
            <div class="card-body">
                <div class="card-body">

                    <div class="form-outline mb-4">
                        <label>Evidencia de daño: </label>
                        <img  src="<%=repVO.getFotoReparacion()%>" class="card-img-top" name="fileReparacion" alt="Sin imagen">
                    </div>
                    <h5 class="card-title">Actualizar solicitud</h5>
                    <form method="post" action="Reparacion" enctype="multipart/form-data">
                        <section class="card my-4">


                            <!-- 2 column grid layout with text inputs for the first and last names -->
                            <!-- Foto reparacion input -->

                            <!-- Timbre input -->
                            <div class="form-outline mb-4">

                                <select required="" class="form-select" name="txtidTimbre"> 
                                    <option selected value="<%=repVO.getIdTimbre()%>"> <%=repVO.getHabitacion()%> piso <%=repVO.getPiso()%></option>
                                    <%
                                        TimbreDAO timDAO = new TimbreDAO();

                                        for (TimbreVO timVO : timDAO.Listar()) {
                                    %>
                                    <option value="<%=timVO.getIdTimbre()%>"><%=timVO.getHabitacion()%> </option>
                                    <%}%>
                                </select>
                            </div>

                            <!-- Empleado input -->
                            <div class="form-outline mb-4">
                                <select required="" class="form-select" name="txtidEmpleado">
                                    <option selected value="<%=repVO.getIdEmpleado()%>"> <%=repVO.getNombre()%> <%=repVO.getApellidos()%></option>
                                    <%
                                        EmpleadoDAO empDAO = new EmpleadoDAO();

                                        for (EmpleadoVO empVO : empDAO.Listar()) {

                                    %>
                                    <option value="<%=empVO.getIdEmpleado()%>"> <%=empVO.getNombre()%>  <%=empVO.getApellidos()%>  </option>
                                    <%}%>
                                </select>                     
                            </div>
                            <!-- MotivoArreglo input -->
                            <div class="row mb-4">
                                <div class="col">
                                    <div class="form-outline">
                                        <input type="text" id="form6Example2" class="form-control" name="txtmotivoArreglo" value="<%=repVO.getMotivoArreglo()%>"/>
                                        <label class="form-label" for="form6Example2" >Motivo arreglo</label>
                                    </div>
                                </div>
                            </div>

                            <!-- EstadoSolicitud input -->

                            <div class="form-outline mb-4">
                                <label class="form-label"  >Estado</label>
                                <select name="txtestadoSolicitud" class="form-select">
                                    <option selected="true" value="<%= repVO.getEstadoSolicitud()%>"><%= repVO.getEstadoSolicitud()%></option>
                                    <option value="Pendiente">Pendiente</option>
                                    <option value="Completa">Completa</option>
                                </select>
                            </div>
                            <!-- Text input -->
                            <div class="form-outline mb-4">
                                <input type="date" id="form6Example3" class="form-control" name="txtfechaReporte" value="<%= repVO.getFechaReporte()%>"/>
                                <label class="form-label" for="form6Example3">Fecha reporte</label>
                            </div>

                            <!-- Text input -->
                            <div class="form-outline mb-4">
                                <input type="text" id="form6Example3" class="form-control" name="txtnumeroSolicitud" value="<%=repVO.getNumeroSolicitud()%>"/>
                                <label class="form-label" for="form6Example3"> Número de solicitud </label>
                            </div>
                            <!-- Text input -->

                            <div class="form-outline mb-4">
                                <input type="date" id="form6Example3" class="form-control" name="txtfechaReparacion" value="<%=repVO.getFechaReparacion()%>"/>
                                <label class="form-label" for="form6Example3">Fecha Reparacion </label>
                            </div>


                            <div class="card-head">
                                <input type="hidden" value="<%=repVO.getIdReparacion()%>" name="txtIdReparacion">
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
                            <!-- Submit button -->
                            <button type="submit" class="btn btn-primary btn-block mb-4">Actualizar </button>
                            <input type="hidden" value="3" name="opcion">
                            <a class="btn btn-outline-success" href="ListarSolicitudes.jsp">Regresar</a>
                            </div>
                        </section>
                    </form>
                    <%
                        } else {
                            request.getRequestDispatcher("ListarSolicitudes.jsp").forward(request, response);
                        }
                    %>
                    <%
                        } else {
                            request.getRequestDispatcher("ListarSolicitudes.jsp").forward(request, response);
                        }
                    %>

                </div>



                </body>
                </html>
