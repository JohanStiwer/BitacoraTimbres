<%-- 
    Document   : ActualizarEmpleado
    Created on : Sep 16, 2022, 10:26:28 PM
    Author     : Damian
--%>

<%@page import="ModeloVO.EmpleadoVO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar empleado</title>
    </head>
    <body>
        <h1>Actualize el empleado</h1>

    <center>

        <%

            EmpleadoVO empVO = (EmpleadoVO) request.getAttribute("EmpleadoConsultado");

            if (empVO != null) {

        %>

        <form method="post" action="Empleado">
            <table>
                <tr>
                    <th>
                        Nombre
                        <input type="text" name="txtNombre" value="<%=empVO.getNombre()%>">
                    </th>
                    <th>
                        Apellido
                        <input type="text" name="txtApellido" value="<%=empVO.getApellidos()%>">
                    </th>
                    <th>
                        Estado
                        <input type="text" name="txtApellido" value="<%=empVO.getEstado()%>">                        
                    </th>
                    <th>
                        Numero documento
                        <input type="text" name="txtNumeroDocumento" value="<%=empVO.getNumeroDocumento()%>">
                    </th>
                    <th>
                        Correo Electronico
                        <input type="text" name="txtEmail" value="<%=empVO.getCorreo()%>">
                    </th>
                </tr>
            </table>
                    <input type="hidden" value="2" name="opcion">
                    <button> Actualizar </button>
                    <a href="consultarEmpleado.jsp">Volver </a>
        </form>

        <%
        } else{
            request.getRequestDispatcher("consultarEmpleado.jsp").forward(request, response);
            }    
        %>

    </center>
</body>
</html>
