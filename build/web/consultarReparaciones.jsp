<%-- 
    Document   : consultarReparaciones
    Created on : Oct 12, 2022, 9:01:05 AM
    Author     : Damian
--%>

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
        <h1>Consultar reparaciones</h1>
        <table border="1">
            <tr>
                <th>Id Reparaciones</th>
                <th>Id timbre</th>
                <th>Id Empleado</th>
                <th>Numero solicitud</th>
                <th>Motivo de arreglo</th>
                <th>Fecha reparacion</th>
                <th>Fecha reporte</th>
                <th>Foto daño</th>
                <th>Estado solicitud</th>

            </tr>
            <%
                ReparacionVO repVO = new ReparacionVO();
                ReparacionDAO repDAO = new ReparacionDAO();
                ArrayList<ReparacionVO> listaReparacion = repDAO.listarReparacion();
                for (int i = 0; i < listaReparacion.size(); i++) {
                    repVO = listaReparacion.get(i);
                
            %>
            <tr>
                <td><%=repVO.getIdReparacion()%></td>
                <td><%=repVO.getIdTimbre()%></td>
                <td><%=repVO.getIdEmpleado()%></td>
                <td><%=repVO.getNumeroSolicitud()%></td>
                <td><%=repVO.getMotivoArreglo()%></td>
                <td><%=repVO.getFotoReparacion()%></td>
                <td><%=repVO.getFechaReporte()%></td>
                <td><%=repVO.getFotoReparacion()%></td>
                <td><%=repVO.getEstadoSolicitud()%></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
