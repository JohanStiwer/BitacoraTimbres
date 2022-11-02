package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.EmpleadoVO;
import ModeloVO.EmpleadoVO;

public final class ActualizarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Actualizar empleado</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Actualize el empleado</h1>\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("\n");
      out.write("        ");


            EmpleadoVO empVO = (EmpleadoVO) request.getAttribute("EmpleadoConsultado");

            if (empVO != null) {

        
      out.write("\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Empleados\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("              \n");
      out.write("                    <th>\n");
      out.write("                        Nombre\n");
      out.write("                        <input type=\"text\" name=\"txtNombre\" value=\"");
      out.print(empVO.getNombre());
      out.write("\">\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        Apellido\n");
      out.write("                        <input type=\"text\" name=\"txtApellidos\" value=\"");
      out.print(empVO.getApellidos());
      out.write("\">\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        Estado\n");
      out.write("                        <select name=\"txtEstado\">\n");
      out.write("                            <option value=\"");
      out.print(empVO.getEstado());
      out.write('"');
      out.write('>');
      out.print(empVO.getEstado());
      out.write("</option>\n");
      out.write("                            <option value=\"Activo\">Activo</option>\n");
      out.write("                            <option value=\"Inactivo\">Inactivo</option>\n");
      out.write("                        </select>\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        Numero documento\n");
      out.write("                        <input type=\"text\" name=\"txtNumeroDocumento\" value=\"");
      out.print(empVO.getNumeroDocumento());
      out.write("\">\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                        Correo Electronico\n");
      out.write("                        <input type=\"text\" name=\"txtEmail\" value=\"");
      out.print(empVO.getCorreo());
      out.write("\">\n");
      out.write("                    </th>                  \n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <input type=\"hidden\" value=\"2\" name=\"opcion\">\n");
      out.write("            <button> Actualizar </button>\n");
      out.write("            <a href=\"consultarEmpleado.jsp\">Volver </a>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

            } else {
                request.getRequestDispatcher("consultarEmpleado.jsp").forward(request, response);
            }
        
      out.write("\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("</body>\n");
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
