package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.EmpleadoVO;

public final class RegistrarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <title>Registrar Empleado</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"Empleados\" id=\"formulario\">\n");
      out.write("\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label  class=\"form-label\">Nombres</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" name=\"txtNombre\" placeholder=\"Inserte el nombre del empleado\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label class=\"form-label\">Apellidos</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" name=\"txtApellidos\" placeholder=\"Inserte los apellidos del empleado\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label  class=\"form-label\">Número de Documento</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"exampleFormControlInput1\" name=\"txtNumeroDocumento\" placeholder=\"Inserte el Número de documento\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label  class=\"form-label\">Correo Electrónico</label>\n");
      out.write("                <input type=\"email\" class=\"form-control\" id=\"exampleFormControlInput1\" name=\"txtEmail\" placeholder=\"Inserte el correo el electronico\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label  class=\"form-label\">Contraseña</label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"exampleFormControlInput1\" name=\"txtClave\" placeholder=\"Inserte una contraseña\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"mb-3\">\n");
      out.write("                <label  class=\"form-label\">Confirme su contraseña</label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"exampleFormControlInput1\" name=\"claveConfirmacion\" placeholder=\"confirme la contraseña\">\n");
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
      out.write("            <input type=\"hidden\" value=\"Activo\" name=\"txtEstado\" >\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Registrar Empleado</button>           \n");
      out.write("            <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
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
