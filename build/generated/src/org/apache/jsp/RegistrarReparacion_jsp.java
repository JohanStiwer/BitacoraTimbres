package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.EmpleadoVO;
import ModeloDAO.EmpleadoDAO;
import ModeloDAO.TimbreDAO;
import ModeloVO.TimbreVO;
import ModeloVO.EmpleadoVO;

public final class RegistrarReparacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<header >\n");
      out.write("    <label for=\"menu-bar\" class=\"fas fa-bars\"></label>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-light\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\"></a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" aria-current=\"page\" href=\"RegistrarEmpleado.jsp\">Registrar Empleado</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"ListarSolicitudes.jsp\">Lista de reparaciones</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"consultarEmpleado.jsp\">Actualizar empleado</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"RegistrarReparacion.jsp\">Registrar solicitud</a>\n");
      out.write("                    </li>\n");
      out.write("            </div>\n");
      out.write("            <form method=\"post\" class=\"d-flex\" action=\"Sesiones\">\n");
      out.write("                <div>\n");
      out.write("                    <input class=\"btn btn-outline-success\" type=\"submit\" value=\"Cerrar Sesion\">\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar Reparacion</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Formulario de registro</h1>\n");
      out.write("        <form action=\"Reparacion\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <div>\n");
      out.write("                <label>Fecha reporte</label>\n");
      out.write("                <input name=\"txtfechaReporte\" type=\"date\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Numero de timbre</label>\n");
      out.write("                <select name=\"txtidTimbre\">      \n");
      out.write("                    <option selected disabled>Seleccione numero de timbre</option>\n");
      out.write("                    ");
                        TimbreDAO timbreDAO = new TimbreDAO();
                        for (TimbreVO timbreVO : timbreDAO.Listar()) {
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print( timbreVO.getIdTimbre());
      out.write('"');
      out.write('>');
      out.print( timbreVO.getPiso());
      out.write(" º habitacion ");
      out.print( timbreVO.getHabitacion());
      out.write(" </option>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Numero de solicitud</label>\n");
      out.write("                <input name=\"txtnumeroSolicitud\">\n");
      out.write("            </div>\n");
      out.write("        <div>\n");
      out.write("            <label>Motivo arreglo</label>\n");
      out.write("                <input name=\"txtmotivoArreglo\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Evidencia de daño</label>\n");
      out.write("                <input name=\"fileReparacion\" type=\"file\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Empleado</label>\n");
      out.write("                <select name=\"txtidEmpleado\">      \n");
      out.write("                    <option selected disabled>Seleccione un empleado</option>\n");
      out.write("                    ");

                        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
                        for (EmpleadoVO empleadoVO : empleadoDAO.Listar()) {
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print( empleadoVO.getIdEmpleado());
      out.write('"');
      out.write('>');
      out.print(empleadoVO.getNombre());
      out.write(' ');
      out.print(empleadoVO.getApellidos());
      out.write("</option>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </select>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Fecha reparacion</label>\n");
      out.write("                <input name=\"txtfechaReparacion\" type=\"date\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Estado de solicitud</label>\n");
      out.write("                <select name=\"txtestadoSolicitud\">\n");
      out.write("                    <option value=\"Pendiente\">Pendiente</option>\n");
      out.write("                    <option value=\"Completa\">Completada</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"color:red;\">\n");
      out.write("                ");

                    if (request.getAttribute("claveIncorrecta") != null) {
      out.write("\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${claveIncorrecta}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                ");
 } else {
      out.write(" \n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${claveCorrecta}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div style=\"color:red;\">\n");
      out.write("                ");

                    if (request.getAttribute("MensajeError") != null) {
      out.write("\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                ");
 } else {
      out.write("\n");
      out.write("                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("            <button> Registrar </button>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
