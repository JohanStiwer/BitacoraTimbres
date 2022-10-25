package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.EmpleadoVO;
import ModeloDAO.EmpleadoDAO;
import ModeloDAO.TimbreDAO;
import ModeloVO.TimbreVO;

public final class RegistrarReparacion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("                <label>Numero de timbre</label>\n");
      out.write("                <select name=\"txtidTimbre\">      \n");
      out.write("                    <option selected disabled>Seleccione numero de timbre</option>\n");
      out.write("                    ");

                        TimbreDAO timbreDAO = new TimbreDAO();
                        for (TimbreVO timbreVO : timbreDAO.Listar()) {
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print( timbreVO.getIdTimbre());
      out.write("\">piso ");
      out.print( timbreVO.getPiso() );
      out.write(" habitacion ");
      out.print( timbreVO.getHabitacion());
      out.write(" </option>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Empleado</label>\n");
      out.write("                <select name=\"txtidEmpleado\">      \n");
      out.write("                    <option selected disabled>Seleccione un horario</option>\n");
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
      out.write("                <label>Numero de solicitud</label>\n");
      out.write("                <input name=\"txtnumeroSolicitud\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Motivo arreglo</label>\n");
      out.write("                <input name=\"txtmotivoArreglo\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Fecha reparacion</label>\n");
      out.write("                <input name=\"txtfechaReparacion\" type=\"date\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Fecha reporte</label>\n");
      out.write("                <input name=\"txtfechaReporte\" type=\"date\">\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <label>Evidencia de daño</label>\n");
      out.write("                <input name=\"fileReparacion\" type=\"file\">\n");
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
