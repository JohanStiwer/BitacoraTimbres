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
        <title>Consultar empleado</title>
    </head>
    <div class="container-scroller">


        <div class="container-fluid page-body-wrapper">



            <div class="main-panel">
                <div class="content-wrapper">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="card-title">Consultar empleado</h4>
                            <p class="card-description">
                                Busque el empleado por su número de documento
                            </p>
                            <div class="form-group">
                                <div class="col-4">
                                    <label>Número de documento</label>
                                    <input id="buscarDocumento" type="text" onKeypress="if (event.keyCode < 45 || event.keyCode > 57)
                                                event.returnValue = false;" maxlength="14" onkeyup="doSearch()" placeholder="Ingrese documento"  class="form-control"/>
                                </div>
                            </div>
                            <form method="post" action="Empleado" class="form-sample">

                                <div class="row">
                                    <div class="col-12">
                                        <div class="table-responsive">
                                            <table class="table table-hover table-bordered" id="datos" >
                                                <thead>
                                                    <tr>
                                                        <th>Nombres</th>
                                                        <th>Apellidos</th>                                                  
                                                        <th>Número de documento</th>
                                                        <th>Estado</th>
                                                        <th>Correo electrónico</th>                                                        
                                                    </tr>
                                                </thead>

                                                <%
                                                    EmpleadoDAO empDAO = new EmpleadoDAO();
                                                    ArrayList<EmpleadoVO> listaEmpleado = empDAO.obtenerEmpleados();
                                                    for (EmpleadoVO EmpVO : listaEmpleado){

                                                %>
                                                <tr>
                                                    <td><%=EmpVO.getNombre()%></td>
                                                    <td><%=EmpVO.getApellidos() %></td>                                             
                                                    <td><%=EmpVO.getNumeroDocumento()%></td>
                                                    <td><%=EmpVO.getCorreo()%></td>                                            
                                                    <td><%=EmpVO.getEstado()%></td>
                                                    <td>

                                                    </td>
                                                    <td>

                                                    </td>
                                                    <% }%>
                                                </tr>
                                            </table>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>

    <script src="JavaScript/Buscador.js"></script>
    <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>

</body>
</html>
