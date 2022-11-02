package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ModeloDAO.ReparacionDAO;
import ModeloVO.ReparacionVO;
import ModeloVO.EmpleadoVO;

public final class ListarReparaciones_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/sesiones.jsp");
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


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>idReparacion</th>\n");
      out.write("                <th>idTimbre </th>\n");
      out.write("                <th>idEmpleado </th>\n");
      out.write("                <th>numeroSolicitud</th>\n");
      out.write("                <th>motivoDeArreglo</th>\n");
      out.write("                <th>fechaReparacion\t</th>\n");
      out.write("                <th>fechaReporte\t</th>\n");
      out.write("                <th>EstadoSolicitud</th>\n");
      out.write("                <th>foto daño </th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                ReparacionVO repVO = new ReparacionVO();
                ReparacionDAO repDAO = new ReparacionDAO();
                ArrayList<ReparacionVO> listarReparacion = repDAO.listarReparacion();
                for (int i = 0; i < listarReparacion.size(); i++) {
                    repVO = listarReparacion.get(i);
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print( repVO.getIdReparacion());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( repVO.getIdTimbre());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( repVO.getIdEmpleado());
      out.write("</td>\n");
      out.write("                <td>");
      out.print( repVO.getNumeroSolicitud());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print( repVO.getMotivoArreglo());
      out.write(" </td>\n");
      out.write("                <td>");
      out.print( repVO.getFechaReparacion());
      out.write(" </td>\n");
      out.write("                <td>");
      out.print( repVO.getFechaReporte());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print( repVO.getFotoReparacion());
      out.write(" </td>\n");
      out.write("                <td> <img loading=\"lazy\" src=\"");
      out.print( repVO.getEstadoSolicitud());
      out.write("\"  width=\"50px\" ></td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
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
