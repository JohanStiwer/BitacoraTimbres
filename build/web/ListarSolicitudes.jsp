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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<%@include file="sesiones.jsp"%>
<%@include file="VistasParciales/nav.jsp"%>

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
        <div class="container">    
            
        <table border="1" id="datos">
            <%                ReparacionVO repVO = new ReparacionVO();
                ReparacionDAO repDAO = new ReparacionDAO();

                ArrayList<ReparacionVO> listarReparacion = repDAO.listarSolicitud();
                for (int i = 0; i < listarReparacion.size(); i++) {
                    repVO = listarReparacion.get(i);
            %>
       
            <div class="card col-md-6" style="width: 18rem;">
                <img  src="<%= repVO.getFotoReparacion()%>" class="card-img-top" alt="Sin imagen">
                <div class="card-body">
                    <h5 class="card-title"> Solicitud Nº:  <%= repVO.getNumeroSolicitud()%> </h5>
                    <h5 class="card-title">Piso <%= repVO.getPiso()%> habitación  <%= repVO.getHabitacion()%></h5>
                    <p class="card-text">Motivo de arreglo: <%= repVO.getMotivoArreglo()%></p>
                </div>
                <ul class="list-group list-group-flush">
                    <li class="list-group-item"> Reparado por: <%= repVO.getNombre()%> <%= repVO.getApellidos()%></li>
                    <li class="list-group-item"> Fecha de reporte: <%= repVO.getFechaReporte()%> </li>
                    <li class="list-group-item">Fecha de reparacion:  <%= repVO.getFechaReparacion()%> </li>
                </ul>
                <div class="card-body">
                     <p class="card-text">Estado solicitud: <%= repVO.getEstadoSolicitud() %></p>
                    <a href="#" class="btn btn-primary">Editar solicitud</a>                    
                </div>
            </div>     
            <%}%>
        </table>
        </div>
 
        <script src="JavaScript/Buscador.js"></script>
    </body>
</html>
