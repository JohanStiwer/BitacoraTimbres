package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.ReparacionVO;
import ModeloVO.EmpleadoVO;
import ModeloDAO.TimbreDAO;
import ModeloVO.TimbreVO;
import ModeloDAO.EmpleadoDAO;
import ModeloVO.EmpleadoVO;
import ModeloVO.EmpleadoVO;

public final class ActualizarReparacion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Actualizar solicitud</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
            ReparacionVO repVO = (ReparacionVO) request.getAttribute("datosReparacion");
            ReparacionVO repIds = (ReparacionVO) request.getAttribute("obtenerIds");
            if (repVO != null) {
                if (repIds != null) {

        
      out.write("\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                <div class=\"form-outline mb-4\">\n");
      out.write("                    <label>Evidencia de daño: </label>\n");
      out.write("                    <img  src=\"");
      out.print(repVO.getFotoReparacion());
      out.write("\" class=\"card-img-top\" name=\"fileReparacion\" alt=\"Sin imagen\">\n");
      out.write("                </div>\n");
      out.write("                <h5 class=\"card-title\">Actualizar solicitud</h5>\n");
      out.write("                <form method=\"post\" action=\"Reparacion\" enctype=\"multipart/form-data\">\n");
      out.write("                    <section class=\"card my-4\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <!-- 2 column grid layout with text inputs for the first and last names -->\n");
      out.write("                        <!-- Foto reparacion input -->\n");
      out.write("\n");
      out.write("                        <!-- Timbre input -->\n");
      out.write("                        <div class=\"form-outline mb-4\">\n");
      out.write("\n");
      out.write("                            <select required=\"\" name=\"txtidTimbre\"> \n");
      out.write("                                <option selected value=\"");
      out.print(repVO.getIdTimbre());
      out.write("\"> ");
      out.print(repVO.getHabitacion());
      out.write(" piso ");
      out.print(repVO.getPiso());
      out.write("</option>\n");
      out.write("                                ");

                                    TimbreDAO timDAO = new TimbreDAO();

                                    for (TimbreVO timVO : timDAO.Listar()) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(timVO.getIdTimbre());
      out.write('"');
      out.write('>');
      out.print(timVO.getHabitacion());
      out.write(" </option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Empleado input -->\n");
      out.write("                        <div class=\"form-outline mb-4\">\n");
      out.write("                            <select required=\"\" name=\"txtidEmpleado\">\n");
      out.write("                                <option selected value=\"");
      out.print(repVO.getIdEmpleado());
      out.write("\"> ");
      out.print(repVO.getNombre());
      out.write(' ');
      out.print(repVO.getApellidos());
      out.write("</option>\n");
      out.write("                                ");

                                    EmpleadoDAO empDAO = new EmpleadoDAO();

                                    for (EmpleadoVO empVO : empDAO.Listar()) {

                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(empVO.getIdEmpleado());
      out.write("\"> ");
      out.print(empVO.getNombre());
      out.write(' ');
      out.write(' ');
      out.print(empVO.getApellidos());
      out.write("  </option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select>                     \n");
      out.write("                        </div>\n");
      out.write("                        <!-- MotivoArreglo input -->\n");
      out.write("                        <div class=\"row mb-4\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <div class=\"form-outline\">\n");
      out.write("                                    <input type=\"text\" id=\"form6Example2\" class=\"form-control\" name=\"txtmotivoArreglo\" value=\"");
      out.print(repVO.getMotivoArreglo());
      out.write("\"/>\n");
      out.write("                                    <label class=\"form-label\" for=\"form6Example2\" >Motivo arreglo</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- EstadoSolicitud input -->\n");
      out.write("\n");
      out.write("                        <div class=\"form-outline mb-4\">\n");
      out.write("                            <label class=\"form-label\" for=\"form6Example5\" >Estado</label>\n");
      out.write("                            <select name=\"txtestadoSolicitud\">\n");
      out.write("                                <option selected=\"true\" value=\"");
      out.print( repVO.getEstadoSolicitud());
      out.write('"');
      out.write('>');
      out.print( repVO.getEstadoSolicitud());
      out.write("</option>\n");
      out.write("                                <option value=\"Pendiente\">Pendiente</option>\n");
      out.write("                                <option value=\"Completa\">Completa</option>\n");
      out.write("                            </select>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Text input -->\n");
      out.write("                        <div class=\"form-outline mb-4\">\n");
      out.write("                            <input type=\"date\" id=\"form6Example3\" class=\"form-control\" name=\"txtfechaReporte\" value=\"");
      out.print( repVO.getFechaReporte());
      out.write("\"/>\n");
      out.write("                            <label class=\"form-label\" for=\"form6Example3\">Fecha reporte</label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <!-- Text input -->\n");
      out.write("                        <div class=\"form-outline mb-4\">\n");
      out.write("                            <input type=\"text\" id=\"form6Example3\" class=\"form-control\" name=\"txtnumeroSolicitud\" value=\"");
      out.print(repVO.getNumeroSolicitud());
      out.write("\"/>\n");
      out.write("                            <label class=\"form-label\" for=\"form6Example3\"> Número de solicitud </label>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Text input -->\n");
      out.write("\n");
      out.write("                        <div class=\"form-outline mb-4\">\n");
      out.write("                            <input type=\"date\" id=\"form6Example3\" class=\"form-control\" name=\"txtfechaReparacion\" value=\"");
      out.print(repVO.getFechaReparacion());
      out.write("\"/>\n");
      out.write("                            <label class=\"form-label\" for=\"form6Example3\">Fecha Reparacion </label>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"card-head\">\n");
      out.write("                            <input type=\"text\" value=\"");
      out.print(repVO.getIdReparacion());
      out.write("\" name=\"txtIdReparacion\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div style=\"color:red;\">\n");
      out.write("                            ");
 if (request.getAttribute("claveIncorrecta") != null) {
      out.write("\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${claveIncorrecta}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            ");
 } else {
      out.write(" \n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${claveCorrecta}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div style=\"color:red;\">\n");
      out.write("                            ");

                                if (request.getAttribute("MensajeError") != null) {
      out.write("\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            ");
 } else {
      out.write("\n");
      out.write("                            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <!-- Submit button -->\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary btn-block mb-4\">Actualizar </button>\n");
      out.write("                        <input type=\"hidden\" value=\"3\" name=\"opcion\">\n");
      out.write("                        </div>\n");
      out.write("                    </section>\n");
      out.write("                </form>\n");
      out.write("                ");

                    } else {
                        request.getRequestDispatcher("ListarSolicitudes.jsp").forward(request, response);
                    }
                
      out.write("\n");
      out.write("                ");

                    } else {
                        request.getRequestDispatcher("ListarSolicitudes.jsp").forward(request, response);
                    }
                
      out.write("\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
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
