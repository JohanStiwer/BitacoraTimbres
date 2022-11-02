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
      out.write("\n");
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
      out.write("        <form method=\"post\" action=\"Empleados\" id=\"formulario\">\n");
      out.write("\n");
      out.write("            <div class=\"formulario__grupo\" id=\"grupo__nombre\">\n");
      out.write("                <label for=\"nombre\" class=\"formulario__label\">Nombres</label>\n");
      out.write("                <div class=\"formulario__grupo-input\">\n");
      out.write("                    <input required=\"\" type=\"text\" class=\"formulario__input\" name=\"txtNombre\" id=\"nombre\" placeholder=\"Ingrese Nombres\">\n");
      out.write("                    <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"formulario__grupo\" id=\"grupo__apellido\">\n");
      out.write("                <label for=\"apellido\" class=\"formulario__label\">Apellidos</label>\n");
      out.write("                <div class=\"formulario__grupo-input\">\n");
      out.write("                    <input required=\"\" type=\"text\" class=\"formulario__input\" name=\"txtApellidos\" id=\"apellido\" placeholder=\"Ingrese Apellidos\">\n");
      out.write("                    <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"formulario__grupo\" id=\"grupo__numeroDocumento\">\n");
      out.write("                <label for=\"numeroDocumento\" class=\"formulario__label\">Número de Documento</label>\n");
      out.write("                <div class=\"formulario__grupo-input\">\n");
      out.write("                    <input required=\"\" onKeypress=\"if (event.keyCode < 45 || event.keyCode > 57)\n");
      out.write("                                event.returnValue = false;\" maxlength=\"14\" type=\"text\" class=\"formulario__input\" name=\"txtNumeroDocumento\" id=\"numeroDocumento\" placeholder=\"Ingrese Documento\">\n");
      out.write("                    <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"formulario__grupo\" id=\"grupo__email\">\n");
      out.write("                <label for=\"email\" class=\"formulario__label\">Correo Electrónico</label>\n");
      out.write("                <div class=\"formulario__grupo-input\">\n");
      out.write("                    <input required=\"\"  type=\"email\" class=\"formulario__input\" name=\"txtEmail\" id=\"email\" placeholder=\"correo@correo.com\">\n");
      out.write("                    <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"formulario__grupo\" id=\"grupo__password\">\n");
      out.write("                    <label for=\"password\" class=\"formulario__label\">Contraseña </label>\n");
      out.write("                    <div class=\"formulario__grupo-input\">\n");
      out.write("                        <input required=\"\"  type=\"password\" class=\"formulario__input\" name=\"txtClave\" id=\"clave\" placeholder=\"digite su contraseña\">\n");
      out.write("                        <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"formulario__grupo\" id=\"grupo__password\">\n");
      out.write("                        <label for=\"password\" class=\"formulario__label\">Confirme su contraseña</label>\n");
      out.write("                        <div class=\"formulario__grupo-input\">\n");
      out.write("                            <input required=\"\"  type=\"password\" class=\"formulario__input\" name=\"claveConfirmacion\" id=\"clave\" placeholder=\"confirme su contraseña\">\n");
      out.write("                            <i class=\"formulario__validacion-estado fas fa-times-circle\"></i>\n");
      out.write("                        </div>\n");
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
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <input type=\"hidden\" value=\"Activo\" name=\"txtEstado\" >\n");
      out.write("\n");
      out.write("                    <button type=\"submit\">Registrar Empleado</button>\n");
      out.write("                    <input type=\"hidden\" value=\"1\" name=\"opcion\">\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    </body>\n");
      out.write("                    </html>\n");
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
