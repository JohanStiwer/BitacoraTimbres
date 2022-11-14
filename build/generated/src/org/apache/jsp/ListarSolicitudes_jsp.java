package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.EmpleadoVO;
import ModeloVO.TimbreVO;
import java.util.ArrayList;
import ModeloDAO.ReparacionDAO;
import ModeloVO.ReparacionVO;
import ModeloVO.EmpleadoVO;

public final class ListarSolicitudes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/sesiones.jsp");
    _jspx_dependants.add("/VistasParciales/nav.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    response.setHeader("Pragma", "No-cache");
    response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
    response.setDateHeader("Expires", 0);

      out.write('\n');
      out.write('\n');

    HttpSession buscarSesion = (HttpSession) request.getSession();
    String nombre = "", numeroDocumento = "", idEmpleado = "";
    if (buscarSesion.getAttribute("datosEmpleado") == null) {
        request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);
    } else {
        EmpleadoVO empVO = (EmpleadoVO)buscarSesion.getAttribute("datosEmpleado");
        nombre = empVO.getNombre();
        numeroDocumento = empVO.getNumeroDocumento();
        idEmpleado = empVO.getIdEmpleado();
    }


      out.write('\n');
      out.write("<header>\n");
      out.write("    <a href=\"landingPage.jsp\"><img class=\"LogoTitulo\" src=\"Css/recursos/LogoHeader.svg\"></a>\n");
      out.write("\n");
      out.write("    <input type=\"checkbox\" id=\"menu-bar\">\n");
      out.write("    <label for=\"menu-bar\" class=\"fas fa-bars\"></label>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar\">\n");
      out.write("        <a href=\"RegistrarEmpleado.jsp\">Registrar Empleado</a>\n");
      out.write("        <a href=\"ListarSolicitudes.jsp\">Lista de reparaciones</a>\n");
      out.write("        <a href=\"consultarEmpleado.jsp\">Actualizar empleado </a>\n");
      out.write("        <a href=\"RegistrarReparacion.jsp\">Registrar solicitud</a>\n");
      out.write("        <a class=\"active\" href=\"../iniciarSesion.jsp\">Iniciar Sesión</a>\n");
      out.write("        <form method=\"post\" action=\"Sesiones\">\n");
      out.write("            <div>\n");
      out.write("                <input  type=\"submit\" value=\"Cerrar Sesion\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <div class=\"col-4\">\n");
      out.write("                <label>Número de solicitud</label>\n");
      out.write("                <input id=\"buscarSolicitud\" type=\"text\" onKeypress=\"if (event.keyCode < 45 || event.keyCode > 57)\n");
      out.write("                            event.returnValue = false;\" maxlength=\"14\" onkeyup=\"doSearch()\" placeholder=\"Ingrese el número de solicitud\"  class=\"form-control\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <table border=\"1\" id=\"datos\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
                ReparacionVO repVO = new ReparacionVO();
                ReparacionDAO repDAO = new ReparacionDAO();

                ArrayList<ReparacionVO> listarReparacion = repDAO.listarSolicitud();
                for (int i = 0; i < listarReparacion.size(); i++) {
                    repVO = listarReparacion.get(i);
            
      out.write("\n");
      out.write("       \n");
      out.write("            <div class=\"card\" style=\"width: 18rem;\">\n");
      out.write("                <img src=\"");
      out.print( repVO.getFotoReparacion());
      out.write("\" class=\"card-img-top\" alt=\"Sin imagen\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\"> Solicitud Nº:  ");
      out.print( repVO.getNumeroSolicitud());
      out.write(" </h5>\n");
      out.write("                    <h5 class=\"card-title\">Piso ");
      out.print( repVO.getPiso());
      out.write(" habitación  ");
      out.print( repVO.getHabitacion());
      out.write("</h5>\n");
      out.write("                    <p class=\"card-text\">Motivo de arreglo: ");
      out.print( repVO.getMotivoArreglo());
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"list-group list-group-flush\">\n");
      out.write("                    <li class=\"list-group-item\"> Reparado por: ");
      out.print( repVO.getNombre());
      out.write(' ');
      out.print( repVO.getApellidos());
      out.write("</li>\n");
      out.write("                    <li class=\"list-group-item\"> Fecha de reporte: ");
      out.print( repVO.getFechaReporte());
      out.write(" </li>\n");
      out.write("                    <li class=\"list-group-item\">Fecha de reparacion:  ");
      out.print( repVO.getFechaReparacion());
      out.write(" </li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Editar solicitud</a>\n");
      out.write("                     <p class=\"card-text\">Estado solicitud: ");
      out.print( repVO.getEstadoSolicitud() );
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("     \n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <script src=\"JavaScript/Buscador.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
