<%-- 
    Document   : ListarReparaciones
    Created on : Oct 23, 2022, 8:50:47 PM
    Author     : Damian
--%>

<%@page import="ModeloVO.EmpleadoVO"%>
<%@page import="ModeloVO.TimbreVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloDAO.ReparacionDAO"%>
<%@page import="ModeloVO.ReparacionVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="form-group">
            <div class="col-4">
                <label>Número de solicitud</label>
                <input id="buscarSolicitud" type="text" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                            event.returnValue = false;" maxlength="14" onkeyup="doSearch()" placeholder="Ingrese el número de solicitud"  class="form-control"/>
            </div>
        </div>
        <table border="1" id="datos">
            <tr>
                <th>Piso</th>
                <th>Habitacion </th>
                <th>Numero de solicitud </th>
                <th>Motivo Arreglo</th>
                <th>Fecha Reparacion</th>
                <th>Fecha Reporte	</th>
                <th>Foto reparacion	</th>
                <th>Nombre</th>
                <th>Apellidos </th>
            </tr>
            <%
                ReparacionVO repVO = new ReparacionVO();
                ReparacionDAO repDAO = new ReparacionDAO();

                ArrayList<ReparacionVO> listarReparacion = repDAO.listarSolicitud();
                for (int i = 0; i < listarReparacion.size(); i++) {
                    repVO = listarReparacion.get(i);
            %>
            <tr>
                <td><%= repVO.getPiso()%></td>
                <td><%= repVO.getHabitacion()%></td>
                <td><%= repVO.getNumeroSolicitud()%></td>
                <td><%= repVO.getMotivoArreglo()%> </td>
                <td> <%= repVO.getFechaReparacion()%> </td>
                <td><%= repVO.getFechaReporte()%> </td>
                <td><img src="<%= repVO.getFotoReparacion()%>" height="50px"> </td>
                <td><%= repVO.getNombre()%> </td>
                <td><%= repVO.getApellidos()%> </td>
            </tr>
            <%}%>
        </table>
        <script src="JavaScript/Buscador.js"></script>
    </body>
</html>
