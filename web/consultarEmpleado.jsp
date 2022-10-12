<%-- 
    Document   : consultarEmpleado
    Created on : Sep 13, 2022, 9:41:50 AM
    Author     : Damian
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.EmpleadoVO"%>
<%@page import="ModeloDAO.EmpleadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar Empleado</title>
    </head>
    <body>
        <h1>Consultar empleado</h1>

        <form method="post" action="Empleados">

            <span>Ingrese el número de documento del empleado</span><br>
            <input type="text" name="txtNumeroDocumento">

            <button>Consultar</button>
            <input type="hidden" value="3" name="opcion">
        </form>
        
        <div>
            <% 
            if (request.getAttribute("MensajeError") != null) {                                    
            %>
            ${MensajeError} <%};%>
        </div>
        <table border="1"><tr>
          
                <th>Nombres</th>
                <th>Apellidos</th>
                <th>Estado</th>
                <th>Numero Documento</th>
                <th>Correo</th>
     
            </tr>
            <%
                EmpleadoVO empVO = new EmpleadoVO();
                EmpleadoDAO empDAO = new EmpleadoDAO();
                ArrayList<EmpleadoVO> listaEmpleado = empDAO.Listar();
                for (int i = 0; i < listaEmpleado.size(); i++) {
                    empVO = listaEmpleado.get(i);
            %>
            <tr>
           
                <td><%= empVO.getNombre()%></td>
                <td> <%= empVO.getApellidos()%></td>
                <td> <%=empVO.getEstado()%> </td>
                <td> <%= empVO.getNumeroDocumento()%> </td>
                <td> <%= empVO.getCorreo()%> </td>
             
            </tr>
            <%}%>
        </table>




    </body>
</html>

