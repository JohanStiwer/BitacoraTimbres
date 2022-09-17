package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
import ModeloVO.EmpleadoVO;
import ModeloDAO.EmpleadoDAO;

public final class consultarEmpleado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Consultar Empleado</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Consultar empleado</h1>\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"Empleado\">\n");
      out.write("\n");
      out.write("            <span>Ingrese el número de documento del empleado</span><br>\n");
      out.write("            <input type=\"text\" name=\"txtNumeroDocumento\">\n");
      out.write("\n");
      out.write("            <button>Consultar</button>\n");
      out.write("            <input type=\"hidden\" value=\"3\" name=\"opcion\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <div>\n");
      out.write("            ");
 
            if (request.getAttribute("MensajeError") != null) {                                    
            
      out.write("\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${MensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
};
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <table border=\"1\"><tr>\n");
      out.write("                <th>IdEmpleado</th>\n");
      out.write("                <th>Nombres</th>\n");
      out.write("                <th>Apellidos</th>\n");
      out.write("                <th>Estado</th>\n");
      out.write("                <th>Numero Documento</th>\n");
      out.write("                <th>Correo</th>\n");
      out.write("                <th>Clave</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                EmpleadoVO empVO = new EmpleadoVO();
                EmpleadoDAO empDAO = new EmpleadoDAO();
                ArrayList<EmpleadoVO> listaEmpleado = empDAO.listar();
                for (int i = 0; i < listaEmpleado.size(); i++) {
                    empVO = listaEmpleado.get(i);
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( empVO.getIdEmpleado());
      out.write(" </td>\n");
      out.write("                <td>");
      out.print( empVO.getNombre());
      out.write("</td>\n");
      out.write("                <td> ");
      out.print( empVO.getApellidos());
      out.write("</td>\n");
      out.write("                <td> ");
      out.print(empVO.getEstado());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print( empVO.getNumeroDocumento());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print( empVO.getCorreo());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print( empVO.getClave());
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
