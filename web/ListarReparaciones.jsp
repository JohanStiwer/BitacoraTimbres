<%-- 
    Document   : ListarReparaciones
    Created on : Oct 23, 2022, 8:50:47 PM
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

        <table border="1">
            <tr>
                <th>idReparacion</th>
                <th>idTimbre </th>
                <th>idEmpleado </th>
                <th>numeroSolicitud</th>
                <th>motivoDeArreglo</th>
                <th>fechaReparacion	</th>
                <th>fechaReporte	</th>
                <th>fotoReparacion</th>
                <th>EstadoSolicitud	va</th>
            </tr>
            <%
                ReparacionVO repVO = new ReparacionVO();
                ReparacionDAO repDAO = new ReparacionDAO();
                ArrayList<ReparacionVO> listarReparacion = repDAO.listarReparacion();
                for (int i = 0; i < listarReparacion.size(); i++) {
                        repVO = listarReparacion.get(i);                    
            %>
            <tr>
                <td><%= repVO.getIdReparacion()%></td>
                <td><%= repVO.getIdTimbre()%></td>
                <td><%= repVO.getIdEmpleado() %></td>
                <td><%= repVO.getNumeroSolicitud() %> </td>
                <td> <%= repVO.getMotivoArreglo() %> </td>
                <td><%= repVO.getFechaReparacion() %> </td>
                <td><%= repVO.getFechaReporte() %> </td>
                <td> <%= repVO.getFotoReparacion() %> </td>
                <td> <img src="<%= repVO.getEstadoSolicitud() %>" width="50px" ></td>
            </tr>
            <%}%>
        </table>

    </body>
</html>
