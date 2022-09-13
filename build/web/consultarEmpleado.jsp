<%-- 
    Document   : consultarEmpleado
    Created on : Sep 13, 2022, 9:41:50 AM
    Author     : Damian
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.EmpleadoVO"%>
<%@page import="ModeloDAO.EmpleadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consultar empleado</title>
    </head>
    <body>
        <h1>Consultar Empleados</h1>
        <form method="post" action="Empleado" class="">
            <table id="datos">
                <thead>
                    <tr>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Numero de documento</th>
                        <th>Estado</th>
                        <th>Correo electronico</th>
                    </tr>
                </thead>
                <%--Llamamos al metodo de listar empledo --%>
                <%
                    EmpleadoDAO empDAO = new EmpleadoDAO();
                    ArrayList<EmpleadoVO> listaEmpleados = empDAO.obtenerEmpleados();
                    for (EmpleadoVO empVO : listaEmpleados) {
                %>
                <tr>
                    <td><%=empVO.getNombre()%></td>
                    <td><%=empVO.getApellidos()%></td>
                    <td><%=empVO.getNumeroDocumento()%></td>
                    <td><%=empVO.getEstado()%></td>
                    <td><%=empVO.getCorreo()%></td>
                    <td>
                        <form method="post" action="Empleado">
                            <input name="txtNumeroDocumento" type="hidden" value="<%= empVO.getNumeroDocumento()%>"> 
                            <button class="btn btn-inverse-info btn-icon"><i class="ti-pencil"></i></button>
                            <input type="hidden" value="4" name="opcion">
                        </form>
                    </td>


                    <% }%>
                </tr>
            </table>
        </form>
    </body>
</html>
